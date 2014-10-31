package com.makoto.compound.duck;

import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.observer.Observable;
import com.makoto.compound.observer.Observer;

public class RubberDuck  implements Quackable
{
	Observable observable;
	
	public RubberDuck()
	{
		this.observable =  new Observable(this);
	}
	
	@Override
	public void quack()
	{
		System.out.println("Squack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer)
	{
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers()
	{
		observable.notifyObservers();
		
	}
	
}
