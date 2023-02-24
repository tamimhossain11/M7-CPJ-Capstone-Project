<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="assets/css/style.css" rel="stylesheet" />
  <%@include file="./base.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<style type="text/css">
.body-option {
    width:100%;
    height:100vh;
    background-color:#9a0aed44;
    display: flex;
    align-items: center;
    justify-content: center;
      background-image:url(https://i.gifer.com/JT33.gif);
}

.card{
    width:250px;
    height:300px;
    background-color:#1818183d;
    border-radius:10px;
    display: flex;
  
    justify-content: center;
   color:#0a34eddc;
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
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark ">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ABCPteLt</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
      
    </button>
   <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav">
            <li class="nav-item ">
             <a class="nav-link  active" aria-current="page" href="home">Home</a>
              </li>
               <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href="login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='registration'>Register</a>
        </li>
          </ul>

        </div>
      <ul class="navbar-nav ml-auto ">
        <li class="nav-item">
           <a class="nav-link  active" aria-current="page" href="login">Logout</a>
        </li>
       
      </ul>
     
  
  </div>
</nav>

  <div class="body-option">
     <section id="registration-confirmation" class="mt-5">
  <div class="container d-flex justify-content-center">
    <div class="confirmation d-flex flex-column text-center">
      <i class="fa-solid fa-check text-success"></i>
      <h2 class="fw-semibold">Welcome</h2>
      <p class="text-secondary">
        </br>
        <div  style="color:blue;font-size:160%;">
       <c:out value="${user.name}"></c:out></h6>
       </div></br> Please Go to home page to continue your activity
      </p>
      <div class="wrapper">
        <a href="home" class="btn btn-primary mt-3">Go To HOME</a>
      </div>
    </div>
  </div>
</section>
</div>
   <%@ include file="footer.jsp" %>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>

</body>
</html>