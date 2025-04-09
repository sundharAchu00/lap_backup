<%@page import="java.util.List"%>
<%@page import="edu.jsp.employee_app.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<link rel="stylesheet" href="./getAllStyle.css">
</head>
<body>

	<%
	List<Employee> employee = (List<Employee>) request.getAttribute("list");
	%>

	<div class="main">
		<section class="formblk">
			<h1>Employee Details</h1>
			<table>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>COMAPNY NAME</th>
					<th>SALARY</th>
					<th>E-MAIL</th>
					<th>PASSWORD</th>
					<th>NUMBER</th>
					<th>DELETE</th>
					<th>UPDATE</th>
				</tr>
				<%
				for (Employee e : employee) {
				%>
				<tr>
					<td><%=e.getId()%></td>
					<td><%=e.getName()%></td>
					<td><%=e.getCname()%></td>
					<td><%=e.getSal()%></td>
					<td><%=e.getEmail()%></td>
					<td><%=e.getPassword()%></td>
					<td><%=e.getPhone_number()%></td>
					<td><a href="delete?id=<%=e.getId()%>">DELETE</a></td>
					<td><a href="get?id=<%=e.getId()%>">UPDATE</a></td>
				</tr>
				<%
				}
				%>
			</table>
		</section>
	</div>
</body>
</html>