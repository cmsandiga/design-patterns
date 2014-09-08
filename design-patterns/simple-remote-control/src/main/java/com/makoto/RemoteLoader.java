package com.makoto;

import com.makoto.command.ceiling.CeilingFanOffCommand;
import com.makoto.command.ceiling.CeilingFanOnCommand;
import com.makoto.command.garage.GarageDoorDownCommand;
import com.makoto.command.garage.GarageDoorOpenCommand;
import com.makoto.command.light.LightOffCommand;
import com.makoto.command.light.LightOnCommand;
import com.makoto.command.stereo.StereoOffCommand;
import com.makoto.command.stereo.StereoWithCdCommand;
import com.makoto.remote.RemoteControl;
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
public class RemoteLoader
{
	public static void main(String[] args)
	{
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight =  new  Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor =  new  GarageDoor("");
		Stereo stereo = new  Stereo("Stereo");
				
		LightOnCommand livingRoomOnCommand = new  LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenOffCommand = new  LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand celiingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new  GarageDoorDownCommand(garageDoor);
		
		StereoWithCdCommand stereoWithCdCommand = new StereoWithCdCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
					
		remoteControl.setCommand(0, livingRoomOnCommand, livingRoomOffCommand);
		remoteControl.setCommand(1, kitchenLightOnCommand, kitchenOffCommand);
		remoteControl.setCommand(2, ceilingFanOnCommand, celiingFanOffCommand);
		remoteControl.setCommand(3, stereoWithCdCommand, stereoOffCommand);
				
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
}
