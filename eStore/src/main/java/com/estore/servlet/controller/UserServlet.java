package com.estore.servlet.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig servletConfig = getServletConfig();
		String appName = servletConfig.getInitParameter("appName");
		
		StringBuffer responseText = new StringBuffer();
		
		responseText.append("<center>");
		responseText.append("<h2>App Name: "+appName+"</h2>");
		
		Enumeration<String> params = servletConfig.getInitParameterNames();
		
		while(params.hasMoreElements()) {
			String name = params.nextElement();
			String value = servletConfig.getInitParameter(name);
			responseText.append("<p>Param Name: "+name+"</p>");
			responseText.append("<p>Param Value :"+value+"</p>");
		}
		ServletContext context = getServletContext();
		String dbUrl = context.getInitParameter("DBURL");
		
		responseText.append("<p>DB URL: "+dbUrl+"</p>");
		responseText.append("</center>");
		
		out.print(responseText.toString());
		
	}

}
