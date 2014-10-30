package com.makoto.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.makoto.gumball.state.State;

/**
 * Implementing remote Interface
 * 
 * @author makoton
 *
 */
public interface GumballMachineRemote extends Remote
{
	public int getCount() throws  RemoteException;
	
	public String getLocation() throws RemoteException;
	
	public State getState() throws RemoteException;
}
