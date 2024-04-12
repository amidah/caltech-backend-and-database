package com.estore.main;

import com.estore.bean.Customer;

public class EstoreApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCid(1);
		customer.setName("John");
		customer.setEmail("john@gmail.com");
	}
	
}
