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
							<h2 class="h4 mb-2 text-center">Give your comment here</h2>
							<p style="color: red;" class="text-center">${msg}</p>
							<p style="color: red;" class="text-center">${err}</p>

						</div>
						<div class="card-body">
							<form class="text-center border border-light "
								 action="${pageContext.request.contextPath}/comments" method="post">
						

								<input type="text" name="id" id="id"
									class="form-control mb-4 disabled" value="${user.id}">
								<input type="text" name="job_id" id="job_id"
									class="form-control mb-4 disabled" value="${job.job_id}">
							

								<input type="text" name="tcomment" id="tcomment"
									class="form-control mb-4" placeholder="Enter comment">
								



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