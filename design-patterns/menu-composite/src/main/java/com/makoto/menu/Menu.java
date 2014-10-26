package com.makoto.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author makoton
 *
 */
public class Menu extends MenuComponent
{
	Iterator<MenuComponent> it;

	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent)
	{
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent)
	{
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i)
	{
		return menuComponents.get(i);
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public void print()
	{
		System.out.print("\n" + name);
		System.out.println(", " + description);
		System.out.println("----------------------");

		Iterator<MenuComponent> it = menuComponents.iterator();

		while (it.hasNext())
		{
			MenuComponent menuComponent = it.next();
			menuComponent.print();
		}
	}

	@Override
	public Iterator<MenuComponent> createIterator()
	{
		if (it == null)
		{
			// it = new CompositeI
		}
		return it;
	}
}
