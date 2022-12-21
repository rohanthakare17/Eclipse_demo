package com.Assignment12;

public class InvalidUserException extends Exception {
	private String invalidUser;

	public InvalidUserException(String errorMessage,String invalidUser) {
		super(errorMessage);
		this.invalidUser=invalidUser;
	}
	
	//Overriding getMessage() method from Exception class
	
	@Override
	public String getMessage() {
		//Invoking baseclass getMessage()
		String message=super.getMessage();
		String finalMessage=message+"==>>"+invalidUser;
		return finalMessage;

	}

	
	
	

}
