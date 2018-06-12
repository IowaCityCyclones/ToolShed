package ToolShed.Classes;

import ToolShed.Items;

public class Item implements Items {
	String Name; // Name of the item
	
	/**
	 * @param args
	 */
	public String getName() { // returns the name of the item
		return this.Name;
	}
	
	/**
	 * @param args
	 */
	public void setName(String Name) { // set  the name of the item
		this.Name=Name;
	}
	
}	

