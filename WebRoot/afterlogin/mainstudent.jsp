<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%-- <base href="<%=basePath%>"> --%>
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
<frameset rows="100px,*,180px" border="0" frameborder="no">
	<frame src="afterlogin/head.jsp" scrolling="no" name="head">
    <frameset cols="220px,*">
    	<frame src="afterlogin/leftstudent.jsp">
        <frame src="afterlogin/right.jsp" name="rightFrame">
    </frameset>
    <frame src="afterlogin/footer.jsp">
 </frameset>
</html>
