package com.makoto;

import com.makoto.menu.MenuComponent;

/**
 * 
 * @author makoton
 *
 */
public class Waitress
{
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus)
	{
		this.allMenus = allMenus;
	}
	
	public void printMenu()
	{
		allMenus.print();
	}
}
