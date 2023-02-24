package com.spring.mvc.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.User;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Registration {
	 @Autowired
	 private UserService userService;
	 
	    @Autowired
	    private ApplicationDAO applicationDAO;
	    
	    @Test
	     public void Registertest() {
	         User user=new User();
	         user.setId((long) 5);
	         user.setName("Abu");
	         user.setEmail("abu53126@gmail.com");
	         user.setPassword("676767");
	         user.setContact("012786578");
	         user.setCity("Dhaka");
	     userService.registerUser(user);
	     Long n=user.getId();
	     Long m=(long) 5;
	     assertEquals(n, m);
	     }
}
