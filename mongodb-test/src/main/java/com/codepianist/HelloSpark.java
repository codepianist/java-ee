/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * <h1>HelloSpark</h1> 
 * <p>created on: Aug 7, 2013, 11:02:53 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class HelloSpark {
    public static void main(String[] args) {
        Spark.get(new Route("/"){

            @Override
            public Object handle(Request rqst, Response rspns) {
                return "Hello from Spark";
            }
            
        });
    }
}
