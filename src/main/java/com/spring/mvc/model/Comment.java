package com.spring.mvc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity(name = "comments")
@javax.persistence.Table(name = "comments")

public class Comment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_comment;
	    
	    @ManyToOne
	    @JoinColumn(name = "id_thread")
	    private Threads threads;
	    private String comment;

		@ManyToOne
	    @JoinColumn(name = "id")
	    private User user;

		public Long getId_comment() {
			return id_comment;
		}

		public void setId_comment(Long id_comment) {
			this.id_comment = id_comment;
		}

		public Threads getThreads() {
			return threads;
		}

		public void setThreads(Threads threads) {
			this.threads = threads;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Comment(Long id_comment, Threads threads, String comment, User user) {
			super();
			this.id_comment = id_comment;
			this.threads = threads;
			this.comment = comment;
			this.user = user;
		}

		public Comment() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Comment [id_comment=" + id_comment + ", threads=" + threads + ", comment=" + comment + ", user="
					+ user + "]";
		}

	
		
}
