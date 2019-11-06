<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function transData(n){
		frm.id.value = n;
		frm.submit();
	}
</script>
</head>
<body>
<div align="center">
	<div><h1> 게시판 목록 </h1></div>
	<div>
	<form id="frm" name="frm" action="boardView.do"  method="post">
			<input type="hidden" id="id" name="id">
		<table border="1">
			<tr>
			<th width="50">순번</th>
			<th width="70">작성자</th>
			<th width="200">제목</th>
			<th width="100">작성일자</th>
			<th width="50">조회수</th> 
			</tr>
			
			<!-- request객체에서 날아오는 list를 그대로 읽으면 되는 거라, request.getParameter(,) 할 필요가 없음 --> 
			<c:forEach var="dto" items="${list }">
			<!-- 반복시켜주기 위해서 forEach 사용 /list를 가져오는 대신, 한 행의 이름을  dto라고 붙여줌 dto.java와 상관 X-->
			<tr onmouseover="this.style.backgroundColor = '#FFFF99'"
				onmouseout="this.style.backgroundColor=''"
				onclick="transData(${dto.id})">
			<td align="center">${dto.id }</td>
			<td align="center">${dto.name }</td>
			<td align="center">${dto.title }</td>
			<td align="center">${dto.wDate }</td>
			<td align="center">${dto.hit }</td>
			</tr>
			</c:forEach>
		</table>
		</form>
	</div>
	
	<div>
	<br>
	<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
	&nbsp;
	<button type="button" onclick="location.href='index.do'">홈으로</button>
	</div>
</div>
</body>
</html>