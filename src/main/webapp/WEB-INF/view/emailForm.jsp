<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style type="text/css">
            #sendEmailBtn {
                float: left;
                margin-top: 22px;
            }
            .mails{
            margin-left: 30%;
            margin-top: 5%;
            }
            #receiver[]{
            padding:10px;
            }
            .email{
            padding:5px;
            border-style: insert;
            border-color: white;
            margin-top: 15px;
            }
             .input{
            padding:5px;
             border-style: insert;
            border-color: white;
            margin-top: 15px;
            }
              .sub{
             padding:5px;
             border-style: insert;
             border-color: white;
             margin-top: 15px;
            }
            textarea {
             width: 100%;
             height: 150px;
             padding: 12px 20px;
             box-sizing: border-box;
             border: 2px solid #ccc;
             border-radius: 4px;
             background-color: #f8f8f8;
             font-size: 16px;
             resize: none;
             margin-top: 15px;
            }
            .btns {
            transition-duration: 0.4s;
            background-color: White;
             padding:10px;
             border-style: none;
             width: 150px;
            }

           .btns:hover {
            background-color: green; /* Green */
            color: white;
            cursor: pointer;
            }

            
</style>
</head>
<body style="background-color: DarkSlateGray;">
<%@ include file="headbeforelogin.jsp" %>
 <section class="mails" style="color: Lavender;">
            <h2>Send Email To Users</h2>
            <form id="sendEmailForm" method="post" action="emailf">
                <table id="emailFormBeanTable" border="0" width="80%">
                    <tr>
                        <td>Email To: </td>
                        <td><input id="receiverMail" type="text" name="mailTo" size="40" /></td>
                    </tr>
                    <tr>
                    <td>More Users</td>
                    <td id = "multipleFields"> <button type="button" id="addMore" class="my-btn btn-sm"> Add More </button> </td>        
                    </tr>
                    <tr>
                        <td>Subject: </td>
                       <td><input id="mailSubject" type="text" name="subject" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Message: </td>
                       <td><textarea id="mailMessage" cols="50" rows="10" name="message"></textarea></td>
                    </tr>
                    <tr>
                        <td>Attachment: </td>
                        <td><input class="attachment" id="attachment[]" type="file" name="attachFileObj" size="40" /></td>
                    </tr>
                    <tr>
                    <td></td>
                        <td colspan="2" align="center"><input id="sendEmailBtn" type="submit" value="Send Email" /></td>
                    </tr>
                </table>
            </form>
        </section>
        <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
     
</body>
</html>