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
		<div style="height:30px;width:-235px;margin-left:50px;margin-top:-780px;border:3px #CFD3B8 solid;background-color:#9BD0F0;float:left;">
	恭喜您，注册成功！
		<input type="button" value="返回登录" onclick="javascript:location.href='login.jsp'"/>
		<br/>
</div>
	</div>
</body>
</html>
