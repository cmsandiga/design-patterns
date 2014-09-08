package com.makoto.remote;

import com.makoto.command.Command;

/**
 * The simple remote control now is our invoker
 * 
 * @author makoton
 *
 */
public class SimpleRemoteControl
{
	private Command slot;
	
	public void setCommand(Command command)
	{
		this.slot =command;
	}
	
	public void buttonWasPressed()
	{
		slot.execute();
	} 
	
}
