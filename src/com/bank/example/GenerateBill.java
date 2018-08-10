package com.bank.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class GenerateBill {

	public static void main(String[] args) throws IOException, NullPointerException {
		GetPlanFactory planFactory= new GetPlanFactory();
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String planName=br.readLine();
		System.out.println("Enter the number of units for bill will be calculated");
		
		int unit=Integer.parseInt(br.readLine());
		Plan p=planFactory.getPlan(planName);
		System.out.println("Bill amount for: "+planName+" of "+unit+" unit is: ");
		p.getRate();
		p.calculateBill(unit);

	}

}
