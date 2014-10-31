package com.makoto.compound.adapter;

import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.duck.Goose;
import com.makoto.compound.observer.Observable;
import com.makoto.compound.observer.Observer;

public class GooseAdapter implements Quackable
{
	Goose goose;
	Observable duck;
	
	public GooseAdapter(Goose goose)
	{
		this.goose = goose;
		this.duck =  new Observable(this);
	}
	@Override
	public void quack()
	{
		goose.honk();
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer observer)
	{
		duck.registerObserver(observer);
	}
	@Override
	public void notifyObservers()
	{
		duck.notifyObservers();
		
	}


}
