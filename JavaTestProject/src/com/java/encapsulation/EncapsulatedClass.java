package com.java.encapsulation;

class Person{
	private int id;
	private String name;
	private int age;
	private String phone;
	private String address;
	
	Person(){
		System.out.println("Non-Parameterized Constructor");
	}
	

	public Person(int id, String name, int age, String phone, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address
				+ "]";
	}
}


public class EncapsulatedClass {
	
	public static void main(String[] args) {
		Person p = new Person(1, "John", 25, "+91-1234567890", "ABCD");
		System.out.println("ID:: " + p.getId());
		System.out.println("NAME:: " + p.getName());
		System.out.println("AGE:: " + p.getAge());
		
		p.setAge(27);
		
		System.out.println("\n");
		System.out.println("ID:: " + p.getId());
		System.out.println("NAME:: " + p.getName());
		System.out.println("AGE:: " + p.getAge());
	}
	

}
