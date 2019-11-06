<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formSubmit(n){
	if(n==1){
		frm.action="boardReplyOk.do";
	} else {
		frm.action="boardView.do";
	}
	
	frm.submit();
}
</script>
</head>
<body>
	<div align="center">
		<div>
			<h2>댓글 달기</h2>
		</div>

		<div>
			<form id="frm" name="frm" action="" method="post">
				<input type="hidden" id="id" name="id" value="${dto.id }"> 
				<input type="hidden" id="group" name="group" value="${dto.group }">
				<input type="hidden" id="step" name="step" value="${dto.step }">
				<input type="hidden" id="indent" name="indent" value="${dto.indent }">


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
					<br>
					<table border="1">
						<tr>
							<th>답 글</th>
							<td colspan="5"><textarea rows="10" cols="60" id="reply"
									name="reply"></textarea></td>
						</tr>
					</table>
				</div>

				<div>
					<br>
					<button type="button" onclick="formSubmit(1)">저장</button>
					&nbsp;
					<button type="button" onclick="formSubmit(2)">취소</button>
				
					
				</div>
			</form>
		</div>
	</div>


</body>
</html>