package com.spring.mvc.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.User;
@Repository
@Transactional
public class ApplyJobRepositoryImpl implements ApplyJobRepository {
	@Autowired
	private SessionFactory factory;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@SuppressWarnings("unchecked")
	@Override
	public List<ApplyJob> allApplyJob() {

		return factory.getCurrentSession().createQuery("from apply_job").list();
	}

	@Override
	public User getUser(Long id) {
		
		return factory.getCurrentSession().get(User.class, id);
	}

//	@Override
//	public boolean validateApplyJob(Long id, Long job_id) {
//	Long count=jdbcTemplate.queryForObject("select count(*) from apply_job where id=? and job_id=?;",Long.class,id,job_id);
//	if(count==1) {
//		return true;
//	}else {
//		return false;
//	}

	

	
	

	

	@Override
	public void saveApplyJobs(User user, Jobs job, String name, String schoolName, float schoolGrade,
			String collegeName, float collegeGrade, String versityName, float versityGrade, String status) {
	ApplyJob apply=new ApplyJob();
	 apply.setJob(job);
     apply.setUser(user);
     apply.setName(name);
     apply.setSchoolName(schoolName);
     apply.setSchoolGrade(schoolGrade);
     apply.setCollegeName(collegeName);
     apply.setCollegeGrade(collegeGrade);
     apply.setVersityName(versityName);
     apply.setVersityGrade(versityGrade);
     apply.setStatus(status);
     factory.getCurrentSession().saveOrUpdate(apply);
		
	}
	public boolean validateApplyJob(Long id,Long job_id) {
		Long count=jdbcTemplate.queryForObject("select count(*) from apply_job where id=? and job_id =?;", Long.class, id, job_id);
	
		if(count==1){
			return true;
		}else {
		return false;
		}
	}
	}
