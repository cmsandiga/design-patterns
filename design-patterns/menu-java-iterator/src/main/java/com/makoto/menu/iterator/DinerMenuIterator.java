package com.makoto.menu.iterator;

import java.util.Iterator;

import com.makoto.menu.MenuItem;

/**
 * Example of java iterator then of create our Iterator menu from scratch
 * 
 * @author makoton
 *
 */
public class DinerMenuIterator implements Iterator<MenuItem>
{

	MenuItem[] menuItems;
	int position;

	public DinerMenuIterator(MenuItem[] menuItems)
	{
		this.menuItems = menuItems;
	}
	
	public boolean hasNext()
	{
		if (position >= menuItems.length || menuItems[position] == null)
		{
			return false;
		}
		return true;
	}

	public MenuItem next()
	{
		if (!hasNext()) return null;
		
		MenuItem menuItem = menuItems[position++];
		return menuItem;
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Yet we supported this maybe in other versions");
	}

}
