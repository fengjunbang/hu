<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	function query(){
		
		var name = $("[name='name']").val();
		location.href="${pageContext.request.contextPath}/list?name="+name;
	}
	function upd(id){
		location.href="${pageContext.request.contextPath}/sel?id="+id;
	}
	function selects(id){
		alert(id)
		location.href="${pageContext.request.contextPath}/selects?id="+id;
	}
	
</script>
<body>
	学生姓名：<input type="text" value="${name }" name="name">
	<input type="button" value="查询" onclick="query()"> 
	<table>
		<tr>
			<td>编号</td>
			<td>学生姓名</td>
			<td>性别</td>
			<td>所属学院</td>
			<td>入校日期</td>
			<td>当前宿舍</td>
			<td>宿舍人数</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="i" varStatus="c">
			<tr>
				<td>${ c.index+1}</td>
				<td>${ i.name}</td>
				<td>${ i.sex}</td>
				<td>${ i.coll}</td>
				<td>${ i.startdate}</td>
				<td>${ i.dnum}</td>
				<td>${ i.pcount}</td>
				<td>
					<input type="button" value="更换宿舍" onclick="upd(${i.id })">
					<input type="button" value="更换记录" onclick="selects(${i.id })">
				</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>