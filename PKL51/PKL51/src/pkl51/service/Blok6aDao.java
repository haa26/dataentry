/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl51.service;

import pkl51.entity.Blok6a;
import pkl51.error.EntityException;

/**
 *
 * @author thiolutfi
 */
public interface Blok6aDao {

    public void insertBlok6a(Blok6a blok6a) throws EntityException;
    public void updateBlok6a(Blok6a blok6a) throws EntityException;
    public Blok6a getBlok6aByNKS(String NKS) throws EntityException;

}
