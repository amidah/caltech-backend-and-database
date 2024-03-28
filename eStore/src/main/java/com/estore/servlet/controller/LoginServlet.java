package com.estore.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
		
		System.out.println("User Details Submitted:");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		
		response.setContentType("text/html");
		
		String loginTimeStamp = new Date().toString();
		String htmlResponse = "<center><h3>Welcome " + email + "</h3>"
				+ "<p>You Loggedin at " + loginTimeStamp + "</p></center>";
		
		PrintWriter out = response.getWriter();
		
		out.print(htmlResponse);
		
		
	}

}
