/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.test;

import pkl51.entity.Mahasiswa;
import pkl51.error.EntityException;
import pkl51.service.MahasiswaDao;
import pkl51.service.impl.MahasiswaDaoImpl;

/**
 *
 * @author Hindarwan
 */
public class TestMahasiswa {

    public static void main(String[] args) throws EntityException {
        MahasiswaDao dao = new MahasiswaDaoImpl();
        Mahasiswa pengentri = new Mahasiswa("09.6666","GASKJH", "09.6666" , 1);

        dao.insertMahasiswa(pengentri);
//        dao.updatePasswordMahasiswa(pengentri);
//        dao.deleteMahasiswa("09.6013");
//        dao.getMahasiswaByNimPassword(null, null)

//        System.out.println(pengentri.getNim());
//        System.out.println(pengentri.getNama());
//        System.out.println(pengentri.getNo_hp());
//        System.out.println(pengentri.getPassword());

    }
}
