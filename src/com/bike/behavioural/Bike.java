package com.bike.behavioural;

public class Bike {
	private RidingStyle ridingStyle;
	public Bike()
	{
		ridingStyle=new CarefulRiding();
	}
	public RidingStyle getRidingStyle()
	{
		return ridingStyle;
	}
	public void setRidingStyle(RidingStyle ridingStyle)
	{
		this.ridingStyle=ridingStyle;
	}
	public void rideBike()
	{
		ridingStyle.ride();
	}

}
