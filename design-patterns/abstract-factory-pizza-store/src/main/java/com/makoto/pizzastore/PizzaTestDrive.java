package com.makoto.pizzastore;

import com.makoto.pizzastore.factory.pizza.ChicagoPizzaStore;
import com.makoto.pizzastore.factory.pizza.NYPizzaStore;
import com.makoto.pizzastore.factory.pizza.PizzaStore;
import com.makoto.pizzastore.pizza.Pizza;

/**
 * Testing the pizza store
 * 
 * @author makoton
 * 
 */
public class PizzaTestDrive
{
	public static void main(String[] args)
	{
		
		PizzaStore nyPizzaStore =  new NYPizzaStore();
		PizzaStore chicagoPizzaStore =  new ChicagoPizzaStore();
		
		Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan order a " + nyPizza.getName() + "\n");
		
		Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel order a " + chicagoPizza.getName() + "\n");
	}
}
