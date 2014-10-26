package com.makoto.menu;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu
{
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

	public CafeMenu()
	{

		addItem("Veggie burguer fries", "wheat burn, lettuce, tomates, fries", true, 3.99);
	}

	private void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		menuItems.put(menuItem.getName(), menuItem);

	}

	public Iterator<MenuItem> createIterator()
	{
		return menuItems.values().iterator();
	}

}
