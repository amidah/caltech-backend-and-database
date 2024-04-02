package com.estore.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final String EMAIL = "admin@estore.com";
	private final String PASSWORD = "admin@123";
	
	private final String NAME = "John";
	private final int TOTAL_SALES = 30000;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		String message = "";
//		String loginTimeStamp = new Date().toString();
//		if(email.equals(EMAIL) && password.equals(PASSWORD)) {
//			// Session Tracking with Cookies
//			Cookie cookie1 = new Cookie("KEY_NAME", NAME);
//			Cookie cookie2 = new Cookie("KEY_SALES", String.valueOf(TOTAL_SALES));
//			
//			response.addCookie(cookie1);
//			response.addCookie(cookie2);
//			
//			message = "<center><h3>Welcome " + email + "</h3><p>You Loggedin at " + loginTimeStamp + "</p>"
//					+ "<p><a href='Home'>Click to navigate to Home</a></p></center>";
//		}
//		else {
//			message = "<center>Login unsuccessful at " + loginTimeStamp +
//					"<br><p>Please try again with valid credentials!!!</p></center>";
//		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
//		out.print(message);
		
		out.print("<center>");
		
		out.print("<p>Welcome to Home<br><a href='Home'>Click to navigate to Home</a></p>");
		
		out.print("</center>");
	}

}
