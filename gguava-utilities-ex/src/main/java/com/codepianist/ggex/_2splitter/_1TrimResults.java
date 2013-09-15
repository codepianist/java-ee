/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._2splitter;

import com.google.common.base.Splitter;

/**
 * <h1>_1TrimResults</h1> 
 * <p>created on: Sep 14, 2013, 10:43:22 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _1TrimResults {
    public static void main(String[] args) {
        String all = "Alpino, MMs,,, Troblerone, Caribe, Diamante,, Milka,,";
        System.out.println("\n example 01:");
        for(String each : Splitter.on(",").split(all) )
            System.out.println(each);
        
        System.out.println("\n example 02:");
        for(String each : Splitter.on(",").trimResults().split(all) )
            System.out.println(each);
        
        System.out.println("\n example 03:");
        for(String each : Splitter.on(",").trimResults().split(all) )
            System.out.println(each);
    }
}
