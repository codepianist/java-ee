/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._6object_utilities;

import com.codepianist.SuperHero;

/**
 * <h1>_1ToStringHelper</h1> 
 * <p>created on: Sep 14, 2013, 12:44:49 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _1ToStringHelper {
    public static void main(String[] args) {
        SuperHero sh = new AdvancedSuperHero("SuperMan", "Ability to fly");
        System.out.println( sh.toString() );
    }
}
