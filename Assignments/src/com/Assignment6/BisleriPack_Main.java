package com.Assignment6;

public class BisleriPack_Main {

	public static void main(String[] args) 
	{
		BisleriBottle b1= new SmallBottle();
		BisleriBottle b2= new MediumBottle();
		BisleriBottle b3= new LargeBottle();
		
		BisleriPack arr[]= {new BisleriPack(b1, 20) ,new BisleriPack(b2, 10), new BisleriPack(b3, 20)};
		
		float sc=b1.getCost()*arr[0].getQuantity();
		float mc=b2.getCost()*arr[1].getQuantity();
		float lc=b3.getCost()*arr[2].getQuantity();
		
		float sv=b1.getVolume()*arr[0].getQuantity();
		float mv=b2.getVolume()*arr[1].getQuantity();
		float lv=b3.getVolume()*arr[2].getQuantity();
		
		float tv=((sv+mv+lv)/1000);
		float tc=sc+mc+lc;
		
		System.out.println("Total Volume: "+tv);
		System.out.println("Total Cost: "+tc);
	
	}

}
