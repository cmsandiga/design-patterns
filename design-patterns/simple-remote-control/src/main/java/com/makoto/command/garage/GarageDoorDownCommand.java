package com.makoto.command.garage;

import com.makoto.command.Command;
import com.makoto.thirparty.GarageDoor;

/**
 * The garage open comand
 * 
 * @author makoton
 *
 */
public class GarageDoorDownCommand implements Command
{

	private GarageDoor	garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute()
	{
		garageDoor.down();
	}

	@Override
	public void undo()
	{
		garageDoor.open();
	}

}
