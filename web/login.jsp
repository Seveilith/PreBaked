<%--
  Created by IntelliJ IDEA.
  User: LinnPettersson
  Date: 2017-05-03
  Time: 09:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="mainContainer">
        <div class="loginForm">
            <form action="login" method="post">
                <table>
                    <tr><td><b>Användarnamn:</b></td><td><input type="text" name="username" style="width: 160px; "/></td></tr>
                    <tr><td><b>Lösenord:</b></td><td><input type="password" name="password" style="width: 160px; "/></td></tr>
                    <tr><td><input type="submit" value="Logga in" /></td></tr>
                </table>
            </form>
    </div>
</div>
</body>
</html>
