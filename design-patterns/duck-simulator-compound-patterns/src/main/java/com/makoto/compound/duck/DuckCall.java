package com.makoto.compound.duck;

import com.makoto.compound.behaivor.Quackable;

public class DuckCall implements Quackable
{

	@Override
	public void quack()
	{
		System.out.println("Kwak");
	}

}
