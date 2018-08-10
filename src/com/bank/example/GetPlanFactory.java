package com.bank.example;

public class GetPlanFactory {
	public Plan getPlan(String planType)
	{
		if(planType==null)
		{
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
		{
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("CommercialPLAN"))
		{
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("Instutional"))
		{
			return new InstitutionalPlan();
		}
		return null;
		
	}

}
