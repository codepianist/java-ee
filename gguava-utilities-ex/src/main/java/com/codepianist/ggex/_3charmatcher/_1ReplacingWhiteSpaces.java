/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._3charmatcher;

import com.google.common.base.CharMatcher;

/**
 * <h1>_1ReplacingWhiteSpaces</h1> 
 * <p>created on: Sep 14, 2013, 11:30:00 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _1ReplacingWhiteSpaces {
    public static void main(String[] args) {
        String test = "O   rato      roeu     a roupa     do    rei    de roma.    ";
        String after1 = CharMatcher.WHITESPACE.collapseFrom(test, ' ');
        String after2 = CharMatcher.WHITESPACE.trimAndCollapseFrom(test, ' ');
        System.out.println( test );
        System.out.println( after1 );
        System.out.println( after2 );
    }
}
