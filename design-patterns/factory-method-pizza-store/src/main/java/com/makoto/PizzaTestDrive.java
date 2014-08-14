package com.makoto;

import com.makoto.factory.ChicagoPizzaStore;
import com.makoto.factory.NYPizzaStore;
import com.makoto.factory.PizzaStore;
import com.makoto.pizza.Pizza;

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
