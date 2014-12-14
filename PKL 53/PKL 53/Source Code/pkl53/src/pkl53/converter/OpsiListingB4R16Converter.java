/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiListingB4r16;
/**
 *
 * @author akhul
 */
public class OpsiListingB4R16Converter extends Converter<String, OpsiListingB4r16> {
    
    @Override
    public OpsiListingB4r16 convertForward(String s) {
        OpsiListingB4r16 b3r15e = new OpsiListingB4r16(s);
        return b3r15e;
    }

    @Override
    public String convertReverse(OpsiListingB4r16 t) {
        return t.getB4r16();
    }
    
}
