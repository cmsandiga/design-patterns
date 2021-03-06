/**
 * 
 */
package com.makoto.gumball.state;

import java.util.Random;

import com.makoto.gumball.GumballMachine;

/**
 * New version of hasQuarter refactored
 * 
 * @author makoton
 *
 */
public class HasQuarterState implements State
{
	private static final long serialVersionUID = -5510690594418990237L;
	
	transient GumballMachine gumballMachine;
	
	Random random = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned .....");
		
		int winner = random.nextInt(10);

		if ((winner == 0) && gumballMachine.getCount() > 1)
		{
			gumballMachine.setState(gumballMachine.getWinnerState());
		}
		else
		{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense()
	{
		System.out.println("No gumball dispense");
	}

}
