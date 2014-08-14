package com.makoto.factory;

import com.makoto.pizza.Pizza;
import com.makoto.pizza.california.CaliforniaStyleCheesePizza;
import com.makoto.pizza.california.CaliforniaStyleClamPizza;
import com.makoto.pizza.california.CaliforniaStylePepperoniPizza;
import com.makoto.pizza.california.CaliforniaStyleVeggiePizza;

/**
 * The Chicago pizza store
 * 
 * @author makoton
 * 
 */
public class CaliforniaPizzaStore extends PizzaStore
{

	@Override
	protected Pizza createPizza(String type)
	{
		if (type.equals("cheese")) return new CaliforniaStyleCheesePizza();
		else if (type.equals("veggie")) return new CaliforniaStyleVeggiePizza();
		else if (type.equals("clam")) return new CaliforniaStyleClamPizza();
		else if (type.equals("pepperoni")) return new CaliforniaStylePepperoniPizza();
		return null;
	}

}
