package com.jdbc.JDBCConfiguaration.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.jdbc.JDBCConfiguaration.model.Customer;

public class DB implements DAO {
	
	Connection con;
	
	Statement stmt;
	
	final String TAG = getClass().getSimpleName();

	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (Exception e) {
			System.out.println("Exception Occurred" + e);
		}
	}

	public void createConnection() {
		try {
			String user = "root";
			String password = "Root@1234";
			String url = "jdbc:mysql://localhost/estore";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println(TAG + " Connection created ..." + " Closed status " + con.isClosed());
			
		} catch (Exception e) {
			System.out.println("Exception Occurred" + e);
		}
		
	}

	public void closeConnection() {
		try {
			con.close();
			System.out.println(TAG + " Connection closed ... Closed Status " + con.isClosed());
		} catch (Exception e) {
			System.out.println("Exception Occurred" + e);
		}
		
	}

	public void createCustomer(Customer customer) {
		try {
			// Date - yyyy-MM-DD
			// DateTime - yyyy-MM-DD hh:mm:ss
			
			SimpleDateFormat pattern1 = new SimpleDateFormat("yyyy-MM-DD");
			SimpleDateFormat pattern2 = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
			
			Date date = new Date(2);
			String date1 = pattern1.format(date);
			String date2 = pattern2.format(date);
			
			String sql = "insert into Customer values(null, '"+ customer.getName() +"', '"+ customer.getPhone() +"', '" + customer.getEmail() + "', '" + date1 + "', " + customer.getAge() + ", '" + date2 + "', '"
					+ date2 + "', " + customer.getTemperature() + ")";
			System.out.println("The SQL- " + sql);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			String message = result > 0 ? "Customer created successfully..." : "Customer not created. Please try again!";
			System.out.println(TAG + " " + message);
		}
		catch(Exception e) {
			System.out.println("Exception Occurred: " + e);
		}
		
	}

	public void updateCustomer(Customer customer) {
		String sql = "update Customer set name= '" + customer.getName() 
		+ "', phone= '" + customer.getPhone() + "', email= '" + customer.getEmail() 
		+ "', birthDate= '" + customer.getBirthDate() 
		+ "', age= " + customer.getAge() + ", inDateTime= '" + customer.getInDateTime() + "', outDateTime= '" + customer.getOutDateTime() + "', temperature= " + customer.getTemperature() 
		+ " where cid= " + customer.getCid();
		
		System.out.println("Update SQL - " + sql);
				
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
