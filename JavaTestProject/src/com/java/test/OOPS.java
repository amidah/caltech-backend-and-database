package com.java.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

class User{
	String name;
	String phone;
	String email;
	String password;
	char gender;
	Date birthDate;
	
	
	
	public User() {
		name = "Sam";
		phone = "+91-1234567891";
		email = "sam@gmail.com";
		password = "Sam@1234";
		gender = 'M';
		birthDate = new Date();
	}

	public User(String name, String phone, String email, String password, char gender, Date birthDate) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.birthDate = birthDate;
	}





	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", birthDate=" + birthDate + "]";
	}
	
	
}

public class OOPS {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User("Elina", "+91-2323232322", "elina@yahoo.com", "elina@1234", 'F', new Date());
		User user4 = user2;
	
		
		user1.name = "John";
		user1.phone = "+91-9090909090";
		user1.email = "john@gmail.com";
		user1.password = "john@1234";
		user1.birthDate = new Date();
		user1.gender = 'M';
		

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		
		System.gc();
		
		
		
	}
	
}
