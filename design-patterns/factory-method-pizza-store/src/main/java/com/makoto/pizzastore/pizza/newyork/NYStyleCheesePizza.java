package com.makoto.pizzastore.pizza.newyork;

import com.makoto.pizzastore.pizza.Pizza;

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
