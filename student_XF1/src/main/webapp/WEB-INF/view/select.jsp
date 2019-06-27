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
	function query() {

		var name = $("[name='name']").val();
		location.href = "${pageContext.request.contextPath}/list?name=" + name;
	}

	$(
			function() {
				$.ajax({
					type : "get",
					url : "${pageContext.request.contextPath}/dService",
					success : function(obj) {
						var did = '${s.did}';
						for ( var i in obj) {
							$("#droom").append(
									"<option value='"+obj[i].did+"'>"
											+ obj[i].dnum + "</ption>");
							if (obj[i].did == did) { //获取did进行匹配宿舍号
								$("#sp").text(obj[i].dnum);
							}
						}

					}

				})
			})
			
			
			function look(){
				var did = $("#droom").val();
				$.ajax({
					type:"post",
					data:{did:did},
					url:"${pageContext.request.contextPath}/selectD",
					success:function(obj){
						if(obj.pcount==8){
							alert("人已满");
							return ;
						}
					}
				})
			}
	
	
	function update(){
		
		var id = $("[name='id']").val();
		var did = $("#droom").val();
		var did2 = '${s.did}';
		
		alert(did2);
		
		$.ajax({
			type:"post",
			data:{id:id,did:did,did2:did2},
			url:"${pageContext.request.contextPath}/update",
			success:function(obj){
				if(obj){
					alert("修改成功");
					location.href="list";
				}
			}
			
		})
		
	}
</script>
<body>

	<table>
		<tr>
			<td>学生姓名:${s.name }</td>
		</tr>

		<td>性别:${s.sex }
		</td>
		</tr>
		<tr>

			<td>所属学院:${s.coll }</td>
		</tr>

		<tr>

			<td>当前宿舍:<span id="sp"></span>
			</td>
		</tr>
		<tr>

			<td>更换宿舍： <select id="droom" name="droom" onchange="look()">
					<option></option>
			</select> <input type="hidden" name="id" value="${s.id }">
			</td>
		</tr>
		<tr>

			<td><input type="button" value="提交" onclick="update()"></td>
		</tr>
	</table>
</body>
</html>