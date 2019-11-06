
<%@page import="co.micol.dao.MemberDao"%>
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
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw");
	String grant = null;
	
	MemberDao dao = new MemberDao();
	
	grant = dao.isLoginCheck(id, pw);
	
	if(grant.equals(null)){%>
		<script type="text/javascript">
		alert("로그인 실패 다시 입력하세요");
		document.location="login.jsp";
		</script>
		<% 
		//자바스크립트를 이용하여 메세지 전달하도록
		response.sendRedirect("login.jsp");
	} else {
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		session.setAttribute("grant", grant);
		response.sendRedirect("main.jsp");	
	}
	
	
%>
</body>
</html>