/**
 * 
 */
package com.makoto.pizzastore.factory.ingredients;

import com.makoto.pizzastore.ingredients.cheese.Cheese;
import com.makoto.pizzastore.ingredients.cheese.ReggianoCheese;
import com.makoto.pizzastore.ingredients.clams.Clams;
import com.makoto.pizzastore.ingredients.clams.FreshClams;
import com.makoto.pizzastore.ingredients.dough.Dough;
import com.makoto.pizzastore.ingredients.dough.ThinCrustDough;
import com.makoto.pizzastore.ingredients.pepperoni.Pepperoni;
import com.makoto.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import com.makoto.pizzastore.ingredients.souce.MarinaraSouce;
import com.makoto.pizzastore.ingredients.souce.Souce;
import com.makoto.pizzastore.ingredients.veggies.Garlic;
import com.makoto.pizzastore.ingredients.veggies.Mushroom;
import com.makoto.pizzastore.ingredients.veggies.Onion;
import com.makoto.pizzastore.ingredients.veggies.RedPepper;
import com.makoto.pizzastore.ingredients.veggies.Veggies;

/**
 * @author makoton
 * 
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough()
	{
		return new ThinCrustDough();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createSouce()
	 */
	@Override
	public Souce createSouce()
	{
		return new MarinaraSouce();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createCheese()
	 */
	@Override
	public Cheese createCheese()
	{
		return new ReggianoCheese();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createVeggies()
	 */
	@Override
	public Veggies[] createVeggies()
	{
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createPepperoni()
	 */
	@Override
	public Pepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createClams()
	 */
	@Override
	public Clams createClams()
	{
		return new FreshClams();
	}

}
