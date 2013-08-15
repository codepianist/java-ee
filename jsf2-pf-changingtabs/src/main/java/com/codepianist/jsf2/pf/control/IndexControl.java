/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.jsf2.pf.control;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * <h1>IndexControl</h1> 
 * <p>created on: Aug 15, 2013, 1:03:58 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
@ManagedBean @ViewScoped
public class IndexControl implements Serializable{
    
    private int tabActiveIndex=0;

    public int getTabActiveIndex() {
        return tabActiveIndex;
    }
    public void setTabActiveIndex(int tabActiveIndex) {
        this.tabActiveIndex = tabActiveIndex;
    }
    
    public void calculate(String value){
        // do calculation
        try {
            tabActiveIndex = Integer.parseInt(value);
            System.out.println("showing tab: "+tabActiveIndex);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            tabActiveIndex = 0;
        }
    }
    

}
