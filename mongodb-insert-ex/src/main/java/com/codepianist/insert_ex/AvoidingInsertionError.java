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

/**
 * <h1>InsertingErro</h1> 
 * <p>created on: Aug 12, 2013, 8:05:00 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class AvoidingInsertionError {
    public static void main(String[] args) {
        MongoClient mongoClient = null;
        try{
            mongoClient = new MongoClient();
        } catch (UnknownHostException ex) {
            System.err.println("Couldn't find host");
            ex.printStackTrace();
        }
        
        DB db = mongoClient.getDB("school");
        DBCollection people = db.getCollection("people");
        
        DBObject doc = new BasicDBObject("name", "Andrew Erlichson")
                .append("company", "10gen");

        try {
            people.insert(doc);      // first insert
            doc.removeField("_id");  // remove the "_id" field
            people.insert(doc);      // second insert
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
