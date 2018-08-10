package com.javaSession.creational.one.sigleton;

public class DbSingletonDemo {
	public static void main (String args[])
	{
		
		// calling DbSingleton class and instead of creating new instance will use
		// getInstance method
		
		DbSingleton instance =DbSingleton.getInstance();
		System.out.println(instance);
		
		// lets try with one more instance and check if we are getting same instance or not
		
		DbSingleton anotherinstance =DbSingleton.getInstance();
		System.out.println(anotherinstance);
		
		// make it lazy loaded
		// make the private static DbSingleton instance =null
	}

}
