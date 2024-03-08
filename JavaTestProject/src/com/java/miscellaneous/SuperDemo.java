package com.java.miscellaneous;

class Parent{
	String fname;
	String lname;
	int wealth;
	
	Parent() {
		fname = "John";
		lname = "Smith";
		wealth = 1000000;
		System.out.println("Parent Object is constructed");
	}
	
	Parent(String fname, String lname, int wealth) {
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
		System.out.println("Parent Object is constructed");
	}

	void purchaseCar() {
		
		System.out.println("Lets buy Honda City");
	}
	
	void show() {
		System.out.println("Parent Details: " + fname + " " + lname + " " + wealth);
	}
}

class Child extends Parent{
	Child() {
		super("Sam", "Watson", 200000000);
		System.out.println("Child Object is constructed");
	}
	
	void purchaseCar() {
		super.purchaseCar();
		System.out.println("Lets buy Honda Civic");
	}
}


public class SuperDemo {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.show();
		child.purchaseCar();
	}

}
