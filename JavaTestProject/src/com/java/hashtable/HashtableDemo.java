package com.java.hashtable;

import java.util.Hashtable;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(100, "John");
		hashTable.put(101, "Ron");
		hashTable.put(102, "Bob");
		hashTable.put(103, "Dwane");
		hashTable.put(104, "Chelsea");
		hashTable.put(105, "Sam");
		hashTable.put(103, "Roy");
		hashTable.put(106, null);
		
		System.out.println(hashTable);
	}

}
