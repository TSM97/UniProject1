<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>User Login Form</h1>
<form action="PatientServlet" method="post">
<table>
<tr><td> User name: </td><td><input type="text" name="username"></td></tr>
<tr><td> Password: </td><td><input type="password" name="password"></td></tr>
<tr><td></td><td><input type="submit" name="buttonP" value="Login"></td></tr>
<a href="RegisterP.jsp">Register</a>
</table>
</div>
</body>
</html>