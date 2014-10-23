package com.makoto.menu.iterator;

public interface Iterator
{
	boolean hasNext();

	<T> T next();
}
