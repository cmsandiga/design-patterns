package com.makoto.pizzastore.factory.pizza;

import com.makoto.pizzastore.factory.ingredients.NYPizzaIngredientFactory;
import com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory;
import com.makoto.pizzastore.pizza.Pizza;

/**
 * The new york pizza store
 * 
 * @author makoton
 * 
 */
public class NYPizzaStore extends PizzaStore
{

	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese"))
		{
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Chesse pizza");
		}
		else if (type.equals("veggie"))
		{

		}
		else if (type.equals("clam"))
		{
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Clam pizza");
		}
		else if (type.equals("pepperoni"))
		{
		}
		return pizza;
	}

}
