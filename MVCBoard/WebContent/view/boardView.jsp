<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function formSubmit(n) {
		if (n == 1) {
			frm.action = "boardEdit.do";
		} else if (n == 2) {
			frm.action = "boardDelete.do";
		} else {
			frm.action = "boardReply.do";
		}
		frm.submit();
	}
</script>
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
					<td align="center" width="70">${list[0].name }</td>
					<th width="70">작성 일자</th>
					<td align="center" width="100">${list[0].wDate }</td>
					<th width="70">조회수</th>
					<td align="center" width="70">${list[0].hit }</td>
				</tr>

				<tr>
					<th>제 목</th>
					<td colspan="5">${list[0].title }</td>
				</tr>

				<tr>
					<th>내 용</th>
					<td colspan="5" height="100">${list[0].content }</td>
				</tr>
			</table>
		</div>

		<div>
			<form id="frm" name="frm" action="" method="post">
				<input type="hidden" id="id" name="id" value="${list[0].id }">
			</form>
		</div>

		<div>
			<table border="1">
				<c:forEach var="i" begin="1" end="${length }">
					<tr>
						<th width="70">내 용</th>
						<td colspan="5" height="100">${list[i].content }</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div>
			<br>
			<button type="button" onclick="formSubmit(1)">수정</button>
			&nbsp;
			<button type="button" onclick="formSubmit(2)">삭제</button>
			&nbsp;
			<button type="button" onclick="formSubmit(3)">댓글</button>
			&nbsp;
			<button type="button" onclick="location.href='boardList.do'">목록</button>
		</div>

	</div>
</body>
</html>