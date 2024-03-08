package com.java.exception.handling;

/*
 * Throwable
 * 		Exception
 * 			RuntimeException
 * 				ArrayOutOfBoundException
 * 				NullPointerException
 * 				
 * 		
 */
// Checked Custom Exception
class InvalidPhoneNumberException extends Exception{

	public InvalidPhoneNumberException(String message) {
		super(message);
		
	}
	
}

// Unchecked Custom Exception
class InvalidEmailException extends RuntimeException{

	public InvalidEmailException(String message) {
		super(message);
	}
	
}


public class CustomException {
	public static void main(String[] args) throws InvalidPhoneNumberException {
		System.out.println("Customer Management App Started");
		String phone = "+91 12345 67890";
		String email = "";
		if(phone.isEmpty()) {
			InvalidPhoneNumberException pne = new InvalidPhoneNumberException("Phone number can't be empty");
			throw pne;
		}
		if(email.isEmpty()) {
			InvalidEmailException ie = new InvalidEmailException("Email can't be empty");
			throw ie;
		}
		System.out.println("Customer Management App Finished");
		
		
	}
}
