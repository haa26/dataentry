/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author debi
 */
public class DateConverter extends Converter<String, Date>{

    @Override
    public Date convertForward(String arg) {
        Date date;
        try{
            if(arg == null){
                date= null;
            }
            else{
                String stringDate = "2014-04-"+arg;
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
