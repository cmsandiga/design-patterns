package com.makoto.gumball;

import com.makoto.gumball.state.HasQuarterState;
import com.makoto.gumball.state.NoQuarterState;
import com.makoto.gumball.state.SoldOutState;
import com.makoto.gumball.state.SoldState;
import com.makoto.gumball.state.State;
import com.makoto.gumball.state.WinnerState;

/**
 * The Gumball Machine start with SOLD_OUT state
 * 
 * @author makoton
 *
 */
public class GumballMachine
{
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs)
	{
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;

		if (numberGumballs > 0)
		{
			state = noQuarterState;
		}
		else
		{
			state = soldOutState;
		}
	}

	public void insertQuarter()
	{
		state.insertQuarter();
	}

	public void ejectQuarter()
	{
		state.ejectQuarter();
	}

	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall()
	{
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) count--;
	}

	public State getSoldOutState()
	{
		return soldOutState;
	}

	public State getNoQuarterState()
	{
		return noQuarterState;
	}

	public State getHasQuarterState()
	{
		return hasQuarterState;
	}

	public State getSoldState()
	{
		return soldState;
	}

	public State getWinnerState()
	{
		return winnerState;
	}

	public int getCount()
	{
		return count;
	}

	public void setState(State state)
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return "Mighty gumball, Inc.\n" + 
				"Java-enabled Standing gumball Model #2004\n"+
				"Inventory: " + count +" gumballs\n"+
				"Machine is " + state + "\n";
	}

}
