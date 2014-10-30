package com.makoto.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Test RMI services.
 * 
 * @author makoton
 *
 */
public class GumballMonitorTestDrive
{
	public static void main(String[] args)
	{
		String[] locations = { "rmi://127.0.0.1/Seattle/gumballmachine" };

		GumballMonitor[] monitor = new GumballMonitor[locations.length];

		for (int i = 0; i < locations.length; i++)
		{
			try
			{
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
				monitor[i] = new GumballMonitor(machine);
			}
			catch (MalformedURLException e)
			{
				e.printStackTrace();
			}
			catch (RemoteException e)
			{
				e.printStackTrace();
			}
			catch (NotBoundException e)
			{
				e.printStackTrace();
			}
		}

		for (GumballMonitor gumballMonitor : monitor)
		{
			gumballMonitor.report();
		}

	}
}
