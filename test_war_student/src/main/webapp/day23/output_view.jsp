<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output View</title>
</head>
<body>
	output view
	<h1><%
	
	String result = (String)session.getAttribute("result");
	//이 세션은 반환값이 오브젝트여서 직접적으로 캐스팅해줘야 한다.
	//세션은 제너릭이 나오기 이전에 만들어져서 제너릭을 사용하기 위해서는 다른 방법을 써야 한다.
	//mythink 클라이언트에서 입력할때는 serAttribute를 쓰나?
	//클라이언트로 받아들여진 정보를 컨트롤러에 올리고
	//db연결 클래스는 컨트롤러에서 값을 getAttribute로 받는다?
	//그럼 db연결하는 클래스에서는 getAttribute로 받은 값을 preparedstatement로 insert?
			
	out.print(result);
	%></h1>
</body>
</html>