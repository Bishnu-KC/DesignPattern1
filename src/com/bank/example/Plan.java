package com.bank.example;

public abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int unit)
	{
		this.rate=unit;
		System.out.println(unit*rate);
	}

}
