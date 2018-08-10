package com.factory.DemoOne;

public class BikeFactory extends VehicleFactory {
	public Vehicle createVehicle()
	{
			return new Bike();
		}
	

}
