<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


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



	</div>

	<!-- Sidebar -->
	<div class="w3-sidebar w3-bar-block w3-light-grey w3-card-2" style="width:30%">
		<a href="#" class="w3-bar-item w3-button">Paket</a>
		<a href="#" class="w3-bar-item w3-button">Enheter</a>
		<div class="w3-dropdown-hover">
			<button class="w3-button">Paket
				<i class="fa fa-caret-down"></i>
			</button>
			<div class="w3-dropdown-content w3-bar-block">
				<a href="#" class="w3-bar-item w3-button">Mediapack</a>
				<a href="#" class="w3-bar-item w3-button">Cloudpack</a>
			</div>
		</div>
		<a href="#" class="w3-bar-item w3-button">Link 3</a>
	</div>

	<div style="margin-left:30%">
	
	<div class="centerPanel">
		<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam viverra turpis lacus, ut fringilla massa luctus nec. Ut quis dui nec ipsum tristique dictum. Nulla non maximus quam. Nullam condimentum convallis dolor, a molestie sem semper sit amet. Nulla eleifend dolor sit amet orci hendrerit varius. Praesent mollis consequat ex a elementum. Aenean aliquet ipsum et scelerisque mattis. Sed diam orci, rutrum non nulla in, tempus commodo sem. Donec rutrum in felis eu placerat. Donec dapibus sem nec nulla facilisis eleifend. Pellentesque eu faucibus lorem, vel pretium leo.</p>
		<p> Vivamus neque diam, finibus in convallis id, iaculis ac nisi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam quis elementum est. Nullam quis pellentesque massa, ac gravida metus. Donec dignissim purus mauris, quis eleifend ante hendrerit eu. Aliquam efficitur arcu magna, non efficitur ex tempus ac. Praesent sit amet metus a felis rutrum pellentesque. Quisque in facilisis magna. Ut risus justo, finibus non nulla et, efficitur luctus lectus. Nulla ac laoreet nisi. Cras id est urna. Suspendisse ut tempus augue. Nulla porta risus et ultrices egestas. Fusce volutpat, turpis sit amet iaculis feugiat, dui ligula eleifend velit, eget dictum ligula quam at nulla. Suspendisse odio turpis, luctus ac nisl sed, cursus aliquet est.</p>
	</div>

</div>

<!--FOOTER-->
<%@ include file="footer.jsp" %>

</body>
</html>