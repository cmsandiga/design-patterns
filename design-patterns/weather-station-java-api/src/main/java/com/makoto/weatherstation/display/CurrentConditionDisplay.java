package com.makoto.weatherstation.display;

import java.util.Observable;
import java.util.Observer;

import com.makoto.weatherstation.subject.WeatherData;

/**
 * Show the current condition of the weather using the java API
 * 
 * @see {@link Observer}
 * @author makoton
 * 
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

	private float temperature;
	private float humidity;
	private Observable observable;

	public CurrentConditionDisplay(Observable weatherData) {
		this.observable = weatherData;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature
				+ " F degree and " + humidity + " % humidity");
	}

}
