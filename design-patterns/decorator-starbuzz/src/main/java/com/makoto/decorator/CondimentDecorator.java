package com.makoto.decorator;

import com.makoto.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage 
{
	public abstract String getDescription();
}
