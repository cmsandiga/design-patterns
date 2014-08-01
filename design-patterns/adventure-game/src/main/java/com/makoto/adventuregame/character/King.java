package com.makoto.adventuregame.character;

import com.makoto.adventuregame.weapon.KnifeBehavior;

/***
 * 
 * @author makoton
 * 
 */
public class King extends Character
{
	public King()
	{
		this.weaponBehavior = new KnifeBehavior();
	}
}
