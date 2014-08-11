package com.makoto.starbuzz.beverage;

/**
 * The public interface beverage decorator
 * 
 * @author makoton
 * 
 */
public abstract class Beverage
{
	public enum Size
	{
		TALL(0.10), GRANDE(0.15), VENTI(0.20);
		
		private final double price;
		
		private Size(double price)
		{
			this.price = price;
		}

		public double getPrice()
		{
			return price;
		}
		
	}

	String description = "Unknow Beverage";
	Size size = Size.TALL;

	public abstract double cost();

	public String getDescription()
	{
		return description;
	}

	public void setSize(Size size)
	{
		this.size = size;
	}

	public Size getSize()
	{
		return size;
	}
}
