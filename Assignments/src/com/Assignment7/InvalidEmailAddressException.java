package com.Assignment7;

public class InvalidEmailAddressException extends Exception 
{
	private String invalidEmail;
	
	public InvalidEmailAddressException(String errorMessage, String invalidEmail)
	{
		super(errorMessage);
		this.invalidEmail= invalidEmail;	
	}
	
	public String getMessage() 
	{
		String message = super.getMessage();
		String finalMassage =message+"==>"+invalidEmail;
		return finalMassage;		
	}
}
