/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._6object_utilities;

import com.codepianist.SuperHero;
import com.google.common.base.Objects;

/**
 * <h1>AdvancedSuperHero</h1> 
 * <p>created on: Sep 14, 2013, 12:45:17 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class AdvancedSuperHero extends SuperHero {

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .omitNullValues()
                .add("my name",this.name)
                .add("my strength",this.strength)
                .toString();
    }
    
    public AdvancedSuperHero(String name, String strength) {
        super(name, strength);
    }
    
}
