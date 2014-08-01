package com.makoto.adventuregame.character;

import com.makoto.adventuregame.weapon.WeaponBehavior;

/**
 * @author makoton
 * 
 */
public abstract class Character
{
	protected WeaponBehavior weaponBehavior;
	
	public void fight()
	{
		this.weaponBehavior.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior weaponBehavior)
	{
		this.weaponBehavior =  weaponBehavior;
	}
}
