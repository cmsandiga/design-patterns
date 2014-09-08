package com.makoto.command;

/***
 * Honorable mention to null object
 * 
 * @author makoton
 *
 */
public class NoCommand implements Command
{

	@Override
	public void execute()
	{
		System.out.println("No command yet implemented");
	}

	@Override
	public void undo()
	{

	}

}
