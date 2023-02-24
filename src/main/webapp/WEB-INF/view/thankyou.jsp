
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>thankyou</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
  <link href="/resources/css/registration-successfulpage.css" rel="stylesheet">
    <%@include file="./base.jsp" %>
  
  
 <style type="text/css">
 
  .body-option {
    width:100%;
    height:100vh;
  
    display: flex;
    align-items: center;
    justify-content: center;
}

.card{
    width:250px;
    height:300px;
    background-color:#181818;
    border-radius:10px;
    display: flex;
    align-items: center;
    justify-content: center;
    color:#0a69ed;
    font-size:40px;
}
.card:hover{
    transform: rotate(360deg);
    transition:1.5s;
}
  .navbar{
background-color:

 DarkOliveGreen;

}
  
  
  </style>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div class="nav-option">
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
</div>
<div class="body-option">
<section id="registration-confirmation" class="mt-5">
  <div class="container d-flex justify-content-center">
    <div class="confirmation d-flex flex-column text-center">
      <i class="fa-solid fa-check text-success"></i>
      <h2 class="fw-semibold">Thank You For Your Registration</h2>
      <p class="text-secondary">
        We have send you an confirmation email to</br>
        <div  style="color:blue;font-size:160%;">
       <c:out value="${user.email}"></c:out></h6>
       </div></br> Please confirm your email address to activate your account
      </p>
      <div class="wrapper">
        <a href="login" class="btn btn-primary mt-3">Login to Continue</a>
      </div>
    </div>
  </div>
</section>
</div>
<%@ include file="footer.jsp" %>

</body>
</html>