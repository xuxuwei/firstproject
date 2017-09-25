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
	<div style="font-size:14px; color: red; text-align: center;margin-top:0px">
		${info}</div>
	<div style="margin-top:0px;">
	<form action="tbUserServlet?method=savegrade" method="post">
		
		ID:<input type="text" name="id" />大于3
		<br/>
		学号:<input type="text" name="studentid"/>
		<br/>
		姓名:<input type="text" name="name"/>
		<br/>
	
		英语成绩:<input type="text" name="english"/>
		<br/>
		数学成绩:<input type="text" name="math"/>
		<br/>
		语文成绩:<input type="text" name="chinese"/>
		<br/>
		<br/>
		<input type="submit" value="保存"/>
		<input type="reset" value="重置"/>
		</form>
		</div>
	<div class="lll" style="height:560px;width:1050px;margin-left:-5px;margin-top:-190px;margin-right:0px;marginborder-bottom:0px;background-color:#999999;float:left;">
			<img src="images/lll.jpg" width=1040 height=580 />
			</div>
	</div>
</body>
</html>
