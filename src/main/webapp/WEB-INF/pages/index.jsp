<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="js/jquery-3.3.1.min.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <title>登录页面</title>
</head>
<body>
<div align="center">


    <form action="${pageContext.request.contextPath }/login.do" method="post">

        <table style="height:200px;weight:100px;margin-top:80px;">
            <h2>E贷登录</h2>
            <tr>
                <td>账号：</td>
                <td><input class="form-control"  id="username" style="WIDTH: 180px" maxLength=50 name="username" ></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input class="form-control"  id="password" style="WIDTH: 180px" maxLength=50 name="password" type="password" ></td>
            </tr>
            <tr>
                <td><input class="btn btn-primary" type="submit" value="登录" /></td>&nbsp;&nbsp;
                <td><input class="btn btn-primary"type="reset" value="重置" /></td>
            </tr>
            <font color="red">${errorMsg}</font>
        </table>

    </form>
</div>
</body>

</html>