<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
<link href="resources/css/UserProfile.css" rel="stylesheet">
  
</head>
<body>

<%@ include file="headafterlogin.jsp" %>

	<div
		class="d-flex flex-wrap align-items-center justify-content-center mx-auto pt-3 pb-5 mb-5 rounded bg-crm"
		style="width: 50%">
		<form method="post" class="col-8" id="edit" action="update">
		<%-- <c:forEach var="user" items="${listuser}"> --%>
			<div class="mb-3">
				<input class="form-control" value="${user.id}"
					name="id" id="id" hidden="hidden"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputname"> Name</label>
				<input type="text" class="form-control" value="${user.name}"
					name="name" id="name" />
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputemail">Email</label>
				<input type="text" class="form-control" name="email" id="email" value="${user.email}"/>
			</div>
			
			<div class="mb-3">
				<label class="form-label" for="inputcity">City</label>
				<input type="text" class="form-control" name="city" id="city" value="${user.city}"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputname">Phone</label>
				<input type="text" class="form-control" name="contact" id="contact" value="${user.contact}"/>
			</div>
			
			<button type="submit" class="btn btn-primary" id="update"
				name="update">Save</button>
		<%-- </c:forEach> --%>
		</form>
	</div>
    
    <%@ include file="footer.jsp" %>
</body>
</html>