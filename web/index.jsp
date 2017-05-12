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
			<li class="nav__menu-item">
				<a class="nav__menu-link page-link" href="login.jsp" title="Logga in">Logga in</a>
			</li>

		</ul>
	</nav>
</header>

<!--MAIN CONTAINER-->
<div class="container">
	<div class="main-site">

		<div id="buttonLogin">
			<form action="login.jsp">
				<input type="submit" value="Logga in" />
			</form>
			<ul></ul>
		</div>

		<div id="productList">
			<li><a href="#" class="">Paket</a></li>
			<li><a href="#" class="">Tillbehör</a></li>
			<li><a href="#" class="">Enheter</a></li>
			<li><a href="#" class="">Övrigt</a></li>
		</div>


	</div>
	
	<div>
		<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam viverra turpis lacus, ut fringilla massa luctus nec. Ut quis dui nec ipsum tristique dictum. Nulla non maximus quam. Nullam condimentum convallis dolor, a molestie sem semper sit amet. Nulla eleifend dolor sit amet orci hendrerit varius. Praesent mollis consequat ex a elementum. Aenean aliquet ipsum et scelerisque mattis. Sed diam orci, rutrum non nulla in, tempus commodo sem. Donec rutrum in felis eu placerat. Donec dapibus sem nec nulla facilisis eleifend. Pellentesque eu faucibus lorem, vel pretium leo.</p>
		<p> Vivamus neque diam, finibus in convallis id, iaculis ac nisi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam quis elementum est. Nullam quis pellentesque massa, ac gravida metus. Donec dignissim purus mauris, quis eleifend ante hendrerit eu. Aliquam efficitur arcu magna, non efficitur ex tempus ac. Praesent sit amet metus a felis rutrum pellentesque. Quisque in facilisis magna. Ut risus justo, finibus non nulla et, efficitur luctus lectus. Nulla ac laoreet nisi. Cras id est urna. Suspendisse ut tempus augue. Nulla porta risus et ultrices egestas. Fusce volutpat, turpis sit amet iaculis feugiat, dui ligula eleifend velit, eget dictum ligula quam at nulla. Suspendisse odio turpis, luctus ac nisl sed, cursus aliquet est.</p>

		<form action="basket" method="GET">
			Balloon id: <input type="text" name="balloon_Id">
			<br />
			Balloon colour: <input type="text" name="balloon_col" />
			<input type="submit" value="Submit" />
		</form>
	</div>

</div>

<!--FOOTER-->
<%@ include file="footer.jsp" %>

</body>
</html>