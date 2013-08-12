package com.codepianist.insert_ex;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.bson.types.ObjectId;

/**
 * Hello world!
 *
 */
public class Inserting1stClient{
    public static void main( String[] args ){
        MongoClient mongoClient = null;

        try {
            mongoClient = new MongoClient();
            
        } catch (UnknownHostException ex) {
            System.err.println("Couldn't find host");
            ex.printStackTrace();
        }
        
        DB testDB = mongoClient.getDB("test");
        DBCollection clients = testDB.getCollection("clients");
        
        // BasicDBObject client = new BasicDBObject("_id", new ObjectId()); // org.bson.types.ObjectId
        BasicDBObject client = new BasicDBObject();
        client.put("name","Carlos Caramujo");
        client.put("email","cacara@mujoex.com");
        client.put("dt-birth", new GregorianCalendar(1970,Calendar.MAY,5).getTime()); // needs to be a Date
        client.put("interests",Arrays.asList("shoes","belts","watches"));
        client.put("phone",new BasicDBObject("title","work")
                    .append("number", "(11) 5589-7852")
                );
        System.out.println("\nBefore:");
        System.out.println(client);
        clients.insert(client);
        
        System.out.println("\nAfter:");
        System.out.println(client);
        
    }
}
//Before:
//{ "name" : "Carlos Caramujo" , "email" : "cacara@mujoex.com" , "dt-birth" : { "$date" : "1970-05-05T03:00:00.000Z"} , "interests" : [ "shoes" , "belts" , "watches"] , "phone" : { "title" : "work" , "number" : "(11) 5589-7852"}}
//
//After:
//{ "name" : "Carlos Caramujo" , "email" : "cacara@mujoex.com" , "dt-birth" : { "$date" : "1970-05-05T03:00:00.000Z"} , "interests" : [ "shoes" , "belts" , "watches"] , "phone" : { "title" : "work" , "number" : "(11) 5589-7852"} , "_id" : { "$oid" : "52095dae4728c9c8e8ac177b"}}