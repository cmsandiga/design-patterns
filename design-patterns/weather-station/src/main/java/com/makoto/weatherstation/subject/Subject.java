package com.makoto.weatherstation.subject;

import com.makoto.weatherstation.observer.Observer;

/**
 * The subject interface
 * 
 * @author makoton
 * 
 */
public interface Subject
{
	/**
	 * Notify all observer when the state is was changed
	 */
	void notifyObservers();

	/**
	 * Remove a observer from subscription
	 * 
	 * @param observer
	 *            {@link Observer}
	 */
	void removeObserver(Observer observer);

	/**
	 * Register a new observer
	 * 
	 * @param observer
	 *            {@link Observer}
	 */
	void registerObserver(Observer observer);
}
