package com.spring.mvc.repository;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.Comment;
import com.spring.mvc.model.Jobs;
import com.spring.mvc.model.Threads;
import com.spring.mvc.model.User;

@Service
@Transactional
public class ThreadRepositoryImpl implements ThreadRepository {
	@Autowired
	private SessionFactory factory;
	@Override
	public User getUser(String uemail) {
		return factory.getCurrentSession().get(User.class, uemail);
	}

	@Override
	public Jobs singleJob(Long job_id) {
		
		return factory.getCurrentSession().get(Jobs.class, job_id);
	}

	
	@Override
	public User getUser(Long uId) {
		
		return factory.getCurrentSession().get(User.class, uId);
	}

	@Override
	public List<Threads> listThread() {
		 List<Threads> listThread = factory.getCurrentSession().createQuery("from threads").list();
		return listThread;
	}

	@Override
	public Threads findThreadById(Long tId) {
		 Threads thread = factory.getCurrentSession().get(Threads.class,tId);
		return thread;
	}

	@Override
	public List listUserComment() {
		  List<Comment> listComment = factory.getCurrentSession().createQuery("from comments").list();
		return listComment;
	}

	@Override
	public void postThread(User user, String title, String content) {
		Threads threads = new Threads();
		  threads.setUser(user);
	        threads.setTitle(title);
	        threads.setContent(content);
	        factory.getCurrentSession().saveOrUpdate(threads);
		
	}

	@Override
	public void postComment(String comment, Threads thread, User user) {
		Comment postComment=new Comment();
		   postComment.setUser(user);
	        postComment.setThreads(thread);
	        postComment.setComment(comment);
	        factory.getCurrentSession().saveOrUpdate(postComment);
		
	}



	

}
