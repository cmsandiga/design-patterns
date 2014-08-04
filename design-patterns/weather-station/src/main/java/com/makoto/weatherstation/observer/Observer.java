package com.makoto.weatherstation.observer;

import com.makoto.weatherstation.subject.Subject;

/**
 * The observer interface
 * 
 * @author makoton
 * 
 */
public interface Observer
{
	/**
	 * Thease are the states that when change, we have to notify using {@link Subject#notifyObserver()}
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	void update(float temperature, float humidity, float pressure);
}
