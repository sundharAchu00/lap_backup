<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-In</title>

<link rel="stylesheet" href="./signup_style.css">

</head>
<body>
	<div class="main">
		<section class="formblk">
			<h1>LOGIN</h1>
			<form action="signin" method="get">
				<input type="email" name="mail" placeholder="Enter Your Mail"><br>
				<input type="password" name="pass" placeholder="Enter Password Here"><br>
				<input type="submit" value="SignIn">
			</form>
		</section>
	</div>
</body>
</html>