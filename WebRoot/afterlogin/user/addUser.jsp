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
</head>
<body>
<div style="height:560px;width:1040px;margin-left:-5px;margin-top:-5px;margin-right:0px;marginborder-bottom:0px;background-color:#677598;float:left;">
<div style="margin-top:0px;">

	<form action="tbUserServlet?method=save" method="post">
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
		<input type="submit" value="保存"/>
		<input type="reset" value="重置"/>
		<br/>
	</form>
	</div>
	<div class="lll" style="height:560px;width:1050px;margin-left:-5px;margin-top:-302px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/lll.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
