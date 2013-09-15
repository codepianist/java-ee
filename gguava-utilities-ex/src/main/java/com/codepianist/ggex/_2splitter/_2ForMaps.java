/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._2splitter;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import java.util.Map;

/**
 * <h1>_2ForMaps</h1> 
 * <p>created on: Sep 14, 2013, 10:55:49 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _2ForMaps {
    public static void main(String[] args) {
        String phonesStr = "Carlos=11 55484488#João=11 8885-8884#Pamela=19 55443333#Zoraide=51 55668888";
        Map<String,String> phonesMap = Splitter.on("#").withKeyValueSeparator("=").split(phonesStr);
        for(String key : phonesMap.keySet()){
            System.out.println(key+":"+phonesMap.get(key));
        }
    }
}
