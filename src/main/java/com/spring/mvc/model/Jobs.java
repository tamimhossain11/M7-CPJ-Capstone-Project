package com.spring.mvc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity(name = "job_Posting")
@javax.persistence.Table(name = "job_Posting")

public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long job_id;
	private String name;
	private String type;
	private String title;
	private String location;
	private Long salary;
	private String description;
	public Long getJob_id() {
		return job_id;
	}
	public void setJob_id(Long job_id) {
		this.job_id = job_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Jobs(Long job_id, String name, String type, String title, String location, Long salary, String description) {
		super();
		this.job_id = job_id;
		this.name = name;
		this.type = type;
		this.title = title;
		this.location = location;
		this.salary = salary;
		this.description = description;
	}
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Jobs [job_id=" + job_id + ", name=" + name + ", type=" + type + ", title=" + title + ", location="
				+ location + ", salary=" + salary + ", description=" + description + "]";
	}
	
}
