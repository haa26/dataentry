/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiB3r15f;
/**
 *
 * @author akhul
 */
public class OpsiB3R15fConverter extends Converter<String, OpsiB3r15f> {
    
    @Override
    public OpsiB3r15f convertForward(String s) {
        OpsiB3r15f b3r15e = new OpsiB3r15f(s);
        return b3r15e;
    }

    @Override
    public String convertReverse(OpsiB3r15f t) {
        return t.getB3r15f();
    }
    
}
