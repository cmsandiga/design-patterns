package com.makoto.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu
{
	ArrayList<MenuItem>	menuItems;

	public PancakeHouseMenu()
	{
		menuItems =  new ArrayList<MenuItem>();
		
		addItem("K&B Pancake breakfast", "Pancake with scramble eggs, and toast", true, 2.99);
		addItem("Regular Pancake breakfast", "Pancake with fried eggs, and sausage", false, 2.99);
		addItem("BlueBerry Pancake breakfast", "Pancake made with fresh bleuberries", true, 3.49);
		addItem("Wafles", "Wafles, with your choice of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator<MenuItem> createIterator()
	{
		return menuItems.iterator();
	}
}
