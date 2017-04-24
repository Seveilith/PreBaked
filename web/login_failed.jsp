<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to SamDiG!</title>
<link rel='stylesheet' type='text/css' href='./files/css/style.css'>

</head>
<body>

<!--HEADER-->
<%@ include file="header.jsp" %>

<!--MAIN CONTAINER-->
<div class="mainContainer">
	<div class="leftPanel">
		<div class="loginForm">
			<form action="login" method="post">
				<table>
					<tr><td><b>Username:</b></td><td><input type="text" name="username" style="width: 160px; "/></td></tr>
					<tr><td><b>Password:</b></td><td><input type="password" name="password" style="width: 160px; "/></td></tr>
					<tr><td></td><td><b>Login failed!</b></td></tr>
					<tr><td><input type="submit" value="Send" /></td></tr>
				</table>
			</form>
		</div>
	</div>
	
	<div class="centerPanel">
		<h1> Welcome to SAM-DIG SERVICE! :) </h1>
		<p> This is a service framework for you to use. Have fun!</p>
	</div>
	
</div>

<!--FOOTER-->
<%@ include file="footer.jsp" %>

</body>
</html>