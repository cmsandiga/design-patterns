package com.makoto.factory;

import com.makoto.pizza.Pizza;

/**
 * 
 * @author makoton
 * 
 */
public abstract class PizzaStore
{
	/**
	 * Order a pizza depending of the type
	 * 
	 * @param type
	 */
	public Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	/**
	 * Factory method each class have to define
	 * 
	 * @param type
	 * @return {@link Pizza}
	 */
	protected abstract Pizza createPizza(String type);
}
