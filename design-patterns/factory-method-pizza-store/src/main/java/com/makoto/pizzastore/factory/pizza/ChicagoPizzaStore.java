package com.makoto.pizzastore.factory.pizza;

import com.makoto.pizzastore.pizza.Pizza;
import com.makoto.pizzastore.pizza.chicago.ChicagoStyleCheesePizza;
import com.makoto.pizzastore.pizza.chicago.ChicagoStyleClamPizza;
import com.makoto.pizzastore.pizza.chicago.ChicagoStylePepperoniPizza;
import com.makoto.pizzastore.pizza.chicago.ChicagoStyleVeggiePizza;

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
		if (type.equals("cheese")) return new ChicagoStyleCheesePizza();
		else if (type.equals("veggie")) return new ChicagoStyleVeggiePizza();
		else if (type.equals("clam")) return new ChicagoStyleClamPizza();
		else if (type.equals("pepperoni")) return new ChicagoStylePepperoniPizza();
		return null;
	}

}
