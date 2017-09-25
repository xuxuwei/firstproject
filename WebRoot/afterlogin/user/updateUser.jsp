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
<title>修改用户</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#677598;float:left;">
<div style="margin-top:0px;">

	<form action="tbUserServlet?method=update" method="post">
		<input type="hidden" value="${user.id }" name="id"/>
		用户名:&nbsp;<input type="text" name="uname" value="${user.uname }"/>
		<br/>
		密&nbsp;&nbsp;码:<input type="password" name="pass" value="${user.pass}"/>
		<br/>
		性&nbsp;&nbsp;别:<input type="radio" name="sex" id="sex" value="男" <c:if test="${user.sex=='男'}">checked="checked"</c:if> />男
		<input type="radio" name="sex" id="sex1" value="女" <c:if test="${user.sex=='女' }">checked="checked"</c:if>/>女
		<br/>
		学&nbsp;&nbsp;历：
		<select name="education" >
			<option value="小学"<c:if test="${user.education=='小学' }">selected="selected"</c:if>>小学</option>
			<option value="初中" <c:if test="${user.education=='初中' }">selected="selected"</c:if>>初中</option>
			<option value="高中" <c:if test="${user.education=='高中' }">selected="selected"</c:if>>高中</option>
			<option value="大专" <c:if test="${user.education=='大专' }">selected="selected"</c:if>>大专</option>
			<option value="本科" <c:if test="${user.education=='本科' }">selected="selected"</c:if>>本科</option>
			<option value="研究生" <c:if test="${user.education=='研究生' }">selected="selected"</c:if>>研究生</option>
			<option value="博士生" <c:if test="${user.education=='博士生' }">selected="selected"</c:if>>博士生</option>
			<option value="博士后" <c:if test="${user.education=='博士后' }">selected="selected"</c:if>>博士后</option>
		</select>
		<br/>
		爱&nbsp;&nbsp;好:
		<c:forEach items="${user.hobbiesList }" var="hobbies">
			<input type="checkbox" name="hobbies" value="${hobbies.name}" <c:if test="${hobbies.flag}"> checked="checked"</c:if>/>${hobbies.name}
		</c:forEach>
		
		
		<br/>
		备&nbsp;&nbsp;注:
		<textarea rows="10" cols="50" name="demo">${user.demo}</textarea>
		<br/>
		<input type="submit" value="保存"/>
		
		<br/>
	</form>
	</div>
	<div class="lll" style="height:560px;width:1050px;margin-left:-5px;margin-top:-302px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/lll.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
