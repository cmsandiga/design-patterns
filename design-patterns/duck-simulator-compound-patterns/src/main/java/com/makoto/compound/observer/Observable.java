package com.makoto.compound.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable
{
	
	ArrayList<Observer> observers =  new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck)
	{
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}

	@Override
	public void notifyObservers()
	{
		Iterator<Observer> it =  observers.iterator();
		
		while(it.hasNext())
		{
			Observer observer = it.next();
			observer.update(duck);
		}
	}
	
}
