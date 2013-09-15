/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

import lombok.Getter;
import lombok.Setter;

/**
 * <h1>SuperHero</h1> 
 * <p>created on: Sep 14, 2013, 9:02:09 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SuperHero {
    @Getter @Setter protected String name;
    @Getter @Setter protected String strength;

    @Override
    public String toString() {
        return "I' a SuperHero: " + "my Name is " + name + ", and my Strength is " + strength + '.';
    }

    
    
    public SuperHero(String name, String strength) {
        this.name = name;
        this.strength = strength;
    }
}
