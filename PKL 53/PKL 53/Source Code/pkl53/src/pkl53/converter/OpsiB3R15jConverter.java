/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiB3r15j;
/**
 *
 * @author akhul
 */
public class OpsiB3R15jConverter extends Converter<String, OpsiB3r15j> {
    @Override
    public OpsiB3r15j convertForward(String s) {
        OpsiB3r15j b3r15e = new OpsiB3r15j(s);
        return b3r15e;
    }

    @Override
    public String convertReverse(OpsiB3r15j t) {
        return t.getB3r15j();
    }
    
}
