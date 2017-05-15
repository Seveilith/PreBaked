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
    <input type="submit" value="Submit">
</form>

<form action="product">
    <input type="hidden" name="operation" value="delete">
    <input type="submit" value="Submit">
</form>

<form action="product">
    ID:<br>
    <h2>Update product</h2>
    <input type="text" name="id" placeholder="id" value="">
    <input type="text" name="id" placeholder="name" value="">
    <input type="text" name="id" placeholder="description" value="">
    <input type="text" name="id" placeholder="" value="">
    <input type="text" name="id" placeholder="" value="">
    <input type ="hidden" name="operation" value="update">
    <br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
