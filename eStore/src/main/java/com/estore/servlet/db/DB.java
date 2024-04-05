package com.estore.servlet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.estore.servlet.model.Product;

public class DB {
	
	Connection connection;
	PreparedStatement preparedStatement;
	
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB] Driver Loaded");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/estore", "root", "Root@1234");	
			System.out.println("[DB] Connection created");
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB] Connection to DB Closed");
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public int addProduct(Product product) {
		int result = 0;
		try {
		String sql = "insert into Product values(null, ?, ?, ?)";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, product.code);
		preparedStatement.setString(2, product.name);
		preparedStatement.setInt(3, product.price);
		
		result = preparedStatement.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
		return result;
	}
	
	public ArrayList<Product> fetchAllProducts(){
		ArrayList<Product> products = new ArrayList<>();
		try {
			String sql = "select * from Product";
			preparedStatement = connection.prepareStatement(sql);
			
			ResultSet set = preparedStatement.executeQuery();
			
			while(set.next()) {
				Product product = new Product();
				product.id = set.getInt(1);
				product.code = set.getInt(2);
				product.name = set.getString(3);
				product.price = set.getInt(4);
				
				products.add(product);
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
		return products;
	}
	
	public int deletProduct(int id) {
		int result = 0;
		try {
			String sql = "delete from Product where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			result = preparedStatement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
		return result;
	}
	
	public Product fetchProduct(int id){
		Product product = new Product();
		try {
			String sql = "select * from Product where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet set = preparedStatement.executeQuery();
			
			while(set.next()) {			
				product.id = set.getInt(1);
				product.code = set.getInt(2);
				product.name = set.getString(3);
				product.price = set.getInt(4);		
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
		return product;
	}
	
	public int updateProduct(Product product) {
	    int result = 0;
	    try {
	        String sql = "update Product set code = ?, name = ?, price = ? where id = ?";
	        preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setInt(1, product.code);
	        preparedStatement.setString(2, product.name);
	        preparedStatement.setInt(3, product.price);
	        preparedStatement.setInt(4, product.id);

	        result = preparedStatement.executeUpdate();

	    } catch (Exception e) {
	        System.out.println("Something went wrong: " + e);
	    }
	    return result;
	}
}
