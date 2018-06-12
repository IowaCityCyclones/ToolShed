package ToolShed;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

import org.bson.Document;

import ToolShed.Classes.Tool;

public interface Items {
	
	abstract String getName();
	abstract void setName(String input);
	
	/**
	 * @param Tool newTool to add to collection
	 * converts a tool object to a document to add to the collection
	 */
	public static Document toolToDocument(Tool newTool) {
		Document Document = new Document();
		Document.append("Name", newTool.getName());
		Document.append("hasToolbox", newTool.getToolboxStatus());
		Document.append("SKU", newTool.getSKU());
		Document.append("Price", newTool.getPrice());
		Document.append("Brand", newTool.getBrand());
		Document.append("AcquisitionDate", newTool.getAcqDate());
		
		return Document;
	}
	
	/**
	 * @param Tool newTool to add to collection
	 * converts a tool object to a DBObject to add to the collection
	 */
	public static DBObject toolToDBObject(Tool newTool) {
		String json = "{'Name' : '" + newTool.getName() + "'";
		json += ",'hasToolbox' : '" + newTool.getToolboxStatus() + "'";
		json += ",'SKU' : '" + newTool.getSKU() + "'";
		json += ",'Price' : '" + newTool.getPrice() + "'";
		json += ",'Brand' : '" + newTool.getBrand() + "'";
		json += ",'AcquisitionDate' : '" + newTool.getAcqDate() + "' }" ;
		
		DBObject Document = (DBObject)JSON.parse(json);
		return Document;
	}
	
}
