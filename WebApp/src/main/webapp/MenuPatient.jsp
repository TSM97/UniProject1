<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date,java.io.*,java.util.Enumeration,java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="ShowPatientServlet" method="post">
<table>
<%
Date date=new Date();
SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y HH:mm");
out.print("<h2 align=\"center\">"+dateForm.format(date).toString()+"</h2>");
%>
<tr><td> welcome <%=session.getAttribute("username") +" !"%></td></tr>
<tr><td><a href="ShowDet.jsp">Show details</a></tr></td>
<tr><td><a href="ShowAppointments.jsp">Show Appointments</a></tr></td>
<tr><td><a href="Login.jsp">Logout</a></tr></td>
</table>
</form>
</body>
</html>