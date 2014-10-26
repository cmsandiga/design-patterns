package com.makoto.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.makoto.menu.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent>
{
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> it)
	{
		stack.push(it);
	}

	public MenuComponent next()
	{
		if (hasNext())
		{
			Iterator<MenuComponent> it = stack.peek();
			MenuComponent component = it.next();
			stack.push(component.createIterator());

			return component;
		}
		else
		{
			return null;
		}
	}

	public boolean hasNext()
	{
		if (stack.isEmpty())
		{
			return false;
		}
		else
		{
			Iterator<MenuComponent> it = stack.peek();

			if (it.hasNext())
			{
				stack.pop();
				return hasNext();
			}
			else
			{
				return true;
			}
		}

	}

	public void remove()
	{
		// TODO Auto-generated method stub

	}

}
