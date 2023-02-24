<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <%@include file="./base.jsp" %>
</head>
<body>
<%@ include file="headbeforelogin.jsp" %>

<div class="container my-5">
<div class="row " >
<div class="col-md-6 offset-md-3">
 <div class="card m-3 shadow">
<div class="card-body p-5">
<h1 class="fs-4 fw-bold mb-4 text-center">Forgot Password</h1>
<p style="color:red;" class="text-center">${error}</p>
<form action="emailConfirm" method="post" id="formValidation">

    <div class="form-group">
    <label for="exampleInputEmail1" class="font-weight-bold">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required>
      </div>

<div class="container text-center mb-3">
  <input type="submit" value="Reset Password"  onclick="submitData();" class="btn btn-primary mt-2">
 </div>
</form>
</div>
</div>
</div>
</div>
</div>



<%@ include file="footer.jsp" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
    <script type="text/javascript">
</body>
</html>