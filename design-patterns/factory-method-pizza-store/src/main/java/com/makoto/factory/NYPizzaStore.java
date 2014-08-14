package com.makoto.factory;

import com.makoto.pizza.Pizza;
import com.makoto.pizza.newyork.NYStyleCheesePizza;
import com.makoto.pizza.newyork.NYStyleClamPizza;
import com.makoto.pizza.newyork.NYStylePepperoniPizza;
import com.makoto.pizza.newyork.NYStyleVeggiePizza;

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
		if (type.equals("cheese")) return new NYStyleCheesePizza();
		else if (type.equals("veggie")) return new NYStyleVeggiePizza();
		else if (type.equals("clam")) return new NYStyleClamPizza();
		else if (type.equals("pepperoni")) return new NYStylePepperoniPizza();
		return null;
	}

}
