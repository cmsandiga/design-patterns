package com.makoto.menu;

import java.util.Iterator;
import java.util.List;

public class WaitressArrayList
{
	List<Menu> menus;
	
	public WaitressArrayList(List<Menu> menus)
	{
		this.menus = menus;
	}

	public void printMenu()
	{
		for(Menu menu : menus)
		{
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> it)
	{
		while (it.hasNext())
		{
			MenuItem menuItem = it.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}

	}
}
