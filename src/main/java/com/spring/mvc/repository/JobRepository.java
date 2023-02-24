package com.spring.mvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.User;

public interface JobRepository {

	void saveJob(Jobs jobs);

	List<Jobs> getAlljobs();

	Jobs singleJob(Long id);

	void saveJobs(Jobs jobs);

	void deletejobsById(Long id);

	User getUser(Long id);


}
