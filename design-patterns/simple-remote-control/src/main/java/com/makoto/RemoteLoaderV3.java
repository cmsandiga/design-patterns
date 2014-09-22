package com.makoto;

import com.makoto.command.Command;
import com.makoto.command.MacroCommand;
import com.makoto.command.light.LightOffCommand;
import com.makoto.command.light.LightOnCommand;
import com.makoto.command.stereo.StereoOffCommand;
import com.makoto.command.stereo.StereoWithCdCommand;
import com.makoto.remote.RemoteWithUndo;
import com.makoto.thirparty.Light;
import com.makoto.thirparty.Stereo;

public class RemoteLoaderV3
{
	public static void main(String[] args)
	{
		Light light = new Light("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand  lightOnCommand = new LightOnCommand(light);
		LightOffCommand  lightOffCommand = new LightOffCommand(light);
		
		StereoWithCdCommand StereoWithCdCommand = new StereoWithCdCommand(stereo);
		StereoOffCommand StereoOffCommand = new StereoOffCommand(stereo);
		
		Command[] patyOn = {lightOnCommand, StereoWithCdCommand};
		Command[] patyOff = {lightOffCommand, StereoOffCommand};
		
		MacroCommand macroOnCommand = new MacroCommand(patyOn);
		MacroCommand macroOffCommand = new MacroCommand(patyOff);
		
		RemoteWithUndo remoteControl  = new RemoteWithUndo();
		remoteControl.setCommand(0, macroOnCommand, macroOffCommand);
		
		System.out.println(remoteControl);
		
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.undoButtonWasPushed();
		
		
	}
}

