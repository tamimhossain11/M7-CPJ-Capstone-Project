package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.User;
import com.spring.mvc.repository.ApplyJobRepository;
import com.spring.mvc.repository.JobRepository;

import com.spring.mvc.service.UserService;

@Controller
public class JobController {
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

	@RequestMapping(value = "/addJobs", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView addJobs(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addJobs");
		return mv;

	}

	@GetMapping("/add")
	public String showAddjobs(Model model) {
		return "addJobs";

	}

	
	@PostMapping("/addJ")
	public String saveJob(@ModelAttribute("job") Jobs jobs, Model model) {
		   jobRepository.saveJob(jobs);
		return "listJobs";

	}

	@RequestMapping("/listJobs")
	public String listJobs(Model model) {
		List<Jobs> jobs = jobRepository.getAlljobs();
		model.addAttribute("jobs", jobs);

		return "/listJobs";

	}

	@RequestMapping("/jobDetails/{jobId}")
	public String jobDetails(@PathVariable("jobId") Long id, Model model) {
		Jobs jobs = this.jobRepository.singleJob(id);
		
		model.addAttribute("job", jobs);
		return "jobDetails";

	}

//Update job
	@RequestMapping("/updateJob/{jobId}")
	public String updateJob(@PathVariable("jobId") Long Id, Model model) {
		Jobs jobs = this.jobRepository.singleJob(Id);
		model.addAttribute("job", jobs);
		return "updateJob";

	}

	@RequestMapping(value = "/updateJobs", method = RequestMethod.POST)
	public String updateJobsedit(@ModelAttribute("job") Jobs jobs) {
		System.out.println(jobs);
		jobRepository.saveJobs(jobs);
		return "updateJob";

	}

	@RequestMapping(value = "/deletejob/{id}")
	public String deletejob(@PathVariable("id") Long id) {
		jobRepository.deletejobsById(id);
		return "redirect:/listJobs";

	}

//
//@PostMapping(value="/applyJobs")
//public String applyJobs(@ModelAttribute("applyJob")ApplyJob applyJob,Model model,HttpSession session) {
//	userService.saveapplyjob(applyJob);
//	
//	return "applyJob";
//	
//}
//
//	@GetMapping(value = "applyJobs")
//	public String applyJob(Model model) {
//		ApplyJob applyJob = new ApplyJob();
//		model.addAttribute(applyJob);
//		System.out.println(applyJob);
//		return "applyJob";
//
//	}

	
	@RequestMapping(value = "/applyJob", method = RequestMethod.POST)
	public String applyJob(@ModelAttribute("apply") ApplyJob applyJob, Model model, HttpSession session,
			@RequestParam("id") Long id, @RequestParam("jobId") Long job_id, @RequestParam("name") String name,
			@RequestParam("schoolName") String schoolName, @RequestParam("schoolGrade") float schoolGrade,
			@RequestParam("collegeName") String collegeName, @RequestParam("collegeGrade") float collegeGrade,
			@RequestParam("versityName") String versityName, @RequestParam("versityGrade") float versityGrade,
			@RequestParam("status") String status) {
		User users = applicationDAO.getUsers();
		
	
	
		User user = applicationDAO.getUser(id);
		
		Jobs job = jobRepository.singleJob(job_id);
		boolean ajAgain = applyJobRepository.validateApplyJob(id, job_id);
		model.addAttribute("job", job);
		model.addAttribute("users", users);

		try {
			if (ajAgain ==true) {
				model.addAttribute("err", "Can not apply for the job");
				return "applyJob";
			}
			applyJobRepository.saveApplyJobs(user, job, name, schoolName, schoolGrade, collegeName, collegeGrade,
					versityName, versityGrade, status);
			model.addAttribute("applyJobSuccess", "msg");
			return "applyJobSuccess";
		} catch (Exception e) {
			model.addAttribute("msg", "Please fill up the form");
		}
		if (users == null) {
			return "redirect:/login";
		} else {
			model.addAttribute("msg", "Please fill up all form");
		}
		return "redirect:/applyJob";
	}

	//to se user own applied jobs
	@RequestMapping("/applyJobs")
	public String applyJob(Model model, HttpSession session, @ModelAttribute("user") User user) {
	
	User users=applicationDAO.getUsers();
		if (users == null) {
			return "redirect:/login";
		}

		List<ApplyJob> applyJob = applyJobRepository.allApplyJob();
		List<ApplyJob> userApplyJobs = new ArrayList<>();
		for (ApplyJob apply : applyJob) {
			if (apply.getId_apply_job() == users.getId()) {
				userApplyJobs.add(apply);
			}
		}
		model.addAttribute("applyJob", userApplyJobs);
		return "applyJobs";
	}
//to get list
	@RequestMapping("/applyJobList")
	public ModelAndView applyJobList(Model model) {
		ModelAndView applyJobList = new ModelAndView("applyJobList");
		List<ApplyJob> applyJobs = applyJobRepository.allApplyJob();
		model.addAttribute("applyJob", applyJobs);
		return applyJobList;
	}

//Get back to the user in apply job page
	@RequestMapping(value = "/applyJobs/{jobId}/{userId}")
	public String applyJobs(@PathVariable("jobId") Long job_id, @PathVariable("userId") Long uId, Model model) {

		Jobs job = this.jobRepository.singleJob(job_id);
		User user = this.jobRepository.getUser(uId);

		if (user == null) {
			return "redirect:/login";
		}
		model.addAttribute("user", user);
		model.addAttribute("job", job);

		return "applyJob";

	}

}
