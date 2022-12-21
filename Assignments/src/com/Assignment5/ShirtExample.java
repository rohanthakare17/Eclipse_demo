package com.Assignment5;
public class ShirtExample {

	public static void main(String[] args) 
	{
		Shirt[] shirtinfo = new Shirt[5];
		shirtinfo[0] = new Shirt("Zodiac", "Red", "Checks");
		shirtinfo[1] = new Shirt("Peter England", "Blue", "Plain");
		shirtinfo[2] = new Shirt("Arrow", "Yellow", "Checks");
		shirtinfo[3] = new Shirt("Polo", "Red", "Plain");
		shirtinfo[4] = new Shirt("Raymond", "Blue", "Plain");
		
		ShirtCollection.setShirts(shirtinfo);
		
		System.out.println(ShirtCollection.getShirtCount("Plain"));
		
		Shirt s = new Shirt("Polo", "Red", "Plain");
		System.out.println(ShirtCollection.isShirtAvailable(s));
	}

}
