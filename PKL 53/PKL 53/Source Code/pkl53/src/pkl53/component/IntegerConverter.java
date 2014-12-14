/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.component;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author debi
 */
public class IntegerConverter extends Converter<String, Integer> {

    @Override
    public Integer convertForward(String arg) {
        int value;
        StringBuffer buffer = new StringBuffer();
        try {
            if (arg == null || arg.equals("")) {
                value = 0;
            } else {
                char[] cs = arg.toCharArray();
                int s = 0;
                for (int i = 0; i < cs.length; i++) {
                    if (cs[i] == ',') {
                        break;
                    }
                    if (Character.isDigit(cs[i]) && cs[i] != '.') {
                        cs[s++] = cs[i];
                    }
                }
                buffer.append(cs, 0, s);
                String nilai = new String(buffer);
                value = Integer.parseInt(nilai);
            }
            //value = (arg == null) ? 0 : Integer.parseInt(arg);
        } catch (NumberFormatException ex) {
            value = 0;
            ex.printStackTrace();
        }
        return value;
    }

    @Override
    public String convertReverse(Integer arg) {
        return String.valueOf(arg);
    }
}
