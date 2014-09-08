package com.makoto.command.garage;

import com.makoto.command.Command;
import com.makoto.thirparty.GarageDoor;

/**
 * The garage open comand
 * @author makoton
 *
 */
public class GarageDoorOpenCommand implements Command
{

	private GarageDoor	garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor)
	{
		this.garageDoor =  garageDoor;
	}
	@Override
	public void execute()
	{
		garageDoor.open();
		
	}

	@Override
	public void undo()
	{
		garageDoor.down();
		
	}

}
