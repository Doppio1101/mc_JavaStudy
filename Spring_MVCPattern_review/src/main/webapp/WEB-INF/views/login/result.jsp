<%@page import="mc.sn.review.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
Result

<%
	
	MemberVO vo = (MemberVO)session.getAttribute("member");
	//MemberVO vo = (MemberVO)request.getAttribute("member");

	String result = "로그인 정보가 정확하지 않습니다.";
	
	if (vo!=null){
		result = vo.getName()+"님 반갑습니다. Status Success!!!";
	} 
	String alertMessage = "<script>alert('"+result+"')</script>";
	String OutMessage = "<h3>'"+result+"'</h3>";
	out.print(alertMessage);
	out.print(OutMessage);
	session.invalidate();
	
%>		


</body>
</html>