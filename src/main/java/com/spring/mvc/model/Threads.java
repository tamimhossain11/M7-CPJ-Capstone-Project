package com.spring.mvc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity(name = "threads")
@javax.persistence.Table(name = "threads")

public class Threads {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_thread;


	    @ManyToOne
	    @JoinColumn(name = "id")
	    private User user;
	    
	    private String title;
	    private String content;
		public Long getId_thread() {
			return id_thread;
		}
		public void setId_thread(Long id_thread) {
			this.id_thread = id_thread;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Threads(Long id_thread, User user, String title, String content) {
			super();
			this.id_thread = id_thread;
			this.user = user;
			this.title = title;
			this.content = content;
		}
		public Threads() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Threads [id_thread=" + id_thread + ", user=" + user + ", title=" + title + ", content=" + content
					+ "]";
		}
	
	    
}
