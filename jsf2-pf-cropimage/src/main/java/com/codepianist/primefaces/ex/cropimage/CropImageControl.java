/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.primefaces.ex.cropimage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.imageio.stream.FileImageOutputStream;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.CroppedImage;

/**
 * <h1>CropImageControl</h1> 
 * <p>created on: Jul 23, 2013, 12:04:18 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
@ManagedBean @ViewScoped
public class CropImageControl implements Serializable{

    @Getter @Setter private CroppedImage croppedImage;
    
    @Getter @Setter private String newImageName;

    private static final String BASE = "";
    
    // Crop
    
    public String crop() {
        System.out.println("Called...");
        
        if(croppedImage == null)
            return null;
        if(BASE.isEmpty()) System.err.println("Ops! Vc precisa especificar o caminho primeiro...");
        String path = BASE+"/primefaces-ex-cropimage-netbeans/src/main/webapp/resources/images/";
        
        setNewImageName(generateUniqueName("codepianist-logo"));
        String fullUniqueName = path+getNewImageName();
        File f = new File(fullUniqueName);
        
        File realFile = new File(path+"codepianist-logo.png");
        System.out.println(realFile.getAbsolutePath());
        System.out.printf("the file at: %s%s, exists? %b.",path,"codepianist-logo.png",realFile.exists());
        

        FileImageOutputStream imageOutput;
        try {
            imageOutput = new FileImageOutputStream(f);
            imageOutput.write(croppedImage.getBytes(), 0, croppedImage.getBytes().length);
            imageOutput.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        System.out.printf("the file at: %s, exists? %b.",fullUniqueName,f.exists());

        return null;
    }
    
    private String generateUniqueName(String name){
        Calendar cal = new GregorianCalendar();
        return new StringBuffer(name)
                .append(cal.get(Calendar.YEAR))
                .append(cal.get(Calendar.DAY_OF_YEAR))
                .append(cal.get(Calendar.HOUR))
                .append(cal.get(Calendar.MINUTE))
                .append(cal.get(Calendar.SECOND))
                .append(".png")
                .toString();
    }
    
}
