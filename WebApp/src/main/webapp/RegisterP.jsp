<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>
<form action="RegisterPatientServlet" method="post">
<table>
<div id="Show" style="visibility:hidden;">
<tr><td> User name: </td><td><input type="text" name="username"></td></tr>
<tr><td> Password: </td><td><input type="password" name="password"></td></tr>
<tr><td> name: </td><td><input type="text" name="name"></td></tr>
<tr><td> surname: </td><td><input type="text" name="surname"></td></tr>
<tr><td> AMKA: </td><td><input type="text" name="AMKA"></td></tr>
</div>
<tr><td></td><td><input type="submit" name="button1" value="Register as patient"></td></tr>
</table>
</form>
</body>
</html>