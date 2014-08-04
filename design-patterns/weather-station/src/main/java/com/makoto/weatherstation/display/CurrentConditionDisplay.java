package com.makoto.weatherstation.display;

import com.makoto.weatherstation.observer.Observer;
import com.makoto.weatherstation.subject.Subject;

/**
 * Show the current condition of the weather
 * 
 * @author makoton
 * 
 */
public class CurrentConditionDisplay implements DisplayElement, Observer
{

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		display();

	}

	@Override
	public void display()
	{
		System.out.println("Current conditions:" + temperature + " F degree and " + humidity + " % humidity");
	}

}
