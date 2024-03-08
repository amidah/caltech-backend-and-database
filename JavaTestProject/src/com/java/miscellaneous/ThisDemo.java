package com.java.miscellaneous;

class User{
	
	static int objSrNumber = 0;
	
	String name;
	String email;
	String phoneNumber;
	
	User(){
		objSrNumber++;
		name =  "";
		email = "";
		phoneNumber = "";
		System.out.println("User Obj Constructed with Sr Number: " + objSrNumber + " this is: " + this);
	}
	
	User(String name){
//		if(name.isEmpty()) {
//		this.name = "NA";
//		}
//		else {
//			this.name = name;
//		}
		
		this.name = name.isEmpty() ? "NA" : name;
	}
	
	User(String name, String email, String phoneNumber){
		this(name);
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	void show() {
		System.out.println("User details: " + this);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}


public class ThisDemo {
	
	public static void main(String[] args) {
//		User user1 = new User();
//		System.out.println(user1);
//		
//		System.out.println("\n");
//		
//		User user2 = new User();
//		System.out.println(user2);
		
		User user = new User("ABC", "+91-1234567890", "abc@xyz.com");
		user.show();
		
	}
	
	
	

}
