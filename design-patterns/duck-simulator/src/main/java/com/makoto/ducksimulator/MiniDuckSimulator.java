package com.makoto.ducksimulator;

import com.makoto.ducksimulator.behavior.fly.FlyRocketPowered;
import com.makoto.ducksimulator.duck.DecoyDuck;
import com.makoto.ducksimulator.duck.Duck;
import com.makoto.ducksimulator.duck.MallarDuck;
import com.makoto.ducksimulator.duck.ModelDuck;

/**
 * Client for execution
 * 
 * @author makoto
 * 
 */
public class MiniDuckSimulator
{

	/**
	 * THe main method
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Duck mallardDuck = new MallarDuck();
		mallardDuck.display();		
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("##############");
		
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.performFly();
		decoyDuck.performQuack();
		
		System.out.println("##############");
		//Changing the behavior at runtime
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
