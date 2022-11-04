<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ShowPatientServlet" method="post">

<table>
<tr><td> Username: </td><td><%=session.getAttribute("username") 
%></td></tr>
<tr><td> Password: </td><td><%=session.getAttribute("password") %></td></tr>
<tr><td> Name: </td><td><%=session.getAttribute("name") %></td></tr>
<tr><td> Surname: </td><td><%=session.getAttribute("surname") %></td></tr>
<tr><td> AMKA: </td><td><%=session.getAttribute("AMKA") %></tr>
</table>
<a href="MenuPatient.jsp">Back</a>
</form>
</body>
</html>