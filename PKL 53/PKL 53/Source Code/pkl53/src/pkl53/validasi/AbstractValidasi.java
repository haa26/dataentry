/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;

/**
 *
 * @author debi
 */
public class AbstractValidasi {

    protected List<Textfield> list;

    /*
     * Mengeset list yang akan divalidasikan
     */
    public void setListTextFields(List<Textfield> listTextFields) {
        this.list = listTextFields;
    }

    public void errorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /*
     * membuat semua field yang akan di skip menjadi not enabled
     */
    public void skipTo(List<Textfield> list, int from, int to) {
        for (int i = from; i < to; i++) {
            
            list.get(i).setEditable(true);
            list.get(i).setEnabled(false);
            list.get(i).setText(null);
            
            
        }
    }
    public void EditableTo(List<Textfield> list, int from, int to) {
         for (int i = from; i < to; i++) {
            list.get(i).setEnabled(true);
            list.get(i).setText(null);
            list.get(i).setBackground(Color.white);
        }}
    public void seTextTo(List<Textfield> list, int from, int to) {
         for (int i = from; i < to; i++) {
           
            list.get(i).setText(null);
            list.get(i).setBackground(Color.white);
        }
       
        
    }
}
