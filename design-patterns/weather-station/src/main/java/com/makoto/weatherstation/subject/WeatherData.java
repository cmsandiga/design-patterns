package com.makoto.weatherstation.subject;

import java.util.ArrayList;

import com.makoto.weatherstation.observer.Observer;

/**
 * The concrete class for weather data
 * 
 * @author makoton
 * 
 */
public class WeatherData implements Subject
{

	private ArrayList<Observer> observers;

	private float temperature;
	private float pressure;
	private float humidity;

	public WeatherData()
	{
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer)
	{	
		observers.add(observer);
	}
		
	@Override
	public void removeObserver(Observer observer)
	{
		int i = observers.indexOf(observer);
		if(i>=0)
			observers.remove(i);
	}


	@Override
	public void notifyObservers()
	{
		//Notify all observer that states was change !!
		for (Observer observer : observers)
		{
			observer.update(temperature, humidity, pressure);
		}
	}
	/**
	 * Don't care about how this is fill
	 */
	public void measuramentsChanges(){
		notifyObservers();
	}

	public void setMeasuraments(float temperature,float humidity,float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measuramentsChanges();
	}
}
