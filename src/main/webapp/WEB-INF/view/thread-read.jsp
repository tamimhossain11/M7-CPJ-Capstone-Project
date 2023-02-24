<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ page isELIgnored = "false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/thread-read.css" rel="stylesheet" />
</head>
<body>
 <button type="button" class="btn btn-info  me-2 mt-2">
      <a href="${pageContext.request.contextPath}/postthread/${user.id}" class= "view">Post</a></button>
  <div class="container my-3 ">
            <div class="row row-cols-1 mt-3">
<c:forEach items="${thread }" var="thread">
                <div class="col mt-3">
                    <div class="card p-3 d-flex">
                        <div class="wrapper d-flex align-items-center me-3">
                            <div class="logo ">
                                <a class="text-decoration-none"
                                    href="userprofile?name=${thread.getUser().getName()}&id=${thread.getUser().getId()}">
                                </a>
                            </div>
                            <div class="detail me-5">
                                <a class="text-decoration-none" href="${pageContext.request.contextPath}/userprofile">
                                    <span class="fs-4 fw-bold text-dark">${thread.getUser().getName()}</span></a>
                                      <a  class="m-2" href="delete/${thread.id_thread}"
								onclick="return confirm('Are You sure?')"><i
									class="fa-solid fa-trash-can text-danger"></i></a>
                            </div>
                        </div>
                        <div class="content mt-3">
                            <h5 class="text-secondary fs-4">Title: ${thread.getTitle()}</h5>
                            <p>Content: ${thread.getContent()}</p>
                        </div>
<%--                        <div class="comments">
                           <div class="heading">
                                <h5>Comments</h5>
                            </div>

                            <form  action="${pageContext.request.contextPath}/postComment/${user.id}/${thread.id_thread}" method="post" onsubmit="return checkValidation()">
                                <input type="hidden" name="id" value="${thread.id_thread}">
                                 <input type="hidden" name="u_id" value="${user.id}">
                                <div class="form-floating">
                                    <textarea name="comment" class="form-control" id="comment" required></textarea>
                                    <label for="floatingTextarea">Comment</label>
                                </div>
                                <p class="error">Can't post blank comment</p>
                                <button type="submit" class="btn btn-primary fw-bold mt-3">Send Comment</button>
                            </form>
                            <a href="${pageContext.request.contextPath}/allComments/${user.id}/${thread.id_thread}">See all comments</a>
                        </div> --%> 
                                                    <a href="${pageContext.request.contextPath}/allComments/${user.id}/${thread.id_thread}">See all comments</a>
                        
                    </div>
                </div>
                </c:forEach>
                
            </div>
            </div>
</body>
</html>