package com.makoto.menu;

import com.makoto.menu.iterator.Iterator;

public class Waitress
{
	PancakeHouseMenu	pancakeHouseMenu;
	DinerMenu			dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu)
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu()
	{
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator menuIterator = dinerMenu.createIterator();
		
		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(menuIterator);
	}

	private void printMenu(Iterator it)
	{
		while(it.hasNext())
		{
			MenuItem menuItem = it.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		
	}
}
