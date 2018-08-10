package com.behavioral.strategy;

import java.util.LinkedList;

public class Client {
	private static LinkedList<Order> orders=new LinkedList<>();

	public static void main(String[] args) {
		createOrders();
		//print all orders or only print summery
		PrintService service=new PrintService(new SummaryPrinter());
		service.printOrders(orders);
		

	}
	private static void createOrders()
	{
		Order o=new Order("100");
		o.addItem("Soda", 2);
		o.addItem("Chip", 12);
		orders.add(o);
		
		 o=new Order("200");
			o.addItem("Cake", 20);
			o.addItem("Cookies", 22);
			orders.add(o);
			
			 o=new Order("300");
				o.addItem("Burger", 21);
				o.addItem("Fries", 8);
				orders.add(o);
	}

}
