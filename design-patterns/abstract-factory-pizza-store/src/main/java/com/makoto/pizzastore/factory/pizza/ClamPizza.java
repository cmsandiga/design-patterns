package com.makoto.pizzastore.factory.pizza;

import com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory;
import com.makoto.pizzastore.pizza.Pizza;

public class ClamPizza extends Pizza
{
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
	{
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	@Override
	public void prepare()
	{
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		souce = pizzaIngredientFactory.createSouce();
		cheese = pizzaIngredientFactory.createCheese();
		clams = pizzaIngredientFactory.createClams();
	}

}
