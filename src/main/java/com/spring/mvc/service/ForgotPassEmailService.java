package com.spring.mvc.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class ForgotPassEmailService {
	@Autowired

	private JavaMailSender mailSender;

	public void resetMail(String emailID) {
		MimeMessage message = this.mailSender.createMimeMessage();
		MimeMessageHelper messageHelper;
		try {
			messageHelper = new MimeMessageHelper(message, true);
			messageHelper.setTo(emailID);
			messageHelper.setFrom("abuo53125@gmail.com");
			messageHelper.setSubject("Forgot password reset");
			messageHelper.setText(
					"<html><body style=\"font-size: 1rem;\"><h2>Good day! This is ABC  Pte Ltd</h2><h4>If you want to reset the password, kindly click on the Reset Password button</h4>"
							+ "<button style=\""
							+ " border-radius: 1.5rem; text-decoration:none;background:white;padding:15px; color: black; font-size: 20px;border: none;\">\r\n"
							+ "<a href='http://localhost:8082/Copy/resetPassword/" + emailID
							+ "/'> Reset your Password</a></button> </body></html>",
					true);
			mailSender.send(message);
		} catch (MessagingException e) {
			System.out.println("Error sendind mail" + e.getMessage());
		}
	}

}
