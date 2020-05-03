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
	<form action="/province/provinceAdd" method="post">
		<input type="hidden" name="id" value='<c:out value="${province.id}" />'/>
		<table>
				<tr>
					<td>省份 ：</td>
					<td><input type="text" name="name" value='<c:out value="${province.name}" />'></td>
				</tr>
				<tr>
					<td>累计确诊：</td>
					<td><input type="text" name="confirmed" value='<c:out value="${province.confirmed}" />'></td>
				</tr>
				<tr>
					<td>累计治愈：</td>
					<td><input type="text" name="cured" value='<c:out value="${province.cured}" />'></td>
				</tr>
				<tr>
					<td>累计死亡：</td>
					<td><input type="text" name="died" value='<c:out value="${province.died}" />'></td>
				</tr>
				<tr>
					<td>cid：</td>
					<td><input type="text" name="cid" value='<c:out value="${province.cid}" />'></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="保存">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>