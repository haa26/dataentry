/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;

import pkl53.model.OpsiB4r8;

/**
 *
 * @author HP G42 (RILLA)
 */
public class OpsiB4R8Converter  extends Converter<String,OpsiB4r8>{

    @Override
    public OpsiB4r8 convertForward(String s) {
            OpsiB4r8 opsi = new OpsiB4r8(s);
            return opsi;
    }

    @Override
    public String convertReverse(OpsiB4r8 t) {
    return String.valueOf(t);
    }
}
