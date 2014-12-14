/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.test;

import pkl51.entity.Blok5;
import pkl51.service.Blok5Dao;
import pkl51.service.impl.Blok5DaoImpl;
import java.sql.SQLException;
/**
 *
 * @author ERI
 */
public class TestBlok5 {
    public static void main(String[] args) throws SQLException{
        Blok5Dao dao = new Blok5DaoImpl();
        Blok5 blok5 = new Blok5("a","a","a","a",1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        Blok5 blok5a = new Blok5("a","b","b","b",11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11);
        //dao.insertBlok5(blok5);
        //dao.updateBlok5(blok5a);
        /*Blok5 baru = dao.getBlok5ByNks("a");
        System.out.println(baru.getNKS());
        System.out.println(baru.getB5R1a());
        System.out.println(baru.getB5R1b());
        System.out.println(baru.getB5R1c());
        System.out.println(baru.getB5R2ia());
        System.out.println(baru.getB5R2ib());
        System.out.println(baru.getB5R2ic());
        System.out.println(baru.getB5R2id());
        System.out.println(baru.getB5R2ie());
        System.out.println(baru.getB5R2iia());
        System.out.println(baru.getB5R2iib());
        System.out.println(baru.getB5R2iic());
        System.out.println(baru.getB5R2iid());
        System.out.println(baru.getB5R2iie());
        System.out.println(baru.getB5R2iif());
        System.out.println(baru.getB5R2iig());
        System.out.println(baru.getB5R2iih());
        System.out.println(baru.getB5R2iiia());
        System.out.println(baru.getB5R2iiib());
        System.out.println(baru.getB5R2iiic());
        System.out.println(baru.getB5R2iiid());
        */
    }
}
