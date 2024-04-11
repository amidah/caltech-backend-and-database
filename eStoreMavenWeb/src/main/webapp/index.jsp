<html>
<body>
	<h2>Hello World!</h2>
	<%
	int a = 10;
	int b = 20;
	int c = 30;
	int d = a + b + c;
	out.print("<h4>Sum of a, b, and c = " + d + "</h4>");
	%>
	<a href='tags.jsp'>JSP Tags</a>
	
	<br><br>
	
	<h3>Register with Us</h3>
	<div style="align-items: center;">
		<form action="register.jsp" method="post">
			Enter Name: <br>
			<input type="text" name="txtName"/><br><br>
			Enter Email: <br>
			<input type="text" name="txtEmail"/><br><br>
			Enter Password: <br>
			<input type="password" name="txtPassword"/><br><br>
			<input type="submit" value="Register">
		</form>
	
	</div>
	<a href="login-user.html">Existing User? Login Here</a>
</body>
</html>
