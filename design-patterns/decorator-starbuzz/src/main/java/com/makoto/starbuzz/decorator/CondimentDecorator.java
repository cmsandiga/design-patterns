package com.makoto.starbuzz.decorator;

import com.makoto.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage 
{
	public Beverage beverage;
	
	@Override
	public Size getSize()
	{
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
	public abstract String getDescription();
}
