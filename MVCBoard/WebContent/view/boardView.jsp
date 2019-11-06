<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function formSubmit(n) {
		if(n == 1) {
			frm.action.value="boardEdit.do";
		} else {
			frm.action.value="boardDelete.do";
			frm.submit();
		}
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

		<div>
			<form id="frm" name="frm" action="" method="post">
				<input type="hidden" id="id" name="id" value="${dto.id }">
			</form>
		</div>

		<div>
			<br>
			<button type="button" onclick="formSubmit(1)">수정</button>&nbsp;
			<button type="button" onclick="formSubmit(2)">삭제</button>&nbsp;
			<button type="button" onclick="location.href='boardList.do'">목록</button>
		</div>

	</div>
</body>
</html>