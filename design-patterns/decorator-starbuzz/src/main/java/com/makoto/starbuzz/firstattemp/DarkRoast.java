package com.makoto.starbuzz.firstattemp;

public class DarkRoast extends Beverage
{
	String description;
	
	
	public DarkRoast()
	{
		description  = "Dark roast"; 
	}
	
	@Override
	protected double cost()
	{		
		return 0.99 + super.cost();
	}
}
