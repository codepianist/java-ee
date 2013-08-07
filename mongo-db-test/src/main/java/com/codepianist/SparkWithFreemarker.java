/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

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
 * <h1>SparkWithFreemarker</h1> 
 * <p>created on: Aug 7, 2013, 11:48:18 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SparkWithFreemarker {
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
                    
                    Map<String,Object> map = new HashMap<String, Object>();
                    map.put("name","Cesar");
                    tmpl.process(map,writer);

                }catch(Exception ex){
                    halt(500);
                    ex.printStackTrace();
                }
                return writer;
            }
            
        });
        
    }
}
