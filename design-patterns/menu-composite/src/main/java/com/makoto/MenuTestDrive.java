package com.makoto;

import com.makoto.menu.Menu;
import com.makoto.menu.MenuComponent;
import com.makoto.menu.MenuItem;

/**
 * 
 * @author makoton
 *
 */
public class MenuTestDrive
{
	public static void main(String[] args)
	{
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		// add menu items here
		
		dinerMenu.add(new MenuItem("Pasta", "SPaguetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side potato salad", false, 3.29));
		dinerMenu.add(new MenuItem("Hot dog", "A hot dog, with a saurkraut, relish, onions, topped with cheese", false, 3.05));
		dinerMenu.add(dessertMenu);
		
		pancakeHouseMenu.add(new MenuItem("K&B Pancake breakfast", "Pancake with scramble eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake breakfast", "Pancake with fried eggs, and sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("BlueBerry Pancake breakfast", "Pancake made with fresh bleuberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Wafles", "Wafles, with your choice of blueberries or strawberries", true, 3.59));
		
		cafeMenu.add(new MenuItem("Veggie burguer fries", "wheat burn, lettuce, tomates, fries", true, 3.99));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();

	}
}
