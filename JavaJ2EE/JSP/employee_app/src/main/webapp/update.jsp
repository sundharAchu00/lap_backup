<%@page import="edu.jsp.employee_app.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>
	
	<% Employee e = (Employee)request.getAttribute("emp"); %>
	<div>
		<form action="update">
			<label>ID : </label>
			<input type="text" name="id" value="<%=e.getId()%>" readonly="readonly"><br>
			<label> NAME :</label>
			<input type="text" name="name" value="<%=e.getName()%>"><br>
			<label>COMPANY NAME :</label>
			<input type="text" name="cname" value="<%=e.getCname()%>"><br>
			<label> SALARY :</label>
			<input type="text" name="sal" value="<%=e.getSal()%>"><br>
			<label> MAIL-ID :</label>
			<input type="text" name="mail" value="<%=e.getEmail()%>"><br>
			<label> PASSWORD :</label>
			<input type="text" name="pass" value="<%=e.getPassword()%>"><br>
			<label> PHONE NUMBER :</label>
			<input type="text" name="pno" value="<%=e.getPhone_number()%>"><br>
			<input type="submit" value="UPDATE">
		</form>
	</div>
</body>
</html>