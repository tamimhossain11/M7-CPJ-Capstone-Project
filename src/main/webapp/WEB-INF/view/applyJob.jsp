<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <%@include file="./base2.jsp" %>
<link href="resources/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="body" style="background: #773e3e">
	<div class="row ">
		<div class="col-md-6 col-lg-6 offset-md-3">
			<div class="card my-5 shadow">
				<div class="card-body p-5">
					<div class="card">
						<div class="card-header">
							<h2 class="h4 mb-2 text-center">Apply Job</h2>
							<p style="color: red;" class="text-center">${msg}</p>
							<p style="color: red;" class="text-center">${err}</p>

						</div>
						<div class="card-body">
							<form class="text-center border border-light "
								 action="${pageContext.request.contextPath}/applyJob" method="post">
						

								<input type="text" name="id" id="id"
									class="form-control mb-4 disabled" value="${user.id }">
								<input type="text" name="jobId" id="jobId"
									class="form-control mb-4 disabled" value="${job.job_id }">
								<%-- <input type="text" name="name" id="name"
									class="form-control mb-4 disabled" disabled="${activeField}"
									value="${job.name }"> 
									<input type="text" name="type" id="type" class="form-control mb-4" disabled="${activeField}"
									value="${job.type }" placeholder="Job Type">  --%>

								<input type="text" name="name" id="name"
									class="form-control mb-4" placeholder="Enter Name"> <input
									type="text" name="schoolName" id="schoolName"
									class="form-control mb-4" placeholder="Enter Your School Name">

								<input type="text" name="schoolGrade" id="schoolGrade"
									class="form-control mb-4" placeholder="Enter Your School Grade">

								<input type="text" name="collegeName" id="collegeName"
									class="form-control mb-4" placeholder="Enter Your College Name">

								<input type="text" name="collegeGrade" id="collegeGrade"
									class="form-control mb-4"
									placeholder="Enter Your College Grade"> <input
									type="text" name="versityName" id="versityName"
									class="form-control mb-4"
									placeholder="Enter Your University Name"> <input
									type="text" name="versityGrade" id="versityGrade"
									class="form-control mb-4"
									placeholder="Enter Your University Grade"> <input
									type="hidden" name="status" id="status"
									class="form-control mb-4" value="status">


								<!-- Sign in button -->
								<button class="btn btn-info btn-block" type="submit">Apply</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>