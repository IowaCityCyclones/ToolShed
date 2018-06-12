package ToolShed.Classes;
import java.time.LocalDate;

import com.mongodb.BasicDBObjectBuilder;

import ToolShed.Items;

public class Tool extends Item implements Items{
	String name;			//name of tool	
	String brand;			// brand of tool - auto fill from known db categories
	double price;			//price of tool
	int SKU; 				//SKU of tool
	LocalDate AcquistionDate;    // date when tool was purchased/added to system
	private String Toolbox;// name of possible toolbox
	boolean hasToolbox;		//is the tool in a toolbox
	
	/**
	 * @param String Name of the tool,boolean inToolbox,int sku of the tool,
	 * double Price of the tool, String Brand of the tool,int AcqDate the acquisition date of the tool
	 * full constructor of a tool
	 */
	public Tool(String Name,boolean inToolbox,int sku,double Price,String Brand,LocalDate AcqDate) {
		setName(Name);
		setToolboxStatus(inToolbox);
		setSKU(sku);
		setPrice(Price);
		setBrand(Brand);
		setAcqDate(AcqDate);
	}
	
	/**
	 * @param String Name of the tool,boolean inToolbox,
	 * double Price of the tool, String Brand of the tool,int AcqDate the acquisition date of the tool
	 * constructor of a tool with a null sku
	 */
	@SuppressWarnings("null")
	public Tool(String Name, boolean inToolbox, double Price, String Brand, LocalDate AcqDate) {
		setName(Name);
		setToolboxStatus(inToolbox);
		setSKU((Integer) null);
		setPrice(Price);
		setBrand(Brand);
		setAcqDate(AcqDate);
	}
	
	/**
	 * @param Tool newTool to add to collection
	 * converts a tool object to a document to add to the collection
	 */
	public BasicDBObjectBuilder toolToDocument() {
		new BasicDBObjectBuilder();
		BasicDBObjectBuilder Document = BasicDBObjectBuilder.start();
		Document.add("Name", this.getName());
		Document.add("hasToolbox", this.getToolboxStatus());
		Document.add("SKU", this.getSKU());
		Document.add("Price", this.getPrice());
		Document.add("Brand", this.getBrand());
		Document.add("AcquisitionDate", this.getAcqDate());
		
		return Document;
	}
	
	/**
	 * @param void
	 * returns the Acquisition date as a Date
	 */
	public LocalDate getAcqDate() {
		return this.AcquistionDate;
	}
	/**
	 * @param int acquisition date
	 * set the acquisition date of when the tool was received
	 */
	private void setAcqDate(LocalDate acqDate) {
		this.AcquistionDate=acqDate;
	}
	
	/**
	 * @param void
	 * returns the SKU of the tool as integer
	 */
	public int getSKU() {
		return this.SKU;
	}
	/**
	 * @param sku is the SKU of the tool
	 * sets SKU of tool
	 */
	private void setSKU(int sku) {
		this.SKU=sku;
	}
	
	/**
	 * @param void
	 * returns the brand name of the tool
	 */
	public String getBrand() {
		return this.brand;
	}
	/**
	 * @param String brand
	 * set the brand name of the tool
	 */
	private void setBrand(String brand) {
		this.brand=brand;
	}
	
	/**
	 * @param void
	 * returns the price of the tool as a double
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * @param double price
	 * the price of the tool
	 */
	public void setPrice(double price) { 
		this.price=price;
	}
	
	/**
	 * @param void
	 * returns the boolean of if the tool is in a tool box
	 */
	public boolean getToolboxStatus() {
		return this.hasToolbox;
	}
	/**
	 * @param boolean hasBox
	 * sets is the tool belongs is a tool box
	 */
	public void setToolboxStatus(boolean hasBox) { 
		this.hasToolbox=hasBox;
	}

	/**
	 * @param void
	 * returns the tool box name as a string
	 */
	public String getToolboxName() { // returns the name of the item
		return this.Toolbox;
	}
	
	/**
	 * @param String Name
	 * sets tool box name
	 */
	public void setToolboxName(String Name) { // set  the name of the item
		this.Toolbox=Name;
	}

}
