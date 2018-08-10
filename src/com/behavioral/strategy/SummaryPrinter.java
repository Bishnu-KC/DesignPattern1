package com.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements OrderPrinter {
	public void print(Collection<Order> orders)
	{
		System.out.println("**********Summery Report*********");
		Iterator<Order> iterator=orders.iterator();
		double total=0;
		for(int i=1;iterator.hasNext();i++)
		{
			Order order=iterator.next();
			System.out.println(i+"."+order.getId()+"\t"+order.getDate()+"\t"+order.getItems().size()+"\t"+order.getTotal());
			total +=order.getTotal();
		}
		System.out.println("**************");
		System.out.println("\t\t\t Total:"+total);
	}

}
