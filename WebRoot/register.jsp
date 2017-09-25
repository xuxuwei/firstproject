<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>添加用户</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="styles.css">
<style type="text/css">

.jjj {
	height:880px;
	width:1260px;
	margin-top:0px;	
	margin-left:0px;	
	float: left;
	border: 0px red solid;
}

</style>

</head>
<body>
<div style="height:880px;width:1260px;margin-left:-25px;margin-top:-30px;margin-right:-25px;marginborder-bottom:-30px;background-color:#999999;float:left;">
<div class="jjj">
			<img src="images/jjj.jpg" width=1310 height=940 />
			</div>
<div style="font-size:14px; color: red; text-align: center;">
		${info}</div>
		<div style="height:340px;width:-235px;margin-left:50px;margin-top:-780px;border:3px #CFD3B8 solid;background-color:#9BD0F0;float:left;">
	<form action="tbUserServlet?method=register" method="post">
	<p>本页面只能注册学生用户，教师用户由管理员来分配！</p>
		用户名:&nbsp;<input type="text" name="uname"/>
		<br/>
		密&nbsp;&nbsp;码:<input type="password" name="pass"/>
		<br/>
		性&nbsp;&nbsp;别:<input type="radio" name="sex" id="sex" value="男" checked="checked"/>男
		<input type="radio" name="sex" id="sex1" value="女"/>女
		<br/>
		学&nbsp;&nbsp;历：
		<select name="education">
			<option value="小学">小学</option>
			<option value="初中">初中</option>
			<option value="高中">高中</option>
			<option value="大专">大专</option>
			<option value="本科">本科</option>
			<option value="研究生" selected="selected">研究生</option>
			<option value="博士生">博士生</option>
			<option value="博士后">博士后</option>
		</select>
		<br/>
		爱&nbsp;&nbsp;好:<input type="checkbox" name="hobbies" value="敲代码"/>敲代码
		<input type="checkbox" name="hobbies" value="打麻将" checked="checked"/>打麻将
		<input type="checkbox" name="hobbies" value="钓鱼"/>钓鱼
		<input type="checkbox" name="hobbies" value="打球"/>打球
		<br/>
		备&nbsp;&nbsp;注:
		<textarea rows="10" cols="50" name="demo"></textarea>
		<br/>
		<input type="submit" value="注册"/>
		<input type="reset" value="重置"/>
		<input type="button" value="返回登录" onclick="javascript:location.href='login.jsp'"/>
		<br/>
	</form>
	</div>
	</div>
</body>
</html>
