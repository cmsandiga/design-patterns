/**
 * 
 */
package com.makoto.command.light;

import com.makoto.command.Command;
import com.makoto.thirparty.Light;

/**
 * 
 * Light on command
 * @author makoton
 *
 */
public class LightOnCommand implements Command
{

	private Light	light;

	public LightOnCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute()
	{
		light.on();
	}

	@Override
	public void undo()
	{
		light.off();
	}

}
