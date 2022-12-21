package com.Assignment3;

public class City_Main1 {

	public static void main(String[] args) {
	
		City arr[] = {new City("Mumbai",10000000), new City("Pune",7800000),new City("Nashik",390000)};
		float pop=CityProcessor1.getAvgPopulation(arr);
		System.out.println("The Average Population of is "+pop);
		
		String name[]=new String[arr.length];
		
		name=CityProcessor.getBigCityNames(arr);
		
		System.out.println("Big Cities are ");
		for(String n:name)
		{
			if(n!=null)
				System.out.println(n);
		}
	}

}
