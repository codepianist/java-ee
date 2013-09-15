/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._1joiner;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>NewClass</h1> 
 * <p>created on: Sep 14, 2013, 8:54:15 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _1Basics {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList(Arrays.asList("Superman",null,"Batman",null,"Spiderman","Wonderwoman","Hulk"));
        System.out.println( Joiner.on(";").skipNulls().join(l1) );
        System.out.println( Joiner.on(" | ").useForNull("ops...").join(l1) );
    }
}
