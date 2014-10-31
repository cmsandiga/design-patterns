package com.makoto.protection.proxy;

import java.lang.reflect.Proxy;

import com.makoto.protection.proxy.handler.NonOwnerInvocationHandler;
import com.makoto.protection.proxy.handler.OwnerInvocationHandler;

public class MatchMakingTestDrive
{
	public static void main(String[] args)
	{
		MatchMakingTestDrive mmtd = new MatchMakingTestDrive();
		mmtd.drive();
	}

	private void drive()
	{
		PersonBean joe = getPersonFromDataBase("JOE ");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println(ownerProxy.getName());

		ownerProxy.setInterests("bowling go");
		System.out.println("Interest set from owner proxy");
		
		try
		{

			ownerProxy.setHotOrNotRating(10);
		}
		catch (Exception e)
		{
			System.out.println("Canto set rating from owner proxy");
		}
		System.out.println("Rating is : " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);		
		System.out.println("Name is: "+ nonOwnerProxy.getName());
		
		try
		{
			nonOwnerProxy.setInterests("Bowling, GO");
		}
		catch (Exception e)
		{
			System.out.println("Cant set interest from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(10);
		
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is:" + nonOwnerProxy.getHotOrNotRating());
	}

	PersonBean getPersonFromDataBase(String person)
	{
		PersonBean pb = new PersonBeanImpl();
		pb.setName(person);
		return pb;
	}

	PersonBean getOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

	PersonBean getNonOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy
				.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
}
