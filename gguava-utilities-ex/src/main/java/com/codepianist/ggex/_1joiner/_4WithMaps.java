/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._1joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>_3WithMaps</h1> 
 * <p>created on: Sep 14, 2013, 9:37:49 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _4WithMaps {
    static Map<String,String> shMap = Maps.newHashMap();
    
    public static void main(String[] args) {
        shMap.put("Ability to fly","Superman");
        shMap.put("Ability to climb walls","Spiderman");
        shMap.put("Green", "Hulk");
        shMap.put("Nocturne Behavior", "Batman");
        
        System.out.println( Joiner.on(" | ").withKeyValueSeparator("=").join(shMap) );
        
    }
}
