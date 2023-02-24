<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <%@include file="./base.jsp" %>
</head>
<body class="" style="background:#c5b7b788">
	<center>
		<form:form action="adminsearchUsrs" method="post"
			modelAttribute="bean">
Enter User Id code:<form:input path="id" />
			<br />
       User name:<form:input path="name" />
			<br />
       User email:<form:input path="email" />
			<br />
      
       User contact:<form:input path="contact" />
			<br />


			<input type="submit" value="Search">


		</form:form>

		<table border="2" width="100%">
			<tr>
				<th>User id</th>
				<th>User name</th>

				<th>User email</th>
				<th>User contact</th>

				<th>User city</th>
				<th>View profile</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="tab" items="${data}">
				<form action="editor" method="post" modelAttribute="bean">
				<tr>
					<th><input type="text" value="${tab.id }" name="id" readonly></th>
					<th><input type="text" value="${tab.city}" name="city"></th>
					<th><input type="text" value="${tab.contact}" name="contact"></th>
					<th><input type="text" value="${tab.email}" name="email"></th>
					<th><input type="text" value="${tab.name}" name="name"></th>

					<th><a class="nav-link " href="viewProfile/${tab.id}">Profile</a></th>
					<th align="center"><input type="submit" value="Update">
					</form></th>
					<th>
					<form action="delete" method="post" modelAttribute="bean">
					<input type="hidden" value="${tab.id}" name="id">
					<input type="submit" value="Delete">

					</form>
					
					</th>
				</tr>

			</c:forEach>

		</table>
		<h2>${msg}</h2>
	</center>
</body>
</html>