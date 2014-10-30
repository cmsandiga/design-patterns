package com.makoto.gumball;

import java.rmi.RemoteException;

/**
 * Monitor all gumball machine
 * 
 * @author makoton
 *
 */
public class GumballMonitor
{
	GumballMachineRemote gumballMachine;

	public GumballMonitor(GumballMachineRemote gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void report()
	{
		try
		{
			System.out.println("Gumball machine: " + gumballMachine.getLocation());
			System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
			System.out.println("Current state: " + gumballMachine.getState());
		}
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}
}
