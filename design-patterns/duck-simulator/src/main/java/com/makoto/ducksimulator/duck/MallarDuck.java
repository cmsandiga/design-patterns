package com.makoto.ducksimulator.duck;

import com.makoto.ducksimulator.behavior.fly.FlyWithWings;
import com.makoto.ducksimulator.behavior.quack.Quack;

/**
 * The mallar duck class
 * 
 * @author makoto
 * 
 */
public class MallarDuck extends Duck {

	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a mallar duck");
	}

}
