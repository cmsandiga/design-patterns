package com.makoto.pizzastore.pizza.california;

import com.makoto.pizzastore.pizza.Pizza;

/**
 * The California style pizza
 * 
 * @author makoton
 * 
 */
public class CaliforniaStyleCheesePizza extends Pizza
{
	
	public CaliforniaStyleCheesePizza()
	{
		name = "California style Deep Dish Cheese Pizza";
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
