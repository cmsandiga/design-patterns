/**
 * 
 */
package com.makoto.adventuregame.character;

import com.makoto.adventuregame.weapon.SwordBehavior;

/**
 * @author makoton
 *
 */
public class Knight extends Character
{

	public Knight()
	{
		this.weaponBehavior = new SwordBehavior();
	}

}
