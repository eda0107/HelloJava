<%@page import="co.micol.dao.MemberDao"%>
<%@page import="co.micol.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<% ArrayList<MemberDto> list = new ArrayList<MemberDto>();
MemberDao dao = new MemberDao();
list = dao.select();

for(MemberDto dto: list){
	out.print(dto.getId()+" ");
	out.print(dto.getName()+" ");
	out.print(dto.getGrant()+" ");
	out.print(dto.getAddr()+" ");
	out.print(dto.getEnterDate()+"<br> ");
}

%>
</div>
</body>
</html>