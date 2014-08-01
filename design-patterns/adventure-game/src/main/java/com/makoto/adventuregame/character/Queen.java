package com.makoto.adventuregame.character;

import com.makoto.adventuregame.weapon.BowAndArrowBehavior;

/**
 * The Queen Class
 * 
 * @author makoton
 * 
 */
public class Queen extends Character
{
	public Queen()
	{
		this.weaponBehavior = new BowAndArrowBehavior();
	}
}
