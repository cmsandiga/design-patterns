/**
 * 
 */
package com.makoto.gumball.state;

/**
 * @author makoton
 *
 */
public class HasQuarterState implements State
{

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine)
	{
		this.gumballMachine =  gumballMachine;
	}

	@Override
	public void insertQuarter()
	{

	}

	@Override
	public void ejectQuarter()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense()
	{
		// TODO Auto-generated method stub

	}

}
