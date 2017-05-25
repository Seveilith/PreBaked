<%@ page import="grupp6.svp.data.DataTransferObjects.ProductData" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="../head.jsp"%>
</head>
<body>
<%
    // retrieve your list from the request, with casting
    ArrayList<ProductData> list = (ArrayList<ProductData>) session.getAttribute("products");
%>
<div class="table-responsive">
<table class="table">
    <tr>
        <th>ProductName</th>
        <th>ProductDescription</th>
        <th>ProductPrice</th>
        <th>ProductQuantity</th>
    </tr>

    <% if (list != null) {
        for (ProductData data : list) {%>
    <tr>
        <td><%out.println(data.getProductName());%></td>
        <td><%out.println(data.getProductDescription());%></td>
        <td><%out.println(data.getProductPrice());%></td>
        <td><%out.println(data.getProductQuantity());%></td>
    </tr>
    <%
            }
        }
    %>
</table>
</div>

<form action="product" method="get">
    ID:<br>
    <input type="text" name="id" value="">
    <input type="hidden" name="operation" value="find">
    <br><br>
    <input type="submit" value="Find">
</form>

</body>
</html>