package com.decorator.fooddemo;

public class VegFood implements Food{
	public String prepareFood()
	{
		return "Veg Food";
	}
	public double foodPrice()
	{
		return 30;
	}

}
