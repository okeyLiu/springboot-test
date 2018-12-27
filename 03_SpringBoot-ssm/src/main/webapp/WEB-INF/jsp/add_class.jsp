<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 引用jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 根路径 -->
<%
	String baseUrl = request.getContextPath() + "/";
	pageContext.setAttribute("baseUrl", baseUrl);
%>
<!DOCTYPE html>
<head>
<title>添加班级</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${baseUrl }style/adminStyle.css" rel="stylesheet"
	type="text/css" />
</head>
<body onload="fun1()">
	<div class="wrap">
		<div class="page-title">
			<span class="modular fl"><i class="add_class"></i><em>添加班级</em></span>
			<span id="p" style="color:red;margin-left:120px;margin-bottom:-10px;">${msg}</span>
		</div>
		<script type="text/javascript">
			function fun1() {
				if("${msg}".length>0){
					alert("${msg}");
				}
			}
		</script>
		<form action="${baseUrl}class/add" method="post">
			<table class="list-style">
				<tr>
					<td style="width: 15%; text-align: right;">班级名称：</td>
					<td><input type="text" name="name"
						class="textBox length-middle" /></td>
				</tr>
				<tr>
					<td style="text-align: right;">班主任：</td>
					<td><input type="text" name="classteacher"
						class="textBox length-middle" /></td>
				</tr>
				<tr>
					<td style="text-align: right;">授课老师：</td>
					<td><input type="text" name="lecturer"
						class="textBox length-middle" /></td>
				</tr>
				<tr>
					<td style="text-align: right;"></td>
					<td><input type="submit" class="tdBtn" value="添加" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>