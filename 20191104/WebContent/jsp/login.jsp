<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function formCheck() {
		if (frm.id.value == "") {
			alert("아이디를 입력하세요");
			frm.id.focus();
			return false;
		}

		if (frm.pw.value == "") {
			alert("비밀번호를 입력하세요");
			frm.pw.focus();
			return false;
		}
		return true;
	}
</script>

</head>
<body>
	<div align="center">
		<c:if test="${id == null}">
		
			<div>
				<h3>로 그 인</h3>
			</div>

			<div>
				<form id="frm" name="frm" action="loginOk.jsp" method="post"
					onsubmit="return formCheck()">
					<table border="1">
						<tr>
							<td width="80" align="center"><b>아이디</b></td>
							<td><input type="text" id="id" name="id" size="30"></td>
						</tr>

						<tr>
							<td width="80" align="center"><b>패스워드</b></td>
							<td><input type="text" id="pw" name="pw" size="30"></td>
						</tr>
					</table>
					<div>
						<br> <input type="submit" value="로그인"> &nbsp; <input
							type="reset" value="취소"> &nbsp; <input type="button"
							onclick="location.href='join.jsp'" value="회원가입">
					</div>
				</form>
			</div>
		</c:if>
		<c:if test="${id != null }">
			<h2>${id }는이미 로그인 하였습니다.</h2>
			<a href="main.jsp">홈으로</a>
		</c:if>

		<div><jsp:include page="footer.jsp"></jsp:include></div>
	</div>

</body>
</html>