package com.java.test;

public class MutableVsImmutableStrings {
	
	public static void main(String[] args) {
		// Immutable Strings
		
		String str1 = new String("Hello ");
		str1 = str1.concat("World. ");
	    str1 = str1.concat("Welcome to the session.");
		System.out.println(str1);
		System.out.println(str1.length());
		
		String str2 = new String(str1);
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("comparision is true");
		}
		else {
			System.out.println("comparision is false");
		}

		
		if(str1.equals(str2)) {
			System.out.println("comparision is true");
		}
		else {
			System.out.println("comparision is false");
		}
		
		// Mutable String Buffers
		StringBuffer sb = new StringBuffer("Java ");
		sb.append("is a ").append("powerful ").append("language");
		
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	
	}

}
