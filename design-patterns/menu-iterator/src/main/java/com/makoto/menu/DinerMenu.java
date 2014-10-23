package com.makoto.menu;

import com.makoto.menu.iterator.DinerMenuIterator;
import com.makoto.menu.iterator.Iterator;

public class DinerMenu
{
	final int	MAX_ITEMS		= 6;
	int			numberOfItems	= 0;
	MenuItem[]	menuItems;

	public DinerMenu()
	{
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT", "(Fakin')Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side potato salad", false, 3.29);
		addItem("Hot dog", "A hot dog, with a saurkraut, relish, onions, topped with cheese", false, 3.05);
	}

	public void addItem(String name, String description, boolean vegetarian, double price)
	{

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (numberOfItems > MAX_ITEMS)
		{
			System.err.println("Sorry menu is full, can't add item to menu");
		}
		else
		{
			menuItems[numberOfItems++] = menuItem;
		}
	}

	public Iterator createIterator()
	{
		return new DinerMenuIterator(menuItems);
	}
}
