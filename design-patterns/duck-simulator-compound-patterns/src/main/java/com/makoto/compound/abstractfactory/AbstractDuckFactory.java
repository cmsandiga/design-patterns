package com.makoto.compound.abstractfactory;

import com.makoto.compound.behaivor.Quackable;

public abstract class AbstractDuckFactory
{
	public abstract Quackable createMallarDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
