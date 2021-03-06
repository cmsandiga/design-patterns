package com.makoto;

import com.makoto.command.light.LightOnCommand;
import com.makoto.remote.SimpleRemoteControl;
import com.makoto.thirparty.Light;

/**
 * Client for remote simple control
 * 
 * @author makoton
 *
 */
public class Main
{

	/**
	 * Test the Simple remote controll
	 * @param args
	 */
	public static void main(String[] args)
	{
		SimpleRemoteControl simpleRemoteControl =  new SimpleRemoteControl();
		Light light = new Light("");
		
		LightOnCommand lightOnCommand =  new LightOnCommand(light);
		
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonWasPressed();
	
	}
}
