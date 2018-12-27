<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 引用jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 根路径 -->
<% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);
%>
<!DOCTYPE html>
<head>
<title>订单详情</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${baseUrl }style/adminStyle.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div class="wrap">
		<div class="page-title">
			<span class="modular fl"><i class="order"></i><em>编号：${requestScope.clazz.id}</em></span>
		</div>
		<p>${msg}</p>
		<dl class="orderDetail">
			<dt class="order-h">班级详情</dt>
			<form action="${baseUrl }class/edit" method="post"> 
						<input
							type="hidden" class="h-cont h-left" name="id"
							value="${requestScope.clazz.id}" />
				<dd>
					<ul>
						<li><span class="h-cont h-right">班级名称：</span> <input
							type="text" class="h-cont h-left" name="name"
							value="${requestScope.clazz.name}" /></li>
						<li><span class="h-cont h-right">班主任：</span> <input
							type="text" class="h-cont h-left" name="classteacher"
							value="${requestScope.clazz.classteacher}" /></li>
						<li><span class="h-cont h-right">授课老师：</span> <input
							type="text" class="h-cont h-left" name="lecturer"
							value="${requestScope.clazz.lecturer}" /></li>
					</ul>
				</dd>
				<dd>
					<!-- Operation -->
					<div class="BatchOperation center">
						<input type="submit" value="修改" class="btnStyle" />
					</div>
				</dd>
			</form>
		</dl>
	</div>
</body>
</html>