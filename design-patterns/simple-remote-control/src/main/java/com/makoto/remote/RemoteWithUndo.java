package com.makoto.remote;

import com.makoto.command.Command;
import com.makoto.command.NoCommand;

/***
 * The more elaborate remote control
 * 
 * @author makoton
 *
 */
public class RemoteWithUndo
{
	private Command[]	onCommands;
	private Command[]	offCommands;

	private Command undoCommand;
	
	public RemoteWithUndo()
	{
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++)
		{
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand)
	{
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
		undoCommand = onCommands[slot]; 
	}

	public void offButtonWasPushed(int slot)
	{
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed()
	{
		undoCommand.undo();
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n --------------- Remote Control --------------- \n");

		for (int i = 0; i < onCommands.length; i++)
		{
			sb.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "\t\t\t" + offCommands[i].getClass().getSimpleName() + "\n");
		}
		sb.append("[undo]").append(" " + undoCommand.getClass().getSimpleName());
		return sb.toString();
	}
}
