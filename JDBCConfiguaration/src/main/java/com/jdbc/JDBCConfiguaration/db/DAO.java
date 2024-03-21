package com.jdbc.JDBCConfiguaration.db;

import java.util.ArrayList;

import com.jdbc.JDBCConfiguaration.model.Customer;

public interface DAO {
	
	// Lets declare methods for CRUD - Create Read Update Delete operations
	void createConnection();
	void closeConnection();
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
	ArrayList<Customer> getAllCustomers();
	
}
