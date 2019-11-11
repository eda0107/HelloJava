<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="co.micol.dto.MemberDto" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
		<div><h2>M E M B E R S</h2></div>
		<div>
			<table border = "1">
				<tr>
					<th>ID</th><th>NAME</th><th>ENTER DATE</th><th>ADDRESS</th><th>TEL</th>
				</tr>
				<c:forEach var = "i" items = "${list}">
				<tr>
					<td>${i.id}</td>
					<td>${i.name}</td>
					<td>${i.eDate}</td>
					<td>${i.addr}</td>
					<td>${i.tel}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<br />
			<button type = "button" onclick = "location.href = 'index.do'">HOME</button>
		</div>
	</div>
</body>
</html>