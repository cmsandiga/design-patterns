package com.makoto.decorator;

import com.makoto.beverage.Beverage;

/**
 * @author makoton
 * 
 */
public class Soy extends CondimentDecorator
{

	Beverage beverage;
	
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
		return this.beverage.cost() + 0.15;
	}
	
}
