package com.makoto.gumball.state;

/**
 * State interface
 * 
 * @author makoton
 *
 */
public interface State
{
	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
