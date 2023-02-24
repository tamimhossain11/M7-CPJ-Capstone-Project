package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.Comment;
import com.spring.mvc.model.Threads;
import com.spring.mvc.model.User;
import com.spring.mvc.repository.ApplyJobRepository;
import com.spring.mvc.repository.JobRepository;
import com.spring.mvc.repository.ThreadRepository;
import com.spring.mvc.service.UserService;

@Controller
public class ThreadController {
	private ApplicationContext context;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private ApplyJobRepository applyJobRepository;
	@Autowired
	private UserService userService2;
	@Autowired
	private ApplicationDAO applicationDAO;
	@Autowired
	private ThreadRepository threadRepository;

	@RequestMapping("/threadRead/{userId}")
	public String threadRead(@PathVariable("userId") Long uId, HttpSession session, Model model, Threads th) {
		User user = this.threadRepository.getUser(uId);

		if (user == null) {
			return "redirect:/login";
		}
		List<Threads> threads = threadRepository.listThread();
		List<Threads> userthreads = new ArrayList<>();

		for (Threads thread : threads) {
			if (thread.getUser().getId() == user.getId()) {
				userthreads.add(thread);
			}
		}

		model.addAttribute("thread", userthreads);
		model.addAttribute("user", user);

		return "thread-read";
	}

	@RequestMapping("/allComments/{userId}/{threadId}")
	public String CommentRead(@PathVariable("userId") Long uId, @PathVariable("threadId") Long tId, HttpSession session,
			Model model, Threads th/* Comment comments */) {
		User user = this.threadRepository.getUser(uId);
		Threads threads = this.threadRepository.findThreadById(tId);
		model.addAttribute("thread", threads);
		if (threads == null) {
			return "redirect:/thread-read";
		} else if (user == null) {
			return "redirect:/login";
		}
		List<Comment> comment = threadRepository.listUserComment();
		List<Comment> userComment = new ArrayList<>();
		for (Comment commentThread : comment) {
			if (commentThread.getThreads().getId_thread() == threads.getId_thread()) {
				userComment.add(commentThread);
			}
		}

		model.addAttribute("listComment", userComment);
		model.addAttribute("user", user);

		return "comment";
	}

	// Post Thread
	@RequestMapping("/postthread/{userId}")
	public String postThread(@PathVariable("userId") Long uId, Model model) {
		User user = this.threadRepository.getUser(uId);

//        Threads thread = new Threads();
//        
		if (user == null) {
			return "redirect:/login";
		}

		model.addAttribute("user", user);

		return "threadPost";
	}

	@RequestMapping("/postThread/{userId}")
	public ModelAndView savePostThread(@PathVariable("userId") Long userId, @RequestParam("id") Long id,
			@RequestParam("title") String title, @RequestParam("content") String content, HttpSession session) {
		ModelAndView mv = new ModelAndView();

		User user = threadRepository.getUser(userId);

		try {
			if (user == null) {
				mv.setViewName("redirect:/login");
				return mv;
			}
			threadRepository.postThread(user, title, content);
//			mv.addObject("user", user);
			List<Threads> threads = threadRepository.listThread();
			List<Threads> userthreads = new ArrayList<>();

			for (Threads thread : threads) {
				if (thread.getUser().getId() == user.getId()) {
					userthreads.add(thread);
				}
			}

			mv.addObject("thread", userthreads);
			mv.addObject("user", user);

			mv.setViewName("thread-read");
			return mv;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping(value = "/postComment/{userId}/{threadId}", method = RequestMethod.POST)
	public ModelAndView postComment(@PathVariable("userId") Long userId, @PathVariable("threadId") Long threadId,
			@RequestParam("id") Long uId, @RequestParam("comment") String comment, @RequestParam("id") Long t_id,
			HttpSession session, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
//        User user = loginRepository.getCurrentUser(session);
		try {
			User userid = this.threadRepository.getUser(userId);
			Threads threadid = threadRepository.findThreadById(threadId);

			User user = this.threadRepository.getUser(uId);
			Threads thread = threadRepository.findThreadById(t_id);

			if (user == null) {
				mv.setViewName("redirect:/login");
				return mv;
			}

			threadRepository.postComment(comment, thread, user);
			mv.addObject("user", userid);

			List<Comment> comments = threadRepository.listUserComment();
			List<Comment> userComment = new ArrayList<>();
			for (Comment commentThread : comments) {
				if (commentThread.getThreads().getId_thread() == thread.getId_thread()) {
					userComment.add(commentThread);
				}
			}
			mv.addObject("listComment", userComment);
			mv.addObject("thread", threadid);
			mv.setViewName("comment");
			return mv;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

}
