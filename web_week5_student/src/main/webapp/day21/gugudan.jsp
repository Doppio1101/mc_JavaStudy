<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan</title>
</head>
<body>
<form action="request_gugudan.html" method="get">
<% 	
	String temp = request.getParameter("dan");
	int dan = Integer.parseInt(temp);
	
	out.print("<h3>"+dan+"단</h3>");
	for(int j=1; j<10; j++){
		out.print(dan+"*"+j+"="+dan*j+"<br>");
	}
	out.print("<br>");
	


%>
<input type="submit" value="돌아가기">
</form>
</body>
</html>