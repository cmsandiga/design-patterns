package com.makoto.ducksimulator.duck;

import com.makoto.ducksimulator.behavior.fly.FlyNoWay;
import com.makoto.ducksimulator.behavior.quack.MuteQuack;

/**
 * Decoy duck do nothing
 * @author makoton
 *
 */
public class DecoyDuck extends Duck
{

	public DecoyDuck()
	{
		this.flyBehavior =  new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	@Override
	public void display()
	{
		System.out.println("I'm decoy duck");
	}

}
