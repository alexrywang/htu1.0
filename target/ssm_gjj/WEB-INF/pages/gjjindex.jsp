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


    <form action="${pageContext.request.contextPath }/gjjlogin.do" method="post">

        <table style="height:200px;weight:100px;margin-top:80px;">
           <h2>公积金查询接口</h2>
            <tr>
                <td>合作平台：</td>
                <td><input class="form-control"  id="hzpt" style="WIDTH: 180px" maxLength=50 name="hzpt" ></td>
            </tr>
            <tr>
                <td>客户身份号码：</td>
                <td><input class="form-control"  id="khsfzhm" style="WIDTH: 180px" maxLength=50 name="khsfzhm" ></td>
            </tr>
            <tr>
                <td>客户姓名：</td>
                <td><input class="form-control" id="kexm" style="WIDTH: 180px" maxLength=50 name="kexm" ></td>
            </tr>
            <tr>
                <td>查询时间：</td>
                <td><input placeholder="1999/01/01" class="form-control" id="cxsj" style="WIDTH: 180px" maxLength=50 name="cxsj" ></td>

            </tr>

            <tr>
                <td><input class="btn btn-primary" type="submit" value="登录" /></td>
                <td><input class="btn btn-primary"type="reset" value="重置" /></td>
            </tr>
            <font color="red">${errorMsg}</font>
        </table>

    </form>
</div>
</body>

</html>
