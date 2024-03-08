package com.java.inheritance;

public class Child extends Parent{
	
	String firstName;
	String lastName;
	int wealth;
	String childPhone;

	Child(){
		firstName = "Sam";
		lastName = "Watson";
		wealth = 2000000;
		childPhone = "+91-1234567890";
	}
	
	void showDetails() {
		System.out.println("Parent Details are: " + super.firstName + ", " + super.lastName + ", " + super.wealth);
		System.out.println("Child Details are: " + firstName + ", " + lastName + ", " + (wealth + super.wealth));
		System.out.println("Only Child's wealth out of total is: " + wealth);
	}
	

}
