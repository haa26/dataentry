/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.B4Art;
import pkl53.model.KetRt;
import pkl53.model.OpsiB3r15e;

/**
 *
 * @author Razy
 */
public class KetRTConverter extends Converter<String, KetRt> {
    
    @Override
    public KetRt convertForward(String s) {
        KetRt b4Art = new KetRt(s);
        return b4Art;
    }

    @Override
    public String convertReverse(KetRt t) {
        return String.valueOf(t);
    }
    
}
