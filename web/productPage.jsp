<%--
  Created by IntelliJ IDEA.
  User: LinnPettersson
  Date: 2017-05-03
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="product">
    ID:<br>
    <input type="text" name="id" value="">
    <input type ="hidden" name="operation" value="find">
    <br><br>
    <input type="submit" value="Find">
</form>

<h2>Delete Product </h2>
<form action="product">
    <input type="text" name="id" value="">
    <input type="hidden" name="operation" value="delete">
    <input type="submit" value="Delete">
</form>

<form action="product">
    ID:<br>
    <h2>Insert product</h2>
    <input type="text" name="id" placeholder="ProductId" value="">
    <input type="text" name="name" placeholder="Name" value="">
    <input type="text" name="description" placeholder="Description" value="">
    <input type="text" name="price" placeholder="Price" value="">
    <input type="text" name="quantity" placeholder="Quantity" value="">
    <input type ="hidden" name="operation" value="insert">
    <br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
