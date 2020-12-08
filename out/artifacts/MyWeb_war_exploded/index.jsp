<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/7 0007
  Time: 上午 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/Login">
    <input type="text" placeholder="请输入密码" name="name"><br>
    <input type="password" placeholder="请输入密码" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
