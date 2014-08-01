package com.makoto.adventuregame;

import com.makoto.adventuregame.character.Character;
import com.makoto.adventuregame.character.King;
import com.makoto.adventuregame.character.Knight;
import com.makoto.adventuregame.character.Queen;
import com.makoto.adventuregame.character.Troll;

/**
 * Class for test our adventure game client
 * 
 * @author makoton
 * 
 */
public class AdventureGameClient
{
	/**
	 * The main execution
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Character knight = new Knight();
		knight.fight();
		
		Character troll = new Troll();
		troll.fight();
		
		Character king = new King();
		king.fight();
		
		Queen queen = new Queen();
		queen.fight();
	}
}
