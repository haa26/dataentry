/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiB4r3;
import pkl53.model.OpsiYaTidak;

/**
 *
 * @author HP G42 (RILLA)
 */
public class OpsiYaTidakConverter extends Converter<String,OpsiYaTidak>{

    @Override
    public OpsiYaTidak convertForward(String s) {
            OpsiYaTidak opsi = new OpsiYaTidak(s);
            return opsi;
    }

    @Override
    public String convertReverse(OpsiYaTidak t) {
    return String.valueOf(t);
    }
}
