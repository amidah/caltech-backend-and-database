<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.estore.model.User"%>
<%@page import="com.estore.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	User user = new User();
	user.email = request.getParameter("txtEmail");
	user.password = request.getParameter("txtPassword");

	DB db = DB.getDb();
	
	String sql = "SELECT * FROM Users WHERE email = ? AND password = ?";
	PreparedStatement stmt = db.con.prepareStatement(sql);
	stmt.setString(1, user.email);
	stmt.setString(2, user.password);
	
	ResultSet result = db.executeQuery(stmt);
	if(result != null && result.next()){
		%>
		<h3>Thank You for Logging In: <%= result.getString("name") %></h3>
		<%
	}
	else{
		%>
		<h3>Login Failed. Please try again!</h3>
		<%
	}
%>