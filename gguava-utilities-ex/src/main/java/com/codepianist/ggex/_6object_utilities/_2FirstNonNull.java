/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._6object_utilities;

import com.google.common.base.Objects;

/**
 * <h1>_2FirstNonNull</h1> 
 * <p>created on: Sep 14, 2013, 12:56:02 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _2FirstNonNull {
    public static void main(String[] args) {
        String a,b,c,d,e;
        a=null; b=null;c="null";d="not null";e=null;
        Objects.firstNonNull(a, b);
       
    }
}
