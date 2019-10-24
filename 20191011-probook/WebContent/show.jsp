<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><a href="add.jsp">添加图书信息</a></p>
<br/>
<table border="1" cellspacing="0" width="350">
	<tr>
		<th>编号</th>
		<th>书名</th>
		<th>作者</th>
	</tr>
	<c:forEach items="${books }" var="b">
		<tr>
			<td>${b.id }</td>
			<td><a href="${pageContext.request.contextPath }/servlet/ShowBookServlet?id=${b.id}">${b.bname }</a></td>
			<td>${b.pname }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>