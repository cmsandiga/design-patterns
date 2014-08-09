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
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		tempSum += temperature;
		numReadings++;

		if (temperature > maxTemp) {
			maxTemp = temperature;
		}
 
		if (temperature < minTemp) {
			minTemp = temperature;
		}
		
		display();
	}

	@Override
	public void display()
	{
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

}
