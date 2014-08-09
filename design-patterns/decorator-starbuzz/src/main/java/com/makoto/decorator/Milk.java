package com.makoto.decorator;

import com.makoto.beverage.Beverage;

public class Milk extends CondimentDecorator
{
	Beverage beverage;
	
	public Milk(Beverage beverage)
	{
		this.beverage = beverage;
	}
	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.10;
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Milk";
	}

}
