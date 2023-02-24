<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style type="text/css">
            #errorMessage {
                text-align: center; 
                font-size: 25px; 
                padding-top: 17px;
            }
             
            #errorMessage span {
                color: red;
            }
        </style>
</head>
<body>
<ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
              <li class="nav-item">
                <a class="nav-link active"  href="home">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="emailForm">Form</a>
              </li>
              <li class="nav-item">
                <a class="nav-link " href="success">Success</a>
               </li>
               <li class="nav-item">
                <a class="nav-link " href="error">Error</a>
              </li>
              <li class="nav-item">
                <a class="nav-link " href="#"></a>
              </li>
            </ul>
<center>
            <h2>Spring MVC Email Example</h2>
        </center>
        <br /> <br />
        <div id="errorMessage">
            <strong>Sorry, The Email Was Not Sent Because Of The Following Error!</strong>
            <span id="exceptionTrace">${exception.message}</span>
        </div>
</body>
</html>