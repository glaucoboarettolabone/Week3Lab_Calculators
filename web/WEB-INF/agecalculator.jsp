<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2020, 11:05:43 PM
    Author     : 815000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
