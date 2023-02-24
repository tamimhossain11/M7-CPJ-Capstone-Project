package com.spring.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Admin;
import com.spring.mvc.model.User;
import com.spring.mvc.service.AdminService;
import com.spring.mvc.service.ForgotPassEmailService;
import com.spring.mvc.service.MailService;
import com.spring.mvc.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AdminService adminService;

	@Autowired
	private ForgotPassEmailService forgotPassEmailService;
	@Autowired
	private MailService mailService;

	// to get value from registration form
	@GetMapping(value = "/registration")
	public ModelAndView registration(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView("registration");

		return modelAndView;

	}

	// to ost form and send regis confirmation
	@PostMapping("/registration")
	public String register(@ModelAttribute("user") User user, Model model, HttpServletRequest request,
			String emailToRecipient, String userName, String EmailID) {
		emailToRecipient = request.getParameter("email");
		userName = request.getParameter("name");

		userService.registerUser(user);
		mailService.sendMail(emailToRecipient, userName); /// sending mail to the user thathis registration is completed
		request.getSession().setAttribute("name", userName);
		request.getSession().setAttribute("email", emailToRecipient);

		model.addAttribute("success", "Registration is successful");

		return "thankyou";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, Model model, HttpSession session,
			@ModelAttribute("admin") Admin admin) {
		User user2 = userService.loginUser(user);// For user
		Admin user3 = adminService.adminlogin(admin);// For admin
		System.out.println("user2" + user2);
		System.out.println("user3" + user3);

		if (user2 != null) { // If user not null it will come welcome page for him
			System.out.println("hello");
			model.addAttribute("user", user2);
			session.setAttribute("user", user2);
			return "welcome";
		}

		if (user3 != null) { // If admin not null it will come adminwelcome page for him
			System.out.println("hello");
			model.addAttribute("admin", user3);
			session.setAttribute("admin", user3);
			return "adminwelcome";
		}

//If user could not get it will show error
		if (user2 == null) {
			System.out.println("on");
			model.addAttribute("error", "Invalid Credential");

		}

//If user information can not get it will show error
		if (user3 == null) {
			System.out.println("on");
			model.addAttribute("error", "Invalid Credential");

		}

		return "login";
	}

	// logout
	public String loginDisplay(Model m, HttpSession session) {
		User user = new User();
		if (session.getAttribute("user") != null) {
			session.invalidate();
			System.out.println("here");
			m.addAttribute("success", "You have logout successfully");

		}
		m.addAttribute("user", user);
		return "login";
	}

	// For checking email is it in database or not and send mail to the definite
	// email
	// start
	@RequestMapping(value = "/emailConfirm", method = RequestMethod.POST)
	public String checkMail(@ModelAttribute("user") User user, Model model, HttpSession session,
			@RequestParam(value = "email") String email, HttpServletRequest request) {
		User user4 = userService.checkMail(user);
		System.out.println(user4);
		if (user4 != null) {
			System.out.println("hello");
			model.addAttribute("user", user4);
			session.setAttribute("user", user4);
			forgotPassEmailService.resetMail(email); // sending mail to the user to reset his/her pasword
			request.getSession().setAttribute("email", email);

			// return "checkMail";
			return "checkMail";

		}
		if (user4 == null) {
			System.out.println("on");
			model.addAttribute("error", "Invalid Credential");
		}

		return "forgotpassform";

	}

	@RequestMapping(value = "/resetPassword/{email}")
	public String resetPassword(@PathVariable String email, Map<String, String> model) {
		// check if the email id is valid and registered with us.
		model.put("emailid", email);
		return "reset_forgotpassform";
	}

}
