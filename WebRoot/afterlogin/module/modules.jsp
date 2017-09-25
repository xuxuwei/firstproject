<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'modules.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
<script type="text/javascript">
	function deleteById(id){
		if(confirm("您是否确定要删除？")){
			location.href="tbModuleServlet?method=delete&id="+id;
		}
	}
	
	function updateById(id){
		location.href="tbModuleServlet?method=toUpdate&id="+id;
	}
</script>
</head>

<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#3372DC;float:left;">

<p>备注：上级模块中1代表系统管理，2代表模块管理，3代表学生管理，4代表个人中心。
	<div style="font-size:14px; color: red; text-align: center;">
		${info}</div>
		<div style="margin-top:0px;">
	<hr />
	<input type="button" value="添加"
		onclick="javascript:location.href='afterlogin/module/addModule.jsp'" />
	<hr />
	<table border="1" width="100%" cellpadding="0" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>模块名</th>
			<th>上级模块ID</th>
			<th>URL</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach var="module" items="${moduleList}">
			<tr>
				<td>${module.id}</td>
				<td>${module.mname}</td>
				<td>${module.upid}</td>
				<td>${module.url}</td>
				<td>${module.demo}</td>
				<td><input type="button" value="修改"
					onclick="updateById(${module.id})" /> <input type="button" value="删除"
					onclick="deleteById(${module.id})" /></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="hhh" style="height:560px;width:1050px;margin-left:-5px;margin-top:-310px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/hhh.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
