package com.Assignment3;

public class City_Main {

	public static void main(String[] args) 
	{
		City arr[]= {new City("Mumbai",5000000),new City("Pune",3000000),new City("Delhi",10000000)};
		float pop=CityProcessor.getAvgPopulation(arr);
		System.out.println("The Average Population of City Array is "+pop);
		
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
