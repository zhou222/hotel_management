<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">入住办理</a></li>
    <li><a href="#">选择房间</a></li>
    <li><a href="#">用户登记</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息</span></div>
    <form method="post" action="servlet/regServlet" >
    <ul class="forminfo">
    <li><label>房号</label><input name="roomid" type="text" class="dfinput" /></li>
    <li><label>姓名</label><input name="name" type="text" class="dfinput" /></li>
    <li><label>联系方式</label><input name="phone" type="text" class="dfinput" /><i>emial或手机号</i></li>
    <li><label>性别</label><cite><input name="sex" type="radio" value="男" checked="checked" />男&nbsp;&nbsp;&nbsp;&nbsp;<input name="sex" type="radio" value="女" />女</cite></li>
    <li><label>用户类别</label><select name="type" class="dfinput"><option value="会员">会员</option><option value="普通">普通</option></select></li>
	<li><label>身份证号</label><input name="incredit" type="text" class="dfinput" value="" /></li>
	
	<li><label>入住日期</label><input name="indate" type="text" class="dfinput" /></li>
	<li><label>退房日期</label><input name="outdate" type="text" class="dfinput" /></li>
	<li><label>操作员工id</label><input name="cname" type="text" class="dfinput" /></li>
	
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认办理"/></li>
	
	
    </ul>
    </form>
    
    </div>


</body>

</html>
