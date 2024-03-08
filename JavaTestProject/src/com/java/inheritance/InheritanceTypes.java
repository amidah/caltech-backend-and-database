package com.java.inheritance;

class A{
	String id;
	String name;
	String age;
	
	public A(String id, String name, String age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

class B extends A{
	String profession;

	public B(String id, String name, String age, String profession) {
		super(id, name, age);
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "B [profession=" + profession + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

class C extends B{
	String salary;

	public C(String id, String name, String age, String profession, String salary) {
		super(id, name, age, profession);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "C [salary=" + salary + ", profession=" + profession + ", id=" + id + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
}

class D extends B{
	String d;

	public D(String id, String name, String age, String profession, String d) {
		super(id, name, age, profession);
		this.d = d;
	}
	
	
}


public class InheritanceTypes {

	public static void main(String[] args) {
		
		A a = new A("1", "John", "22");
		B b = new B("2", "Sam", "23", "Software Engineer");
		C c = new C("3", "Roy", "24", "Solution Architect", "15000USD/month");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	
	
	
	
}
