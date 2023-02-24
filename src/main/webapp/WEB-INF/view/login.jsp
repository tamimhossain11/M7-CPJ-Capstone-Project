<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link href="resources/css/index-styles.css" rel="stylesheet">
  <link href="resources/css/style.css" rel="stylesheet">
  <style>
.navbar{
background-color:

 DarkOliveGreen;

}

</style>
 
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="home">ABC PteLt</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href="login">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href="login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='registration'>Register</a>
        </li>
       
      </ul>
     
    </div>
  </div>
</nav>
<div class="container mt-5">
<div class="card" style="height: 40rem;">
 
  <c:if test="${success != null}">
 <div  style="color: green;font-size: 20px;" role="alert"><c:out value="${success}"/></div>
</c:if>
<c:if test="${error != null}">
 <div  style="color: green;font-size: 20px;" role="alert"><c:out value="${error}"/></div>
</c:if>
 
    

<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="<c:url value="resources/images/signin-image.jpg" />">
						</figure>
						<!-- <a href="register" class="signup-image-link">Create an account</a> -->
						<a class="signup-image-link"  href="registration">Create an account</a>
</div>
					<div class="signin-form">
						<h2 class="form-title">Login</h2>
						 <f:form action="login" modelAttribute="user" method="post">
						<%--  <f:form action="login" modelAttribute="student" method="post"> --%>
						 
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="email" id="email"
									placeholder="Type your email"/>
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="password" id="password"
									placeholder="Type your password"/>
							</div>
							<div class="form-group">
								<input type="checkbox" name="remember-me" id="remember-me"
									class="agree-term" /> <label for="remember-me"
									class="label-agree-term"><span><span></span></span>Remember
									me</label>
							</div>
							<li><a href="forgotpassform">Forgot password</a></li>
							
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" />
							</div>
						</f:form>
						<div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>

  </div>
</div>
</div>

</body>
</html>