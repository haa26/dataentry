/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.test;

import pkl51.entity.Blok4;
import pkl51.service.Blok4Dao;
import pkl51.service.impl.Blok4DaoImpl;
import java.sql.SQLException;
/**
 *
 * @author ERI
 */
public class TestBlok4 {
    public static void main(String[] args) throws SQLException{
        Blok4Dao dao = new Blok4DaoImpl();
        Blok4 blok4 = new Blok4("a","a","a","a",1,"a","a","a","a","a","a","a");
        Blok4 blok4a = new Blok4("a","c","c","c",1,"c","c","c","c","c","c","c");
        //dao.insertBlok4(blok4);
        //dao.updateBlok4(blok4a);
        /*Blok4 baru = dao.getBlok4ByNks("a");
        System.out.println(baru.getNKS());
        System.out.println(baru.getB4C2());
        System.out.println(baru.getB4C3());
        System.out.println(baru.getB4C4());
        System.out.println(baru.getB4C5());
        System.out.println(baru.getB4C6());
        System.out.println(baru.getB4C7());
        System.out.println(baru.getB4C8());
        System.out.println(baru.getB4C9());
        System.out.println(baru.getB4C10());
        System.out.println(baru.getB4C11());
        System.out.println(baru.getB4C12());*/
        
    }
}
