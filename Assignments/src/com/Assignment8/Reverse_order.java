package com.Assignment8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName=args[0];
		StringBuilder fr=new StringBuilder(100);
		try(FileInputStream fin= new FileInputStream(fileName))
		{
			while(true) {
				int data=fin.read();
				if(data!=-1)
					fr.append((char)data);
				else
					break;
			}
			fr.reverse();
			System.out.println(fr);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
