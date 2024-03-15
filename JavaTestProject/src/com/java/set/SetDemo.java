package com.java.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<>();
		emails.add("john@gmail.com");
		emails.add("sam@yahoo.com");
		emails.add("leo@outlook.com");
		emails.add("mike@gmail.com");
		emails.add("anna@yahoo.com");
		emails.add("jenni@yahoo.com");
		emails.add("john@gmail.com");
		emails.add("sam@yahoo.com");
		
		System.out.println("ArrayList: " + emails);
		
		System.out.println("");
		
		HashSet<String> mails = new HashSet<>();
		mails.add(null);
		mails.add("john@gmail.com");
		mails.add("sam@yahoo.com");
		mails.add("leo@outlook.com");
		mails.add("mike@gmail.com");
		mails.add("anna@yahoo.com");
		mails.add("jenni@yahoo.com");
		mails.add("john@gmail.com");
		mails.add("sam@yahoo.com");
		
		System.out.println("HashSet: "+ mails);
		mails.remove("sam@yahoo.com");
		System.out.println(mails);
		
		
//		Iterator<String> itr = mails.iterator();
//		while(itr.hasNext()) {
//			String mail = itr.next();
//			System.out.println(mail);
//		}
		
		System.out.println("");
		LinkedHashSet<String> linkedMails = new LinkedHashSet<>();
		linkedMails.add(null);
		linkedMails.add("john@gmail.com");
		linkedMails.add("sam@yahoo.com");
		linkedMails.add("leo@outlook.com");
		linkedMails.add("mike@gmail.com");
		linkedMails.add("anna@yahoo.com");
		linkedMails.add("jenni@yahoo.com");
		linkedMails.add("john@gmail.com");
		linkedMails.add("sam@yahoo.com");
		
		System.out.println("LinkedHashSet: " + linkedMails);
		
		System.out.println("");
		TreeSet<String> treeMails = new TreeSet<>();
		treeMails.add(null);
		treeMails.add("john@gmail.com");
		treeMails.add("sam@yahoo.com");
		treeMails.add("leo@outlook.com");
		treeMails.add("mike@gmail.com");
		treeMails.add("anna@yahoo.com");
		treeMails.add("jenni@yahoo.com");
		treeMails.add("john@gmail.com");
		treeMails.add("sam@yahoo.com");
		
		System.out.println("TreeSet: " + treeMails);
		
	}
}
