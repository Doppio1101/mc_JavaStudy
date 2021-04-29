<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Gugudan</title>
		<style type="text/css">
				table{
					
					border:solid 1px black;
					border-collapse: collapse;
				}
				tr{argin : center;}
				td{border: solid 1px black}
				td{width: 400px;}
		</style>
	</head>
	<body>
		<table>
			<% 	
				String temp = request.getParameter("dan");
				int dan = Integer.parseInt(temp);
				
				out.print("<tr><td colspan=2>"+dan+"단</td></tr>");
				for(int j=1; j<10; j++){
					//out.print("<tr><td>"+dan+"*"+j+"</td><td>"+dan*j+"</td></tr>");
			%>	
				<tr>
					<td> <%=(dan+"*"+j)%> </td>
					<td> <%=(dan*j)%> </td>
				</tr>
			
			
			<%
				}
			%>
		</table>
		<a href="request_gugudan.html">돌아가기</a>
		
	</body>
</html>