package com.java.interfacedemo;

interface PayTMPaymentGateway{
	
}

interface RazorPay{
	
}

interface PayPal{
	
}

class MyPaymentPage implements PayTMPaymentGateway, RazorPay, PayPal{
	
}

interface Notification{
	
	void notifyMessage(String text);
	
}

interface ElectricityBillPayment{
	
	int billAccountNumber = 123456789;// public static final int billAccountNumber = 123456789;
	
	void billGenerated();
	void payBillNotification();
}

class User implements Notification, ElectricityBillPayment
{

	@Override
	public void notifyMessage(String text) {
		
		System.out.println("A new notification message: " + text);
	}

	@Override
	public void billGenerated() {
		
		System.out.println("Electricity Bill is generated, please pay in time!");
	}

	@Override
	public void payBillNotification() {
		
		System.out.println("Thank you for paying your bill in time!");
	}
	
}

class ElectricityApp{
	ElectricityBillPayment payment;
	void susbcribeForBill(ElectricityBillPayment payment) {
		this.payment = payment;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println("Bill Account Number is: " + ElectricityBillPayment.billAccountNumber);
		ElectricityApp elcApp = new ElectricityApp();
		User sam = new User();
		elcApp.susbcribeForBill(sam);
		
	}
}
