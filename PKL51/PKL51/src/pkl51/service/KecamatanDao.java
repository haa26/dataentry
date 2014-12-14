/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service;

import pkl51.entity.Kecamatan;
import pkl51.error.EntityException;

/**
 *
 * @author Hindarwan
 */
public interface KecamatanDao {
    public void insertKecamatan(Kecamatan kecamatan) throws EntityException;
    public void updateKecamatan(Kecamatan kecamatan) throws EntityException;
    public Kecamatan getKecamatanByKodeKec(String kode_kec) throws EntityException;
}
