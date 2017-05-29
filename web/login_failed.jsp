<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome to SamDiG!</title>
    <link rel='stylesheet' type='text/css' href='files/css/style.css'>

</head>
<body>

<!--HEADER-->
<%@ include file="head.jsp" %>

<!--MAIN CONTAINER-->
<div class="mainContainer">

    <h1>Inloggning misslyckades!</h1>
    <div id="returnButton">
        <form action="/login">
            <input type="submit" value="Försök igen"/>
        </form>
        <form action="index.jsp">
            <input type="submit" value="Återvänd till startsida"/>
        </form>
        <ul></ul>
    </div>

</div>

</body>
</html>