package com.makoto.weatherstation.subject;

/**
 * The subject interface
 * 
 * @author makoton
 * 
 */
public interface Subject
{
	void notifyObserver();
	
	void removeObserver();
	
	void registerObserver();
}
