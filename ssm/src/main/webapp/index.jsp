<%--
  Created by IntelliJ IDEA.
  User: 10641
  Date: 19/2/15
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">查询所有</a>
<form action="account/save" method="post">
    账户名称：<input type="text" name="name"/><br/>
    账户金额：<input type="text" name="money"><br/>
    <input type="submit" value=" 保存 "/>
</form>
</body>
</html>
