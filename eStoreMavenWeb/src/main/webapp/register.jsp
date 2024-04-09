<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.estore.model.User"%>
<%@page import="com.estore.db.DB	"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	User user = new User();
 	user.name = request.getParameter("txtName");
 	user.email = request.getParameter("txtEmail");
 	user.password = request.getParameter("txtPassword");
 
 	DB db = DB.getDb();
 	
 	String sql = "insert into Users values(null, ?, ?, ?)";
 	PreparedStatement stmt = db.con.prepareStatement(sql);
 	stmt.setString(1, user.email);
 	stmt.setString(2, user.password);
 	stmt.setString(3, user.name);
 	
 	int result = db.executeUpdate(stmt);
 	if(result > 1){
 		%>
 		<h3>Thank You for Registration: <%= user.name %></h3>
 		<%
 	}
 	else{
 		%>
 		<h3>Registration Failed: <%= user.name %></h3>
 		<%
 	}
 %>