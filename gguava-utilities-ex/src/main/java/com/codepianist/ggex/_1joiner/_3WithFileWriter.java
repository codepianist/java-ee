/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ggex._1joiner;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>WithFileWriter</h1> 
 * <p>created on: Sep 14, 2013, 9:25:41 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class _3WithFileWriter {
    static List<String> l1 = new ArrayList(Arrays.asList("Superman",null,"Batman",null,"Spiderman","Wonderwoman","Hulk"));
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter(new File("filled-with-google-guava.txt"));
            fw.write("Superheroes list:\n");
            
            Joiner j = Joiner.on(", ").skipNulls();
            j.appendTo(fw, l1); // returns the FileWriter
            //fw.flush();
            fw.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
