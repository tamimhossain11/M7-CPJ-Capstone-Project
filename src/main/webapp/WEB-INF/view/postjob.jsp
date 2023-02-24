<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
      <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
	<f:form action="postjob" modelAttribute="job" method="post" enctype="multipart/form-data">


		<label for="name"> Job name</label>
		<input type="text" class="form-control" id="jobname" name="jobname"
			required>
		<label for="name">About Employeer</label>
		<textarea class="form-control" type="textarea" name="employer"
			id="employer" maxlength="350" rows="7"></textarea>




		<label for="name">job title</label>
		<input type="text" class="form-control" id="jobtitle" name="jobtitle"
			required>
			
	<label for="name">Description</label>
		<textarea class="form-control" type="textarea" name="description"
			id="description" maxlength="350" rows="7"></textarea>

		<label for="name"> Salary</label>
		<input type="text" class="form-control" id="salary" name="salary"
			required>



		<label for="name">Company Name</label>
		<input type="text" class="form-control" id="cname"
			name="cname" required>
			
		<label for="name">Adress</label>
		<textarea class="form-control" type="textarea" name="adress"
			id="adress" maxlength="350" rows="7"></textarea>

<label for="name"> Image</label>
		<input type="file" class="form-control" id="image" name="image" required>
		<label for="validationDefault01" class="form-label">Job
			catagory</label>


<label for="name" class="form-label">Job
			catagory</label>

		<div class="form-check form-check-inline">
			<input name="jobcatagory" type="radio" class="form-check-input"
				id="inlineRadio1" value="frontend"> <label for="jobcatagory">
				frontend</label>
		</div>

		<div class="form-check form-check-inline">
			<input name="jobcatagory" type="radio" class="form-check-input"
				id="inlineRadio1" value="backend"> <label for="name">backend</label>
		</div>
		
<label for="validationDefault01" class="form-label"> Job type</label>

		<div class="form-check form-check-inline">
			<input name="jtype" type="radio" class="form-check-input"
				id="inlineRadio1" value="On-office"> <label for="name">
				On-office</label>
		</div>

		<div class="form-check form-check-inline">
			<input name="jtype" type="radio" class="form-check-input"
				id="inlineRadio1" value="remote"> <label for="name">remote</label>
		</div>





		<div class="col-sm-6 form-group">
			<button type="submit" class="btn btn-lg btn-default pull-right">Post</button>
		</div>

	</f:form>
</body>
</html>