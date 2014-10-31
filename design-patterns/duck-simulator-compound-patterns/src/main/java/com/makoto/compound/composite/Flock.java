package com.makoto.compound.composite;

import java.util.ArrayList;
import java.util.Iterator;

import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.observer.Observable;
import com.makoto.compound.observer.Observer;

public class Flock implements Quackable
{
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker)
	{
		quackers.add(quacker);
	}
	
	public void quack()
	{
		Iterator<Quackable> it = quackers.iterator();
		
		while(it.hasNext())
		{
			Quackable quacker =  it.next();
			quacker.quack();
		}
		
	}

	@Override
	public void registerObserver(Observer observer)
	{
		Iterator<Quackable> it = quackers.iterator();
		
		while(it.hasNext())
		{	
			Quackable duck = it.next();
			duck.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers()
	{
	}
}
