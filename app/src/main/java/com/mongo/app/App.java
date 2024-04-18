package com.mongo.app;

import java.util.Iterator;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to my app!" );
        
        try {
        
        String mongoDBURI = "mongodb+srv://amitdahiyaj:Admin%401234@mongocluster.q5sx95l.mongodb.net/?retryWrites=true&w=majority&appName=MongoCluster";
        		
        //1. Connect to MongoDB
        MongoClient client = MongoClients.create(mongoDBURI);
        System.out.println("Connection created successfully!");
       
        System.out.println(client.listDatabaseNames());
        Iterator itr = client.listDatabaseNames().iterator();
   
        while(itr.hasNext()) {
        	String db = itr.next().toString();
        	System.out.println("Database Name:");
        	System.out.println(db);
        	Iterator dbItr = client.getDatabase(db).listCollectionNames().iterator();
        	System.out.println("Collection Names:");
        	while(dbItr.hasNext()) {
        		System.out.println(dbItr.next().toString());
        	}
        	System.out.println("\n");
        }
        
        }
        catch(Exception e) {
        	System.out.println("Something went wrong!");
        	System.out.println("Message: " + e.getMessage());
        }
    }
}
