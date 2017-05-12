<%--
  Created by IntelliJ IDEA.
  User: LinnPettersson
  Date: 2017-05-03
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PreBaked</title>
    <h1>You are now logged on as admin</h1>
</head>
<body>

<div>
    <form action="product" method="GET">
        <table class="product_input">
            <caption>Mata in en ny produkt</caption>
            <tr>
                <th>Produktnamn:</th>
                <th>Beskrivning:</th>
                <th>Pris:</th>
                <th>Antal i lager:</th>
            </tr>
            <tr>
                <td><input type="text" name="product_name"></td>
                <td><input type="text" name="product_description"/></td>
                <td><input type="text" name="product_price"></td>
                <td><input type="text" name="product_quantity" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>

</body>
</html>
