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
<title>My JSP 'users.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
<script type="text/javascript">
	
</script>
</head>

<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#3372DC;float:left;">

	<div style="font-size:14px; color: red; text-align: center;">
		${info}</div>
		<div style="margin-top:0px;">
	<hr />
	
	<hr />
	<table align="center" border="1" width="100%" cellpadding="0" cellspacing="0" align="center">
		<tr>
			<th>ID</th>
			<th>角色ID</th>
			<th>学号</th>
			<th>姓名</th>
			<th>职业</th>
			<th>英语</th>
			<th>数学</th>
			<th>语文</th>
			
		</tr>
		<c:forEach var="u" items="${gradeList}">
			<tr>
				<td>${u.id}</td>
				<td>${u.rid}</td>
				<td>${u.studentid}</td>
				<td>${u.name}</td>
				<td>${u.rname}</td>
				<td>${u.english}</td>
				<td>${u.math}</td>
				<td>${u.chinese}</td>
				
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="hhh" style="height:560px;width:1050px;margin-left:-5px;margin-top:-260px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/hhh.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
