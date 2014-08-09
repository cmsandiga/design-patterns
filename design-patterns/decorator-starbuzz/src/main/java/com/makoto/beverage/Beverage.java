package com.makoto.beverage;

/**
 * The public interface beverage decorator
 * 
 * @author makoton
 * 
 */
public abstract class Beverage
{
	protected String description = "Unknow Beverage";

	public abstract double cost();

	public String getDescription(){
		return description;
	}
}
