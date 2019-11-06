<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"> //필수 사항 입력에 대한 메소드
	function formCheck(){
		
		if (frm.id.value == "") {
			alert("아이디를 입력하세요.");
			frm.id.focus();
			return false;
		}
		
		if (frm.idChk.value=="unCheck"){
			alert("아이디 중복체크 하세요.")
			return false;
			
		}
		
		if (frm.pw.value == ""){
			alert("패스워드를 입력하세요.");
			frm.pw.focus();
			return false;
		}
		
		if (frm.name.value == ""){
			alert("이름을 입력하세요.")
			frm.name.focus();
			return false;
		}
		
		frm.submit();
	}
	
	function idCheck(){
		window.open("idcheck.jsp?cid="+id.value,"IdCheck","width=800","height=700");
		
	}
	
</script>
</head>
<body>
	<div align="center">
		<div>
			<h2>회원가입</h2>
		</div>
		<div>
			<form id="frm" name="frm" action="joinOk.jsp" method="post" >
				<div>
					<table border="1">
						<tr>
							<td align="center" width="100"><b><font color="red">*</font>아이디</b></td>
							<td><input type="text" id="id" name="id" size="40">&nbsp;
							<button type="button" name="idChk" onclick="idCheck()" value="unCheck">중복체크</button></td>
						</tr>

						<tr>
							<td align="center" width="100"><b><font color="red">*</font>패스워드</b></td>
							<td><input type="text" id="pw" name="pw" size="40"></td>
						</tr>

						<tr>
							<td align="center" width="100"><b><font color="red">*</font>이
									름</b></td>
							<td><input type="text" id="name" name="name" size="40"></td>
						</tr>

						<tr>
							<td align="center" width="100"><b>주 소</b></td>
							<td><input type="text" id="addr" name="addr" size="70"></td>
						</tr>
					</table>
				</div>

				<div>
					<br>
					<button type="button" onclick="formCheck()">회원가입</button>
					&nbsp;&nbsp;
					<button type="reset">취소</button>
					&nbsp;&nbsp;
					<button type="button" onclick="location.href='login.jsp'">로그인</button>

				</div>
			</form>
		</div>
	</div>
</body>
</html>