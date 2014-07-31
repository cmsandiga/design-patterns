package com.makoto.ducksimulator.behavior.fly;

/**
 * The not fly behavior <br>
 * This is for duck that not fly (like rubber ducks)
 * 
 * @author makoto
 * 
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm sorry i can't fly quack quack !!");
	}

}
