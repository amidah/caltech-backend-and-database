package com.estore.bean;

import java.io.Serializable;

public class Customer implements Serializable{
	
	int cid;
	String name;
	String email;
	
	public Customer() {
	}

	public Customer(int cid, String name, String email) {
		this.cid = cid;
		this.name = name;
		this.email = email;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + "]";
	}

	public String sayHello() {
		return "Hello, " + name;
	}
}
