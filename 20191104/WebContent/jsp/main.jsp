<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<c:if test = "${id != null}">
      ${ id } 님, 환영합니다! <br>
      <c:if test = "${ grant == 'U' }"> 일반 유저로 접속합니다. <br> </c:if>
      <c:if test = "${ grant == 'S' }"> 관리자로 접속합니다.<br>
      <button type="button" onclick="location.href='mlist.jsp'">회원 목록 보기</button>   &nbsp;&nbsp;
      </c:if>

      <button type = "button" onclick = "location.href = 'modify.jsp'">내 정보</button>
      &nbsp;&nbsp;
      <button type = "button" onclick = "location.href = 'logOut.jsp'">로그아웃</button>
      </c:if>
      <c:if test = "${id == null}">
         <h2>로그인한 사용자만 접근 가능합니다.</h2>
      <button type = "button" onclick = "location.href = 'login.jsp'">로그인</button>
	</c:if>
	</div>
</body>
</html>