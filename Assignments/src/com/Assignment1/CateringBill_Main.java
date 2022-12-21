package com.Assignment1;

public class CateringBill_Main 
{
	public static void main(String[] args) 
	{
		CateringBill cb1=new CateringBill();
		cb1.setPlateCount(15);
		cb1.setRatePerPlate(40);
		System.out.println("Plate Count: "+cb1.getPlateCount());
		System.out.println("Rate per Plate: "+cb1.getRatePerPlate());
		System.out.println("Total bill: "+cb1.genrateBill());
		System.out.println("Your final bill after discount: "+cb1.genrateBill(10));
		
	}

}
