<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
   function openFormClose(n) {
      if (n == 1) {
         opener.document.frm.idCk.value = "checked"
         opener.frm.name.focus();
      } else {
         opener.frm.id.focus();
      }
      window.close();
   }
</script>
</head>
<body>
   <div align="center">
      <c:choose>
         <c:when test="${idCheck == true }">
            <h1>${id }는 사용 할 수 있는 아이디입니다.</h1>
            <div>
               <br />
               <button type="button" onclick="openFormClose(1)">확인</button>
            </div>
         </c:when>
         <c:otherwise>
            <h1>${id }는 이미 사용 중인 아이디입니다.</h1>
            <div>
               <br />
               <button type="button" onclick="openFormClose(0)">확인</button>
            </div>
         </c:otherwise>
      </c:choose>
   </div>

</body>
</html>
</body>
</html>