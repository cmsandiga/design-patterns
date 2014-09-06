package com.makoto.command;

/**
 * Command interface
 * 
 * @author makoton
 *
 */
public interface Command
{
	/**
	 * Command the encapsulate the request
	 */
	public void execute();

	/**
	 * Undo the latest push button
	 */
	public void undo();
}
