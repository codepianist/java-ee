/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.insert_ex;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * <h1>Inserting2Clients</h1> 
 * <p>created on: Aug 12, 2013, 7:24:21 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Inserting2Clients {
    public static void main(String[] args) {
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
        List<BasicDBObject> toInsert = new ArrayList();
        
        toInsert.add(new BasicDBObject()
            .append("name","Amanda Nunes")
            .append("email","amanda@nu.co")
            .append("dt-birth", new GregorianCalendar(1982,Calendar.JULY,15).getTime()) // needs to be a Date
            .append("interests",Arrays.asList("lingiere","jewelry"))
            .append("phone",new BasicDBObject("title","home")
                        .append("number", "(11) 4487-5588")
                ));
        
        toInsert.add(new BasicDBObject()
            .append("name","Barbara Zude")
            .append("email","baby@myzude.com")
            .append("dt-birth", new GregorianCalendar(1984,Calendar.DECEMBER,20).getTime()) // needs to be a Date
            .append("interests",Arrays.asList("shoes","skirts","jewelry"))
            .append("phone",new BasicDBObject("title","work")
                        .append("number", "(11) 3365-7002")
                ));
        
        System.out.println("\nBefore:");

        clients.insert(new ArrayList<DBObject>(toInsert));  // use this insert overloaded version
                                                            // insert 2 or more times will result a MongoExceptionDuplicatedKey
        
        System.out.println("\nAfter:");

        
    }
}
