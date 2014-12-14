/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service;

import pkl51.entity.Pencacah;
import pkl51.error.EntityException;

/**
 *
 * @author Hindarwan
 */
public interface PencacahDao {
    public void insertPencacah(Pencacah pencacah) throws EntityException;
    public void updatePencacah(Pencacah pencacah) throws EntityException;
    public Pencacah getPencacahByNimPencacah(String nim_pencacah) throws EntityException;
}
