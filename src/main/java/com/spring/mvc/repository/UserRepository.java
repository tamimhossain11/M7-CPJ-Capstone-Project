package com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	

}
