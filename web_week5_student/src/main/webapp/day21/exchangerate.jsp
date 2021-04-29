<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exchange rate</title>
</head>
<body>
<%
	out.print("<h1>환전결과</h1>");

	String selector = request.getParameter("selector");
	String strwon = request.getParameter("won");
	int trans = 0;
	int won = Integer.parseInt(strwon);
	if(selector.equals("달러")){
		trans = 1114;
		out.print("<h3>환율 결과는 "+won/trans+"달러입니다.</h3>");
	}else if(selector.equals("유로")){
		trans = 1343;
		out.print("<h3>환율 결과는 "+won/trans+"유로입니다.</h3>");
	}else if(selector.equals("엔화")){
		trans = 102;
		out.print("<h3>환율 결과는 "+won/trans+"엔입니다.</h3>");
	}else if(selector.equals("엔화")){
		out.print("<h3>선택을 올바르게 해주세요.</h3>");
	}
	

%>
<a href="trans.html">돌아가기</a>

</body>
</html>