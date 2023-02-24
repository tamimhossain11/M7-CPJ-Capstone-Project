<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
            #emailFormDiv {
                text-align: center;
                padding-top: 16px;
            }
             
            #emailFormPage {
                text-decoration: none;
                text-align: center;
                cursor: pointer;
            }
             
            #successMessage {
                text-align: center; 
                color: green; 
                font-size: 25px; 
                padding-top: 17px;
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
        <div id="successMessage">
            <strong>${messageObj}</strong>
        </div>
        <div id="emailFormDiv">
            <a id="emailFormPage" href="emailForm">Go To Email Form Page</a>
        </div>
</body>
</html>