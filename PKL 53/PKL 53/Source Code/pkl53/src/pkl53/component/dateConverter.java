/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.component;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author HP G42 (RILLA)
 */

    public class dateConverter extends Converter<String, Date>{

    @Override
    public Date convertForward(String arg) {
        Date date;
        try{
            if(arg == null){
                date= null;
            }
            else{
                String stringDate = "2013-03-"+arg;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                date = dateFormat.parse(stringDate);
            }
        }catch(Exception e){
            date = null;
        }
        return date;
    }

    @Override
    public String convertReverse(Date value) {
        return String.valueOf(value);
    }
    }
    

