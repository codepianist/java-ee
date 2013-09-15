/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._4strings;

import com.google.common.base.Strings;

/**
 * <h1>_2NullValues</h1> 
 * <p>created on: Sep 14, 2013, 11:25:56 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _2NullValues {
    public static void main(String[] args) {
        System.out.println( "_"+ Strings.nullToEmpty(null) );
        System.out.println( "_"+ Strings.emptyToNull("") );
        System.out.println( "_"+ Strings.isNullOrEmpty(null) );
        System.out.println( "_"+ Strings.isNullOrEmpty("") );
        System.out.println( "_"+ Strings.isNullOrEmpty("blah, blah, blah,...") );
    }
}
