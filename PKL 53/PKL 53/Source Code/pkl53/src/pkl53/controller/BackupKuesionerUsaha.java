/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
import pkl53.view.BlokUsaha123;
import pkl53.view.BlokUsaha4;
import pkl53.view.BlokUsaha5;
import pkl53.view.BlokUsaha5B;
import pkl53.view.BlokUsaha5C;
import pkl53.view.BlokUsaha5D;
import pkl53.view.DataEntriUsahaPanel;
import pkl53.view.HomePanel;

/**
 *
 * @author akhul
 */
public class BackupKuesionerUsaha {
    private BlokUsaha123 blok123Usaha;
    private BlokUsaha4 blokUsaha4;
    private BlokUsaha5B blokUsaha5B;
    private BlokUsaha5C blokUsaha5C;
    private BlokUsaha5 blokUsaha5;
    private BlokUsaha5D blokUsaha5D;        
   
    /**
     * Untuk membaca database.properties yang berisi konfigurasi koneksi
     * database
     */
    public void read() {
        try {
            //String backupDir1 = "D://yopi.7gp";
            
            String name = HomePanel.getPathTextField().getText();
            if(name.equals("")){
                JOptionPane.showMessageDialog(blok123Usaha, "Please chose the file first!");
//                Message.errorMessage("Please chose the file first!");
            }
            
            Properties properties = new Properties();
            properties.load(new FileInputStream(name));
            
            getBlok123Usaha().getB1R1().setText(properties.getProperty("B1R1"));
            getBlok123Usaha().getB1R2().setText(properties.getProperty("B1R2"));
            getBlok123Usaha().getB1R3().setText(properties.getProperty("B1R3"));
            getBlok123Usaha().getB1R4().setText(properties.getProperty("B1R4"));
            getBlok123Usaha().getB1R5a().setText(properties.getProperty("B1R5a"));
            getBlok123Usaha().getB1R5b().setText(properties.getProperty("B1R5b"));
            getBlok123Usaha().getB1R6().setText(properties.getProperty("B1R6"));
//            getBlok123Usaha().getB1R7().setText(properties.getProperty("B1R7"));
//            getBlok123Usaha().getB1R8().setText(properties.getProperty("B1R8"));
//
////            blok56Usaha.getB5R26a().setText(properties.getProperty("B5R26a"));
//            blok56Usaha.getB5R26b().setText(properties.getProperty("B5R26b"));
//            blok56Usaha.getB5R27().setText(properties.getProperty("B5R27"));
//            blok56Usaha.getB5R28().setText(properties.getProperty("B5R28"));
//            blok56Usaha.getB5R28a().setText(properties.getProperty("B5R28a"));
//            blok56Usaha.getB5R28b().setText(properties.getProperty("B5R28b"));
//            blok56Usaha.getB5R28c().setText(properties.getProperty("B5R28c"));
//            blok56Usaha.getB5R28d().setText(properties.getProperty("B5R28d"));
//            blok56Usaha.getB5R28f1().setText(properties.getProperty("B5R28f1"));
//            blok56Usaha.getB5R28f2().setText(properties.getProperty("B5R28f2"));
//            blok56Usaha.getB5R28f3().setText(properties.getProperty("B5R28f3"));
//            blok56Usaha.getB5R28f4().setText(properties.getProperty("B5R28f4"));
//            blok56Usaha.getB5R28f5().setText(properties.getProperty("B5R28f5"));
//            blok56Usaha.getB5R28f6().setText(properties.getProperty("B5R28f6"));
//            blok56Usaha.getB5R28f7().setText(properties.getProperty("B5R28f7"));
//            blok56Usaha.getB5R28f8().setText(properties.getProperty("B5R28f8"));
//            blok56Usaha.getB5R28f9().setText(properties.getProperty("B5R28f9"));
//            blok56Usaha.getB5R29a().setText(properties.getProperty("B5R29a"));
//            blok56Usaha.getB5R29b1().setText(properties.getProperty("B5R29b1"));
//            blok56Usaha.getB5R29b2().setText(properties.getProperty("B5R29b2"));
//            blok56Usaha.getB5R29b3().setText(properties.getProperty("B5R29b3"));
//            blok56Usaha.getB5R29b4().setText(properties.getProperty("B5R29b4"));
//            blok56Usaha.getB5R29b5().setText(properties.getProperty("B5R29b5"));
//            blok56Usaha.getB5R29b6().setText(properties.getProperty("B5R29b6"));
//            blok56Usaha.getB5R29b7().setText(properties.getProperty("B5R29b7"));
//            blok56Usaha.getB5R29b8().setText(properties.getProperty("B5R29b8"));
//            blok56Usaha.getB5R29b9().setText(properties.getProperty("B5R29b9"));
//            blok56Usaha.getB5R29b10().setText(properties.getProperty("B5R29b10"));
//            blok56Usaha.getB5R29b11().setText(properties.getProperty("B5R29b11"));
//            blok56Usaha.getB5R29b12().setText(properties.getProperty("B5R29b12"));
//            
//            //blok6 = pertanyaan
//         
//            
//            //blok7 = pertanyaan
//            blok78Usaha.getB7R1().setText(properties.getProperty("B7R1"));
//            blok78Usaha.getB7R2a().setText(properties.getProperty("B7R2a"));
//            blok78Usaha.getB7R2b().setText(properties.getProperty("B7R2b"));
//            blok78Usaha.getB7R2c().setText(properties.getProperty("B7R2c"));
//            blok78Usaha.getB7R2d().setText(properties.getProperty("B7R2d"));
//            blok78Usaha.getB7R2e().setText(properties.getProperty("B7R2e"));
//            blok78Usaha.getB7R2f().setText(properties.getProperty("B7R2f"));
//            blok78Usaha.getB7R2g().setText(properties.getProperty("B7R2g"));
//            blok78Usaha.getB7R2h().setText(properties.getProperty("B7R2h"));
//            blok78Usaha.getB7R2i().setText(properties.getProperty("B7R2i"));
//            blok78Usaha.getB7R2j().setText(properties.getProperty("B7R2j"));
//            blok78Usaha.getB7R2k().setText(properties.getProperty("B7R2k"));
//            blok78Usaha.getB7R2l().setText(properties.getProperty("B7R2l"));
//            blok78Usaha.getB7R3().setText(properties.getProperty("B7R3"));
//            blok78Usaha.getB7R4a().setText(properties.getProperty("B7R4a"));
//            blok78Usaha.getB7R4b().setText(properties.getProperty("B7R4b"));
//            blok78Usaha.getB7R4c().setText(properties.getProperty("B7R4c"));
//            blok78Usaha.getB7R4d().setText(properties.getProperty("B7R4d"));
//            blok78Usaha.getB7R4e().setText(properties.getProperty("B7R4e"));
//            blok78Usaha.getB7R4f().setText(properties.getProperty("B7R4f"));
//            blok78Usaha.getB7R4g().setText(properties.getProperty("B7R4g"));
//            blok78Usaha.getB7R4h().setText(properties.getProperty("B7R4h"));
//            blok78Usaha.getB7R4i().setText(properties.getProperty("B7R4i"));
//            blok78Usaha.getB7R4j().setText(properties.getProperty("B7R4j"));
//            blok78Usaha.getB7R5().setText(properties.getProperty("B7R5"));
//            blok78Usaha.getB7R6().setText(properties.getProperty("B7R6"));
//            
//            //blok 8 = pertanyaan
//            blok78Usaha.getB8R1a().setText(properties.getProperty("B8R1a"));
//            blok78Usaha.getB8R1b().setText(properties.getProperty("B8R1b"));
//            blok78Usaha.getB8R1c().setText(properties.getProperty("B8R1c"));
//            blok78Usaha.getB8R1d().setText(properties.getProperty("B8R1d"));
//            blok78Usaha.getB8R1e().setText(properties.getProperty("B8R1e"));
//            blok78Usaha.getB8R1f().setText(properties.getProperty("B8R1f"));
//            blok78Usaha.getB8R2().setText(properties.getProperty("B8R2"));
//            blok78Usaha.getB8R3().setText(properties.getProperty("B8R3"));
//            blok78Usaha.getB8R4().setText(properties.getProperty("B8R4"));
//            blok78Usaha.getB8R5().setText(properties.getProperty("B8R5"));
//            blok78Usaha.getB8R6().setText(properties.getProperty("B8R6"));
//            blok78Usaha.getB8R7().setText(properties.getProperty("B8R7"));
//            blok78Usaha.getB8R8().setText(properties.getProperty("B8R8"));
            

  //          Message.infoMessage("<html><p>Success import the file <br> KKS: "+name);
        } catch (Exception ex) {
            ex.printStackTrace();
    //        Message.errorMessage("Import file failed");
        }
    }

    /**
     * Kalo yang ini untuk menulis konfigurasi databasenya
     */
    public void write() {
        String fileSeparator = System.getProperty("file.separator");
        try {
            String backupDir1 = System.getProperty("user.home") + fileSeparator + "Data-entry-pkl53";
            String folderDir = System.getProperty("user.home") + fileSeparator + "Data-entry-pkl53"+fileSeparator+"Usaha";
            
            File f = new File(backupDir1);
            File folder = new File(folderDir);
            if (!f.exists()) {
                f.mkdir();
                    if(!folder.exists()){
                        f.mkdir();
                    }
            }
            System.out.println(fileSeparator +" "+ backupDir1);
            
            String kks = getBlok123Usaha().getB1R1().getText()+
                         getBlok123Usaha().getB1R2().getText()+
                         getBlok123Usaha().getB1R3().getText()+
                         getBlok123Usaha().getB1R4().getText()+
                         getBlok123Usaha().getB1R5a().getText()+
                         getBlok123Usaha().getB1R5b().getText()+
                         getBlok123Usaha().getB1R6().getText();
            
            Properties properties = new Properties();
            
            //blok1= 9 pertanyaan
            properties.setProperty("B1R1", getBlok123Usaha().getB1R1().getText());
            properties.setProperty("B1R2", getBlok123Usaha().getB1R2().getText());
            properties.setProperty("B1R3", getBlok123Usaha().getB1R3().getText());
            properties.setProperty("B1R4", getBlok123Usaha().getB1R4().getText());
            properties.setProperty("B1R5a", getBlok123Usaha().getB1R5a().getText());
            properties.setProperty("B1R5b", getBlok123Usaha().getB1R5b().getText());
            properties.setProperty("B1R6", getBlok123Usaha().getB1R6().getText());
//            properties.setProperty("B1R7", getBlok123Usaha().getB1R7().getText());
//            properties.setProperty("B1R8", getBlok123Usaha().getB1R8().getText());
//          
            //blok2= 8 pertanyaan
//            properties.setProperty("B2C1R1", blok123Usaha.getB2C1R1().getText());
//            properties.setProperty("B2C1R2", blok123Usaha.getB2C1R2().getText());
//            properties.setProperty("B2C1R3a", blok123Usaha.getB2C1R3a().getText());
//            properties.setProperty("B2C1R3b", blok123Usaha.getB2C1R3b().getText());
//            properties.setProperty("B2C2R1", blok123Usaha.getB2C2R1().getText());
//            properties.setProperty("B2C2R2", blok123Usaha.getB2C2R2().getText());
//            properties.setProperty("B2C2R3a", blok123Usaha.getB2C2R3a().getText());
//            properties.setProperty("B2C2R3b", blok123Usaha.getB2C2R3b().getText());
            
            //BLOK 4 Belum
            
            //blok5a= 13 pertanyaan
//            properties.setProperty("B4R1a", blok123Usaha.getB2C2R3b().getText());
            
//            //blok5b= 29 pertanyaan
//            
//           
//            
//            //blok5c= 7 pertanyaan
//            properties.setProperty("B7R1", blok78Usaha.getB7R1().getText());
//            properties.setProperty("B7R2a", blok78Usaha.getB7R2a().getText());
//            properties.setProperty("B7R2b", blok78Usaha.getB7R2b().getText());
//            properties.setProperty("B7R2c", blok78Usaha.getB7R2c().getText());
//            properties.setProperty("B7R2d", blok78Usaha.getB7R2d().getText());
//            properties.setProperty("B7R2e", blok78Usaha.getB7R2e().getText());
//            properties.setProperty("B7R2f", blok78Usaha.getB7R2f().getText());
//            properties.setProperty("B7R2g", blok78Usaha.getB7R2g().getText());
//            properties.setProperty("B7R2h", blok78Usaha.getB7R2h().getText());
//            properties.setProperty("B7R2i", blok78Usaha.getB7R2i().getText());
//            properties.setProperty("B7R2j", blok78Usaha.getB7R2j().getText());
//            properties.setProperty("B7R2k", blok78Usaha.getB7R2k().getText());
//            properties.setProperty("B7R2l", blok78Usaha.getB7R2l().getText());
//            properties.setProperty("B7R3", blok78Usaha.getB7R3().getText());
//            properties.setProperty("B7R4a", blok78Usaha.getB7R4a().getText());
//            properties.setProperty("B7R4b", blok78Usaha.getB7R4b().getText());
//            properties.setProperty("B7R4c", blok78Usaha.getB7R4c().getText());
//            properties.setProperty("B7R4d", blok78Usaha.getB7R4d().getText());
//            properties.setProperty("B7R4e", blok78Usaha.getB7R4e().getText());
//            properties.setProperty("B7R4f", blok78Usaha.getB7R4f().getText());
//            properties.setProperty("B7R4g", blok78Usaha.getB7R4g().getText());
//            properties.setProperty("B7R4h", blok78Usaha.getB7R4h().getText());
//            properties.setProperty("B7R4i", blok78Usaha.getB7R4i().getText());
//            properties.setProperty("B7R4j", blok78Usaha.getB7R4j().getText());
//            properties.setProperty("B7R5", blok78Usaha.getB7R5().getText());
//            properties.setProperty("B7R6", blok78Usaha.getB7R6().getText());
//            
//            //blok5d = pertanyaan
//            properties.setProperty("B8R1a", blok78Usaha.getB8R1a().getText());
//            properties.setProperty("B8R1b", blok78Usaha.getB8R1b().getText());
//            properties.setProperty("B8R1c", blok78Usaha.getB8R1c().getText());
//            properties.setProperty("B8R1d", blok78Usaha.getB8R1d().getText());
//            properties.setProperty("B8R1e", blok78Usaha.getB8R1e().getText());
//            properties.setProperty("B8R2", blok78Usaha.getB8R2().getText());
//            properties.setProperty("B8R3", blok78Usaha.getB8R3().getText());
//            properties.setProperty("B8R4", blok78Usaha.getB8R4().getText());
//            properties.setProperty("B8R5", blok78Usaha.getB8R5().getText());
//            properties.setProperty("B8R6", blok78Usaha.getB8R6().getText());
//            properties.setProperty("B8R7", blok78Usaha.getB8R7().getText());
//            properties.setProperty("B8R8", blok78Usaha.getB8R8().getText());
//            
        


            properties.store(new FileOutputStream(backupDir1 + "/" + kks + ".p53"), kks);
//            System.out.println("BackUp Success");
        } catch (IOException ex) {
//            System.out.println("BackUp Failed");
        }
    }

    /**
     * @return the blok123Usaha
     */
    public BlokUsaha123 getBlok123Usaha() {
        return blok123Usaha;
    }

    /**
     * @param blok123Usaha the blok123Usaha to set
     */
    public void setBlok123Usaha(BlokUsaha123 blok123Usaha) {
        this.blok123Usaha = blok123Usaha;
    }

    /**
     * @return the blokUsaha4
     */
    public BlokUsaha4 getBlokUsaha4() {
        return blokUsaha4;
    }

    /**
     * @param blokUsaha4 the blokUsaha4 to set
     */
    public void setBlokUsaha4(BlokUsaha4 blokUsaha4) {
        this.blokUsaha4 = blokUsaha4;
    }

    /**
     * @return the blokUsaha5B
     */
    public BlokUsaha5B getBlokUsaha5B() {
        return blokUsaha5B;
    }

    /**
     * @param blokUsaha5B the blokUsaha5B to set
     */
    public void setBlokUsaha5B(BlokUsaha5B blokUsaha5B) {
        this.blokUsaha5B = blokUsaha5B;
    }

    /**
     * @return the blokUsaha5C
     */
    public BlokUsaha5C getBlokUsaha5C() {
        return blokUsaha5C;
    }

    /**
     * @param blokUsaha5C the blokUsaha5C to set
     */
    public void setBlokUsaha5C(BlokUsaha5C blokUsaha5C) {
        this.blokUsaha5C = blokUsaha5C;
    }

    /**
     * @return the blokUsaha5
     */
    public BlokUsaha5 getBlokUsaha5() {
        return blokUsaha5;
    }

    /**
     * @param blokUsaha5 the blokUsaha5 to set
     */
    public void setBlokUsaha5(BlokUsaha5 blokUsaha5) {
        this.blokUsaha5 = blokUsaha5;
    }

    /**
     * @return the blokUsaha5D
     */
    public BlokUsaha5D getBlokUsaha5D() {
        return blokUsaha5D;
    }

    /**
     * @param blokUsaha5D the blokUsaha5D to set
     */
    public void setBlokUsaha5D(BlokUsaha5D blokUsaha5D) {
        this.blokUsaha5D = blokUsaha5D;
    }


}
