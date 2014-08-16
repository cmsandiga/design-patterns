/**
 * 
 */
package com.makoto.pizzastore.factory.ingredients;

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
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createSouce()
	 */
	@Override
	public Souce createSouce()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createCheese()
	 */
	@Override
	public Cheese createCheese()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createVeggies()
	 */
	@Override
	public Veggies[] createVeggies()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createPepperoni()
	 */
	@Override
	public Pepperoni createPepperoni()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createClams()
	 */
	@Override
	public Clams createClams()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
