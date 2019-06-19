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
    <title>申请页面</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath }/apply.do" method="post">

        <table style="height:200px;weight:100px;margin-top:80px;">
            <h2>申请贷款</h2>
            <tr>
                <td>公积金缴纳省份：</td>
                <td><input class="form-control"  id="payprovince" style="WIDTH: 180px" maxLength=50 name="payprovince" ></td>
            </tr>
            <tr>
                <td>公社税局：</td>
                <td><input class="form-control"  id="gssj" style="WIDTH: 180px" maxLength=50 name="gssj" type="gssj" ></td>
            </tr>
            <tr>
                <td>联系地址：</td>
                <td><input class="form-control"  id="address" style="WIDTH: 180px" maxLength=50 name="address" ></td>
            </tr>
            <tr>
                <td>联系人：</td>
                <td><input class="form-control"  id="truename" style="WIDTH: 180px" maxLength=50 name="truename" ></td>
            </tr>
            <tr>
                <td>还款卡号：</td>
                <td><input class="form-control"  id="paycardnumber" style="WIDTH: 180px" maxLength=50 name="paycardnumber" ></td>
            </tr>
            <tr>
                <td><input class="btn btn-primary" type="submit" value="登录" /></td>&nbsp;&nbsp;
                <td><input class="btn btn-primary" type="reset" value="重置" /></td>
            </tr>
        </table>

    </form>




</div>
</body>

</html>

