package com.bike.behavioural;

public class Rider {
	public static void main(String args[])
	{
		Bike bike=new Bike();
		bike.rideBike();
		bike.setRidingStyle(new RashRiding());
		bike.rideBike();
	}

}
