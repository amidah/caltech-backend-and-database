<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.estore.model.User"%>
<%@page import="com.estore.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
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
		
		user.name = result.getString("name");
		Cookie cookie1 = new Cookie("useremail", user.email);
		Cookie cookie2 = new Cookie("userpassword", user.password);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.setContentType("text/html");
		
		session.setAttribute("keyUser", user);
		
		
		String res = "<form action='home.jsp' method='post'>"+
				"<input type='hidden' name='txtName' value='"+user.name+"'/><br>"+
				"<input type='hidden' name='txtEmail' value='"+user.email+"'/><br>"+
				"<input type='submit' value='Enter Home'/><br>"+
				"</form>";
		out.print(res);
		%>
		<%-- <jsp:forward  page="home.jsp"/> --%>
		
		<h3>Thank You for Logging In: <%= user.name %></h3>
		<a href="home.jsp?name=<%= user.name%>&email=<%= user.email%>">Enter Home</a>
		<%
	}
	else{
		%>
		<h3>Login Failed. Please try again!</h3>
		<%
	}
%>