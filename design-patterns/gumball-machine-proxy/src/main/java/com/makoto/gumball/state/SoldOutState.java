package com.makoto.gumball.state;

import com.makoto.gumball.GumballMachine;

public class SoldOutState implements State
{
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("You can't eject a quarter, the machine is sold out");

	}

	@Override
	public void turnCrank()
	{
		System.out.println("You can't turn a crank, the machine is sold out");
	}

	@Override
	public void dispense()
	{
		System.out.println("You can't disponse a quarter, the machine is sold out");
	}

}
