<strong><u><%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'left.jsp' starting page</title>

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
	margin: 0px;
	font-size: 12px;
}

span {
	height: 30px;
	width: 180px;
	display: block;
	background: #666;
	color: white;
	font-size: 15px;
	line-height: 30px;
	margin-top: 10px;
}

ul {
	display: none;
	list-style-type: none;
}

ul li {
	height: 30px;
	border-bottom: 1px blue dotted;
	line-height: 40px;
}

a {
	font-size: 15px;
	color: blue;
	text-decoration: none;
}

.left {
	border-right: 1px #333 solid;
	widht: 175px;
	height: 500px;
}
.kkk {
	border-right: 1px #333 solid;
	widht: 180px;
	height: 520px;
}
</style>

<script type="text/javascript">
	function showOrHide(id) {
		//获取对应的子菜单
		var submenu = document.getElementById("submenu0" + id);

		//console.log(submenu.style.display);
		//首先判断子菜单是否显示
		if (submenu.style.display == "" || submenu.style.display == null
				|| submenu.style.display == "none") {
			//隐藏DIV
			submenu.style.display = "block";
		} else {
			//显示div
			submenu.style.display = "none";
		}
	}
</script>

</head>

<body>


	<div class="left">
	
  <div class="ddd">
			<img src="images/kkk.jpeg" width="220" height="575">
		</div>
		<div style="margin-top: -570">
			<img src="images/abb.gif" width="220" height="40">
		</div>
		<div style="margin-top: 10">
	<p>您的身份是管理员，正在使用管理员版！</p>
		<span id="menu01" onClick="showOrHide(1)">系统管理</span>
		<ul id="submenu01">
			<li><a href="tbUserServlet?method=findAll" target="rightFrame">用户管理</a>
			</li>
			
			<li><a href="tbUserServlet?method=findPower" target="rightFrame">权限管理</a>
			</li>
		
		</ul>

		<span id="menu02" onClick="showOrHide(2)">模块管理</span>
		<ul id="submenu02">
			<li><a href="tbModuleServlet?method=findAll" target="rightFrame">模块管理</a>
			</li>
			
			
		</ul>

		<span id="menu03" onClick="showOrHide(3)">学生管理</span>
		<ul id="submenu03">
			<li><a href="tbUserServlet?method=findAllgrade" target="rightFrame">成绩管理</a>
			</li>
			
		</ul>
		
		<span id="menu04" onClick="showOrHide(4)">个人中心</span>
		<ul id="submenu04">
			<li><a href="tbUserServlet?method=showPersontwo" target="rightFrame">修改个人信息</a>
			</li>
			
		</ul>
		<br><br>
		<p>管理员您好！请记住您的职责：<br>
		1、角色0代表学生，1代表教师，2代表管理员！<br>
		2、由于教师账号不能注册，请您来分配教师账号。<br>
		3、请补全教师和学生的账号信息。
		</p></div>
	</div>
</body>
</html></u>
</strong>