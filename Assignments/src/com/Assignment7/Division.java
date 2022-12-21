package com.Assignment7;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		float a,b, div;
		try (Scanner sc = new Scanner(System.in)) {
			a=sc.nextFloat();
			b=sc.nextFloat();
		}
		div=a/b;
		
		System.out.println(div);
	}

}
