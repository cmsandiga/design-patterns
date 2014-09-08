package com.makoto.thirparty;

/**
 * The stereo
 * 
 * @author makoton
 *
 */
public class Stereo
{
	private String	message;

	public Stereo(String message)
	{
		this.message = message;
	}

	public void on()
	{
		System.out.println(message + " The stereo is on");
	}

	public void off()
	{
		System.out.println(message+ " The stereo is off");
	}

	public void setCd()
	{
		System.out.println("The stereo option CD setting");
	}

	public void setDvd()
	{
		System.out.println("The stereo option DVD setting");
	}

	public void setRadio()
	{
		System.out.println("The stereo option Radio");
	}

	public void setVolume(int n)
	{
		System.out.println("The stereo Volume is in " + n);
	}
}
