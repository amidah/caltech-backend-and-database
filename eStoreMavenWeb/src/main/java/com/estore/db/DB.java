package com.estore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	public Connection con;
	public PreparedStatement stmt;
	
	private static DB db = new DB();
	
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/estore";
			String user = "root";
			String password = "Root@1234";
			con = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	
	public int executeUpdate(PreparedStatement stmt) {
		int result = 0;
		try {
			result = stmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return result;
	}
	
	public ResultSet executeQuery(PreparedStatement stmt) {
		ResultSet set= null;
		try {
			set = stmt.executeQuery();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return set;
	}

	public static DB getDb() {
		return db;
	}
	
	public void closeConnection() {
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	
	
	
}