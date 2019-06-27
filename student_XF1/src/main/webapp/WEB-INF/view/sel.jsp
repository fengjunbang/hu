<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入css样式 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/effect/css/index.css">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/effect/js/jquery-1.8.2.min.js"></script>

</head>
<script type="text/javascript">
	function back(){
		location.href="${pageContext.request.contextPath}/list";
	}
</script>
<body>
	姓名:${stu.name };性别:${stu.sex };入学日期:<fmt:formatDate value="${stu.startdate}" pattern="yyyy-MM-dd"/>
	<table>
		<tr>
			<td>宿舍编号</td>
			<td>宿舍人数</td>
			<td>宿舍进入日期</td>
			<td>离开日期</td>
		</tr>
		<c:forEach items="${list }" var="i">
			<tr>
				<td>${i.dnum }</td>
				<td>${i.pcount }</td>
				<td>${i.startdate }</td>
				<td>${i.leavedate }</td>
			</tr>
		</c:forEach>
	</table>
	<tr>
		<td><input type="button" value="back" onclick="back()"> </td>
	</tr>
	
</body>
</html>