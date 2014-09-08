package com.makoto.command.light;

import com.makoto.command.Command;
import com.makoto.thirparty.Light;

/**
 * Light off command
 * 
 * @author makoton
 *
 */
public class LightOffCommand implements Command
{

	private Light	light;

	public LightOffCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute()
	{
		light.off();
	}

	@Override
	public void undo()
	{
		light.on();
	}

}
