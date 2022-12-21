package com.Assignment11;

public class Score 
{
	private int runs;
	private boolean notOut;
	
	public Score() {
		runs=50;
		notOut=true;
		
	}

	public Score(int runs, boolean notOut) {
		super();
		this.runs = runs;
		this.notOut = notOut;
	}

	public int getRuns() {
		return runs;
	}

	public boolean isNotOut() {
		return notOut;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void setNotOut(boolean notOut) {
		this.notOut = notOut;
	}
}
