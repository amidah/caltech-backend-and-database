<%@page import="com.estore.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<center>
		<h3>Welcome <%= request.getParameter("username")%> to JSP Action Tags Demo</h3>
		<p>You have registered with us using email: <b><i><u><%= request.getParameter("useremail")%></u></i></b></p>
	
		<%
			Customer customer1 = new Customer();
			customer1.setName("Roy");
		%>
		
		<jsp:useBean id="customer2" class="com.estore.bean.Customer"></jsp:useBean>
		<%
	 	    customer2.setName("John");
			String data = customer2.sayHello();
			out.print("Data: " + data);
		%>
	</center>
</body>
</html>