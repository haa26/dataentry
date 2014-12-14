/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiJeniskelamin;
/**
 *
 * @author akhul
 */
public class OpsiJenisKelaminConverter extends Converter<String, OpsiJeniskelamin> {
    
    @Override
    public OpsiJeniskelamin convertForward(String s) {
        OpsiJeniskelamin ojk = new OpsiJeniskelamin(s);
        return ojk;
    }

    @Override
    public String convertReverse(OpsiJeniskelamin t) {
        return t.getKodeJenisKelamin();
    }
    
}
