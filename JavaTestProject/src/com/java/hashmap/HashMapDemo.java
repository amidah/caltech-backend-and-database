package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		
		//LinkedHashMap<Integer, String> hMap = new LinkedHashMap<>();
		
		//TreeMap<Integer, String> hMap = new TreeMap<>();
		//hMap.put(100, null);
		hMap.put(104, "Tonny");
		hMap.put(105, "John");
		hMap.put(106, "Ron");
		hMap.put(107, "Joy");
		hMap.put(101, "Joy");
		hMap.put(102, "Roy");
		hMap.put(103, "Johnny");
		hMap.put(108, "Roy");
		hMap.put(109, "Johnny");
		hMap.put(110, "Tonny");
		hMap.put(111, "John");
		hMap.put(112, "Ron");
		
		System.out.println(hMap);
		
		System.out.println("Value at key 108: " + hMap.get(108));
		
		Set<Integer> keys = hMap.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		
		System.out.println("");
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.print(key + " : ");
			System.out.print(hMap.get(key));
			System.out.println();
		}
		
		
		
		
	}

}
