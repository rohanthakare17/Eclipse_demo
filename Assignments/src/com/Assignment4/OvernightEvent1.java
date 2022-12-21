package com.Assignment4;

public class OvernightEvent1 {

	private int days;		
	private int ratePerDay;		
	private int roomCount;		
	private int farePerRoom;
	
	
	public OvernightEvent1(int days, int ratePerDay, int roomCount, int farePerRoom) {
		super();
		this.days = days;
		this.ratePerDay = ratePerDay;
		this.roomCount = roomCount;
		this.farePerRoom = farePerRoom;
	}
	
	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public int getRatePerDay() {
		return ratePerDay;
	}


	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}


	public int getRoomCount() {
		return roomCount;
	}


	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}


	public int getFarePerRoom() {
		return farePerRoom;
	}


	public void setFarePerRoom(int farePerRoom) {
		this.farePerRoom = farePerRoom;
	}
	
	
	public float getTotalFare() {
		float rateDay=days*ratePerDay;
		float nightRate=(days-1)*farePerRoom;
		float totalRoom=nightRate*roomCount;
		float total=rateDay+totalRoom+(getTotalFare());
		return total;
		
	}
	
}
