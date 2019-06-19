<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="js/jquery-3.3.1.min.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <title>公积金数据查询</title>
</head>
<body>

<table class="table table-bordered table table-hover" align='center' border='1' cellspacing='0'>

    <tr  class="text-muted">
        <th>信息校验结果</th>
        <th>公积金中心信息 缴存发生地点</th>
        <th>公积金中心信息 数据发生机构代码</th>
        <th>申请人基本信息 姓名</th>
        <th>申请人基本信息 姓名简拼</th>
        <th>申请人基本信息 性别</th>
        <th>申请人基本信息 个人登记号</th>
        <th>申请人基本信息 个人编号</th>
        <th>申请人基本信息 证件类型</th>
        <th>申请人基本信息 证件号码</th>
        <th>申请人基本信息 出生年月</th>
        <th>申请人基本信息 参加工作时间</th>
        <th>申请人基本信息 税前工资总额</th>
        <th>申请人基本信息 住宅电话</th>
        <th>申请人基本信息 手机号</th>
        <th>申请人基本信息 联系地址(家庭）</th>
        <th>申请人现缴存单位信息 单位名称</th>
        <th>申请人现缴存单位信息 单位登记号</th>
        <th>申请人现缴存单位信息 开户管理部编号</th>
        <th>申请人现缴存单位信息 初次登记时间</th>
        <th>申请人现缴存单位信息 组织机构代码</th>
        <th>申请人现缴存单位信息 营业执照号码</th>
        <th>申请人现缴存单位信息 性质代码</th>
        <th></th>
        <th></th>
        <th>合作平台</th>
        <th>客户身份证号码</th>
        <th>客户姓名</th>
        <th>查询时间</th>
        <th>申请人现缴存单位信息 单位地址</th>
        <th>申请人现缴存单位信息 单位缴存状态</th>
        <th>申请人现缴存单位信息 单位缴存资金来源</th>
        <th>申请人现缴存单位信息 法定代表人或负责人</th>
        <th>申请人现缴存单位信息 单位联系方式</th>
        <th>申请人现缴存单位信息 单位开户银行及行号</th>
        <th>申请人现缴存单位信息 单位账号</th>
        <th>申请人现缴存单位信息 发薪日期</th>
        <th>申请人现缴存单位信息 是否申请公积金缓缴</th>
        <th>申请人现缴存单位信息 申请缓缴时间</th>
        <th>申请人现缴存单位信息 申请缓缴的原因</th>
    </tr>
    <c:forEach items="${list}" var="u" >
        <tr>
            <td>${u.xijyjg}</td>
            <td>${u.jcfsdd}</td>
            <td>${u.sjfsjgdm}</td>
            <td>${u.xm}</td>
            <td>${u.xmjp}</td>
            <td>${u.xb}</td>
            <td>${u.grdjh}</td>
            <td>${u.grbh}</td>
            <td>${u.csny}</td>
            <td>${u.gzsj}</td>
            <td>${u.sqgzze}</td>
            <td>${u.zzdh}</td>
            <td>${u.sjh}</td>
            <td>${u.lxdz}</td>
            <td>${u.dwmc}</td>
            <td>${u.dwdjh}</td>
            <td>${u.khglbbh}</td>
            <td>${u.ccdjsj}</td>
            <td>${u.zzjgdm}</td>
            <td>${u.yyzzhm}</td>
            <td>${u.xzdm}</td>
            <td>${u.zjlx}</td>
            <td>${u.zjhm}</td>
            <td>${u.hzpt}</td>
            <td>${u.khsfzhm}</td>
            <td>${u.kexm}</td>
            <td>${u.cxsj}</td>
        </tr>

        <tr  class="text-muted">
        <th>个人公积金账户信息 公积金账号</th>
        <th>个人公积金账户信息 开户日期</th>
        <th>个人公积金账户信息 初缴年月日</th>
        <th>个人公积金账户信息 缴至年月日</th>
        <th>个人公积金账户信息 当月缴存单位名称</th>
        <th>个人公积金账户信息 当月单位缴存额</th>
        <th>个人公积金账户信息 当月单位缴存比例</th>
        <th>个人公积金账户信息 当月缴存状态</th>
        <th>个人公积金账户信息 最近一次缴交日期</th>
        <th>个人公积金账户信息 当前公积金年度</th>
        <th>个人公积金账户信息 累计缴存次数</th>
        <th>个人公积金账户信息 当前余额</th>
        <th>个人公积金账户信息 近12个自然月个人缴存额</th>
        <th>个人公积金账户信息 近12个自然月个人缴存比例</th>
        <th>个人公积金账户信息 近12个自然月单位缴存比例</th>
        </tr>
        <c:forEach items="${u.account}" var="a">
            <tr>
            <td>${a.gjjzh}</td>
            <td>${a.khrq}</td>
            <td>${a.cjnyr}</td>
            <td>${a.jznyr}</td>
            <td>${a.dyjcdwmc}</td>
            <td>${a.dydwjce}</td>
            <td>${a.dydwjcbl}</td>
            <td>${a.dyjczt}</td>
            <td>${a.zjycjnrq}</td>
            <td>${a.dqgjjnd}</td>
            <td>${a.ljjncs}</td>
            <td>${a.dqye}</td>
            <td>${a.grjce12}</td>
            <td>${a.grjcbl12}</td>
            <td>${a.dwjcbl12}</td>
            </tr>
        </c:forEach>
       <tr class="text-muted">
        <th>个人公积金提取信息 公积金账号</th>
        <th>个人公积金提取信息 提取原因</th>
        <th>个人公积金提取信息 提取时间</th>
        <th>个人公积金提取信息 提取方式</th>
        <th>个人公积金提取信息 核定提取总额</th>
        <th>个人公积金提取信息 提取金额</th>
        <th>个人公积金提取信息 累计提取金额</th>
        <th>个人公积金提取信息 共同提取人姓名</th>
        <th>个人公积金提取信息 共同提取人身份证号</th>
        <th>个人公积金提取信息 共同提取人是否建立公积金</th>
       </tr>
        <c:forEach items="${u.extract}" var="b">
            <tr>
            <td>${b.gjjzh}</td>
            <td>${b.tqyy}</td>
            <td>${b.tqsj}</td>
            <td>${b.tqfs}</td>
            <td>${b.kdtqze}</td>
            <td>${b.tqje}</td>
            <td>${b.ljtqje}</td>
            <td>${b.gttqrxm}</td>
            <td>${b.gttqrsfzh}</td>
            <td>${b.gttqrsfjlgjj}</td>
            </tr>
        </c:forEach>
        <tr class="text-muted">
        <th>个人公积金贷款信息 公积金账号</th>
        <th>个人公积金贷款信息 公积金贷款编号</th>
        <th>个人公积金贷款信息 公积金贷款金额</th>
        <th>个人公积金贷款信息 公积金贷款期限</th>
        <th>个人公积金贷款信息 公积金贷款还款方式</th>
        <th>个人公积金贷款信息 公积金贷款月还款额</th>
        <th>个人公积金贷款信息 公积金贷款起始日期</th>
        <th>个人公积金贷款信息 公积金贷款到期日期</th>
        <th>个人公积金贷款信息 公积金贷款结清日期</th>
        <th>个人公积金贷款信息 公积金贷款贷款余额</th>
        <th>个人公积金贷款信息 共同贷款人姓名</th>
        <th>个人公积金贷款信息 共同贷款人身份证号</th>
        <th>个人公积金贷款信息 共同贷款人是否建立公积金</th>
        <th>个人公积金贷款信息 联系地址(家庭）</th>
        <th>个人公积金贷款信息 贷款状态</th>
        <th>个人公积金贷款信息 当期还款状态</th>
        <th>个人公积金贷款信息 公积金贷款历史发生逾期次数</th>
        <th>个人公积金贷款信息 最大连续的逾期期数（近24个月）</th>
        </tr>
        <c:forEach items="${u.loan}" var="c">
            <tr>
            <td>${c.gjjbh}</td>
            <td>${c.gjjdkbh}</td>
            <td>${c.gjjdkje}</td>
            <td>${c.gjjdknx}</td>
            <td>${c.hkfs}</td>
            <td>${c.yhke}</td>
            <td>${c.qsrq}</td>
            <td>${c.dqrq}</td>
            <td>${c.jqrq}</td>
            <td>${c.dkye}</td>
            <td>${c.gtxm}</td>
            <td>${c.gtsfz}</td>
            <td>${c.gtsfjlgjj}</td>
            <td>${c.lxdz}</td>
            </tr>
        </c:forEach>
        <tr class="text-muted">
        <th>个人购/租房信息 个人购房地址</th>
        <th>个人购/租房信息 个人租房地址</th>
        <th>个人购/租房信息 房屋购买记税价格</th>
        <th>个人购/租房信息 房屋租金</th>
        </tr>
        <c:forEach items="${u.house}" var="d">
            <tr>
            <td>${d.gfdz}</td>
            <td>${d.zfdz}</td>
            <td>${d.fwgmjsjg}</td>
            <td>${d.fwzj}</td>
            </tr>
        </c:forEach>


    </c:forEach>


</table>

</body>
</html>
