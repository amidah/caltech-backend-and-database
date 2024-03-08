package com.java.exception.handling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] cashbacks = {100, 20, 30, 80, 90, 60, 40, 50, 10};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your lucky number: ");
		int userInp = scanner.nextInt();
		scanner.close();
		
		int cashbackEarned = 0;
		try {
			cashbackEarned = cashbacks[userInp];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry! Something Went Wrong!");
			System.out.println("Message: " + e.getMessage());		
		}
		finally {
			System.out.println("Some imp tasks to be executed in case exception occurs or not");
		}
		System.out.println("Thank you for your participation. You earned a cashback of $" + cashbackEarned);
		
		System.out.println("Cashback App Finished");
	}
}
