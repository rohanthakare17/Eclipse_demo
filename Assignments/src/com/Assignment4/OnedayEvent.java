package com.Assignment4;

public class OnedayEvent extends Event
{
	private int hours;
	private int ratePerHour; 
	private int extraHours;
	
	public OnedayEvent(int eventId, String eventName, float baseFare, int hours, int ratePerHour, int extraHours) {
		super(eventId, eventName, baseFare);
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		this.extraHours = extraHours;
	}
	public OnedayEvent(int eventId, String eventName, float baseFare) {
		super(eventId, eventName, baseFare);
		
	}
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	
	public float getTotalFare() 
	{
		float hourRate=hours*ratePerHour;
		float extra=extraHours*500;
		float total=hourRate+extra+(getBaseFare());
		return total;
		
	}

}
