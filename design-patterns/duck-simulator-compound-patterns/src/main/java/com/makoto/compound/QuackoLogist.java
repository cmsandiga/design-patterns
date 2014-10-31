package com.makoto.compound;

import com.makoto.compound.observer.Observer;
import com.makoto.compound.observer.QuackObservable;

public class QuackoLogist implements Observer
{

	@Override
	public void update(QuackObservable duck)
	{
		System.out.println("Quacklogist: " + duck + " just quacked");
		
		
	}

}
