package com.makoto.weatherstation.subject;

import java.util.Observable;

/**
 * The concrete class for weather data
 * 
 * @author makoton
 * 
 */
public class WeatherData extends Observable {

	private float temperature;
	private float pressure;
	private float humidity;

	public WeatherData() {
		;
	}

	/**
	 * Don't care about how this is fill
	 */
	public void measuramentsChanges() {
		setChanged();
		notifyObservers();
	}

	public void setMeasuraments(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measuramentsChanges();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

}
