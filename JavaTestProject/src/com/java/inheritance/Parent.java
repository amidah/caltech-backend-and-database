package com.java.inheritance;

public class Parent {

	String firstName;
	String lastName;
	int wealth;
	String childGender;
	
	Parent() {
		firstName = "John";
		lastName = "Watson";
		wealth = 1000000;
	}
	
	void showDetails() {
		System.out.println("Parent Details are: " + firstName + ", " + lastName + ", " + wealth);
	}

}
