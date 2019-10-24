<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	#bookul b{
		float:left;
		width:80px;
		font-weight:normal;
	}
	#bookul li{
		list-style:none;
		line-height:30px;
	}
</style>
<body>
<form action="${pageContext.request.contextPath }/servlet/AddBookServlet" method="post" enctype="multipart/form-data">
<ul id="bookul">
	<li><b>书名</b><input type="text" name="bname" /></li>
	<li><b>作者</b><input type="text" name="pname" /></li>
	<li><b>价格</b><input type="text" name="money" /></li>
	<li><b>出版社</b><input type="text" name="press" /></li>
	<li><b>简介</b><textarea rows="7" cols="30" name="intro"></textarea></li>
	<li><b>封面</b><input type="file" name="file" /></li>
	<li><button>添   加</button></li>
</ul>
</form>
</body>
</html>