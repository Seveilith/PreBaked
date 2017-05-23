<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--<title>Welcome to SamDiG!</title>-->
<link rel='stylesheet' type='text/css' href='./files/css/style.css'>

</head>
<body>

<!--HEADER-->
<header class="site-header" id="masthead">
	<nav class="nav container">
		<ul class="nav__menu" id="nav-primary">
			<li class="nav__menu-item home">
				<a class="nav__menu-link page-link" id="homeLogo" href="./" rel="index"><img class="loga " src="files/img/logo.png" alt="Loga"></a>
			</li>
			<li class="nav__menu-item">
				<a class="nav__menu-link page-link" href="productPage.jsp" title="Produkter">Produkter</a>
			</li>
			<li class="nav__menu-item">
				<a class="nav__menu-link page-link" href="basket.jsp" title="Varukorg">Varukorg</a>
			</li>

			<%
				String username = (String)request.getSession().getAttribute("Username");

				if (username == null) { %>
					<li class="nav__menu-item">
						<a class="nav__menu-link page-link" href="login.jsp" title="Logga in">Logga in</a>
					</li>
			<% }
				else { %>
					<li class="nav__menu-item">
						<a class="nav__menu-link page-link" href="logout.jsp" title="Logga in">Logga ut</a>
					</li>
			<% } %>


		</ul>
	</nav>
</header>

<!--MAIN CONTAINER-->
<div class="container">

</div>

<!--FOOTER-->
<%@ include file="footer.jsp" %>

</body>
</html>