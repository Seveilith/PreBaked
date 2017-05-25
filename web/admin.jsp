<%--
  Created by IntelliJ IDEA.
  User: LinnPettersson
  Date: 2017-05-03
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Kontrollerar om användaren som kommer åt sidan är inloggad eller inte.
    String username = (String)request.getSession().getAttribute("Username");

    if (username == null) {
        System.out.println("PreBaked: Username is not defined -> User is not logged in! Redirecting to index.jsp");
        response.sendRedirect("/index.jsp");
    } else if (username.charAt(5) != '0') {
        System.out.println("PreBaked: Username is not an Admin! Redirecting to index.jsp");
        response.sendRedirect("/index.jsp");
    }
%>


<html>
<head>
    <title>PreBaked</title>
    <h1>You are now logged on as admin</h1>
</head>
<body>

<h2>Delete Product </h2>
<form action="product">
    <input type="text" name="id" value="">
    <input type="hidden" name="operation" value="delete">
    <input type="submit" value="Delete">
</form>

<form action="product">
    <table class="product_input">
        <h2>Mata in en ny produkt</h2>
        <tr>
            <th>ID:</th>
            <th>Produktnamn:</th>
            <th>Beskrivning:</th>
            <th>Pris:</th>
            <th>Antal i lager:</th>
        </tr>
    <tr>
        <td><input type="text" name="id" placeholder="ProductId" value=""></td>
        <td><input type="text" name="name" placeholder="Name" value=""></td>
        <td><input type="text" name="description" placeholder="Description" value=""></td>
        <td><input type="text" name="price" placeholder="Price" value=""></td>
        <td><input type="text" name="quantity" placeholder="Quantity" value=""></td>
        <td><input type ="hidden" name="operation" value="insert"></td>
    </tr>
    </table>
    <input type="submit" value="Submit">
</form>
</body>
</html>
