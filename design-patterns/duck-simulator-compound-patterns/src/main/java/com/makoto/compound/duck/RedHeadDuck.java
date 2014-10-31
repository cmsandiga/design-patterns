package com.makoto.compound.duck;

import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.observer.Observable;
import com.makoto.compound.observer.Observer;

public class RedHeadDuck implements Quackable
{
	Observable observable;
	
	public RedHeadDuck()
	{
		this.observable =  new Observable(this);
	}
	@Override
	public void quack()
	{
		System.out.println("Quack");
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
