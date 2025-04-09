<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<% System.out.println("Hello Im service method"); %>
	
	<%! public void jspDestroy(){
		System.out.println("Hello I'm destroy()");
	} %>
</body>
</html>