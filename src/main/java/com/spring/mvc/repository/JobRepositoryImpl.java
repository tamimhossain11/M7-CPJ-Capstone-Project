package com.spring.mvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.User;
@Repository
@Transactional
public class JobRepositoryImpl implements JobRepository{
	@Autowired
	private SessionFactory factory;
	@Override
	public void saveJob(Jobs jobs) {
		Session session = factory.getCurrentSession();
		session.save(jobs);
	}
	@Override
	public List<Jobs> getAlljobs() {
	@SuppressWarnings("unchecked")
	List<Jobs>jobs=factory.getCurrentSession().createQuery("from job_Posting").list();
		return jobs;
	}
	//get the single job
	@Override
	public Jobs singleJob(Long id) {
	
		return factory.getCurrentSession().get(Jobs.class,id);
	}
	@Override
	public void saveJobs(Jobs jobs) {
	factory.getCurrentSession().saveOrUpdate(jobs);
		
	}
	@Override
	public void deletejobsById(Long id) {
	Jobs jobs=factory.getCurrentSession().load(Jobs.class, id);
	factory.getCurrentSession().delete(jobs);
		
	}
	@Override
	public User getUser(Long id) {
		
		return factory.getCurrentSession().get(User.class, id);
	}
	

}
