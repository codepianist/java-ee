/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * <h1>MongoDBSparkAndFreemarker</h1> 
 * <p>created on: Aug 7, 2013, 12:22:39 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class MongoDBSparkAndFreemarker {
    public static void main(String[] args) {

        Spark.get(new Route("/"){

            @Override
            public Object handle(Request rqst, Response rspns) {
                Configuration c = new Configuration();
                c.setLocale(new Locale("pt_BR"));
                c.setDefaultEncoding("UTF-8");
                StringWriter writer = new StringWriter();
                try {
                    File f = new File("./src/main/resources");
                    System.out.println(f.getAbsolutePath());
                    c.setDirectoryForTemplateLoading(f);
                    Template tmpl = c.getTemplate("testTmpl.html");
                    
                    MongoClient client = new MongoClient(new ServerAddress("localhost",27017)); // porta default do mongo

                    DB database = client.getDB("test");
                    DBCollection collection = database.getCollection("names");
                    DBObject doc = collection.findOne();

                    tmpl.process(doc,writer);

                }catch(Exception ex){
                    halt(500);
                    ex.printStackTrace();
                }
                return writer;
            }
            
        });
        
    }
}
