package com.Assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
public class Work_Duration {
	static int count;
	static int count1;
	public static void main(String[] args) 
	{
		
		String filePath="work_duration.txt";
		try(FileReader fr =new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr))
		{
			int summin=0;
			int sumhr=0;
			int rem=0;
			
			while(true)
			{
				String line=br.readLine();
				if(line==null)
					break;
				
				String values[]=line.split(":");
				
				String hours=values[0];
				int hour=Integer.parseInt(hours);
				
				sumhr=sumhr+hour;
				
				String minutes=values[1];
				int min=Integer.parseInt(minutes);
				summin=summin+min;
				

			}
			rem=summin%60;
			sumhr=sumhr+(summin/60);
			System.out.println("Total duration: "+sumhr+" hours and "+rem+" minutes.");
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		}
				
				
		
		
	

}


