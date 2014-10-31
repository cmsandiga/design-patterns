package com.makoto.protection.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.makoto.protection.proxy.PersonBean;

/**
 * Applying Protection Proxy
 * 
 * @author makoton
 *
 */
public class OwnerInvocationHandler implements InvocationHandler
{
	PersonBean person;

	public OwnerInvocationHandler(PersonBean person)
	{
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		try
		{
			
			if (method.getName().startsWith("get"))
			{
				return method.invoke(person, args);
			}
			else if (method.getName().equals("setHotOrNotRating"))
			{
				throw new IllegalAccessException();
			}
			else if (method.getName().startsWith("set"))
			{
				return method.invoke(person, args);				
			}
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
