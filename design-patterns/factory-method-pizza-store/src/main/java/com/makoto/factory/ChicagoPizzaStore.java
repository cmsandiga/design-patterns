package com.makoto.factory;

import com.makoto.pizza.Pizza;
import com.makoto.pizza.chicago.ChicagoStyleCheesePizza;
import com.makoto.pizza.chicago.ChicagoStyleClamPizza;
import com.makoto.pizza.chicago.ChicagoStylePepperoniPizza;
import com.makoto.pizza.chicago.ChicagoStyleVeggiePizza;
import com.makoto.pizza.newyork.NYStyleCheesePizza;
import com.makoto.pizza.newyork.NYStyleClamPizza;
import com.makoto.pizza.newyork.NYStylePepperoniPizza;
import com.makoto.pizza.newyork.NYStyleVeggiePizza;

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
