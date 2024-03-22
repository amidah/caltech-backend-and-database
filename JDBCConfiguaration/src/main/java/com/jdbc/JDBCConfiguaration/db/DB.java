package com.jdbc.JDBCConfiguaration.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.jdbc.JDBCConfiguaration.model.Customer;
import com.jdbc.JDBCConfiguaration.model.User;

import java.sql.CallableStatement;

public class DB implements DAO {
	
	Connection con;
	
	Statement stmt;
	
	PreparedStatement prStmt;
	
	CallableStatement calStmt;
	
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
			
//			String sql = "insert into Customer values(null, '"+ customer.getName() +"', '"+ customer.getPhone() +"', '" + customer.getEmail() + "', '" + customer.getBirthDate() + "', " + customer.getAge() + ", '" + customer.getInDateTime() + "', '"
//					+ customer.getOutDateTime() + "', " + customer.getTemperature() + ")";
//			System.out.println("The SQL- " + sql);
			String sql = "insert into Customer values(null, ?, ?, ?, ?, ?, ?, ?, ?)";
			prStmt = con.prepareStatement(sql);
			prStmt.setString(1, customer.getName());
			prStmt.setString(2, customer.getPhone());
			prStmt.setString(3, customer.getEmail());
			prStmt.setString(4, customer.getBirthDate());
			prStmt.setInt(5, customer.getAge());
			prStmt.setString(6, customer.getInDateTime());
			prStmt.setString(7, customer.getOutDateTime());
			prStmt.setFloat(8, customer.getTemperature());
			//int result = stmt.executeUpdate(sql);
			int result = prStmt.executeUpdate();
			String message = result > 0 ? "Customer created successfully..." : "Customer not created. Please try again!";
			System.out.println(TAG + " " + message);
		}
		catch(Exception e) {
			System.out.println("Exception Occurred: " + e);
		}
		
	}

	public void updateCustomer(Customer customer) {
		try {
//		String sql = "update Customer set name= '" + customer.getName() 
//		+ "', phone= '" + customer.getPhone() + "', email= '" + customer.getEmail() 
//		+ "', birthDate= '" + customer.getBirthDate() 
//		+ "', age= " + customer.getAge() + ", inDateTime= '" + customer.getInDateTime() + "', outDateTime= '" + customer.getOutDateTime() + "', temperature= " + customer.getTemperature() 
//		+ " where cid= " + customer.getCid();
//		
//		System.out.println("Update SQL - " + sql);
		String sql="update Customer set name=?, phone=?,email=?,birthDate=?,age=?,inDateTime=?,outDateTime=?,temperature=? where cid=?";
		prStmt = con.prepareStatement(sql);
		prStmt.setString(1, customer.getName());
		prStmt.setString(2, customer.getPhone());
		prStmt.setString(3, customer.getEmail());
		prStmt.setString(4, customer.getBirthDate());
		prStmt.setInt(5, customer.getAge());
		prStmt.setString(6, customer.getInDateTime());
		prStmt.setString(7, customer.getOutDateTime());
		prStmt.setFloat(8, customer.getTemperature());
		prStmt.setInt(9, customer.getCid());
//		int result = stmt.executeUpdate(sql);
		int result = prStmt.executeUpdate();
		String message = result > 0 ? "Customer updated successfully..." : "Customer not updated. Please try again!";
		System.out.println(TAG + " " + message);
		
		}
		catch(Exception e) {
			System.out.println("Exception Occurred " + e);
		}
				
		
	}

	public void deleteCustomer(int cid) {
		try {
//			String sql = "delete from Customer where cid =" + cid;
			String sql = "delete from Customer where cid = ?";
			prStmt = con.prepareStatement(sql);
			prStmt.setInt(1, cid);
//			int result = stmt.executeUpdate(sql);
			int result = prStmt.executeUpdate();
			String message = result > 0 ? "Customer deleted successfully..."
					: "Customer not deleted. Please try again!";
			System.out.println(TAG + " " + message);

		} catch (Exception e) {
			System.out.println("Exception Occured: " + e);
		}

		
	}

	public ArrayList<Customer> getAllCustomers() {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			String sql = "select * from Customer";
//			stmt = con.createStatement();
//			ResultSet resultSet = stmt.executeQuery(sql);
			prStmt = con.prepareStatement(sql);
			ResultSet resultSet = prStmt.executeQuery();
			
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setCid(resultSet.getInt(1));
				customer.setName(resultSet.getString(2));
				customer.setPhone(resultSet.getString(3));
				customer.setEmail(resultSet.getString(4));
				customer.setBirthDate(resultSet.getString(5));
				customer.setAge(resultSet.getInt(6));
				customer.setInDateTime(resultSet.getString(7));
				customer.setOutDateTime(resultSet.getString(8));
				customer.setTemperature(resultSet.getFloat(9));
				customerList.add(customer);
			}
		}
		catch(Exception e) {
			System.out.println("Exception Occurred " + e);
		}
		return customerList;
	}
	
	public Customer getCustomerById(int cid) {
		Customer customer = new Customer();
		try {
//			String sql = "select * from Customer WHERE cid = " + cid;
//			stmt = con.createStatement();
//			ResultSet resultSet = stmt.executeQuery(sql);
			
			String sql = "select * from Customer WHERE cid = ?";
			prStmt = con.prepareStatement(sql);
			prStmt.setInt(1, cid);
			ResultSet resultSet = prStmt.executeQuery();


			while (resultSet.next()) {
				
				customer.setCid(resultSet.getInt(1));
				customer.setName(resultSet.getString(2));
				customer.setPhone(resultSet.getString(3));
				customer.setEmail(resultSet.getString(4));
				customer.setBirthDate(resultSet.getString(5));
				customer.setAge(resultSet.getInt(6));
				customer.setInDateTime(resultSet.getString(7));
				customer.setOutDateTime(resultSet.getString(8));
				customer.setTemperature(resultSet.getFloat(9));	
			}

		} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
		}
		return customer;
	}

	public void executeStoredProcedure(User user) {
		
		try{
			String sql = "{ call addUser(?, ?) }";
			calStmt = con.prepareCall(sql);
			calStmt.setString(1, user.getName());
			calStmt.setString(2, user.getPassword());
			calStmt.execute();
			String message = "Stored procedured executed successfully.";
			System.out.println(TAG + " " + message);
		}
		catch(Exception e) {
			System.out.println("Exception Occured:" + e);
		}
		
	}

	public void executeUpdateStoredProcedure(User user) {
		
		try{
			String sql = "{ call updateUser(?, ?, ?) }";
			calStmt = con.prepareCall(sql);
			calStmt.setInt(1, user.getUid());
			calStmt.setString(2, user.getName());
			calStmt.setString(3, user.getPassword());
			calStmt.execute();
			String message = "Update Stored procedured executed successfully.";
			System.out.println(TAG + " " + message);
		}
		catch(Exception e) {
			System.out.println("Exception Occured:" + e);
		}
	}
	

}
