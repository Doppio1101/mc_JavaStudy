<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" isELIgnored="false" contentType ="text/html; charset=UTF-8"%>
<!-- isELIgnored="false" contentType ="text/html; charset=UTF-8" 설정 안 하면 디폴트 값이 된다.  -->
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
