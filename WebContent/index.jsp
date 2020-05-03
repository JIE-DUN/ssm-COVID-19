<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
	欢迎来测试
	<!-- 超链接到/country/findall -->
	<a href='<c:out value="/country/findall" />'>查询全部国家信息</a>
</body>
</html>