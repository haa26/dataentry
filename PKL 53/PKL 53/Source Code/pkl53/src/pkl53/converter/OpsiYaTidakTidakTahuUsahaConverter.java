/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiYaTidakTidaktau;

/**
 *
 * @author HP G42 (RILLA)
 */
public class OpsiYaTidakTidakTahuUsahaConverter  extends Converter<String,OpsiYaTidakTidaktau>{

        @Override
        public OpsiYaTidakTidaktau convertForward(String s) {
            OpsiYaTidakTidaktau  opsi = new OpsiYaTidakTidaktau(s);
            return opsi;
    }

        @Override
    public String convertReverse(OpsiYaTidakTidaktau t) {
    return String.valueOf(t);
    }

   
    
}
