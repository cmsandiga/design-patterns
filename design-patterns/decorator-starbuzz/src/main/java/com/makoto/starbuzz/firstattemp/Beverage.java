package com.makoto.starbuzz.firstattemp;

public class Beverage
{
	String description;
	boolean milk;
	boolean mocha;
	boolean soy;
	boolean whip;

	protected double cost()
	{
		double cost = 0.0;

		if (milk) cost += 0.10;
		if (mocha) cost += 0.20;
		if (soy) cost += 0.30;
		if (whip) cost += 0.40;
		
		return cost;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean isMilk()
	{
		return milk;
	}

	public void setMilk(boolean milk)
	{
		this.milk = milk;
	}

	public boolean isMocha()
	{
		return mocha;
	}

	public void setMocha(boolean mocha)
	{
		this.mocha = mocha;
	}

	public boolean isSoy()
	{
		return soy;
	}

	public void setSoy(boolean soy)
	{
		this.soy = soy;
	}

	public boolean isWhip()
	{
		return whip;
	}

	public void setWhip(boolean whip)
	{
		this.whip = whip;
	}
	
	
}
