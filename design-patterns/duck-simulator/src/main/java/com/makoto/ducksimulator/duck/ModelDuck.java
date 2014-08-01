package com.makoto.ducksimulator.duck;

import com.makoto.ducksimulator.behavior.fly.FlyNoWay;
import com.makoto.ducksimulator.behavior.quack.Quack;

/**
 * The model duck Will use strategy pattern for change at runtime the behavior
 * 
 * @author makoton
 * 
 */
public class ModelDuck extends Duck
{

	public ModelDuck()
	{
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I'm a Model Duck");
	}

}
