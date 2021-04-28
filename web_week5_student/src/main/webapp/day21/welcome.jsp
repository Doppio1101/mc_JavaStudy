<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<%= "Welcome! Java Server Pages" %>
<h1><%= "Welcome! Java Server Pages" %></h1>
<h1>Welcome! Java Server Pages</h1>
<h1><%
	String name = "Java web";
	out.print(name);
	//클라이언트 브라우저로 가는 문장

%></h1>
<!-- 자바코드 생성 가능 구역 -->
<!-- 밑에 구구단 2단 출력 -->
<%
	for(int i=1; i<10; i++){
		out.print("2 *"+i+"="+2*i+"<br>");
	}
	
%>

</body>
</html>