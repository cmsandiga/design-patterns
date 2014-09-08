package com.makoto.command.stereo;

import com.makoto.command.Command;
import com.makoto.thirparty.Stereo;

/**
 * Stereo with cd command
 * 
 * @author makoton
 *
 */
public class StereoWithCdCommand implements Command
{

	private Stereo	stereo;

	public StereoWithCdCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	
	@Override
	public void execute()
	{
		stereo.on();
		stereo.setCd();
		stereo.setVolume(13);
	}

	@Override
	public void undo()
	{
		stereo.off();
	}
	
}
