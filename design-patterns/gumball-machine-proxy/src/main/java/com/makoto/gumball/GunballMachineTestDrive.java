package com.makoto.gumball;

/**
 * Test drive of our gumball machine
 * @author makoton
 *
 */
public class GunballMachineTestDrive
{
	public static void main(String[] args)
	{
		GumballMachine gumballMachine = new GumballMachine("CA Palo Alto",5);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}
}
