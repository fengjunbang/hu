<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/effect/css/index.css" type="text/css"></link>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/effect/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/effect/My97DatePicker/WdatePicker.js"></script>
 <script type="text/javascript">
	function upd() {
		alert("sfaf");
		alert($("#t1").val());
	}
	
 </script>
  </head>
  
  <body >
<input type="button" name="t1" id="t1" value="2222" onclick="upd()">
  </body>
</html>