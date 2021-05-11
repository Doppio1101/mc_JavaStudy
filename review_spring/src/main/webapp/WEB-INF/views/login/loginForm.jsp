<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<c:set var="result" value="${param.result }" />
<%
   request.setCharacterEncoding("UTF-8");
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="/review/resources/client/css/mystyle.css">
<script type="text/javascript" src="/review/resources/client/js/command.js"></script>
<c:choose>
	<c:when test="${result=='loginFail' }">
	  <script>
	    window.onload=function(){
	      alert("아이디나 비밀번호가 틀립니다.다시 로그인 하세요!");
	    }
	  </script>
	</c:when>
	
</c:choose>  
</head>
<body>
<form action="${contextPath}/login/login.do" method="post" onsubmit="return checkData()">
<table>
	<tr><td>아이디</td><td><input type="text" name="id" id="userId"></td></tr>
	<tr><td>패스워드</td><td><input type="password" name="pwd" value="1234" id="pwd"></td></tr>
	<tr>
		<td>로그인</td>
		<td><input type="submit" value="로그인"></td>
	</tr>
</table>
<img alt="이미지 연결 연습" src="/review/resources/image/duke.png">
</form>
</body>
</html>