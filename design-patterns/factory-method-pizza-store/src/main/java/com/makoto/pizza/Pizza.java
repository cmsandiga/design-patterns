/**
 * 
 */
package com.makoto.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author makoton
 * 
 */
public abstract class Pizza
{
	protected String name;
	protected String dough;
	protected String souce;
	protected List<String> toppings = new ArrayList<String>();

	/**
	 * Preparing our pizza, we are becoming a Gourmet cheff xD!
	 */
	public void prepare()
	{
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding souce...");
		System.out.println("Adding toupings...");

		for (String topping : toppings)
		{
			System.out.println("   " + topping);
		}
	}

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
}
