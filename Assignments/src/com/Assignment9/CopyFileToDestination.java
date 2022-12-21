package com.Assignment9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileToDestination 
{
	public static void main(String[] args) 
	{
		String source = args[0];
		String destination = args[1];
		StringBuilder sb = new StringBuilder(2000);
		try(FileInputStream fin = new FileInputStream(source); FileOutputStream fout = new FileOutputStream(destination))
		{
			int data;
			while(true)
			{
				data = fin.read();
				if(data==-1)
				break;
				else
				{
					char ch = (char)data;
					sb.append(ch);
				}
			}
				String ijk = sb.toString();
				byte[] arr = ijk.getBytes();
				fout.write(arr);
				System.out.println("Data is written successfully");
		}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
