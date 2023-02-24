<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link href="resources/css/index-styles.css" rel="stylesheet">
  <link href="resources/css/style.css" rel="stylesheet">
   
<meta charset="ISO-8859-1">
<title>Registration</title>
<%@include file="./base.jsp" %>
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

<div class="card" style="height: 60rem; ">
 
  <c:if test="${success != null}">
 <div  style="color: green;font-size: 20px;" role="alert"><c:out value="${success}"/></div>
</c:if>
 
  
 <!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title  text-center">Sign up</h2>
					
							 <f:form action="registration" modelAttribute="user" method="post">
							<div class="form-group">
							 <input
									type="text" name="name" id="name" placeholder="Your Name" required/>
							</div>
							<div class="form-group">
								 <input
									type="text" name="email" id="email" placeholder="Your Email" required/>
							</div>
							<div class="form-group">
								 <input
									type="text" name="password" id="pass" placeholder="Password" required/>
							</div>
							<div class="form-group">
								
								<input type="text" name="re_pass" id="re_pass"
									placeholder="Repeat your password" required />
							</div>
							<div class="form-group">
								 <input
									type="text" name="city" id="city" placeholder="city" required/>
							</div>
							<div class="form-group">
							
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" required/>
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button text-center">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="registration"/>
							</div>
						</f:form>
					</div>
					<div class="signup-image">
						<figure>
						<img  src="<c:url value="resources/images/signup-image.jpg"/>"> 
						</figure>
						<!-- <a href="login.jsp" class="signup-image-link">I am already
							member</a> -->
							  <a class="signup-image-link" href="loginPage">I am already
							member</a>
					</div>
				</div>
			</div>
		</section>
</div>

 

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>

</body>
</html>