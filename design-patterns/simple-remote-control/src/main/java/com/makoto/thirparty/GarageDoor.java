package com.makoto.thirparty;

/**
 * Garage door
 * 
 * @author makoton
 *
 */
public class GarageDoor
{
	private String message;
	
	public GarageDoor(String message)
	{
		this.message =  message;
	}
	public void open()
	{
		System.out.println(message + " Garage Door is open");
	}

	public void down()
	{
		System.out.println(message + " Garage Door is down");
	}
	
	public void stop()
	{
		System.out.println("Garage Door was stopped");
	}
	
}
