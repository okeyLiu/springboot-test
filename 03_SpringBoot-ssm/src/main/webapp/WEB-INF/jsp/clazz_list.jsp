<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引用jstl标签库 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!-- 根路径 -->
<% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);
%>  
<!DOCTYPE html>
<head>
<title>班级列表</title>
<meta http-equiv="Content-Type" content=2"text/html; charset=utf-8" />
<link href="${baseUrl }style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="${baseUrl }js/jquery.js"></script>
<script src="${baseUrl }js/public.js"></script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="order"></i><em>班级列表</em></span>
  </div>
  <div class="operate">
   <form action="${baseUrl }class/find">
    <img src="${baseUrl }images/icon_search.gif"/>
    <input type="text" class="textBox length-long" name="name" placeholder="输入班级名称"/>
    <input type="submit" value="查询" class="tdBtn"/>
    <input type="button" value="添加新班级" class="tdBtn" style="float: right;" onclick="fun1()"/>
   </form>
  </div>
  <script type="text/javascript">
  		function fun1(){
	  		window.location.href="${baseUrl}class/toAdd";
  		}
  </script>	
  
  <p align="center">${msg}</p>
  <table class="list-style Interlaced">
   <tr>
    <th>编号</th>
    <th>班级名称</th>
    <th>班主任</th>
    <th>授课老师</th>
    <th>操作</th>
   </tr>
   <c:if test="${requestScope.classes.size()==0}">
   	<tr><td class="center" colspan="6">暂无数据</td></tr>
   </c:if>
   <c:forEach items="${requestScope.classes}" var="clazz">
	   <tr>
	    <td>
	     <input type="checkbox"/>
	     <a href="order_detail.html">${clazz.id }</a>
	    </td>
	    <td class="center">
	     <span class="block">${clazz.name}</span>
	    </td>
	    <td>
	     <span class="block">${clazz.classteacher }</span>
	    </td>
	    <td class="center">
	     <span class="block">${clazz.lecturer }</span>
	    </td>
	    <td class="center">
	      <a href="${baseUrl }class/get/${clazz.id}" class="inline-block" title="编辑"><img src="${baseUrl }images/icon_edit.gif"/>编辑</a>
	     <a class="inline-block" title="删除" href="${baseUrl }class/delete/${clazz.id}" 
	     	onclick="return confirm('确定删除吗？数据不可恢复！')"><img src="${baseUrl }images/icon_drop.gif"/>删除</a>
	    </td>
	   </tr>
   </c:forEach>
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div>
  </div>
 </div>
</body>
</html>