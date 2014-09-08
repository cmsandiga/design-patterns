package com.makoto.thirparty;

public class CeilingFan
{

	private String message;
	
	public CeilingFan(String message)
	{
		this.message =  message;
	}

	public void open()
	{
		System.out.println(message + " Ceiling fan open");
	}
	
	public void down()
	{
		System.out.println(message + " Ceiling fan down");
	}
}
