<%--
  Created by IntelliJ IDEA.
  User: JJR
  Date: 2019/6/22 0022
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JJ Blog</h1>
<form action="/user/login" method="post">
    username:<input type="text" name="username"><br />
    password:<input type="password" name="password"><br />
    <input type="submit" value="login">
</form>
${msg }
</body>
</html>
