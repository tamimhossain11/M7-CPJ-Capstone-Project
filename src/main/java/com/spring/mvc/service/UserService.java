package com.spring.mvc.service;

import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.User;

public interface UserService {
	public void registerUser(User user);

	public User loginUser(User user);

	public User checkMail(User user);

	public void saveapplyjob(ApplyJob applyJob);
}
