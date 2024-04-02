package com.estore.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.estore.servlet.db.DB;

/**
 * Servlet implementation class DeleteProductController
 */
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<center>");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		DB db = new DB();
		int result = db.deletProduct(id);
		
		if(result > 0) {
			out.print("<h3>Product Deleted Successfully</h3>");
		}
		else {
			out.print("<h3>Product Not Deleted. Please try again</h3>");
		}
		
		out.print("</center>");
	}

}
