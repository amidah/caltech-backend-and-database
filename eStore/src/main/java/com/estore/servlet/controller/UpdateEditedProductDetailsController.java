package com.estore.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.estore.servlet.db.DB;
import com.estore.servlet.model.Product;

/**
 * Servlet implementation class UpdateEditedProductDetailsController
 */
public class UpdateEditedProductDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int code = Integer.parseInt(request.getParameter("code"));
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));

		Product product = new Product(id, code, name, price);
		
		DB db = new DB();
		int status = db.updateProduct(product);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		
		if(status > 0) {
			response.sendRedirect("Home");
		}
		else {
			out.print("Sorry! Unable to update the record!");
		}
		
		out.print("</center>");
	}

}
