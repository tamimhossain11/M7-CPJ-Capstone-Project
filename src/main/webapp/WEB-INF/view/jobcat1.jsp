<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jobcat1</title>
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
	  <%@include file="./base.jsp" %>
</head>
<body class="" style="background: #c5b7b780">
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Job Portal</h1>
			</div>
			

			
			<div class="container mt-3 ">
  <div class="row arrow ">
   <c:forEach items="${jobs}" var="u">
    <div class="col-lg-5 m-2 " >
      <div class="row  my-4 p-3 border rounded my-color card ">

        <div class="col-9">
       
        <img alt="" src="*{'data:image/jpeg;base64,'+${u.image}}" style="width: 150px;height: 150px;">
          <h2 class="fw-bolder">${u.jobname}</h2>
          <h5>${u.salary}</h5>
          <h5>${u.jtype}</h5>
          <h6>${u.jobtitle}</h6>
          <button type="button" class="btn btn-info  me-2 mt-2">
								<a href="jobDetails/${job.id }" class= "view">View Details</a>
								</button>
        </div>
      </div>
    </div>
    </c:forEach>
    </div>
			
		</div>
	</div>
	<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</body>
</html>