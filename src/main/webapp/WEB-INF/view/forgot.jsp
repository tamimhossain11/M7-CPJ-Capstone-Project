<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST"  modelAttribute="MemberBean">
        <table>

            <tr>
                <td>Reset your password</td>
                <td><form:input id="mPassword"  path="mPassword" type="text" value="${user.password}"
                     size="10"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center"><input type="submit" value="password"  > 
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>