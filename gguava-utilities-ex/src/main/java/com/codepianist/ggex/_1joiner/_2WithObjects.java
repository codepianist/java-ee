/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._1joiner;

import com.codepianist.SuperHero;
import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>_2WithObjects</h1> 
 * <p>created on: Sep 14, 2013, 10:30:20 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _2WithObjects {
    public static void main(String[] args) {
        List<SuperHero> l2 = new ArrayList(Arrays.asList(
                    new SuperHero("Superman", "to Fly"),
                    new SuperHero("Spiderman", "to Climb"),
                    new SuperHero("Wonderwoman", "Beauty"),
                    new SuperHero("Batman", "Gadgets"),
                    new SuperHero("Hulk", "Strength")
                ));
        System.out.println( Joiner.on("\n").skipNulls().join(l2) );
        
    }
}
