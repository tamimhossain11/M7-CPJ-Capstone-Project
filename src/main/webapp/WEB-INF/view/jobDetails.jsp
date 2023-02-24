<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="resources/css/jobdetails.css" rel="stylesheet">

</head>
<body>
	<div class="container mt-3 mb-5 ">
		<div class="border info mt-2 p-3 pb-3">
			<img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9cqcYWglHiqsy3TOpHZYMvTK3_fP0okuC_w&usqp=CAU" style="width: 200px; height: 200px;">
			<h1 class="fw-bold">Name: ${job.name }</h1>
			<h2>Type: ${job.type }</h2>
			<h5>Title: ${job.title }</h5>
			<h6>Salary: ${job.salary}</h6>
			<h6>Location: ${job.location }</h6>
			<h1>Description:</h1>
			<p>${job.description }</p>
			
			<button type="button" class="btn btn-info  me-2 mt-2">
				  <a href="${pageContext.request.contextPath }/applyJobs/${job.job_id}/${user.id}" class= "view">Apply Now</a></button>
				  	<button type="button" class="btn btn-info  me-2 mt-2">
				  <a href="${pageContext.request.contextPath }/comment/${job.job_id}/${user.id}" class= "view">Comment</a></button>
				  
		</div>
	</div>
</body>
</html>