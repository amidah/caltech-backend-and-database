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
 * Servlet implementation class UpdateProductController
 */
public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<center>");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		DB db = new DB();
		Product product = db.fetchProduct(id);
		out.print("<h3>Update Product Details</h3>");
		out.print("<br><br>");
		out.print("<div>");
		out.print("<form action='UpdateEditedDetails' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+product.id+"'/></td></tr>");
		out.print("<tr><td>Code:</td><td><input type='text' name='code' value='"+product.code+"'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+product.name+"'/></td></tr>");
		out.print("<tr><td>Price:</td><td><input type='text' name='price' value='"+product.price+"'/></td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Save'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.print("</div>");
		out.print("</center>");
		out.close();
		
	}

}
