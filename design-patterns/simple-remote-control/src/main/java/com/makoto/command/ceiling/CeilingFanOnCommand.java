package com.makoto.command.ceiling;

import com.makoto.command.Command;
import com.makoto.thirparty.CeilingFan;

/**
 * The ceiling fan open command
 * 
 * @author makoton
 *
 */
public class CeilingFanOnCommand implements Command
{
	private CeilingFan	ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute()
	{
		ceilingFan.open();
	}

	@Override
	public void undo()
	{
		ceilingFan.down();
	}

}
