package com.makoto.gumball.state;

import com.makoto.gumball.GumballMachine;

/**
 * 
 * @author makoton
 *
 */
public class WinnerState implements State
{
	private static final long serialVersionUID = 682333872283145622L;

	
	transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter()
	{
		System.out.println("You can't insert a quarter");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("You can't eject a quarter");

	}

	@Override
	public void turnCrank()
	{
		System.out.println("You can't turn crank");
	}

	@Override
	public void dispense()
	{
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() == 0)
		{
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		else
		{
			gumballMachine.releaseBall();
			System.out.println("You are a winner!, you got two gumballs or your quarter");
			
			if(gumballMachine.getCount() >0)
			{
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}
			else
			{
				System.out.println("Oops, out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
			
		}
	}

}
