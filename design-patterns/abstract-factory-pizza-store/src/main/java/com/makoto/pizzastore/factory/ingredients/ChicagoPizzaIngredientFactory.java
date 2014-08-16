/**
 * 
 */
package com.makoto.pizzastore.factory.ingredients;

import com.makoto.pizzastore.ingredients.cheese.Cheese;
import com.makoto.pizzastore.ingredients.cheese.MozzarellaCheese;
import com.makoto.pizzastore.ingredients.clams.Clams;
import com.makoto.pizzastore.ingredients.clams.FrozenClams;
import com.makoto.pizzastore.ingredients.dough.Dough;
import com.makoto.pizzastore.ingredients.dough.ThickCrustDough;
import com.makoto.pizzastore.ingredients.pepperoni.Pepperoni;
import com.makoto.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import com.makoto.pizzastore.ingredients.souce.PlunTomatoSouce;
import com.makoto.pizzastore.ingredients.souce.Souce;
import com.makoto.pizzastore.ingredients.veggies.BlackOlives;
import com.makoto.pizzastore.ingredients.veggies.EggPlant;
import com.makoto.pizzastore.ingredients.veggies.Spinach;
import com.makoto.pizzastore.ingredients.veggies.Veggies;

/**
 * @author makoton
 * 
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough()
	{
		return new ThickCrustDough();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createSouce()
	 */
	@Override
	public Souce createSouce()
	{
		return new PlunTomatoSouce();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createCheese()
	 */
	@Override
	public Cheese createCheese()
	{
		return new MozzarellaCheese();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.makoto.pizzastore.factory.ingredients.PizzaIngredientFactory#createVeggies()
	 */
	@Override
	public Veggies[] createVeggies()
	{
		Veggies[] veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
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
		return new FrozenClams();
	}

}
