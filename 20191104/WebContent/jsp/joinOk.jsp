<%@page import="co.micol.dao.MemberDao"%>
<%@page import="co.micol.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%! int n; //지역변수가 아닌 전역변수로 사용하기 위해서 따로 변수 설정 %>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	
	MemberDto dto = new MemberDto(id, name, pw, addr);
	MemberDao dao = new MemberDao();
	
	n = dao.insert(dto); //return value가 int
			
%>
</head>
<body>
	<%
		if(n != 0){ //MemberDao에서 insert Method의 n값이 1이라면
			out.print("회원가입 성공");
		} else {
			out.print("회원가입 실패");
		}
	%>
</body>
</html>