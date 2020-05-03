<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>用户信息</title>
	<!-- 设置表格属性,这个属性在../css/my.css这个文件里设置好了，可以修改 -->
	<link rel="stylesheet" type="text/css" href="../css/m.css">
</head>
<body>
	<form action="/country/countrySave" method="post">
		<input type="hidden" name="id" value='<c:out value="${country.id}" />'/>
		<table>
				<tr>
					<td>国家 ：</td>
					<td><input type="text" name="name" value='<c:out value="${cname}" />'></td>
				</tr>
				<tr>
					<td>现有确诊：</td>
					<td><input type="text" name="curConfirm" value='<c:out value="${country.curConfirm}" />'></td>
				</tr>
				<tr>
					<td>累计确诊：</td>
					<td><input type="text" name="confirmed" value='<c:out value="${country.confirmed}" />'></td>
				</tr>
				<tr>
					<td>累计治愈：</td>
					<td><input type="text" name="cured" value='<c:out value="${country.cured}" />'></td>
				</tr>
				<tr>
					<td>累计死亡：</td>
					<td><input type="text" name="died" value='<c:out value="${country.died}" />'></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="确定">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>