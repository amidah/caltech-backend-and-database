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
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product();
		product.code = Integer.parseInt(request.getParameter("txtCode"));
		product.name = request.getParameter("txtName");
		product.price = Integer.parseInt(request.getParameter("txtPrice"));
		
		System.out.println("[Product Servlet] Product Details: " + product);
		
		DB db = new DB();
		int result = db.addProduct(product);
		db.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		String message="";
		
		if(result > 0) {
			message = product.name + " added in database successfully";
		} 
		else{
			message = product.name + " not added in database. Please try again";
		}
		
		out.print("<p>"+message+"</p>");
		out.print("</center>");
		
	}
	
	

}
