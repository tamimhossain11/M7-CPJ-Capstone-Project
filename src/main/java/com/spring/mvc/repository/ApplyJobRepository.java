package com.spring.mvc.repository;

import java.util.List;

import com.spring.mvc.model.ApplyJob;
import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.User;

public interface ApplyJobRepository {

	List<ApplyJob> allApplyJob();
	public User getUser(Long id);
	public boolean validateApplyJob(Long id, Long job_id);
	void saveApplyJobs(User user, Jobs job, String name, String schoolName, float schoolGrade, String collegeName,
			float collegeGrade, String versityName, float versityGrade, String status);




}
