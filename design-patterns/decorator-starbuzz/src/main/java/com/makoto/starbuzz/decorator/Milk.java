package com.makoto.starbuzz.decorator;

import com.makoto.starbuzz.beverage.Beverage;

public class Milk extends CondimentDecorator
{	
	public Milk(Beverage beverage)
	{
		this.beverage = beverage;
	}
	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.15 + getSize().getPrice();
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Milk";
	}

}
