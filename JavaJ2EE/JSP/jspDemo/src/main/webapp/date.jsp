<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date and Time</title>
</head>
<body>
	<h1>The Current Date And Time</h1>

	<%	Date d = new Date();%>
	
	<%= d.toString()%>
</body>
</html>