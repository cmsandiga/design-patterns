package com.makoto.gumball.state;

import com.makoto.gumball.GumballMachine;

public class SoldState implements State
{
	private static final long serialVersionUID = -4357988703998002427L;
	
	transient GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Turning twice doesnt get you another gumball");
	}

	@Override
	public void dispense()
	{
		gumballMachine.releaseBall();

		if (gumballMachine.getCount() > 0)
		{
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else
		{
			System.out.println("Oopss, out of gumballs!! ");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
