package com.estore.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		out.print("<h3>Welcome to Front Controller</h3>");
		
		String typeOfRequest = request.getParameter("txtType");
		
		String url = "";
		
		if(typeOfRequest.equals("login")) {
			url = "Login";
		}
		else if(typeOfRequest.equals("register")) {
			url = "Register";
		}
		else {
			out.print("<h3>Sorry!! Request can't be processed.</h3>");
		}
		if(!url.isEmpty()) {
			System.out.println("Redirecting to " + typeOfRequest);
			RequestDispatcher reqDispatcher = request.getRequestDispatcher(url);
			//reqDispatcher.forward(request, response);
			reqDispatcher.include(request, response);
		}
		out.print("</center>");
	}

}
