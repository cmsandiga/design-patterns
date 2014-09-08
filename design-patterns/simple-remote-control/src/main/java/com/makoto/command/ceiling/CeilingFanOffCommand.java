package com.makoto.command.ceiling;

import com.makoto.command.Command;
import com.makoto.thirparty.CeilingFan;

/**
 * The Ceiling fan down command
 * 
 * @author makoton
 *
 */
public class CeilingFanOffCommand implements Command
{
	private CeilingFan	ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan)
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
