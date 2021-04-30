<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output View</title>
</head>
<body>
	<h1>output view</h1>
	<%
	ArrayList<String> infolist = (ArrayList<String>)session.getAttribute("result");
	//String result = (String)session.getAttribute("result");
	//이부분은 원래는 result라는 키 값으로 받아오는 게 String형식이었지만 
	//연습에서는 테이블 전체를 출력하기 위해서 ArrayList로 받아오고자 한다.
	//이 세션은 반환값이 오브젝트여서 직접적으로 캐스팅해줘야 한다.
	//세션은 제너릭이 나오기 이전에 만들어져서 제너릭을 사용하기 위해서는 다른 방법을 써야 한다.
	for(String result : infolist){
%>

	<div><%=result%></div>
<%
	}
	//mythink> 클라이언트에서 입력할때는 serAttribute를 쓰나?
	//클라이언트로 받아들여진 정보를 컨트롤러에 올리고
	//db연결 클래스는 컨트롤러에서 값을 getAttribute로 받는다?
	//그럼 db연결하는 클래스에서는 getAttribute로 받은 값을 preparedstatement로 insert?
	//이건 월요일 수업에서 확인하자
	%>
</body>
</html>