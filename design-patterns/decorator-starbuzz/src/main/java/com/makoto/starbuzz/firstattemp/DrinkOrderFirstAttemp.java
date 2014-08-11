package com.makoto.starbuzz.firstattemp;

public class DrinkOrderFirstAttemp
{
	public static void main(String[] args)
	{
		DarkRoast beverage =  new DarkRoast();
		beverage.setMilk(true);
		beverage.setSoy(true);
		
		System.out.println("Description:"+  beverage.description + "  $ " + beverage.cost());
	}
}
