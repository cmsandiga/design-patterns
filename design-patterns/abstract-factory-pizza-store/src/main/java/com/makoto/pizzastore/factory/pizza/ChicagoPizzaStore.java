package com.makoto.pizzastore.factory.pizza;

import com.makoto.pizzastore.factory.ingredients.ChicagoPizzaIngredientFactory;
import com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory;
import com.makoto.pizzastore.pizza.Pizza;

/**
 * The Chicago pizza store
 * 
 * @author makoton
 * 
 */
public class ChicagoPizzaStore extends PizzaStore
{

	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;
		PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

		if (type.equals("cheese"))
		{
			pizza = new CheesePizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago Style Chesse pizza");
		}
		else if (type.equals("veggie"))
		{

		}
		else if (type.equals("clam"))
		{
			pizza = new ClamPizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago Style Clam pizza");
		}
		else if (type.equals("pepperoni"))
		{
		}
		return pizza;
	}

}
