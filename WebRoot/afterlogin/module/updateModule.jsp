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
<title>修改模块</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#677598;float:left;">
<div style="margin-top:0px;">
	<form action="tbModuleServlet?method=update" method="post">
		<input type="hidden" value="${module.id }" name="id"/>
		模块名:&nbsp;<input type="text" name="mname" value="${module.mname }"/>
		<br/>
		上级模块:<input type="radio" name="upid" id="upid" value="1" <c:if test="${module.upid=='1'}">checked="checked"</c:if> />系统管理
		<input type="radio" name="upid" id="upid1" value="2" <c:if test="${module.upid=='2'}">checked="checked"</c:if> />模块管理
		<input type="radio" name="upid" id="upid2" value="3" <c:if test="${module.upid=='3'}">checked="checked"</c:if> />学生管理
		<input type="radio" name="upid" id="upid3" value="4" <c:if test="${module.upid=='4'}">checked="checked"</c:if> />个人中心
		<br/>
		URL:&nbsp;&nbsp;&nbsp;<input type="text" name="url" value="${module.url}"/>
		<br/>
		<br/>
		备&nbsp;&nbsp;注:
		<textarea rows="10" cols="50" name="demo">${module.demo}</textarea>
		<br/>
		<input type="submit" value="保存"/>
		<input type="reset" value="重置"/>
		<br/>
	</form>
	</div>
	<div class="lll" style="height:560px;width:1050px;margin-left:-5px;margin-top:-281px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/lll.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
