<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
		<div>
			<br />
			<h2>${id}님, 정상적으로 로그아웃 되었습니다.</h2>
		</div>
		<div>
			<br />
			<button type = "button" onclick = "location.href = 'index.do'">HOME</button>
		</div>
	</div>
</body>
</html>