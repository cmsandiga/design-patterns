package com.makoto.decorator;

import com.makoto.beverage.Beverage;

public class Mocha extends CondimentDecorator
{
	Beverage beverage;

	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.20;
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Mocha";
	}

}
