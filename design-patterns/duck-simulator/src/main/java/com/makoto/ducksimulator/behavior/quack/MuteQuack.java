package com.makoto.ducksimulator.behavior.quack;

/**
 * The mute Quack
 * 
 * @author makoto
 * 
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
