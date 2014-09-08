package com.makoto.thirparty;

public class Light
{
	private String message;
	
	public Light(String message)
	{
		this.message = message;
	}
	public void on()
	{
		System.out.println(message + " Light is on");
	}

	public void off()
	{
		System.out.println(message + " Light is off");
	}
}
