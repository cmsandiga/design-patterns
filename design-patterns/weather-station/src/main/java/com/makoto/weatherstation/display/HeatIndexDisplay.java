package com.makoto.weatherstation.display;

import com.makoto.weatherstation.observer.Observer;
import com.makoto.weatherstation.subject.Subject;

public class HeatIndexDisplay implements DisplayElement, Observer
{
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		display();
	}

	@Override
	public void display()
	{
		System.out.println("Heat index");
	}

}
