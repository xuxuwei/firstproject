<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>修改权限</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#677598;float:left;">
<div style="margin-top:0px;">

	<form action="tbUserServlet?method=upPower" method="post">
		<input type="hidden" value="${user.id }" name="id"/>
		<br/>
		权&nbsp;&nbsp;限·:<input type="radio" name="roleid" id="roleid" value="0" <c:if test="${user.roleid=='0'}">checked="checked"</c:if> />学生
		<input type="radio" name="roleid" id="roleid1" value="1" <c:if test="${user.roleid=='1' }">checked="checked"</c:if>/>教师
		<input type="radio" name="roleid" id="roleid2" value="2" <c:if test="${user.roleid=='2' }">checked="checked"</c:if>/>管理员
		<br/>
		
		
		<input type="submit" value="保存"/>
		
		<br/>
	</form>
	</div>
	<div class="lll" style="height:560px;width:1050px;margin-left:-5px;margin-top:-82px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/lll.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
