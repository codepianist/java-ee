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
import java.util.Map;

/**
 * <h1>HelloFreeMarker</h1> 
 * <p>created on: Aug 7, 2013, 11:26:07 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class HelloFreeMarker {
    public static void main(String[] args) {
        Configuration c = new Configuration();
        
        try {
            File f = new File("./src/main/resources");
            System.out.println(f.getAbsolutePath());
            c.setDirectoryForTemplateLoading(f);
            Template tmpl = c.getTemplate("testTmpl.html");
            StringWriter sw = new StringWriter();
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("name","Cesar");
            tmpl.process(map,sw);
            System.out.println(sw);
            
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        
    }
}
