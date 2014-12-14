/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.converter;

import org.jdesktop.beansbinding.Converter;
import pkl53.model.OpsiYaDalamprosesTidakTidaktahu;

/**
 *
 * @author HP G42 (RILLA)
 */
public class OpsiYaDalamProsesTidakTidakTahuUsahaConverter  extends Converter<String,OpsiYaDalamprosesTidakTidaktahu>{

    @Override
    public OpsiYaDalamprosesTidakTidaktahu convertForward(String s) {
            OpsiYaDalamprosesTidakTidaktahu opsi = new OpsiYaDalamprosesTidakTidaktahu(s);
            return opsi;
    }

    @Override
    public String convertReverse(OpsiYaDalamprosesTidakTidaktahu t) {
    return String.valueOf(t);
    }
}
