<%@page import="com.jnu.pojo.user"%>
<%@page import="com.jnu.pojo.worker"%>
<%@page import="com.jnu.pojo.room"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<base href="<%=basePath%>">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {

	$(".select3").uedSelect({
		width : 152
	});
});
</script>
</head>

<body class="sarchbody">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">入住记录查询管理</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="formtitle"><span>记录列表</span></div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>姓名</th>
        <th>性别</th>
        <th>类型</th>
		<th>联系方式</th>
		
		<th>入住房间号</th>
		<th>入住时间</th>
		<th>退房时间</th>
		<th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%List<user> list=null;
        list=(List<user>)request.getAttribute("list");
        for(user u : list){
         %>
        <tr>
        <td><%=u.getCustomername() %></td>
        <td><%=u.getCustomersex() %></td>
        <td><%=u.getCustomertype() %></td>
		<td><%=u.getCustomerphone() %></td>
        <td><%=u.getRoomid() %></td>
        <td><%=u.getIndate() %></td>
		<td><%=u.getOutdate() %></td>
        <td><a href="form.html" class="tablelink">删除</a></td>
        </tr> 
        
        <%} %>
        </tbody>
    </table>
    

       
	</div> 
 

    
    
    </div>


</body>

</html>