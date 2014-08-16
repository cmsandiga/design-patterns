/**
 * 
 */
package com.makoto.pizzastore.pizza;

import java.util.ArrayList;
import java.util.List;

import com.makoto.pizzastore.ingredients.cheese.Cheese;
import com.makoto.pizzastore.ingredients.clams.Clams;
import com.makoto.pizzastore.ingredients.dough.Dough;
import com.makoto.pizzastore.ingredients.pepperoni.Pepperoni;
import com.makoto.pizzastore.ingredients.souce.Souce;
import com.makoto.pizzastore.ingredients.veggies.Veggies;

/**
 * @author makoton
 * 
 */
public abstract class Pizza
{
	protected String name;

	protected Dough dough;
	protected Souce souce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;

	protected List<String> toppings = new ArrayList<String>();

	/**
	 * Preparing our pizza, we are becoming a Gourmet cheff xD!
	 */
	public abstract void prepare();

	/**
	 * bake at 350 grades
	 */
	public void bake()
	{
		System.out.println("Baking for 30 minutes at 350");
	}

	/**
	 * Cutting the pizzas
	 */
	public void cut()
	{
		System.out.println("Cutting the pizza in diagonal slices");
	}

	/**
	 * Box the pizza
	 */
	public void box()
	{
		System.out.println("Place pizza in official Pizza store");
	}

	/**
	 * Get the name
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Set the name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;		
	}
}
