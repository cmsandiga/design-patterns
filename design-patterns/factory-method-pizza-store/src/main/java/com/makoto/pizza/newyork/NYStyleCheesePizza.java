package com.makoto.pizza.newyork;

import com.makoto.pizza.Pizza;

/**
 * The new york style pizza
 * @author makoton
 *
 */
public class NYStyleCheesePizza extends Pizza
{
	public NYStyleCheesePizza()
	{
		name = "NY Style souce and cheese pizza";
		dough = "Thin crus dough";
		souce = "Marinara souce";
		
		toppings.add("Gratted Reggiano cheese");
	}
}
