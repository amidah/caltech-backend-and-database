package com.java.arraylist;

import java.util.ArrayList;

class Product{
	int pid;
	String name;
	int price;
	int quantity;
	
	public Product() {
	
	}

	public Product(int pid, String name, int price, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}

class User{
	String name;
	String email;
	ArrayList<Product> shoppingCart;
	
	public User() {

	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.shoppingCart = new ArrayList<Product>();
	}
	
	void addProductToCart(Product product) {
		product.quantity++;
		shoppingCart.add(product);
	}
	
	void increment(Product product) {
		int idx = shoppingCart.indexOf(product);
		
		shoppingCart.get(idx).quantity++;
		
	}
	
	void decrement(Product product) {
		int idx = shoppingCart.indexOf(product);
		shoppingCart.get(idx).quantity--;
		
	}
	
	void removeProductFromCart(Product product) {
		int idx = shoppingCart.indexOf(product);
		shoppingCart.remove(idx);
	}
	
	void showProductsInCart() {
		System.out.println("Listing Products for name: " + name);
		
		for(Product product : shoppingCart) {
			System.out.println(product);
		}
		System.out.println();
	}
	
	void checkoutFromCart() {
		System.out.println("Checking out for name: " + name);
		
		int total = 0;
		
		for(Product product : shoppingCart) {
			System.out.println(product);
			total += (product.price * product.quantity); 
		}
		System.out.println("Dear " + name + ". Please pay: " + total);
		System.out.println();
	}
	
	
}

public class Arraylist {
	
	public static void main(String[] args) {
		Product p1 = new Product(101, "Adidas AlphaBounce Shoe", 5000, 0);
		Product p2 = new Product(102, "IPhone", 85000, 0);
		Product p3 = new Product(103, "Samsung Led TV", 65000, 0);
		Product p4 = new Product(104, "Hitachi Fridge", 75000, 0);
		Product p5 = new Product(105, "Coffee Mug", 1000, 0);
		
		User user1 = new User("John", "john@gmail.com");
		User user2 = new User("Cena", "cena@yahoo.com");
		
		user1.addProductToCart(p1);
		user1.addProductToCart(p2);
		user1.addProductToCart(p3);
		
		user2.addProductToCart(p4);
		user2.addProductToCart(p5);
		
		user1.removeProductFromCart(p3);
		user2.removeProductFromCart(p5);
	
		
		user1.increment(p1);
		user1.increment(p2);
		user1.increment(p1);
		
		user2.increment(p4);
		user2.increment(p4);
		user2.increment(p4);
		
		user1.showProductsInCart();
		user2.showProductsInCart();
		
		user1.checkoutFromCart();
		user2.checkoutFromCart();
		
		user1.decrement(p1);
		user2.decrement(p4);
		
		user1.checkoutFromCart();
		user2.checkoutFromCart();
		
	}

}
