package com.spring.mvc.dao;

import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.User;

public interface UserDAO {
	public void registerUser(User user);

	public User loginUser(User user);

	public User checkMail(User user);
	public void saveapplyjob(ApplyJob applyJob);
	
}
