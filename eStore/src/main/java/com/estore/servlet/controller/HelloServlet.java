package com.estore.servlet.controller;

import jakarta.servlet.ServletConfig;
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
 * Servlet implementation class HelloServlet
 * Lifecycle of a Servlet
 * Servlet class is loaded
 * Servlet instance is created
 * init method is invloked
 * service method is invoked
 * destroy method is invoked
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Hello Servlet - init executed.");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		super.destroy();
		System.out.println("Hello Servlet - destroy executed.");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servlet - service executed.");
		response.setContentType("text/html");
//		String htmlResponse = "<center><h3>Welcome to Hello Servlet!!!</h3>"
//				+ "<p>Request served at " + new Date() + "</p>";
		
		String htmlResponse = "<center><h3>Welcome to Home Admin!!!</h3>"
				+ "<p>Request served at " + new Date() + "</p>" + 
				"<p><a href='add-products.html'>ADD PRODUCT</a></p><br>"
				+ "<p><a href='ViewProducts'>VIEW PRODUCTS</a></p>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
		
		// Session Tracking with Cookies
		// Reading Cookies
		
//		Cookie[] array = request.getCookies();
//		for(Cookie cookie : array) {
//			out.print("<p>" + cookie.getName() + " - " + cookie.getValue() + "</p>");
//		}
		
		out.print("</center>");
	}

}
