<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output View JSP</title>
</head>
<body>
<%
	ArrayList<String> info = (ArrayList<String>)session.getAttribute("result");
	for(String result : info){
%>

<div><%=result%></div>
<%
	}
%>
</body>
</html>