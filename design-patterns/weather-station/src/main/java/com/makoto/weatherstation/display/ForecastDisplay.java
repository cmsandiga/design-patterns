/**
 * 
 */
package com.makoto.weatherstation.display;

import com.makoto.weatherstation.observer.Observer;
import com.makoto.weatherstation.subject.Subject;

/**
 * @author makoton
 *
 */
public class ForecastDisplay implements Observer, DisplayElement
{
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		System.out.println("Forecast: " );
	}

	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		display();
	}


}
