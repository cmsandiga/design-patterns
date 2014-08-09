package com.makoto.weatherstation;

import com.makoto.weatherstation.display.CurrentConditionDisplay;
import com.makoto.weatherstation.display.ForecastDisplay;
import com.makoto.weatherstation.display.HeatIndexDisplay;
import com.makoto.weatherstation.display.StatisticsDisplay;
import com.makoto.weatherstation.subject.WeatherData;


/**
 * The main execution class
 * 
 * @author makoton
 * 
 */
public class WeatherStation
{
	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasuraments(80, 50, 30.4f);
		weatherData.setMeasuraments(82, 70, 29.2f);		
		weatherData.setMeasuraments(78, 90, 29.2f);
		
		
	}
}
