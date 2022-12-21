package com.Assignment1;

public class CateringBill1 {
	private int plateCount;
	private int ratePerPlate;

	public CateringBill1() {
		
	}

	public CateringBill1(int plateCount, int ratePerPlate) {
		super();
		this.plateCount = plateCount;
		this.ratePerPlate = ratePerPlate;
	}

	public int getPlateCount() {
		return plateCount;
	}

	public void setPlateCount(int plateCount) {
		this.plateCount = plateCount;
	}

	public int getRatePerPlate() {
		return ratePerPlate;
	}

	public void setRatePerPlate(int ratePerPlate) {
		this.ratePerPlate = ratePerPlate;
	}

	public int generateBill() {
		int bill=plateCount*ratePerPlate;
		return bill;
	}
	
	public int generateBill(int discountPercent) {
		int bill=plateCount*ratePerPlate;
		int discount=(discountPercent*bill)/100;
		return discount;
	}
	
}
