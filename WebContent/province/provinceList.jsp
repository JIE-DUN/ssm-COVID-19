<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>用户列表</title>
	<!-- 设置表格属性,这个属性在../css/my.css这个文件里设置好了，可以修改 -->
	<link rel="stylesheet" type="text/css" href="../css/m.css">
</head>
<body>
	<table id="t1" >
		<tr>
			<td>ID</td>
			<td>省份</td>
			<td>累计确诊</td>
			<td>累计治愈</td>
			<td>累计死亡</td>
			<td>删除</td>
			<td>修改</td>
		</tr>
		<c:forEach items="${allProvinces}" var="p">
			<tr>
				<td><c:out value="${p.id}"/></td>
				<td><c:out value="${p.name}"/></td>
				<td><c:out value="${p.confirmed}"/></td>
				<td><c:out value="${p.cured}"/></td>
				<td><c:out value="${p.died}"/></td>
				<!-- 将"删除"变成超链接，根据u.id删除对应数据 -->
				<td><a href='<c:url value="/province/deleteprovince?pid=${p.id}"></c:url>'>删除</a></td>
				<!-- 将"修改"变成超链接，作用是跳转到修改界面 -->
				<td><a href='<c:url value="/province/provinceEdit?pname=${p.name}"></c:url>'>修改</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7" style="text-align: right">
				<!-- 分页查询，param.pn是判断参数和页面是否相同，相同就没有超链接，不同就有 -->
				<c:forEach begin="1" end="${pages}" step="1" var="i">
					<c:if test="${i == param.pn}">
						[<c:out value="${i}" />]&nbsp;&nbsp;
					</c:if>
					<c:if test="${i != param.pn}">
						<a href='<c:url value="/province/province?cid=${cid}&pn=${i}" />'><c:out value="${i}" /></a>&nbsp;&nbsp;
					</c:if>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td colspan="8">
				<input type="button" onclick="window.location.href='/province/provinceAdd.jsp'" value="新增" />
			</td>
		</tr>
	</table>
</body>
</html>