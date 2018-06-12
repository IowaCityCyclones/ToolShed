/**
 * 
 */
package ToolShed;

import java.net.UnknownHostException;
import java.time.LocalDate;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import ToolShed.Classes.Tool;

/**
 * @author brjam
 *
 */
public class ToolShed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		try {
			MongoClient mongoClient = new MongoClient("localhost",27017);
			System.out.println("Connection Established Successfully");
			
			DB db = mongoClient.getDB("ToolShed");
			System.out.println("Found ToolShed Successfully");
			
			DBCollection Shed = db.getCollection("Shed");
			System.out.println("Broke into Shed Successfully");
			
			LocalDate date = LocalDate.parse("2018-05-15");
			Tool newTool= new Tool("MutliTool",false,0000000001,40.00,"Leatherman",date);
			DBObject document = Items.toolToDBObject(newTool);
			
			Shed.insert(document);
			
			DBCursor cursor = Shed.find();
			
			while(cursor.hasNext()) {
				//int i=1;
				System.out.println(cursor.next());
				//i++;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
