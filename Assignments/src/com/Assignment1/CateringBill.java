package com.Assignment1;

public class CateringBill 
{
	private int plateCount;
	private int ratePerPlate;
	
	
	public int getPlateCount() 
	{
		return plateCount;
	}
	
	public void setPlateCount(int plateCount) 
	{
		this.plateCount = plateCount;
	}
	public int getRatePerPlate() 
	{
		return ratePerPlate;
	}
	public void setRatePerPlate(int ratePerPlate) 
	{
		this.ratePerPlate = ratePerPlate;
	}
	
	public int genrateBill()
	{
		int bill=plateCount*ratePerPlate;
		return bill;
	}
	
	public int genrateBill(int discPer)
	{
		int bill=plateCount*ratePerPlate;
		int discount=(discPer*bill)/100;
		
		return (bill-discount);
	}


}
