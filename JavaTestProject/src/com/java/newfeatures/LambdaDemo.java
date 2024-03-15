package com.java.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Register{
	void register(String name);
} 

@FunctionalInterface
interface Login{
	void login(String email, String password);	
}

@FunctionalInterface
interface Authentication{
	void print();
}

class Auth implements Authentication{

	@Override
	public void print() {
		System.out.println("print");
		
	}
	
}


public class LambdaDemo {

	public static void main(String[] args) {
		List<String> emails = Arrays.asList("john@gmail.com", "sam@yahoo.com", "roy@gmail.com");

		System.out.println(emails);

		String csvData = emails.stream().map((var email) -> email.replace("@yahoo.com", "outlook.com"))
				.collect(Collectors.joining(", "));
		
		System.out.println(csvData);
		
		
		String text = "Hello";
		var vartext = true;
		
		System.out.println(text + ", " + vartext);
	
		System.out.println(text.getClass().getName());
		System.out.println(((Object) vartext).getClass().getName());
		
		
//		Register register = new User();
//		register.register();
		
//		Register register = new Register() {
//			
//			@Override
//			public void register() {
//				System.out.println("Register Method is invoked.");
//				
//			}
//		};
//		
//		register.register();
		
		
		
		
		Register register = (name) -> {
				System.out.println(name + " is Registered ...");
				};
		
		
		Login login = (email, password) -> {
			System.out.println("email: " + email + " entered...");
			System.out.println("password: " + password + " entered...");
			
			if(email.equals("john@gmail.com") && password.equals("John@123"))
			{		
				register.register("John");
			}
			else if(email.equals("sam@yahoo.com") && password.equals("Sam@123")) {
				register.register("Sam");
			}
			else{
				System.out.println("Loggin Failed...");
			}
		};
		
		login.login("sam@yahoo.com", "Sam@12");
		
		
	}

}
