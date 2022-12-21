
package com.Assignment5;

public class ShirtCollection extends Shirt
{
	public static Shirt shirts[];
	
	public static void setShirts(Shirt shirt[])
	{
		shirts = shirt;
	}
	
	public static int getShirtCount(String type)
	{
		int count = 0;
		for(Shirt checkcount : shirts)
		{
			if(checkcount.getType().equals(type))
				count++;
		}
		if(count == 0)
			System.out.println("Oops, the number of shirts available of the given type are :-");
		else
			System.out.println("Number of shirts available of given type :-");
		return count;
	}
	
	public static boolean isShirtAvailable(Shirt shirt)
	{
		int count=0;
		for(Shirt checkshirt : shirts)
		{
			//if((checkshirt.getBrandName().equals(shirt.getBrandName()) && (checkshirt.getColor().equals(shirt.getColor()) && (checkshirt.getType().equals(shirt.getType())))))
			if(checkshirt.equals(shirt))
			{
				count++;
			}	
		}
		if(count!=0)
			System.out.println("Yes, that shirt is available with us!");
		else
			System.out.println("Sorry, we don't have that shirt available right now..");
		return false;
	}
}
