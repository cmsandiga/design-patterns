package com.makoto.compound.abstractfactory;

import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.duck.DuckCall;
import com.makoto.compound.duck.MallarDuck;
import com.makoto.compound.duck.RedHeadDuck;
import com.makoto.compound.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory
{

	@Override
	public Quackable createMallarDuck()
	{
		return new MallarDuck();
	}

	@Override
	public Quackable createRedheadDuck()
	{
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall()
	{
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck()
	{
		return new RubberDuck();
	}

}
