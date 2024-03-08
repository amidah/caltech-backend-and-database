package com.java.miscellaneous;

final class PaymentGateway{
	
	static int a = 10;
	
	final static void pay(int amount) {
		System.out.println("Payment transaction of amount " + amount + " is successful through Payment Gateway!");
	}
}





public class FinalKeywordExample {
	
	public static void main(String[] args) {
		
		int a = 20;
		System.out.println("Before: " + a);
		
		a = 10;	
		System.out.println("After: " + a);
		
		final int b = 50;
		System.out.println("Before: " + b);	
		
		PaymentGateway.pay(100000000);
		PaymentGateway.a = 20;
		
		
		
	}

}
