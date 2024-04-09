<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h3>Welcome to the JSP Page</h3>
	<% 
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a + b + c;
		out.print("<h4>Sum of a, b, and c = " + d +"</h4>");
	%>
</body>
</html>