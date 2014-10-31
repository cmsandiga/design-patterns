package com.makoto.compound.behaivor;

import com.makoto.compound.observer.QuackObservable;


/**
 * Quackable interface
 * 
 * @author makoton
 *
 */
public interface Quackable extends QuackObservable
{
	abstract void quack();
}
