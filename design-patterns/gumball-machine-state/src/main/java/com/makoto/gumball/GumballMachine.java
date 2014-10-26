package com.makoto.gumball;

/**
 * The Gumball Machine start with SOLD_OUT state
 * 
 * @author makoton
 *
 */
public class GumballMachine
{
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count)
	{
		this.count = count;

		if (count > 0)
		{
			state = NO_QUARTER;
		}
	}

	public void insertQuarter()
	{
		if (state == HAS_QUARTER)
		{
			System.out.println("You cant insert another Quarter");
		}
		else if (state == NO_QUARTER)
		{
			state = HAS_QUARTER;
			System.out.println("You inserted a Quarter");
		}
		else if (state == SOLD_OUT)
		{
			System.out.println("You can't insert a quarter, the machine is sold out");
		}
		else if (state == SOLD)
		{
			System.out.println("Please wait, we re already giving you a gumball");
		}
	}

	public void ejectQuarter()
	{
		if (state == HAS_QUARTER)
		{
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		}
		else if (state == NO_QUARTER)
		{
			System.out.println("You Havent't  inserted a Quarter");
		}
		else if (state == SOLD)
		{
			System.out.println("Please wait, we re already giving you a gumball");
		}
		else if (state == SOLD_OUT)
		{
			System.out.println("You can't insert a quarter, the machine is sold out");
		}
	}

	public void turnCrank()
	{
		if (state == SOLD)
		{
			System.out.println("Turning twice doesnt get you another gumball!");
		}
		else if (state == NO_QUARTER)
		{
			System.out.println("You turned but therres no quarter");
		}
		else if (state == SOLD_OUT)
		{
			System.out.println("You turned, but there are no gumballs");
		}
		else if (state == HAS_QUARTER)
		{
			System.out.println("You turned ... ");
			state = SOLD;
			dispense();
		}
	}

	public void dispense()
	{
		if (state == SOLD)
		{
			System.out.println("A gumball comes rolling out the slot");

			count--;

			if (count == 0)
			{
				System.out.println("Oops, out of gumball");
				state = SOLD_OUT;
			}
			else
			{
				state = NO_QUARTER;
			}
		}
		else if (state == NO_QUARTER)
		{
			System.out.println("You nee to pay first");
		}
		else if (state == SOLD_OUT)
		{
			System.out.println("No gumball dispensed");
		}
		else if (state == HAS_QUARTER)
		{
			System.out.println("No gumball dispensd");
		}
	}
	
	@Override
	public String toString()
	{
		return "State = " + state + " gumball= " + count;
	}
}
