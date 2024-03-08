package com.java.exception.handling;


class BankAccount{
	int balance;
	int minBalance;
	int attempts = 0;
	
	public BankAccount() {
		balance = 10000;
		minBalance = 1000;
	}
	
	void withdraw(int amount) throws BankingException {
		balance -= amount;
		
		if(balance < minBalance)
		{
			balance += amount;
			System.out.println("Withdrawl Failed for amount: " + amount + "! Remaining Balance is low: " + balance);
			attempts++;
		}
		else{
			System.out.println("Withdrawl Successful for amount: " + amount + "! Remaining Balance: " + balance);
		}
		
		if(attempts == 3) {
			BankingException be = new BankingException("Max. attempts allowed is only 3! Please try again later after sufficient balance in acount!");
			throw be;
		}
		
		
		
	}
	
}


class BankingException extends Exception{
	public BankingException(String message) {
		super(message);
	}
}


public class BankingApp {

	public static void main(String[] args) {
		System.out.println("Banking App Started");
		
		BankAccount bankAccount = new BankAccount();
		
		try {
			for(int i = 1; i < 10; i++) {
			bankAccount.withdraw(3000);
			}
		} catch (BankingException e) {
			
			System.out.println("Banking Exception Occurred: " + e.getMessage());
		}
		System.out.println("Banking App End");
		}
		
	}


