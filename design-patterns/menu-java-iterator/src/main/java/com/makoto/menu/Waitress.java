package com.makoto.menu;

import java.util.Iterator;

public class Waitress
{
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu)
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu =  cafeMenu;
	}

	public void printMenu()
	{
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> menuIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(menuIterator);
		System.out.println("\nCafe");
		printMenu(cafeIterator);
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
