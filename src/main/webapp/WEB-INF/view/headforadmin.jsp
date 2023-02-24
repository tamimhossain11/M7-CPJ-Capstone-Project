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
 <%@ include file="headforadmin.jsp"%>

<nav class="navbar navbar-expand-lg navbar-dark  id="mainNav"">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ABCPteLt</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
      
    </button>
   <div class="collapse navbar-collapse" id="navbarSupportedContent" id="navbarResponsive">
          <ul class="navbar-nav">
            <li class="nav-item ">
             <a class="nav-link  active" aria-current="page" href="adminwelcome">AdminHome</a>
              </li>
               <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href="adminpage">ViewUsers</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='admin'>ControlUsers</a>
        </li>
  <li class="nav-item">
         <a class="nav-link active" href="emailForm">SendEmail</a>
        </li>
         <li class="nav-item">
         <a class="nav-link active" href="postjob">Postjob</a>
        </li>
        

   
       
      </ul>
     
  
  </div>
</nav>
</body>
</html>