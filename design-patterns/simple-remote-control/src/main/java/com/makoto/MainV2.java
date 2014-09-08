package com.makoto;

import com.makoto.command.garage.GarageDoorOpenCommand;
import com.makoto.command.light.LightOnCommand;
import com.makoto.remote.SimpleRemoteControl;
import com.makoto.thirparty.GarageDoor;
import com.makoto.thirparty.Light;

/**
 * Client for remote simple control
 * 
 * @author makoton
 *
 */
public class MainV2
{

	/**
	 * Test the Simple remote controll
	 * @param args
	 */
	public static void main(String[] args)
	{
		SimpleRemoteControl simpleRemoteControl =  new SimpleRemoteControl();
		
		//Light command
		Light light = new Light("");		
		LightOnCommand lightOnCommand =  new LightOnCommand(light);
		
		//Garage command
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonWasPressed();
		
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonWasPressed();
	
	}
}
