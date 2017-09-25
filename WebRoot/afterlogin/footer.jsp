<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'footer.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">

}

.ccc {
	height: 150px;
	width: 1280px;
	float: left;
	border: 0px red solid;
	margin-left: 0;
	margin-top: 0;
}
.ddd {
	height: 30px;
	width: 1280px;
	float: left;
	margin-left: 0;
	margin-top: 0;
}

</style>

  </head>
  
  <body>
  <div style="height:260px;background-color:#76AAE4">
  <div class="ddd">
			<img src="images/ddd.png" width="1280" height="30" />
		</div>
		<div class="ccc">
			<img src="images/ccc.png" width="1280" height="150" />
		</div>
		
	</div>
  </body>
</html>
