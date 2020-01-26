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
    <li><a href="#">信息管理</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="formtitle"><span>员工列表</span></div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>姓名<i class="sort"><img src="images/px.gif" /></i></th>
        <th>性别</th>
        <th>职位</th>
		<th>工资</th>
		
		<th>身份证号</th>
		<th>登陆密码</th>
		<th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%List<worker> list=null;
        list=(List<worker>)request.getAttribute("list");
        for(worker w : list){
         %>
        <tr>
        <td><%=w.getWorkername() %></td>
        <td><%=w.getWorkersex() %></td>
        <td><%=w.getWorkerposition() %></td>
		<td><%=w.getWorkerwage() %></td>
        <td><%=w.getWorkeridnumber() %></td>
		<td><%=w.getWorkerpassword() %></td>
        <td><a href="form.html" class="tablelink">修改</a>&nbsp;&nbsp;&nbsp;<a href="form.html" class="tablelink">删除</a></td>
        </tr> 
        
        <%} %>
        </tbody>
    </table>
    

       
	</div> 
 

    
    
    </div>


</body>

</html>
