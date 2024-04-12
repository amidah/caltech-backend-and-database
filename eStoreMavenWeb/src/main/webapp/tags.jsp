<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page errorPage="error-page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>

	<h3>Accessing elements from Declarative Tag in the Beginning of the Page</h3>
	<%
		out.print("App Name: " + appName + " <br>");
		out.print(punchLine + " <br>");
		out.print("Discount: " + getDiscount("JUMBO") + " <br>");
	%>


	<h3>Scriptlet Tag</h3>

	<%
		int a = 10;
		int b = 10;
		int c = a * b;
		String name = "John";
		out.print("c = " + c);
		%>
		<br>
	<%
		out.print("Name is " + name);
	%>
	<br><br>
	<h3>Declarative Tag</h3>
	<%! 
		String appName = "eStore";
		String punchLine = "We deliver in no time";
		double getDiscount(String promoCode){
			if(promoCode.equals("JUMBO")){
				return 0.40;
			}
			
			return 0.20;
		}
		
		int[] cashBacks = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
	%>
	<%
		out.print("App Name: " + appName + " <br>");
		out.print("Discount: " + getDiscount("JUMBO") + " <br>");
	%>
	<h3>CashBack Earned: <%= cashBacks[13] %></h3>
</body>
</html>








