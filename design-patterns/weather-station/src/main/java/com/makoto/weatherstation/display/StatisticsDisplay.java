package com.makoto.weatherstation.display;

import com.makoto.weatherstation.observer.Observer;
import com.makoto.weatherstation.subject.Subject;

/**
 * Display the current statistics
 * 
 * @author makoton
 * 
 */
public class StatisticsDisplay implements DisplayElement, Observer
{
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData)
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
		System.out.println("Avg/Max/Min:");
	}

}
