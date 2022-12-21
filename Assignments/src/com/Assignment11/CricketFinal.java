package com.Assignment11;

import java.util.ArrayList;
import java.util.List;

public class CricketFinal {

	public static void main(String[] args) {
		Batter b1=new Batter();
		System.out.println("Player1 Name:"+b1.getName());
		//List<Score> player1=b1.getScores();
//		int sum=0;
//		for(Score list1:player1) {
//			sum=sum+list1.getRuns();
//			
//		}
//		System.out.println("Total Run of player1:"+sum);
		System.out.println("Total Average of 5 inning of "+b1.getName()+" is:"+b1.getBattingAverage());
		System.out.println(" ");
		
		System.out.println("******************************************************");
		System.out.println(" ");
		
		Score sc1=new Score(50,false);
		Score sc2=new Score(45,true);
		Score sc3=new Score(100,true);
		Score sc4=new Score(57,true);
		Score sc5=new Score(27,false);
		List<Score> player2=new ArrayList<Score>();
		player2.add(sc1);
		player2.add(sc2);
		player2.add(sc3);
		player2.add(sc4);
		player2.add(sc5);
		Batter b2=new Batter("SuryaKumar Yadav",player2);
		System.out.println("Player2 Name:"+b2.getName());
//		int sum2=0;
//		for(Score list2:player2) {
//			sum2=sum2+list2.getRuns();	
//		}
//		System.out.println("Total Run of player2:"+sum2);
		System.out.println("Total Average of 5 inning of "+b2.getName()+" is:"+b2.getBattingAverage());
		

	}

}
