<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 2019-03-13
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" media="screen" href="resources/css/index.css" />
    <!-- <script src="main.js"></script> -->
</head>

<body>
<div class="header">WORLDWIDE SHIPPING, FREE SHIPPING OVER $50</div>
<div class="topnav">
    <a href="" id="logo"><img src="resources/images/logo_new.svg"/></a>
    <a href="login">Checkout</a>
    <a href="#">Cart : ["${cart.getSize()}"]</a>
</div>
<div id="success">
    <h1>Thank you! Your order will be shipped soon!</h1>
</div>
<div class="footer">
    <h1>WANT MORE? OF COURSE YOU DO.</h1>
    <h3>
        Join our squad for exclusive access to must-have product releases,
        trending news, boutique & updates.
    </h3>
    <div class="social">
        <a href="#">facebook</a>
        <a href="#">instagram</a>
        <a href="#">youtube</a>
    </div>
    <ul>
        <li><a href="#">FAQ</a></li>
        <li><a href="#">Shipping & returns</a></li>
        <li><a href="#">terms</a></li>
        <li><a href="#">privacy</a></li>
        <li><a href="#">my account</a></li>
        <li><a href="#">about us</a></li>
        <li><a href="#">contact us</a></li>
    </ul>
    <h6>Made by Julia 2019.03</h6>
</div>
</body>
</html>