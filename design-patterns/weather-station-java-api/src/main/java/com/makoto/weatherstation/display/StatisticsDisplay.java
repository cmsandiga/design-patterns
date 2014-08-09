package com.makoto.weatherstation.display;

import java.util.Observable;
import java.util.Observer;

import com.makoto.weatherstation.subject.WeatherData;

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
	private float tempSum = 0.0f;
	private int numReadings;

	private Observable observable;

	public StatisticsDisplay(Observable observable)
	{
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg)
	{
		if (o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) o;
			computeStatics(weatherData.getTemperature());
			display();
		}
	}

	private void computeStatics(float temperature)
	{
		this.tempSum += temperature;
		this.numReadings++;

		if (temperature > maxTemp) this.maxTemp = temperature;
		if (temperature < minTemp) this.minTemp = temperature;

	}

	@Override
	public void display()
	{
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
