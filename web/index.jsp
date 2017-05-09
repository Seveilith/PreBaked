<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--<title>Welcome to SamDiG!</title>-->
<link rel='stylesheet' type='text/css' href='./files/css/style.css'>

</head>
<body>

<!--HEADER-->
<%@ include file="header.jsp" %>

<!--MAIN CONTAINER-->
<div class="mainContainer">
	<div class="leftPanel">


		<!--<div class="loginForm">
			<form action="login" method="post">
				<table>
					<tr><td><b>Username:</b></td><td><input type="text" name="username" style="width: 160px; "/></td></tr>
					<tr><td><b>Password:</b></td><td><input type="password" name="password" style="width: 160px; "/></td></tr>
					<tr><td><input type="submit" value="Send" /></td></tr>
				</table>
			</form>
		</div>
-->
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
	
	<div class="centerPanel">
		<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam viverra turpis lacus, ut fringilla massa luctus nec. Ut quis dui nec ipsum tristique dictum. Nulla non maximus quam. Nullam condimentum convallis dolor, a molestie sem semper sit amet. Nulla eleifend dolor sit amet orci hendrerit varius. Praesent mollis consequat ex a elementum. Aenean aliquet ipsum et scelerisque mattis. Sed diam orci, rutrum non nulla in, tempus commodo sem. Donec rutrum in felis eu placerat. Donec dapibus sem nec nulla facilisis eleifend. Pellentesque eu faucibus lorem, vel pretium leo.</p>
		<p> Vivamus neque diam, finibus in convallis id, iaculis ac nisi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam quis elementum est. Nullam quis pellentesque massa, ac gravida metus. Donec dignissim purus mauris, quis eleifend ante hendrerit eu. Aliquam efficitur arcu magna, non efficitur ex tempus ac. Praesent sit amet metus a felis rutrum pellentesque. Quisque in facilisis magna. Ut risus justo, finibus non nulla et, efficitur luctus lectus. Nulla ac laoreet nisi. Cras id est urna. Suspendisse ut tempus augue. Nulla porta risus et ultrices egestas. Fusce volutpat, turpis sit amet iaculis feugiat, dui ligula eleifend velit, eget dictum ligula quam at nulla. Suspendisse odio turpis, luctus ac nisl sed, cursus aliquet est.</p>

		<table border="1px">
			<form action="localhost:8080/PreBaked/src/grupp6.svp/web/servlet/basket" method="post">

				<th>Pizza Name</th> <th>Price</th>  <th>Add to Cart</th>
				<tr><td>Muffuleta</td><td>$20</td><td><input type="hidden" name="name" value="Muffuleta">
					<input type="hidden" name="price" value="20"><input type="submit" value="Add to cart"></td>
				</tr>
			</form>
			<form action="/basket">
				<tr><td>Veggie Delight</td><td>$40</td><td>
					<input type="hidden" name="name" value="Veggie Delight">
					<input type="hidden" name="price" value="40">
					<input type="submit" value="Add to cart"></td>
				</tr>
			</form>
			<form action="grupp6.svp.web.servlet.BasketServlet.java">
				<tr><td>Margherita</td><td>$10</td><td>
					<input type="hidden" name="name" value="margherita">
					<input type="hidden" name="price" value="10">
					<input type="submit" value="Add to cart"></td>
				</tr>

			</form>
		</table>

	</div>

</div>

<!--FOOTER-->
<%@ include file="footer.jsp" %>

</body>
</html>