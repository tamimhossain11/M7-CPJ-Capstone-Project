package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.AdminDAO;
import com.spring.mvc.model.Admin;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	
	@Override
	public Admin adminlogin(Admin admin) {

		return adminDAO.adminlogin(admin);
	}

}
