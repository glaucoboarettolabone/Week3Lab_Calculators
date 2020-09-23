<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 22, 2020, 11:37:26 PM
    Author     : 815000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="arithmetic">
            <input type="submit" value="-" name="arithmetic">
            <input type="submit" value="*" name="arithmetic">
            <input type="submit" value="%" name="arithmetic">
        </form>
            <p>${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
