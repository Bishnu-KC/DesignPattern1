package com.structural.decorator;

public class BumperSticker  extends AccessoriesDecorator{
	private String color;
	public BumperSticker(Car car, String color)
	{
		this.car=car;
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return car.getDetails()+",bumper stickers with color= "+color;
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return car.calculateCost()+250;
	}

}
