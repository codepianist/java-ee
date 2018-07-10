package com.codepianist;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
public class HelloMongoDB {
    public static void main( String[] args ) throws UnknownHostException {
        // MongoClient client = new MongoClient("localhost",27017);
        MongoClient client = new MongoClient(new ServerAddress("localhost",27017)); // porta default do mongo
        
        DB database = client.getDB("test");
        DBCollection collection = database.getCollection("names");
        DBObject doc = collection.findOne();
        System.out.println( doc );
    }
}
