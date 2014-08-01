package com.makoto.ducksimulator.duck;

import com.makoto.ducksimulator.behavior.fly.FlyBehavior;
import com.makoto.ducksimulator.behavior.quack.QuackBehavior;

/**
 * The abstract class duck <br>
 * Using Strategy pattern
 * 
 * @author makoto
 * 
 */
public abstract class Duck
{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck()
	{
	}

	/**
	 * Each duck has his own display method
	 */
	public abstract void display();

	/**
	 * Delegating the fly behavior to interface
	 */
	public void performFly()
	{
		flyBehavior.fly();
	}

	/**
	 * Delegating the quack behavior to interface
	 */
	public void performQuack()
	{
		quackBehavior.quack();
	}

	/**
	 * duck swim
	 */
	public void swim()
	{
		System.out.println("All duck  float , even decoys!");
	}

	/**
	 * Setting the fly behavior at runtime
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}

	/**
	 * Setting the quack Behavior at runtime
	 */
	public void setQuackBeavior(QuackBehavior quackBehavior)
	{
		this.quackBehavior = quackBehavior;
	}
}
