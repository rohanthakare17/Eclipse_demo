package com.Assignment2;

public class Account {
	private int accountNo;
	private String name;
	private float balance;
	

	public Account(int accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(float deposit) {
		 balance=deposit+balance;
	}
	public void withdraw(float withdraw) {
		 balance=balance-withdraw;
		
	}
	public void transferFunds(Account acc,float amountToTransfer) {
		acc.balance=amountToTransfer+acc.balance;
		this.balance=this.balance-amountToTransfer;
	}
	
}
