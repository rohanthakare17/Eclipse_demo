package com.Assignment4;

public class Event_Main {

	public static void main(String[] args) 
	{
		Event e=new OvernightEvent(1001,"Garba",10000,4,5000,5,3000);
		System.out.println("Event ID: "+e.getEventId());
		System.out.println("Event Name: "+e.getEventName());
		System.out.println("Total Fare Of Over Night Event :"+e.getTotalFare());
		
		e=new OnedayEvent(1002,"Marriage",10000,4,2000,2);
		System.out.println("\nEvent ID: "+e.getEventId());
		System.out.println("Event Name: "+e.getEventName());
		System.out.println("Total Fare Of One Day Event: "+e.getTotalFare());

	}

}
