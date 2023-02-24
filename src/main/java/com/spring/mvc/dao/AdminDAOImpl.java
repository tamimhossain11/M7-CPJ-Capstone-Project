package com.spring.mvc.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.spring.mvc.model.Admin;

@Repository
@Transactional
public class AdminDAOImpl implements AdminDAO{
	@Autowired
	private SessionFactory factory;//

	public Admin adminlogin(Admin admin) {
	
	Session session=factory.getCurrentSession();
	try {
		Query<Admin> query=session.createQuery("FROM admins_table where email=:email and password=:password",Admin.class);
		
	query.setParameter("email",admin.getEmail());
		query.setParameter("password",admin.getPassword());
	admin=(Admin) query.getSingleResult();
//		query.setMaxResults(1).uniqueResult();
		
		return admin;
}catch(NoResultException e) {
	return null;
	}
	
	
}}
