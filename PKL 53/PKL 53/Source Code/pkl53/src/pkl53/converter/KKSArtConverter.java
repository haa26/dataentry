/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.B4Art;
import pkl53.model.OpsiB3r15e;

/**
 *
 * @author Razy
 */
public class KKSArtConverter extends Converter<String, B4Art> {
    
    @Override
    public B4Art convertForward(String s) {
        B4Art b4Art = new B4Art(s);
        return b4Art;
    }

    @Override
    public String convertReverse(B4Art t) {
        return String.valueOf(t);
    }
    
}
