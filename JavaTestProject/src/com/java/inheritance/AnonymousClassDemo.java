package com.java.inheritance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Payments{

	default void pay(int amount) {
		
	}
}

interface PaymentCallback{
	void onSuccess(String message);
	void onFailure(String message);
}

//class Payment implements PaymentCallback{
//
//	@Override
//	public void onSuccess(String message) {
//		System.out.println("Payment Passed: " + message);
//		
//	}
//
//	@Override
//	public void onFailure(String message) {
//		System.out.println("Payment Failed: " + message);
//		
//	}
//	
//}

class ButtonCickListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside Action Listener...");
		
	}
	
}

public class AnonymousClassDemo {
	public static void main(String[] args) {
		PaymentCallback pc = new PaymentCallback() {
			
			@Override
			public void onSuccess(String message) {
				System.out.println("Payment Passed: " + message);
				
			}
			
			@Override
			public void onFailure(String message) {
				System.out.println("Payment Failed: " + message);
				
			}
		};
		pc.onSuccess("Amount paid: 1000");
		pc.onFailure("Amount not paid: 1000");
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Inside Action listener");
				
			}
		};
		ac.actionPerformed(null);
	}
}
