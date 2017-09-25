<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE>
<html>
<head>
<base href="<%=basePath%>">

<title>登录界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="styles.css">
<style type="text/css">

.nng {
	height:880px;
	width:1260px;
	margin-top:0px;	
	margin-left:0px;	
	float: left;
	border: 0px red solid;
}
.aaa {
	height:150px;
	width:480px;
	margin-top:-800px;	
	margin-left:380px;	
	float: left;
	border: 0px red solid;
}

</style>

</head>

<body>
<div style="height:880px;width:1260px;margin-left:-25px;margin-top:-30px;margin-right:-25px;marginborder-bottom:-30px;background-color:#999999;float:left;">
<div class="nng">
			<img src="images/nng.png" width=1310 height=940 />
			</div>
<div class="aaa">
			<img src="images/aaa.png" width=480 height=150 />
			</div>
			<div style="height:66px;width:-235px;margin-left:480px;margin-top:-390px;background-color:#5E777C;float:left;">
			<form action="tbUserServlet?method=login" method="post">
		用户名:<input type="text" name="username" /><br /> 密&nbsp;码:<input
			type="password" name="password" /><br /> <input type="submit"
			value="登录" /> <input type="button" value="注册" onclick="javascript:location.href='register.jsp'"/>
	</form>
		</div>
	</div>
</body>
</html>
