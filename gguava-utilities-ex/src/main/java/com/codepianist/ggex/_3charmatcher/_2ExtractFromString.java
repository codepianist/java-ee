/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._3charmatcher;

import com.google.common.base.CharMatcher;

/**
 * <h1>NewClass</h1> 
 * <p>created on: Sep 14, 2013, 12:03:36 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _2ExtractFromString {
    public static void main(String[] args) {
        String s = "1111adasADASDd0000asdAASDFEf-asfd9899";
        
        System.out.println( s );
        System.out.println( CharMatcher.JAVA_DIGIT.retainFrom(s) );
        System.out.println( CharMatcher.JAVA_LETTER.retainFrom(s) );
        System.out.println( CharMatcher.JAVA_LOWER_CASE.retainFrom(s) );
        System.out.println( CharMatcher.JAVA_UPPER_CASE.retainFrom(s) );
    }
}
