package com.makoto.gumball.state;

import java.io.Serializable;

/**
 * State interface
 * 
 * @author makoton
 *
 */
public interface State extends Serializable
{
	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
