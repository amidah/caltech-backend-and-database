package com.java.inheritance;

abstract class GooglePay {

	
	void payFromGoogle(int amount) {
		System.out.println("[Google Pay] Amount Paid: " + amount);
		onSuccess(101, "Amount Paid: " + amount);
	}
	

	abstract void onSuccess(int code, String message);

	abstract void onFailure(int code, String message);
}

abstract class ApplePay {
	void payFromApple(int amount) {
		System.out.println("[Apple Pay] Amount Paid: " + amount);
	}

	abstract void onSuccess(int code, String message);

	abstract void onFailure(int code, String message);
}

class FoodDeliveryAppPayments extends GooglePay {

	@Override
	void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment Received. We will deliver the order soon..." + code + " " + message);

	}

	@Override
	void onFailure(int code, String message) {
		System.out.println("[FDA] Payment Failed. Please try again..." + code + " " + message);

	}

}

public class AbstractionWithInterfaces {
	public static void main(String[] args) {
		GooglePay ref = new FoodDeliveryAppPayments();
		ref.payFromGoogle(2000);
//		ref.onSuccess(101, "Amount Paid: 2000");
	}
}
