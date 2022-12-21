package com.Assignment11;

import java.util.ArrayList;
import java.util.List;

public class Batter {
	private String name;
	private List<Score> scores;
	public Batter() {
		name="Virat Kohli";
		scores=new ArrayList<Score>();
		//Adding States into the lsit:allStates
		Score s1=new Score();
		Score s2=new Score(30,true);
		Score s3=new Score(45,true);
		Score s4=new Score(50,true);
		Score s5=new Score(60,true);
		scores.add(s1);
		scores.add(s2);
		scores.add(s3);
		scores.add(s4);
		scores.add(s5);
	}
	public Batter(String name, List<Score> scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	public String getName() {
		return name;
	}
	public List<Score> getScores() {
		return scores;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	
	public float getBattingAverage() {
		//Score bt=new Score();
		int totalRuns=0;
		float avg=0;
		int count=0;
		for(Score s:scores) {
			int a=s.getRuns();
			totalRuns=totalRuns+a;
			if(s.isNotOut()==false) {
				count++;
			}		
		}
		int k=5;
		int NoOut=k-count;
		
		if(count!=0) {
			
		avg=(float)totalRuns/(float)count;
		}
		else {
			String ab="Infinity";
			avg=new Float(ab);
		}
		System.out.println("Total Runs:" + totalRuns);
		System.out.println("NotOut:"+NoOut+", "+"Out:"+count);
		return avg;
		
	}

}
