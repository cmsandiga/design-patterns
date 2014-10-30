package com.makoto.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

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

		GumballMachine gumballMachine;
		try
		{
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind(args[0]+ "/gumballmachine", gumballMachine);
		
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
