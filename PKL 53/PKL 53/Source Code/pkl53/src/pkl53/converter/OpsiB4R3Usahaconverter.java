/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;


import pkl53.model.OpsiB4r3;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author HP G42 (RILLA)
 */
public class OpsiB4R3Usahaconverter extends Converter<String,OpsiB4r3>{

    @Override
    public OpsiB4r3 convertForward(String s) {
            OpsiB4r3 opsi = new OpsiB4r3(s);
            return opsi;
    }

    @Override
    public String convertReverse(OpsiB4r3 t) {
    return String.valueOf(t);
    }
    
}
