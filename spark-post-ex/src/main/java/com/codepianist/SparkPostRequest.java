/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * <h1>SparkPostRequest</h1> 
 * <p>created on: Aug 9, 2013, 12:13:07 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SparkPostRequest {
    public static void main(String[] args) {
        
        final Configuration fmConf = new Configuration();
        fmConf.setDefaultEncoding("UTF-8");
        
        Spark.get(new Route("/"){
            @Override
            public Object handle(Request request, Response response) {
                StringWriter writer= buildTeamsForm(fmConf);
                return writer;
            }
        });
        
        Spark.post(new Route("you-root-for"){
            @Override
            public Object handle(Request request, Response response) {
                final String team = request.queryParams("team");
                if(team!=null){
                    return "Parabéns vc torce pelo "+team;
                }else{
                    return "vc precisa escolher um time";
                }
                
            }
        });
    }

    private static StringWriter buildTeamsForm(final Configuration fmConf) {
        File f= new File("./src/main/resources");
        Template teamsFormTpl= null;
        
        Map<String,Object> templParams = new HashMap();
        templParams.put("teams",
                    Arrays.asList("Corinthians","Palmeiras","Santos","Ponte Preta")
                );
        StringWriter writer= null;
        try{
            fmConf.setDirectoryForTemplateLoading(f);
            teamsFormTpl = fmConf.getTemplate("soccer_teams_form.html");
            
            writer= new StringWriter();
            
            teamsFormTpl.process(templParams, writer);
            
            
        }catch(FileNotFoundException ex){
            System.err.println("Arquivo nao encontrado no caminho: "+f.getAbsolutePath());
            ex.printStackTrace();
        }catch(TemplateException ex){
            System.err.println("Problema com o template: "+ex.getMessage());
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return writer;
    }
}
