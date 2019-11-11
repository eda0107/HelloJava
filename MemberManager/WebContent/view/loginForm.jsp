<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<div><jsp:include page = "topmenu.jsp"></jsp:include></div>
		<div>
			<br />
			<h2>L O G - I N</h2>
			<div>
			<form id = "frm" name = "frm" action = "loginOk.do" method = "post" onsubmit = "return LoginFormCheck()">
				<div>
				<table border = "1">
					<tr>
						<th width = "100">I D</th>
						<td><input type = "text" id = "id" name = "id" size = "70"></td>
					</tr>
					<tr>
						<th width = "100">P W</th>
						<td><input type = "password" id = "pw" name = "pw" size = "70"></td>
					</tr>
				</table>
				</div>
			<div>
				<br />
				<input type = "submit" value = "LOGIN">&nbsp;&nbsp;
				<input type = "reset" value = "RESET">
			</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>