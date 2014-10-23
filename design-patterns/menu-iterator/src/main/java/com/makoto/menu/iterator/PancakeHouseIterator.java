package com.makoto.menu.iterator;

import java.util.ArrayList;

import com.makoto.menu.MenuItem;

public class PancakeHouseIterator implements Iterator
{

	ArrayList<MenuItem>	menuItems;
	int					position;

	public PancakeHouseIterator(ArrayList<MenuItem> menuItems)
	{		
		this.menuItems = menuItems;
	}

	public boolean hasNext()
	{
		if (position >= menuItems.size()) return false;
		
		return true;
	}

	@SuppressWarnings("unchecked")
	public MenuItem next()
	{
		return menuItems.get(position++);
	}

}
