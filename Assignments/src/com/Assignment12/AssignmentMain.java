package com.Assignment12;
import java.util.Scanner;

public class AssignmentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Wlcome To Login Page**********");
		System.out.println("Enter UserName:");
		String userName=sc.nextLine();
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		User input=new User(userName,password);
		System.out.println(" ");
		
		try {
			UserDetails foundDetails=UserCollection.getUserDetails(input);
			System.out.println("Login Successful....");
			System.out.println(" ");
			System.out.println(userName+" Details Are:");
			System.out.println("First Name:"+foundDetails.getFirstName());
			System.out.println("Last Name:"+foundDetails.getLastName());
			System.out.println("Age:"+foundDetails.getAge());
		} catch (InvalidUserException e) {
			String message=e.getMessage();
			System.out.println(message);
		}
		

	}

}
