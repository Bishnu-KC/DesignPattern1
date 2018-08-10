package com.decorator.fooddemo;

public class NonVegFood extends FoodDecorator{
	public NonVegFood(Food newFood)
	{
		super(newFood);
	}
	public String prepareFood()
	{
		return super.prepareFood()+"With Roaste Chicken and Chicken Curry";
	}
	public double foodPrice()
	{
		return super.foodPrice()+120;
	}

}
