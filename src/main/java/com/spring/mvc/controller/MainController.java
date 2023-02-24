package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/registration")
	public String Form() {
		return "registration";

	}

	@RequestMapping("/thankyou")
	public String thankyou() {
		return "thankyou";

	}

	@RequestMapping("/login")
	public String login() {
		return "login";

	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";

	}

	@RequestMapping("/adminwelcome")
	public String adminwelcome() {
		return "adminwelcome";

	}

	@RequestMapping("/postjob")
	public String postjob() {
		return "postjob";

	}

	@RequestMapping("/forgotpassform")
	public String forgotpassform() {
		return "forgotpassform";

	}

	@RequestMapping("/forgot")
	public String forgot() {
		return "forgot";

	}

	@RequestMapping("/home")
	public String home() {
		return "home";

	}

	@RequestMapping("/userProfile")
	public String userProfile() {
		return "userProfile";

	}

	@RequestMapping("/editprofile")
	public String editprofile() {
		return "editprofile";

	}

	@RequestMapping("/viewProfile")
	public String viewProfile() {
		return "viewProfile";

	}

	@RequestMapping("/emailForm")
	public String emailForm() {
		return "emailForm";

	}

	@RequestMapping("/error")
	public String error() {
		return "error";

	}

	@RequestMapping("/success")
	public String success() {
		return "success";

	}

	@RequestMapping("/applyJobSuccess")
	public String applyJobSuccess() {
		return "applyJobSuccess";

	}

	@RequestMapping("/jobs")
	public String jobs() {
		return "jobs";

	}

	@RequestMapping("/testIndex")
	public String testIndex() {
		return "testIndex";

	}

	@RequestMapping("/applyJob")
	public String applyJob() {
		return "applyJob";

	}
	@RequestMapping("/sendMessage")
	public String sendMessage() {
		return "sendMessage";
		
	}
	@RequestMapping("/readMessage")
	public String readMessage() {
		return "readMessage";
		
	}

	@RequestMapping("/commentThread")
	public String commentThread() {
		return "commentThread";
		
	}

	
	@RequestMapping("/message")
	public String message() {
		return "message";
		
	}
	@RequestMapping("testpage")
	public String testpage() {
		return "testpage";
		
	}
	@RequestMapping("/thread-post")
	public String threadpost() {
		return "thread-post";
		
	}
	
	@RequestMapping("/thread-read")
	public String threadread(){
		return "thread-read";
		
		
	}
	@RequestMapping("comment")
	public String  comment() {
		return "comment";
		
	}
	@RequestMapping("/viewjobs")
	public String viewjobs() {
		return "viewjobs";
		
	}
	
}
