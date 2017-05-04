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
    <title>Varukorg</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class = "container">

    <h1 style="text-align: center">VARUKORG</h1>
    <div class = "col-md-6 col-md-offset-2">
        <!--hardkodad salängetabell-->
        <table class="basketlist">
            <tr>
                <th>Produkter</th>
                <th>Antal</th>
                <th>Totalt</th>
            </tr>
            <tr>
                <td>RaspberryPlay</td>
                <td>1</td>
                <td>699</td>
            </tr>
            <tr>
                <td>RaspberryCloud</td>
                <td>2</td>
                <td>749</td>
            </tr>
        </table>
    </div>
    <div class = "col-md-2">
        <div class = "totalbasket">
            <h2>TOTALT VARUKORG</h2>
            <table>
                <tr>
                    <td>Produkter</td>
                    <td>1448</td>
                </tr>
                <tr>
                    <td>Fraktkostnad</td>
                    <td>0</td>
                </tr>
                <tr>
                    <td>TOTALT</td>
                    <td>1448</td>
                </tr>
            </table>
        </div>
        <div class="payButton">
            <button type="button">TILL KASSAN</button>
        </div>
    </div>
</div>

</body>
</html>
