<%@page import="co.micol.dao.MemberDao"%>
<%@page import="co.micol.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();

		dto = dao.select(id);
	%>
	<div align="center">
		<div>
			<h2>회원 개인 정보</h2>
		</div>
		<div>
			<form id="frm" name="frm" action="modifyOk.jsp" method="post">
				<div>
					<table border="1">

						<tr>
							<td align="center" width="100"><b>아이디 </b></td>
							<td><input type="text" id="id" name="id" value=<%=dto.getId()%> size="30" readonly></td>
						</tr>

						<tr>
							<td align="center" width="100"><b>이름</b></td>
							<td><input type="text" id="name" name="name" value=<%=dto.getName()%> size="30"></td>
							
						</tr>

						<tr>
							<td align="center" width="100"><b>가입일자 </b></td>
							<td><%=dto.getEnterDate()%></td>
						</tr>

						<tr>
							<td align="center" width="100"><b>주소 </b></td>
							<td><input type="text" id="addr" name="addr" value=<%=dto.getAddr()%> size="50"></td>
						</tr>

					</table>
				</div>
				
				<div>
				<br>
				<input type="submit" value="수정">&nbsp;
				<button type="button" onclick="location.href='main.jsp'">돌아가기
				</button>
				</div>

			</form>
		</div>
	</div>
</body>
</html>