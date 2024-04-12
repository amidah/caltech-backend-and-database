<%@page import="com.estore.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<center>
		<h2>Welcome to Home</h2>
		<br><br>
		<h3>Cookies</h3>
		<% 
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
		%>
		<br>
		
		<%= cookie.getName() %> | <%= cookie.getValue() %> 
		
		<%		
			}
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			String txtName = request.getParameter("txtName");
			String txtEmail = request.getParameter("txtEmail");
		%>	
	<br><br>
	<div>
		<h3>URL Rewriting</h3>
		<p>Name: <%= name %></p>
		<p>Email: <%= email %></p>
	</div>
	<br><br>
	<div>
		<h3>Hidden Form Field</h3>
		<p>Name: <%= txtName %></p>
		<p>Email: <%= txtEmail %></p>
	</div>
	<br><br>
	<div>
		<h3>Http Session Attributes</h3>
		<%
		User user = (User)session.getAttribute("keyUser");
		%>
		<p>Name: <%= user.name %></p>
		<p>Email: <%= user.email %></p>
		<p>Password: <%= user.password %></p>
	</div>
	
	
	</center>
</body>
</html>