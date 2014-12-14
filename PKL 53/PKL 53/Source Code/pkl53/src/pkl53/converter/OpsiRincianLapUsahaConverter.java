/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiRincianLapUsaha;

/**
 *
 * @author akhul
 */
public class OpsiRincianLapUsahaConverter extends Converter<String, OpsiRincianLapUsaha> {
    
    @Override
    public OpsiRincianLapUsaha convertForward(String s) {
        OpsiRincianLapUsaha orlu = new OpsiRincianLapUsaha(s);
        return orlu;
    }

    @Override
    public String convertReverse(OpsiRincianLapUsaha t) {
        return t.getKode();
    }
}
