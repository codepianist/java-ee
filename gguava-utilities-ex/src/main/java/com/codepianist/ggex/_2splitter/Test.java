/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._2splitter;

/**
 * <h1>Test</h1> 
 * <p>created on: Sep 14, 2013, 10:38:58 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        String all = "Alpino, MMs,,, Troblerone, Caribe, Diamante,, Milka,,";
        for(String each : all.split(","))
            System.out.println(each);
    }
}
