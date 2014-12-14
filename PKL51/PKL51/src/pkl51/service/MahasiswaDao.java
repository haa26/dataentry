/*
 * PKL 51 - Subseksi Data Entry
 */

package pkl51.service;

import pkl51.entity.Mahasiswa;
import pkl51.error.EntityException;

/**
 * Yang digunakan hanya update dan get
 * @author RN Hindarwan
 */
public interface MahasiswaDao {

    public void insertMahasiswa(Mahasiswa mahasiswa) throws EntityException;

    public void updatePasswordMahasiswa(Mahasiswa mahasiswa) throws EntityException;

    public void deleteMahasiswa(String nim) throws EntityException;

    public Mahasiswa getMahasiswaByNimPassword(String nim, String password) throws EntityException;
    
}
