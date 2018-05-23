package ToolShed.Classes;
import ToolShed.Items;

public class Tool extends Item implements Items{
	String name;			//name of tool						
	float price;			//price of tool
	private String Toolbox;// name of possible toolbox
	boolean hasToolbox;		//is the tool in a toolbox
	

	public Tool(String Name,boolean inToolbox) {//constructor for a tool
		setName(Name);
		this.hasToolbox = inToolbox;
		
		
	}
	
	public String getToolboxName() { // returns the name of the item
		return this.Toolbox;
	}
	
	public void setToolboxName(String Name) { // set  the name of the item
		this.Toolbox=Name;
	}

}
