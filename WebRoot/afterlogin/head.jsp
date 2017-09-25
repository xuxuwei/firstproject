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

<title>My JSP 'head.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
* {
	font-size: 14px;
	margin: 0px;
	background-color: #999;
}

.logo {
	height: 100px;
	width: 100px;
	float: left;
	border: 0px red solid;
}
.bbb {
	height: 60px;
	width: 540px;
	float: left;
	margin-left: 300;
	margin-top: 5;
}

.time {
	width: 400px;
	height: 20px;
	margin-top: 0px;
	float: right;
}
</style>

<script type="text/javascript">
	//定时器
	//var mytimeout;

	function showTime() {
		var today = new Date();

		var year = today.getFullYear();
		var month = today.getMonth() + 1;
		var date = today.getDate();

		var hour = today.getHours();
		var minute = today.getMinutes();
		var seconds = today.getSeconds();

		if (month < 10) {
			month = "0" + month;
		}
		if (date < 10) {
			date = "0" + date;
		}
		if (hour < 10) {
			hour = "0" + hour;
		}
		if (minute < 10) {
			minute = "0" + minute;
		}
		if (seconds < 10) {
			seconds = "0" + seconds;
		}

		var str = year + "-" + month + "-" + date + " " + hour + ":" + minute
				+ ":" + seconds;

		document.getElementById("time").innerHTML = str;

		window.setTimeout("showTime()", 1000);
	}
</script>
</head>

<body onLoad="showTime()">
	<div style="height:120px;background-color:#76AAE4">
	
		<div class="logo">
			<img src="images/logo.png" width="100" height="100" />
		</div>
		<p><font color="#00FF00" size="20" ><big><i>亲爱的用户“</i><strong>${user.uname}</strong><i>”您好，恭喜您登录成功！欢迎来到中南大学研究生教务管理系统！</i></big></font></p>
		<div class="bbb">
			<img src="images/bbb.png" width="540" height="60" />
		</div>
		<div class="time" style="background-color:#999999">
			当前系统时间为：<span id="time"></span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="login.jsp?action=logout" target="_head">退出登录</a> 
		
		<br/>
		</div>
	</div>
</body>
</html>
