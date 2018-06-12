package ToolShed;

import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;

public class MongoClass {

	public static void main(String[] args) {
		
		try {
			MongoClient mongoClient = new MongoClient("localhost",27017);
			System.out.println("Connection Established Successfully");
			
			DB db = mongoClient.getDB("ToolShed");
			System.out.println("Found ToolShed Successfully");
			
			DBCollection Shed = db.getCollection("Shed");
			System.out.println("Broke into Shed Successfully");
			
			DBCursor cursor = Shed.find();
			
			while(cursor.hasNext()) {
				int i=1;
				System.out.println(cursor.next());
				i++;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
