/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service;

import pkl51.entity.Korwil;
import pkl51.error.EntityException;

/**
 *
 * @author Hindarwan
 */
public interface KorwilDao {

    public void insertKorwil(Korwil korwil) throws EntityException;

    public void updateKorwil(Korwil korwil) throws EntityException;

    public Korwil getKorwilByNimKortim(String nim_kortim) throws EntityException;
}
