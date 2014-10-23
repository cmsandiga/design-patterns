package com.makoto.menu.iterator;

import com.makoto.menu.MenuItem;

public class DinerMenuIterator implements Iterator
{

	MenuItem[]	menuItems;
	int			position;

	public DinerMenuIterator(MenuItem[] menuItems)
	{
		this.menuItems = menuItems;
	}

	@SuppressWarnings("unchecked")
	public MenuItem next()
	{
		MenuItem menuItem = menuItems[position++];
		return menuItem;
	}

	public boolean hasNext()
	{
		if (position >= menuItems.length || menuItems[position] == null)
		{
			return false;
		}
		return true;
	}
}
