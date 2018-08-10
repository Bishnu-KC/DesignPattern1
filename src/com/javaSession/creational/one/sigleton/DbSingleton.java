package com.javaSession.creational.one.sigleton;

public class DbSingleton {
	
	// Singleton class will not  have public constructor
	// Singleton class also requires to have static instance of class it self
	
	private static volatile DbSingleton instance =null;
	private DbSingleton()
	{
		
	}
	
	// this method will use to use the instance of the class
	public static DbSingleton getInstance()
	{
		if (instance ==null)
		{
			instance =new DbSingleton();
		}
		return instance;
	}

}
