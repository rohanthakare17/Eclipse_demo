package com.Assignment3;

public class CityProcessor1 {

	public CityProcessor1() {
		// TODO Auto-generated constructor stub
	}

	public static float getAvgPopulation(City c1[]) {
		int size=c1.length;
		float avg=0, sum=0;
		for(City ca :c1)
		{
			int p=ca.getPopulation();
			sum=sum+p;
			avg=sum/size;
		}
		return avg;
	}
	
	public static String[] getBigCityNames(City c1[])
	{
		int size=c1.length;
		String name[]=new String[size];
		int index=0;
		
		for(City ca:c1)
		{
			if(ca!=null)
			{
				int p=ca.getPopulation();
				if(p>4000000)
					name[index]=ca.getName();
			}
			index++;
		}
		return name;
	}
	
}
