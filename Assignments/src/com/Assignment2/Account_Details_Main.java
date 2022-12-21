package com.Assignment2;

public class Account_Details_Main 
{

		public static void main(String[] args) 
		{
			Account_Details acc1=new Account_Details();
			Account_Details acc2=new Account_Details();

			acc1.setAccountNo(227);
			acc1.setName("Rohan");
			acc1.setBalance(100000);
			
			acc2.setAccountNo(228);
			acc2.setName("Rushikesh");
			acc2.setBalance(50000);
			
			System.out.println("Account number: "+acc1.getAccountNo());
			System.out.println("Account holder name: "+acc1.getName());
			System.out.println("Blance: "+acc1.getBalance());
			
			System.out.println("\nAccount number: "+acc2.getAccountNo());
			System.out.println("Account holder name: "+acc2.getName());
			System.out.println("Blance: "+acc2.getBalance());
			
			acc1.transferFunds(acc2, 25000);
			
			System.out.println("\n"+acc1.getName()+" your Account blance is: "+acc1.getBalance());
			System.out.println(acc2.getName()+" your Account blance is: "+acc2.getBalance());
		}

}


