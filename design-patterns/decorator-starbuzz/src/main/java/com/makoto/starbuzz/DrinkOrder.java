package com.makoto.starbuzz;

import com.makoto.starbuzz.beverage.Beverage;
import com.makoto.starbuzz.beverage.Beverage.Size;
import com.makoto.starbuzz.beverage.DarkRoast;
import com.makoto.starbuzz.beverage.Expresso;
import com.makoto.starbuzz.beverage.HouseBlend;
import com.makoto.starbuzz.decorator.Milk;
import com.makoto.starbuzz.decorator.Mocha;
import com.makoto.starbuzz.decorator.Soy;
import com.makoto.starbuzz.decorator.Whip;

public class DrinkOrder
{
	public static void main(String[] args)
	{
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
				
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		Beverage beverage4 = new HouseBlend();
		beverage4.setSize(Size.GRANDE);
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
	}
}
