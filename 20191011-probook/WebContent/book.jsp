<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 #bimg{
 	width:150px;
 	height:250px;
 }
</style>
</head>
<body>
<table border="0" width="200"> 
	<caption>图书详情信息</caption>
	<tr>
		<td>编号</td>
		<td>${book.id }</td>
	</tr>
	<tr>
		<td>书名</td>
		<td>${book.bname }</td>
	</tr>
	<tr>
		<td>作者</td>
		<td>${book.pname }</td>
	</tr>
	<tr>
		<td>出版社</td>
		<td>${book.press }</td>
	</tr>
	<tr>
		<td>价格</td>
		<td>${book.money }</td>
	</tr>
	<tr>
		<td>图书简介</td>
		<td>${book.introduction }</td>
	</tr>
	<tr>
		<td>封面</td>
		<td><img src="${pageContext.request.contextPath }/${book.cover }" id="bimg" /></td>
	</tr>
</table>
</body>
</html>