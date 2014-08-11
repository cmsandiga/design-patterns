package com.makoto.starbuzz.beverage;

public class HouseBlend  extends Beverage
{
	public HouseBlend()
	{
		description  = "House Blend Coffe ";
	}
	@Override
	public double cost()
	{
		return 0.89;
	}

}
