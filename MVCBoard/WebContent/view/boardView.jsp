<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h2>게시글 조회</h2>
		</div>

		<div>
			<table border="1">
				<tr>
					<th width="70">작성자</th>
					<td align="center" width="70">${dto.name }</td>
					<th width="70">작성 일자</th>
					<td align="center" width="100">${dto.wDate }</td>
					<th width="70">조회수</th>
					<td align="center" width="70">${dto.hit }</td>
				</tr>

				<tr>
				<th>제 목</th>
				<td colspan="5">${dto.title }</td>
				</tr>

				<tr>
				<th>내 용</th>
				<td colspan="5" height="100">${dto.content }</td>
				</tr>
			</table>
		</div>
		<br>
		<button type="button" onclick="#">수정</button>
		&nbsp;
		<button type="button" onclick="#">삭제</button>
		&nbsp;
		<button type="button" onclick="location.href='boardList.do'">목록</button>
	</div>
</body>
</html>