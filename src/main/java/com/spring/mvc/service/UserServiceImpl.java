package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDAO;
import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.User;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	@Override
	public void registerUser(User user) {
	
		userDAO.registerUser(user);
	}

	@Override
	public User loginUser(User user) {
	
		return userDAO.loginUser(user);
	}

	@Override
	public User checkMail(User user) {

		return userDAO.checkMail(user);
	}

	@Override
	public void saveapplyjob(ApplyJob applyJob) {
		userDAO.saveapplyjob(applyJob);
		
	}
	
	
}
