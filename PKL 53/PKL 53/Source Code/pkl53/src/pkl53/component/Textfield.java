/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.component;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import pkl53.validasi.Validator;
import pkl53.view.Blok4Listing;
import pkl53.view.DataEntriPekerjaanPanel;
import pkl53.view.EntriListing;

/**
 *
 * @author User
 */
public class Textfield extends JFormattedTextField implements Serializable {

    private JPanel panel;
    private boolean blok4PU;
    private boolean blok4Listing;
    private int length;
    private char charType;
    private char minDigit;
    private char maxDigit;
    private boolean valid;
    private Color color;
    private JTextField textfield;
    private boolean textfieldKhusus;
    private JTextField textfieldSkipTo;
    private boolean fieldValidasi;
    private boolean nextType;
    private Validator validator;
    private boolean required;
    private boolean tab;
    private IntegerConverter intconvert =  new IntegerConverter();

    public Textfield() {

        this.setTab(true);
        this.setCharType('1');
        setMaxDigit('9');
        setMinDigit('0');
        this.setHorizontalAlignment(CENTER);
        setLength(1);
        this.setBackground(new Color(255, 255, 255));
        setFocusTraversalKeysEnabled(false);
        setText("1");
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {

                if (isBlok4Listing()) {
                    Component focused = evt.getComponent();

                    getPanel().scrollRectToVisible(new Rectangle(focused.getBounds().x + 100, focused.getBounds().y + 100, focused.getBounds().width, focused.getBounds().height));
                    EntriListing.getjScrollPane1().getHorizontalScrollBar().setValue(evt.getComponent().getBounds().x - 150);

                    System.out.println(evt.getComponent());

                    repaint();

                } else if (isBlok4PU()) {
                    Component focused = evt.getComponent();
                    focused.setBounds(focused.getBounds().x + 200, focused.getBounds().y + 200, focused.getBounds().width, focused.getBounds().height);
                    getPanel().scrollRectToVisible(focused.getBounds());

                } else {
                    Component focused = evt.getComponent();
                    focused.setBounds(focused.getBounds().x-100, focused.getBounds().y+200, focused.getBounds().width, focused.getBounds().height);
                    getPanel().scrollRectToVisible(focused.getBounds());
                    if(isTextfieldKhusus()){
                        DataEntriPekerjaanPanel.getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                    
                    }

                    repaint();
                }
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //proses validasi dijalankan ketika tombol enter/tab/panah bawah/panah kanan ditekan.
                Textfield.this.setBackground(new Color(255, 255, 255));
                if (isTab()) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN
                            || e.getKeyCode() == KeyEvent.VK_TAB) {
                        valid =  validator.onCheckValue(Textfield.this);

//                        if (isValid() && isFieldValidasi()) {
//                            boolean a = Blok4Listing.CekERoorB4r24();
//                            boolean b = Blok4Listing.CekERoorB4r30();
//                            
//                            Textfield.this.setBackground(new Color(55, 155, 255));
//                            Textfield.this.transferFocus();
//                            
//                            
//                            
//                            
//                            if (a == true && b == true) {
//                                boolean c = validator.onCheck(Textfield.this);
//                                JOptionPane.showConfirmDialog(null,"Tambah Bangunan Fisik??"+c);
//                                if(c){
//                                int x = JOptionPane.showConfirmDialog(null,"Tambah Bangunan Fisik??","confirm",JOptionPane.YES_NO_OPTION);
//                                if(x==JOptionPane.YES_OPTION)
//                                    Blok4Listing.addNewLoop();
//                                
//                                }
//                            }    
//                            
//                        } else 
                        if (isValid()) {
                            if (isNextType()) {
                                Textfield.this.setBackground(new Color(55, 155, 255));
                                getTextfield().grabFocus();
                              

                            } else {
                                Textfield.this.setBackground(new Color(55, 155, 255));
                                Textfield.this.transferFocus();

                            }
                        } else {
                            Textfield.this.setBackground(new Color(251, 64, 64));//warna merah
                            Textfield.this.requestFocusInWindow();

                        }

//                        if ("".equals(Textfield.this.getText().trim())) {
//                            if (isRequired()) {
//
//                                Textfield.this.setBackground(new Color(251, 64, 64));
//                                JOptionPane.showMessageDialog(null, "Field must not be empty!");
//                                Textfield.this.requestFocusInWindow();
//
//                            }
//                        } else {//seting validator from propertises
//                            Textfield.this.setBackground(new Color(55, 155, 255));
//                            Textfield.this.transferFocus();
//                        }
                    

                }
            }}

//            @Override
//            public void keyReleased(KeyEvent e) {
//                if (Textfield.this.getText().length() == getLength()) {
//                    valid = validator.onCheckValue(Textfield.this);
//
//                    if (isValid()) {
//                        if (isNextType()) {
//                            Textfield.this.setBackground(new Color(55, 155, 255));
//                            getTextfield().grabFocus();
//
//                        } else {
//                            Textfield.this.setBackground(new Color(55, 155, 255));
//                            Textfield.this.transferFocus();
//
//                        }
//                    } else {
//                        Textfield.this.setBackground(new Color(251, 64, 64));//warna merah
//                        Textfield.this.requestFocusInWindow();
//
//                    }
//                }
//            }
        }
        );

        setDocument(
                new PlainDocument() {

                    @Override
                    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                        StringBuffer buffer = new StringBuffer();
                        char[] cs = str.toCharArray();
                        int s = 0;
                        if (Textfield.this.getText().length() < length) {
                            for (int i = 0; i < cs.length; i++) {
                                //digit yang bisa diatur angka berapa aja yang boleh
                                //bisa untuk uang juga
                                if (charType == '1') {
                                    if (cs[i] >= minDigit && cs[i] <= maxDigit) {
                                        cs[s] = cs[i];
                                        s++;
                                    }
                                    //just karakter
                                } else if (charType == '2') {
                                    if (Character.isDigit(cs[i]) || Character.isLetter(cs[i]) || cs[i] == ' ' || cs[i] == ',' || cs[i] == '(' || cs[i] == ')' || cs[i] == '.' || cs[i] == '-' || cs[i] == '\'') {
                                        cs[s] = Character.toUpperCase(cs[i]);
                                        s++;
                                    }
                                } //untuk nim
                                else if (charType == '3') {
                                    if (Character.isDigit(cs[i])) {
                                        cs[s] = cs[i];
                                        s++;
                                    } else if (cs[i] == '.' && !Textfield.this.getText().contains(".")) {
                                        cs[s] = cs[i];
                                        s++;
                                    }
                                } else {
                                    cs[s] = cs[i];
                                    s++;

                                }

                            }
                            buffer.append(cs, 0, s);

                        }
                        super.insertString(offs, new String(buffer), a);

                    }

                });
    }

    public void setPropertiesTextField() {
        
        this.setEditable(true);
        this.setBackground(new Color(55, 155, 255));
    }
    public void setPropertiesTextFieldfOCUSNo() {
        this.setFocusable(false);
        this.setEditable(true);
        this.setBackground(new Color(55, 155, 255));
    }

    public void setTextNew(String s) {
        this.setText(s);
    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the charType
     */
    public char getCharType() {
        return charType;
    }

    /**
     * @param charType the charType to set
     */
    public void setCharType(char charType) {
        this.charType = charType;
    }

    /**
     * @return the minDigit
     */
    public char getMinDigit() {
        return minDigit;
    }

    /**
     * @param minDigit the minDigit to set
     */
    public void setMinDigit(char minDigit) {
        this.minDigit = minDigit;
    }

    /**
     * @return the maxDigit
     */
    public char getMaxDigit() {
        return maxDigit;
    }

    /**
     * @param maxDigit the maxDigit to set
     */
    public void setMaxDigit(char maxDigit) {
        this.maxDigit = maxDigit;
    }

    /**
     * @return the valid
     */
    @Override
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the textfield
     */
    public JTextField getTextfield() {
        return textfield;
    }

    /**
     * @param textfield the textfield to set
     */
    public void setTextfield(JTextField textfield) {
        this.textfield = textfield;
    }

    /**
     * @return the nextType
     */
    public boolean isNextType() {
        return nextType;
    }

    /**
     * @param nextType the nextType to set
     */
    public void setNextType(boolean nextType) {
        this.nextType = nextType;
    }

    /**
     * @return the validator
     */
    public Validator getValidator() {
        return validator;
    }

    /**
     * @param validator the validator to set
     */
    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    /**
     * @return the required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * @return the blok4PU
     */
    public boolean isBlok4PU() {
        return blok4PU;
    }

    /**
     * @param blok4PU the blok4PU to set
     */
    public void setBlok4PU(boolean blok4PU) {
        this.blok4PU = blok4PU;
    }

    /**
     * @return the blok4Listing
     */
    public boolean isBlok4Listing() {
        return blok4Listing;
    }

    /**
     * @param blok4Listing the blok4Listing to set
     */
    public void setBlok4Listing(boolean blok4Listing) {
        this.blok4Listing = blok4Listing;
    }

    /**
     * @return the tab
     */
    public boolean isTab() {
        return tab;
    }

    /**
     * @param tab the tab to set
     */
    public void setTab(boolean tab) {
        this.tab = tab;
    }


    /**
     * @return the fieldValidasi
     */
    public boolean isFieldValidasi() {
        return fieldValidasi;
    }

    /**
     * @param fieldValidasi the fieldValidasi to set
     */
    public void setFieldValidasi(boolean fieldValidasi) {
        this.fieldValidasi = fieldValidasi;
    }

    /**
     * @return the textfieldKhusus
     */
    public boolean isTextfieldKhusus() {
        return textfieldKhusus;
    }

    /**
     * @param textfieldKhusus the textfieldKhusus to set
     */
    public void setTextfieldKhusus(boolean textfieldKhusus) {
        this.textfieldKhusus = textfieldKhusus;
    }

    /**
     * @return the textfieldSkipTo
     */
    public JTextField getTextfieldSkipTo() {
        return textfieldSkipTo;
    }

    /**
     * @param textfieldSkipTo the textfieldSkipTo to set
     */
    public void setTextfieldSkipTo(JTextField textfieldSkipTo) {
        this.textfieldSkipTo = textfieldSkipTo;
    }


}
