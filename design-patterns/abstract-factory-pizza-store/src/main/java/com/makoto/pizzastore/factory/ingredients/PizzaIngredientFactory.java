package com.makoto.pizzastore.factory.ingredients;

import com.makoto.pizzastore.ingredients.cheese.Cheese;
import com.makoto.pizzastore.ingredients.clams.Clams;
import com.makoto.pizzastore.ingredients.dough.Dough;
import com.makoto.pizzastore.ingredients.pepperoni.Pepperoni;
import com.makoto.pizzastore.ingredients.souce.Souce;
import com.makoto.pizzastore.ingredients.veggies.Veggies;

/**
 * The pizza ingredient factory
 * 
 * @author makoton
 * 
 */
public interface PizzaIngredientFactory
{
	public Dough createDough();

	public Souce createSouce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClams();

}
