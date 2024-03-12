package com.java.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 100;
		double b = 2.2;
		char c = 'A';
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		Integer intRef = Integer.valueOf(a);
		Double doubleRef = Double.valueOf(b);
		Character charRef = Character.valueOf(c);
		
		
		System.out.println("intRef = " + intRef.intValue());
		System.out.println("doubleRef = " + doubleRef.doubleValue());
		System.out.println("charRef = " + charRef.charValue());
		
	}
}
