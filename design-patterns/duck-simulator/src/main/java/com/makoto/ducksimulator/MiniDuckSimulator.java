package com.makoto.ducksimulator;

import com.makoto.ducksimulator.duck.Duck;
import com.makoto.ducksimulator.duck.MallarDuck;

/**
 * Client for execution
 * 
 * @author makoto
 * 
 */
public class MiniDuckSimulator {

	/**
	 * THe main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
	}
}
