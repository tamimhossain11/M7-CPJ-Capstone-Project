package com.spring.mvc.repository;

import java.util.List;

import com.spring.mvc.model.Comment;
import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.Threads;
import com.spring.mvc.model.User;

public interface ThreadRepository {
	Jobs singleJob(Long job_id);
User getUser(String uemail);
User getUser(Long uId);
List<Threads> listThread();
Threads findThreadById(Long tId);
List<Comment> listUserComment();
 public void postThread(User user, String title, String content);
public void postComment(String comment, Threads thread, User user);


}
