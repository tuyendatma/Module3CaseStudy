<%--
  Created by IntelliJ IDEA.
  User: TUYEN
  Date: 6/29/2020
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="loginbox">
    <h1>Create account here</h1>
    <form method="post" action="hello">
        <p>Username</p>
        <input type="text" name="username" placeholder="Enter Username">
        <p>Password</p>
        <input type="password" name="password" placeholder="Enter Password">
        <p>Full_name</p>
        <input type="text" name="full_name">
        <p>Email</p>
        <input type="text" name="email">
        <p>Phone Number</p>
        <input type="number" name="phone_number">
        <input type="submit"  value="Create">
        <a href="#">Back to main</a><br>

    </form>
</div>
</body>
</html>
