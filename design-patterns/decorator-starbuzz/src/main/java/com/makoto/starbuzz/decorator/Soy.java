package com.makoto.starbuzz.decorator;

import com.makoto.starbuzz.beverage.Beverage;

/**
 * @author makoton
 * 
 */
public class Soy extends CondimentDecorator
{	
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost()
	{
		return this.beverage.cost() + 0.15 + getSize().getPrice();
	}
	
}
