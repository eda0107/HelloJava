<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<script type = "text/javascript" src = "js/myJavaScript.js"></script>
</head>
<body>
	<div id="memu" align="center">
		<nav id="topMenu">
			<ul>
				<li class="topMenuLi"><a class="menuLink" href="index.do">HOME</a></li>
				<li>|</li>
				<c:if test = "${id != null}">
				<li class="topMenuLi"><a class="menuLink" href="noticeList.do">NOTICE</a> <!-- 관리자만 글 작성, 수정, 삭제할 수 있음 / 글 조회는 로그인 사용자만 가능 -->
					<c:if test = "${grant == 'S'}">
					<ul class="submenu">
						<li><a href="#" class="submenuLink">WRITE</a></li>
						<li><a href="#" class="submenuLink">EDIT</a></li>
						<li><a href="#" class="submenuLink">DELETE</a></li>
					</ul>
					</c:if>
				</li>
				<li>|</li>
				</c:if>
				<li class="topMenuLi"><a class="menuLink" href="#">JOIN</a>
					<ul class="submenu">
					<c:choose>
					<c:when test = "${grant == 'S'}">
						<li><a href="memberList.do" class="submenuLink">MEMBERS</a></li>
					</c:when>
					<c:when test = "${grant == 'U'}">
						<li><a href="#" class="submenuLink">MY PAGE</a></li>
						<li><a href="#" class="submenuLink">BYE</a></li>
					</c:when>
					<c:otherwise>
							<li><a href="memberInput.do" class="submenuLink">JOIN</a></li>
					</c:otherwise>
					</c:choose>
					</ul></li>
				<li>|</li>
				<li class="topMenuLi"><a class="menuLink" href="#">BOARD</a></li> <!-- 로그인 사용자만 글 작성, 수정, 삭제 가능 / 글 조회는 누구나 가능 -->
				<li>|</li>
				<c:choose>
					<c:when test = "${id == null}">
						<li class="topMenuLi"><a class="menuLink" href="login.do">LOG-IN</a>
						</li>
					</c:when>
					<c:otherwise>
						<li class="topMenuLi"><a class="menuLink" href="logout.do">LOG-OUT</a>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</div>
</body>
</html>