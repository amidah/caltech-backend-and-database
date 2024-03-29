package com.estore.servlet.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter extends HttpFilter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("[Login Filter] - destroy executed.");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		out.print("<h3>Pre Processing</h3>");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.print("<h3>Post Processing</h3>");
		out.print("</center>");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("[Login Filter] - init executed.");
	}

}
