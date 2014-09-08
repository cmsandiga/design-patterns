package com.makoto;

import com.makoto.command.ceiling.CeilingFanOffCommand;
import com.makoto.command.ceiling.CeilingFanHighCommand;
import com.makoto.command.garage.GarageDoorDownCommand;
import com.makoto.command.garage.GarageDoorOpenCommand;
import com.makoto.command.light.LightOffCommand;
import com.makoto.command.light.LightOnCommand;
import com.makoto.command.stereo.StereoOffCommand;
import com.makoto.command.stereo.StereoWithCdCommand;
import com.makoto.remote.RemoteControl;
import com.makoto.remote.RemoteWithUndo;
import com.makoto.thirparty.CeilingFan;
import com.makoto.thirparty.GarageDoor;
import com.makoto.thirparty.Light;
import com.makoto.thirparty.Stereo;

/**
 * The remote loader class
 * 
 * @author makoton
 *
 */
public class RemoteLoaderV2
{
	public static void main(String[] args)
	{
		RemoteWithUndo remoteControl = new RemoteWithUndo();
		
		Light livingRoomLight =  new  Light("Living Room");
		
				
		LightOnCommand livingRoomOnCommand = new  LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);
				
		remoteControl.setCommand(0, livingRoomOnCommand, livingRoomOffCommand);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
