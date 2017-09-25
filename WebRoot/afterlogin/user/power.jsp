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
	
	
	function updateById(id){
		location.href="tbUserServlet?method=toPower&id="+id;
	}
</script>
</head>

<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#3372DC;float:left;">

	<div style="font-size:14px; color: red; text-align: center;">
	</div>
	<div style="margin-top:0px;">
	
	<hr />
	<table border="1" width="100%" cellpadding="0" cellspacing="0" align="center">
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>密码</th>
			<th>性别</th>
			<th>学历</th>
			<th>爱好</th>
			<th>备注</th>
			<th>角色</th>
			<th>操作</th>
		</tr>
		<c:forEach var="u" items="${userList}">
			<tr>
				<td>${u.id}</td>
				<td>${u.uname}</td>
				<td>${u.pass}</td>
				<td>${u.sex}</td>
				<td>${u.education}</td>
				<td>${u.hobbies}</td>
				<td>${u.demo}</td>
				<td>${u.roleid}</td>
				<td><input type="button" value="修改权限"
					onclick="updateById(${u.id})" /> </td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="hhh" style="height:560px;width:1050px;margin-left:-5px;margin-top:-350px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/hhh.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
