package com.structural.decorator;

public class MusicSystem extends AccessoriesDecorator{
	MusicSystem(Car car)
	{
		this.car=car;
	}

	@Override
	public String getDetails() {
		
		return car.getDetails()+",MusicSystem= "+getMusicSystemDetails();
	}

	@Override
	public double calculateCost() {
		
		return car.calculateCost()+20000;
	}
	public String getMusicSystemDetails()
	{
		return "Surround Sound system";
	}
	

}
