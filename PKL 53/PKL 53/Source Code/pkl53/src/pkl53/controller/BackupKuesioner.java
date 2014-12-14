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
import pkl53.view.Blok123;
import pkl53.view.Blok4;
import pkl53.view.Blok4B;
import pkl53.view.Blok56;
import pkl53.view.Blok56B;
import pkl53.view.Blok789;
import pkl53.view.DataEntriPekerjaanPanel;
import pkl53.view.HomePanel;

/**
 *
 * @author akhul
 */
public class BackupKuesioner {

    private static Blok123 blok123;
    private static Blok4 blok4;
    private static Blok4B blok4b;
    private static Blok56 blok56;
    private static Blok56B blok67;
    private static Blok789 blok89;
   
    /**
     * Untuk membaca database.properties yang berisi konfigurasi koneksi
     * database
     */
    public static void read() {
    }

    /**
     * Kalo yang ini untuk menulis konfigurasi databasenya
     */
    public static void write() {
    }

    /**
     * @param aBlok123 the blok123 to set
     */
    public static void setBlok123(Blok123 aBlok123) {
        blok123 = aBlok123;
    }

    /**
     * @param aBlok4 the blok4 to set
     */
    public static void setBlok4(Blok4 aBlok4) {
        blok4 = aBlok4;
    }

    /**
     * @param aBlok56 the blok56 to set
     */
    public static void setBlok56(Blok56 aBlok56) {
        blok56 = aBlok56;
    }

    


}
