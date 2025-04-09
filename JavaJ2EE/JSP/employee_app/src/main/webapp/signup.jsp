<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link rel="stylesheet" href="./signup_style.css">
</head>
<body>
	<div class="main">
		<section class="formblk">
		<h1>REGISTER EMPLOYEE</h1>
		<form action="signup" method="post">
			<input type="text" name="name" placeholder="Enter Your Name"><br>
			<input type="text" name="cname" placeholder="Enter Your Company Name"><br>
			<input type="text" name="job" placeholder="Designation"><br>
			<input type="number" name="sal" placeholder="Enter Your salary"><br>
			<input type="email" name="mail" placeholder="Enter Your Email"><br>
			<input type="password" name="pass" placeholder="Enter Your Password"><br>
			<input type="text" name="pno" placeholder="Enter Your phone number"><br>
			<input type="submit" value="SignUp">
		</form>
		</section>
	</div>
</body>
</html>