<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQ<!DOCTYPE html">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link href="resources/css/profile.css" rel="stylesheet">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

<div class="body" style="background: #E8ECEF; color: black">
<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Job Portal</h1>
			</div>

			<table class="table table-secondary table-hover" border="1">
				<thead class="table-dark">
					<tr>
						<th scope="col">User FullName</th>
						<th scope="col">Name</th>
						<th scope="col">Email</th>
						<th scope="col">Company Name</th>
						<th scope="col">Job Type</th>
						<th scope="col">Job Title</th>
						<th scope="col">User School Name</th>
						<th scope="col">User School Grade</th>
						<th scope="col">User College Name</th>
						<th scope="col">User College Grade</th>
						<th scope="col">User Versity Name</th>
						<th scope="col">User Versity Grade</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${applyJob }" var="aj">
						<tr>
						<th scope="row">${aj.id_apply_job}</th>
						<td>${aj.collegeGrade}</td>
		 					<td>${aj.collegeName}</td>
							<td>${aj.name}</td>
							<td>${aj.schoolGrade}</td>
							<td>${aj.schoolName}</td> 
							<td>${aj.status}</td>
							<td>${aj.versityGrade}</td>
							<td>${aj.versityName}</td>
							<td>${aj.getJob().getName()}</td>
							<td>${aj.getUser().getFullName()}</td>
							<td></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>




</div>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</body>
</html>