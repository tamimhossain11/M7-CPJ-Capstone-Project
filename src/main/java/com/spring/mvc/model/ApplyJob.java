package com.spring.mvc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity(name = "apply_job")
@javax.persistence.Table(name = "apply_job")
public class ApplyJob {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_apply_job;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Jobs job;
	private String name;
	private String schoolName;
	private float schoolGrade;
	private String collegeName;
	private float collegeGrade;
	private String versityName;
	private float versityGrade;
	private String status;

	public Long getId_apply_job() {
		return id_apply_job;
	}

	public void setId_apply_job(Long id_apply_job) {
		this.id_apply_job = id_apply_job;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public float getSchoolGrade() {
		return schoolGrade;
	}

	public void setSchoolGrade(float schoolGrade) {
		this.schoolGrade = schoolGrade;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getCollegeGrade() {
		return collegeGrade;
	}

	public void setCollegeGrade(float collegeGrade) {
		this.collegeGrade = collegeGrade;
	}

	public String getVersityName() {
		return versityName;
	}

	public void setVersityName(String versityName) {
		this.versityName = versityName;
	}

	public float getVersityGrade() {
		return versityGrade;
	}

	public void setVersityGrade(float versityGrade) {
		this.versityGrade = versityGrade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ApplyJob(Long id_apply_job, User user, Jobs job, String name, String schoolName, float schoolGrade,
			String collegeName, float collegeGrade, String versityName, float versityGrade, String status) {
		super();
		this.id_apply_job = id_apply_job;
		this.user = user;
		this.job = job;
		this.name = name;
		this.schoolName = schoolName;
		this.schoolGrade = schoolGrade;
		this.collegeName = collegeName;
		this.collegeGrade = collegeGrade;
		this.versityName = versityName;
		this.versityGrade = versityGrade;
		this.status = status;
	}

	public ApplyJob() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ApplyJob [id_apply_job=" + id_apply_job + ", user=" + user + ", job=" + job + ", name=" + name
				+ ", schoolName=" + schoolName + ", schoolGrade=" + schoolGrade + ", collegeName=" + collegeName
				+ ", collegeGrade=" + collegeGrade + ", versityName=" + versityName + ", versityGrade=" + versityGrade
				+ ", status=" + status + "]";
	}

}
