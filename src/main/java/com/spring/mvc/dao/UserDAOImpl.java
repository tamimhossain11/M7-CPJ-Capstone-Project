package com.spring.mvc.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
//To call the session factory
	@Autowired
	private SessionFactory factory;

	public void registerUser(User user) {
		Session session = factory.getCurrentSession();
		session.save(user);

	}

	public User loginUser(User user) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		try {

			Query<User> query = session.createQuery("from User_table where email=:email and password=:password",
					User.class);

			query.setParameter("email", user.getEmail());
			query.setParameter("password", user.getPassword());
			user = query.getSingleResult();
//query.setMaxResults(1).uniqueResult();

			return user;
		} catch (NoResultException e) {
			return null;
		}

	}

	public User checkMail(User user) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		try {

			Query<User> query = session.createQuery("from User_table where email=:email", User.class);

			query.setParameter("email", user.getEmail());

//user=query.getSingleResult();
			query.setMaxResults(1).uniqueResult();

			return user;
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void saveapplyjob(ApplyJob applyJob) {
		Session session = factory.getCurrentSession();
		session.save(applyJob);
		
	}

}

//to login user
