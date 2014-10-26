package com.makoto.menu;

import java.util.Iterator;

/**
 * 
 * @author makoton
 *
 */
public class MenuItem extends MenuComponent
{
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price)
	{
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}
	
	@Override
	public double getPrice()
	{
		return price;
	}

	public boolean isVegetarian()
	{
		return vegetarian;
	}

	public void print()
	{
		System.out.print(" " + name);

		if (isVegetarian())
		{
			System.out.print(" (v) ");
		}

		System.out.println(", " + price);
		System.out.println(" -- " + description);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterator<MenuComponent> createIterator()
	{
		return new NullIterator();
	}
	
	@SuppressWarnings("rawtypes")
	class NullIterator implements Iterator{

		public boolean hasNext()
		{
			// TODO Auto-generated method stub
			return false;
		}

		public Object next()
		{
			// TODO Auto-generated method stub
			return null;
		}

		public void remove()
		{
			// TODO Auto-generated method stub
			
		}}
}
