package com.Assignment1;

import java.util.Scanner;

public class CateringBill_Main1 {

	public static void main(String[] args) {

		CateringBill1 cb1= new CateringBill1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of plate");
		int m = sc.nextInt();
		cb1.setPlateCount(15);
	    System.out.println(m);
	    System.out.println("Enter rate per plate");
		int n = sc.nextInt();
		cb1.setRatePerPlate(40);
	    System.out.println(n);
	    
	    System.out.println("Total bill without discount: "+cb1.generateBill());
	    System.out.println("Total discount you got it: "+cb1.generateBill(m));
	    System.out.println("Total amount you have to pay: "+(cb1.generateBill()-cb1.generateBill(m)));
	}

}
