package com.Assignment7;

public class InvalidAgeException extends Exception 
{
	private int invalidAge;
	
	public InvalidAgeException(String errorMessage, int invalidAge)
	{
		super(errorMessage);
		this.invalidAge= invalidAge;
	}

	public String getMessage() 
	{
		String message = super.getMessage();
		String finalMassage =message+"==>"+invalidAge;
		return finalMassage;
	}
}
