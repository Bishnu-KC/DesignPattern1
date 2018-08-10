package com.decorator.fooddemo;

public class ChinesseFood extends FoodDecorator{
	public ChinesseFood(Food newFood)
	{
		super(newFood);
	}
	public String prepareFood()
	{
		return super.prepareFood()+"with Fried Rice and Manchurian";
	}
	public double foodPrice()
	{
		return super.foodPrice()+45;
	}

}
