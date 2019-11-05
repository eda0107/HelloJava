<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function formCheck() {
		if(frm.name.value == ""){
			alert("작성자를 입력하세요.");
			frm.name.focus();
			return false;
		}
		
		if(frm.title.value == ""){
			alert("제목을 입력하세요.");
			frm.title.focus();
			return false;
		}
		
		if(frm.contents.value == ""){
			alert("내용을 입력하세요.");
			frm.contents.focus();
			return false;
		}
		
		return true;
		
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<h2>게시글 작성</h2>
		</div>
		<div>
			<form id="frm" name="frm" action="boardWriterOk.do" method="post" onsubmit="return formCheck()">
				<table border="1">
					<tr>
						<th width="70">* 작성자</th>
						<td><input type="text" id="name" name="name" size="30"></td>
						<th width="70">작성일자</th>
						<td><input type="date" id="date" name="date" size="30"></td>
					</tr>

					<tr>
						<th width="70">* 제목</th>
						<td colspan="3"><input type="text" id="title" name="title"
							size="70"></td>
					</tr>

					<tr>
						<th width="70">* 내용</th>
						<td colspan="3"><textarea rows="5" cols="70" id="contents" name="contents"></textarea></td>
					</tr>

				</table>
				<div>
					<br />
					<input type="submit" value="등록">&nbsp;
					<input type="reset" value="취소">&nbsp;
					<button type="button" onclick="location.href='boardList.do'">목록</button>
				</div>
			</form>
		</div>
		
		<script type="text/javascript">
			document.getElementById('date').value = new Date().toISOString()
					.substring(0, 10);
		</script>
	</div>


</body>
</html>