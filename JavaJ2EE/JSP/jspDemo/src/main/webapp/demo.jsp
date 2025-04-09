<!-- directive tag used to import -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- scriptlet tag==> in scriptlet don't allow methods declaration(we cannot create method inside method) -->>
	<% 
		
		
	%>
	<!--Declarative tag-->
	<%! 
		int a=10;
	%>>
	<!--Expression tag-->
	<%= 
			System.out.println("hello")
	%>>
</body>
</html>