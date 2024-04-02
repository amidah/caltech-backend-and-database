package com.estore.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.estore.servlet.db.DB;
import com.estore.servlet.model.Product;

/**
 * Servlet implementation class AllProductsController
 */
public class AllProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		out.print("<center>");
		out.print("<h3>All Products</h3>");
		
		DB db = new DB();
		
		ArrayList<Product> products = db.fetchAllProducts();
		
		db.closeConnection();
		
		StringBuffer buffer = new StringBuffer();
		
		if(products.size() > 0) {
			buffer.append("<table>");
			buffer.append("<tr>");
			buffer.append("<th>ID</th>");
			buffer.append("<th>CODE</th>");
			buffer.append("<th>NAME</th>");
			buffer.append("<th>PRICE</th>");
			buffer.append("</tr>");
			
			for(Product product : products) {
				buffer.append("<tr>");
				buffer.append("<td>"+product.id+"</td>");
				buffer.append("<td>"+product.code+"</td>");
				buffer.append("<td>"+product.name+"</td>");
				buffer.append("<td>"+product.price+"</td>");
				buffer.append("<td><a href='Delete?id="+product.id+"'>DELETE</a> | <a href=''>UPDATE</a></td>");
				buffer.append("</tr>");
			}
			
			buffer.append("</table>");
			
		}
		else {
			buffer.append("<h3>No Products Found</h3>");
		}
		
		out.print(buffer.toString());
		out.print("</center>");
		
	}

}
