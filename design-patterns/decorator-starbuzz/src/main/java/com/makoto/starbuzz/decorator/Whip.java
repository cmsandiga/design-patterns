package com.makoto.starbuzz.decorator;

import com.makoto.starbuzz.beverage.Beverage;

public class Whip extends CondimentDecorator
{	
	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.10 + getSize().getPrice();
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Whip";
	}

}
