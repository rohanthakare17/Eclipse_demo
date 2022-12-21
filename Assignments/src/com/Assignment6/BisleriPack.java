package com.Assignment6;

public class BisleriPack 
{
	BisleriBottle bottelType;
	int quantity;
	public BisleriPack(BisleriBottle bottelType, int quantity) {
		super();
		this.bottelType = bottelType;
		this.quantity = quantity;
	}
	public BisleriBottle getBottelType() {
		return bottelType;
	}
	public void setBottelType(BisleriBottle bottelType) {
		this.bottelType = bottelType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
//	public float totalcost()
//	{
//		float tp=bottelType.getCost();
//		return tp;
//	}
//	
//	public float totalVolume()
//	{
//		float tp=bottelType.getVolume();
//		return tp;
//	}
}
