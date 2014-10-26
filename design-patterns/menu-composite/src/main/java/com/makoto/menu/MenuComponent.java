package com.makoto.menu;

import java.util.Iterator;

/**
 * Abstract class for menu component
 * 
 * @author makoton
 *
 */
public abstract class MenuComponent
{

	// Composite Methods
	public void add(MenuComponent menuComponent)
	{
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent)
	{
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i)
	{
		throw new UnsupportedOperationException();
	}

	// Menu items
	public String getName()
	{
		throw new UnsupportedOperationException();
	}

	public String getDescription()
	{
		throw new UnsupportedOperationException();
	}

	public double getPrice()
	{
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian()
	{
		throw new UnsupportedOperationException();
	}

	public void print()
	{
		throw new UnsupportedOperationException();
	}

	public Iterator<MenuComponent> createIterator()
	{
		throw new UnsupportedOperationException();
	}
}
