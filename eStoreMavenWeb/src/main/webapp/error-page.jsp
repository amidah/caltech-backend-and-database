<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
	<center>
		<h3>Something Went Wrong !!</h3>
		Exception: <%= exception%>
		<br>
		Message: <%= exception.getMessage() %>
	</center>
</body>
</html>