package com.Assignment2;

public class Account_Details 
{
	private int accountNo;
	private String name;
	private float balance;
	
	
	public int getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(int accountNo) 
	{
		this.accountNo = accountNo;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getBalance() 
	{
		return balance;
	}
	public void setBalance(float balance) 
	{
		this.balance = balance;
	}

	public void deposit(float amt)
	{
		balance=balance+amt;
	}
	
	public void withdraw(float amt)
	{
		balance=balance-amt;
	}
	
	public void transferFunds(Account_Details acc,float amt)
	{
		acc.balance=acc.balance+amt;
		this.balance=this.balance-amt;
	}

}
