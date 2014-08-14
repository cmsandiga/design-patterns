package com.makoto.pizza.chicago;

import com.makoto.pizza.Pizza;

/**
 * The chicago style pizza
 * 
 * @author makoton
 * 
 */
public class ChicagoStyleCheesePizza extends Pizza
{
	
	public ChicagoStyleCheesePizza()
	{
		name = "Chicago style Deep Dish Cheese Pizza";
		dough = "Extra thick dough pizza";
		souce = "Plum tomato Souce";
		
		toppings.add("Shredded Mozarella Cheese");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
