<%@page import="com.jnu.pojo.room"%>
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
    <li><a href="#">退房办理</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="formtitle"><span>房间列表</span></div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>房间号<i class="sort"><img src="images/px.gif" /></i></th>
        <th>类型</th>
        <th>价格</th>
		<th>房间状态</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        
        <%List<room> list = null;
        list = (List<room>)request.getAttribute("list");
        if(list.isEmpty());
        else
        for(room r : list){
         %>
        <tr>
        <td><%=r.getRoomid() %></td>
        <td><%=r.getRoomtype() %></td>
        <td><%=r.getRoomprice() %></td>
        <td><%=r.getRoomstate() %></td>
        <td>  <a href="javaScript:if(confirm('确定退房吗?')){location.href='jsp/show.jsp'}" class="tablelink">退房</a></td>
        </tr> 
        
        <%} %>
        </tbody>
    </table>
    

       
	</div> 
 

    
    
    </div>


</body>

</html>