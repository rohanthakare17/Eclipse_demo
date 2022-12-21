package com.Assignment2;

public class Account_Main {

	public static void main(String[] args) {
		Account acc1= new Account(101,"Rohan Thakare",100000);
		Account acc2= new Account(102,"Roshan Thakare",50000);
		
//		acc1.setAccountNo(101);
//		acc1.setName("Rohan Thakare");
//		acc1.setBalance(100000);
//		
//		acc2.setAccountNo(102);
//		acc2.setName("Roshan Thakare");
//		acc2.setBalance(50000);
		
		System.out.println("Accout number: "+acc1.getAccountNo()+"\nAccount Holder Name: "+acc1.getName()+"\nBalances: "+acc1.getBalance());
		System.out.println("\nAccout number: "+acc2.getAccountNo()+"\nAccount Holder Name: "+acc2.getName()+"\nBalances: "+acc2.getBalance());
	
		acc1.transferFunds(acc2, 25000);
		System.out.println(acc1.getName()+" your account blance is "+acc1.getBalance());
		System.out.println(acc2.getName()+" your account blance is "+acc2.getBalance());
	}

}
