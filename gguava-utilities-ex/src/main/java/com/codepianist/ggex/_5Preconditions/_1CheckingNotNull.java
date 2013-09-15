/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._5preconditions;

import com.codepianist.SuperHero;
import static com.google.common.base.Preconditions.*;

/**
 * <h1>_1CheckingNotNull</h1> 
 * <p>created on: Sep 14, 2013, 12:14:35 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _1CheckingNotNull {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero("Superman", "ability to fly");
        
        System.out.println("\nexample 1:");
        cannotBeNull(sh);
        mustBeValid(sh);
        
        System.out.println("\nexample 2:");
        sh = null;
        // comment one of the lines above
        cannotBeNull(sh);
        mustBeValid(sh);
    }
    static void cannotBeNull(SuperHero sh){
        SuperHero in = checkNotNull(sh, "var cannot be null.");
        System.out.println(in);
    }
    static void mustBeValid(SuperHero sh){
        checkArgument(sh!=null, "var cannot be null."); // void
        System.out.println(sh);
    }
}
