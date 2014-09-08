package com.makoto.command.stereo;

import com.makoto.command.Command;
import com.makoto.thirparty.Stereo;

/**
 * The stereo off command
 * 
 * @author makoton
 *
 */
public class StereoOffCommand implements Command
{
	private Stereo	stereo;

	public StereoOffCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}

	@Override
	public void execute()
	{
		stereo.off();
	}

	@Override
	public void undo()
	{
		stereo.on();
	}

}
