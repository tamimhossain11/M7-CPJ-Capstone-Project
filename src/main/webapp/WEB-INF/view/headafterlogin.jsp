<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <%@include file="./base.jsp" %>
  <style>
.navbar{
background-color:

 DarkOliveGreen;

}

</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark  id="mainNav"">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ABCPteLt</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
      
    </button>
   <div class="collapse navbar-collapse" id="navbarSupportedContent" id="navbarResponsive">
          <ul class="navbar-nav">
            <li class="nav-item ">
             <a class="nav-link  active" aria-current="page" href="test">Home</a>
              </li>
               <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href="login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='registration'>Register</a>
        </li>
  <li class="nav-item active"><a class="nav-link" href="#about">About</a></li>
                        <li class="nav-item active"><a class="nav-link" href="#services">Services</a></li>
                        <li class="nav-item active"><a class="nav-link" href="#portfolio">Jobs</a></li>
                        <li class="nav-item active"><a class="nav-link" href="#contact">Contact</a></li>
                         <li class="nav-item active"><a class="nav-link" href="userProfile">Profile</a></li>
                             <li class="nav-item active"><a class="nav-link" href="searchUser">viewProfile</a></li>
                              <li class="nav-item active"><a class="nav-link" href="message">message</a></li>
                                <li class="nav-item active"><a class="nav-link" href="testIndex">testIndex</a></li>
                                 <li class="nav-item active"><a class="nav-link" href="thread-post">PostThread</a></li>
                                  <li class="nav-item active"><a class="nav-link" href="thread-read">ReadThread</a></li>
                                    <li class="nav-item active"><a class="nav-link" href="comment">comment</a></li>
                              
          </ul>

        </div>
      <ul class="navbar-nav ml-auto ">
        <li class="nav-item">
           <a class="nav-link  active" aria-current="page" href="loginPage">Logout</a>
        </li>
       
      </ul>
     
  
  </div>
</nav>
</body>
</html>