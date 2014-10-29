package com.makoto.gumball;


/**
 * Test drive of our gumball machine
 * 
 * @author makoton
 *
 */
public class GunballMachineTestDrive
{
	public static void main(String[] args)
	{
		if (args != null)
		{
			args = new String[2];
			args[0] = "Seattle";
			args[1] = "112";
		}

		int count = Integer.parseInt(args[1]);

		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		
		monitor.report();
	}
}
