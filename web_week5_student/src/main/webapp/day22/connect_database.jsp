<%@page import="mc.sn.test2.BookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="mc.sn.test2.BookTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database Connect</title>
<style type="text/css">
	table{
			border:solid 1px black;
			border-collapse: collapse;
			}
	td{border: solid 1px black;
		width: auto;
		argin: center;}
</style>
</head>
<body>
<table>
<% 
	BookTest bt = new BookTest();
	ArrayList<BookDTO> list = bt.getBookList();
	for(BookDTO dto : list){
%>
		<tr>
			<td><%=(dto.getIsbn())%></td>
			<td><%=(dto.getTitle())%></td>
			<td><%=(dto.getAuthor())%></td>
			<td><%=(dto.getPublisher())%></td>
			<td><%=(dto.getPrice())%></td>
			<td><%=(dto.getDescription())%></td>
		</tr>
<!-- 현재 부분에서 뭐 책이름만 나오게 한 다음에 책 이름을 누르면
자세한 부분을 출력하는 페이지를 서블릿으로 만들 수 있겠다. -->
<%
		
	}

%>

</table>

</body>
</html>