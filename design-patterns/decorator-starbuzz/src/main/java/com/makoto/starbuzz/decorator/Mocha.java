package com.makoto.starbuzz.decorator;

import com.makoto.starbuzz.beverage.Beverage;

public class Mocha extends CondimentDecorator
{
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.20 + getSize().getPrice();
	}

	@Override
	public String getDescription()
	{
		return this.beverage.getDescription() + ", Mocha";
	}

}
