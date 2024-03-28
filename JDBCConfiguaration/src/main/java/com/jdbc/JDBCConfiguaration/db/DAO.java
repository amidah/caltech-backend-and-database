package com.jdbc.JDBCConfiguaration.db;

import java.util.ArrayList;

import com.jdbc.JDBCConfiguaration.model.Customer;
import com.jdbc.JDBCConfiguaration.model.User;

public interface DAO {
	
	// Lets declare methods for CRUD - Create Read Update Delete operations
	void createConnection();
	void closeConnection();
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
	ArrayList<Customer> getAllCustomers();
	Customer getCustomerById(int cid);
	void executeStoredProcedure(User user);
	void executeUpdateStoredProcedure(User user);
	void executeTransactions();
}
