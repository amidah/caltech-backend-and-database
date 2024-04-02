package com.estore.servlet.model;

public class Product {

	public int id;
	public int code;
	public String name;
	public int price;
	
	public Product() {
		
	}

	public Product(int id, int code, String name, int price) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}
