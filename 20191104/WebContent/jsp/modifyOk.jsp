<%@page import="co.micol.dao.MemberDao"%>
<%@page import="co.micol.dto.MemberDto"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%! int n; %>
	<%
	request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String name = request.getParameter("name");
String addr = request.getParameter("addr");

String update = null;

MemberDto dto = new MemberDto(id, name, addr);
MemberDao dao = new MemberDao();

n = dao.update(dto);


%>
</head>
<body>

<%
	if (n != 0) {
		dto = dao.select(id);
		//화면에 보여주는 부분
		out.print("회원정보 수정에 성공하였습니다");

	} else {
		out.print("회원정보 수정에 실패하였습니다. 관리자에게 문의하세요.");
	}
%>
<br><br>
<button type="button" onclick="location.href='main.jsp'">홈으로</button>


</body>
</html>