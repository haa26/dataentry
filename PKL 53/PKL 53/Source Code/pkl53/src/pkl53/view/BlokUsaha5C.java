/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view;

import java.util.ArrayList;
import java.util.List;
import pkl53.component.Textfield;
import pkl53.validasi.UsahaBlok5CValidasi;

/**
 *
 * @author lele
 */
public class BlokUsaha5C extends javax.swing.JPanel {

   private ArrayList<Textfield> listTextFieldBlokUsaha5c = new ArrayList<Textfield>();
    /**
     * Creates new form blok123
     */
    public BlokUsaha5C() {
        initComponents();
        addListTextfield();
        UsahaBlok5CValidasi val = new UsahaBlok5CValidasi();
        
        
        val.setPanelUsahaBlok5C(this);
        val.setList5CUsaha();
        val.registerValidasi();
    }
    
    public List<Textfield> getListTextFieldBlokUsaha5c() {
        return listTextFieldBlokUsaha5c;
    }
    
     public void addListTextfield() {
         //42 textfield
         listTextFieldBlokUsaha5c.add(B5R18A);
         listTextFieldBlokUsaha5c.add(B5R18B_LAKI);
         listTextFieldBlokUsaha5c.add(B5R18B_PR);
         listTextFieldBlokUsaha5c.add(B5R19_UTAMA);
         listTextFieldBlokUsaha5c.add(B5R19_LAIN);
         listTextFieldBlokUsaha5c.add(B5R19_LL);
         listTextFieldBlokUsaha5c.add(B5R20A);
         listTextFieldBlokUsaha5c.add(B5R20B);
         listTextFieldBlokUsaha5c.add(B5R21);
         listTextFieldBlokUsaha5c.add(B5R21Lainnya);
         listTextFieldBlokUsaha5c.add(B5R22A);
         listTextFieldBlokUsaha5c.add(B5R22A);
         listTextFieldBlokUsaha5c.add(B5R22B);
         listTextFieldBlokUsaha5c.add(B5R22BLainnya);
         listTextFieldBlokUsaha5c.add(B5R22C);
         listTextFieldBlokUsaha5c.add(B5R22D);
         listTextFieldBlokUsaha5c.add(B5R22D_LAIN);
         listTextFieldBlokUsaha5c.add(B5R22E);
         listTextFieldBlokUsaha5c.add(B5R22F);
         listTextFieldBlokUsaha5c.add(B5R22FLainnya);
         listTextFieldBlokUsaha5c.add(B5R22G1);
         listTextFieldBlokUsaha5c.add(B5R22G2);
         listTextFieldBlokUsaha5c.add(B5R22G3);
         listTextFieldBlokUsaha5c.add(B5R22G4);
         listTextFieldBlokUsaha5c.add(B5R22G5);
         listTextFieldBlokUsaha5c.add(B5R22G6);
         listTextFieldBlokUsaha5c.add(B5R22G7);
         listTextFieldBlokUsaha5c.add(B5R22G8);
         listTextFieldBlokUsaha5c.add(B5R22G9_LAIN);
         listTextFieldBlokUsaha5c.add(B5R23A);
         listTextFieldBlokUsaha5c.add(B5R23B1);
         listTextFieldBlokUsaha5c.add(B5R23B2);
         listTextFieldBlokUsaha5c.add(B5R23B3);
         listTextFieldBlokUsaha5c.add(B5R23B4);
         listTextFieldBlokUsaha5c.add(B5R23B5);
         listTextFieldBlokUsaha5c.add(B5R23B6);
         listTextFieldBlokUsaha5c.add(B5R23B7);
         listTextFieldBlokUsaha5c.add(B5R23B8);
         listTextFieldBlokUsaha5c.add(B5R23B9);
         listTextFieldBlokUsaha5c.add(B5R23B9);
         listTextFieldBlokUsaha5c.add(B5R23B10);
         listTextFieldBlokUsaha5c.add(B5R23B13_LAIN);

       
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        b3RinciusahaTambahan1 = new pkl53.model.tambahan.B3RinciusahaTambahan();
        blok5deUsaha1 = new pkl53.imageClass.BlokUsaha5C();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        B5R18A = new pkl53.component.Textfield();
        B5R18B_LAKI = new pkl53.component.Textfield();
        B5R18B_PR = new pkl53.component.Textfield();
        B5R19_UTAMA = new pkl53.component.Textfield();
        B5R19_LAIN = new pkl53.component.Textfield();
        B5R19_LL = new pkl53.component.Textfield();
        B5R20A = new pkl53.component.Textfield();
        B5R20B = new pkl53.component.Textfield();
        B5R21 = new pkl53.component.Textfield();
        B5R22A = new pkl53.component.Textfield();
        B5R22B = new pkl53.component.Textfield();
        B5R22C = new pkl53.component.Textfield();
        B5R22D = new pkl53.component.Textfield();
        B5R22D_LAIN = new pkl53.component.Textfield();
        B5R22E = new pkl53.component.Textfield();
        B5R22F = new pkl53.component.Textfield();
        B5R22G1 = new pkl53.component.Textfield();
        B5R22G2 = new pkl53.component.Textfield();
        B5R22G3 = new pkl53.component.Textfield();
        B5R22G4 = new pkl53.component.Textfield();
        B5R22G5 = new pkl53.component.Textfield();
        B5R22G6 = new pkl53.component.Textfield();
        B5R22G7 = new pkl53.component.Textfield();
        B5R22G8 = new pkl53.component.Textfield();
        B5R22G9_LAIN = new pkl53.component.Textfield();
        B5R23A = new pkl53.component.Textfield();
        B5R23B1 = new pkl53.component.Textfield();
        B5R23B2 = new pkl53.component.Textfield();
        B5R23B3 = new pkl53.component.Textfield();
        B5R23B4 = new pkl53.component.Textfield();
        B5R23B5 = new pkl53.component.Textfield();
        B5R23B6 = new pkl53.component.Textfield();
        B5R23B7 = new pkl53.component.Textfield();
        B5R23B8 = new pkl53.component.Textfield();
        B5R23B9 = new pkl53.component.Textfield();
        B5R23B10 = new pkl53.component.Textfield();
        B5R23B11 = new pkl53.component.Textfield();
        B5R23B13_LAIN = new pkl53.component.Textfield();
        B5R21Lainnya = new pkl53.component.Textfield();
        B5R22BLainnya = new pkl53.component.Textfield();
        B5R22FLainnya = new pkl53.component.Textfield();
        B5R23ALainnya = new pkl53.component.Textfield();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R18A, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R18A"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R18B_LAKI, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R18B_LAKI"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R18B_PR, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R18B_PR"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R19_LAIN, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R19_LAIN"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R19_LL, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R19_LL"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R19_UTAMA, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R19_UTAMA"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R20A, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R20A"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R20B, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R20B"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R21, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R21"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R21Lainnya, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R21Lainnya"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22A, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22A"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22B, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22B"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22BLainnya, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22BLainnya"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22C, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22C"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22D, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22D"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22D_LAIN, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22D_LAIN"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22E, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22E"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22F, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22F"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22FLainnya, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22FLainnya"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G1, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G2, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G3, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G3"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G4, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G4"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G5, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G5"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G6, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G6"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G7, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G7"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G8, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G8"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R22G9_LAIN, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R22G9_LAIN"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23A, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23A"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23ALainnya, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23ALainnya"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B1, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B10, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B10"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B11, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B11"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B13_LAIN, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B13_LAIN"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B2, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B3, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B3"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B4, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B4"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B5, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B5"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B6, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B6"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B7, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B7"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B8, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B8"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B5R23B9, org.jdesktop.beansbinding.ELProperty.create("${text}"), b3RinciusahaTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b5R23B9"));
        bindingGroup.addBinding(binding);

        setPreferredSize(new java.awt.Dimension(1070, 1381));
        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B5R18A.setNextType(true);
        B5R18A.setPanel(blok5deUsaha1);
        B5R18A.setTextfield(B5R18B_LAKI);
        B5R18A.setTextfieldKhusus(true);
        jLayeredPane1.add(B5R18A, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 30, 30));

        B5R18B_LAKI.setNextType(true);
        B5R18B_LAKI.setPanel(blok5deUsaha1);
        B5R18B_LAKI.setTextfield(B5R18B_PR);
        jLayeredPane1.add(B5R18B_LAKI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 30, 30));

        B5R18B_PR.setNextType(true);
        B5R18B_PR.setPanel(blok5deUsaha1);
        B5R18B_PR.setTextfield(B5R19_UTAMA);
        jLayeredPane1.add(B5R18B_PR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 30, 30));

        B5R19_UTAMA.setNextType(true);
        B5R19_UTAMA.setPanel(blok5deUsaha1);
        B5R19_UTAMA.setTextfield(B5R19_LAIN);
        jLayeredPane1.add(B5R19_UTAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 30, 30));

        B5R19_LAIN.setNextType(true);
        B5R19_LAIN.setPanel(blok5deUsaha1);
        B5R19_LAIN.setTextfield(B5R19_LL);
        jLayeredPane1.add(B5R19_LAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 30, 30));

        B5R19_LL.setCharType('2');
        B5R19_LL.setLength(30);
        B5R19_LL.setNextType(true);
        B5R19_LL.setPanel(blok5deUsaha1);
        B5R19_LL.setTextfield(B5R20A);
        jLayeredPane1.add(B5R19_LL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 525, 200, 25));

        B5R20A.setNextType(true);
        B5R20A.setPanel(blok5deUsaha1);
        B5R20A.setTextfield(B5R20B);
        jLayeredPane1.add(B5R20A, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 30, 30));

        B5R20B.setNextType(true);
        B5R20B.setPanel(blok5deUsaha1);
        B5R20B.setTextfield(B5R21);
        jLayeredPane1.add(B5R20B, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 30, 30));

        B5R21.setNextType(true);
        B5R21.setPanel(blok5deUsaha1);
        B5R21.setTextfield(B5R21Lainnya);
        jLayeredPane1.add(B5R21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 800, 30, 30));

        B5R22A.setNextType(true);
        B5R22A.setPanel(blok5deUsaha1);
        B5R22A.setTextfield(B5R22B);
        jLayeredPane1.add(B5R22A, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1070, 30, 30));

        B5R22B.setNextType(true);
        B5R22B.setPanel(blok5deUsaha1);
        B5R22B.setTextfield(B5R22BLainnya);
        jLayeredPane1.add(B5R22B, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1170, 30, 30));

        B5R22C.setNextType(true);
        B5R22C.setPanel(blok5deUsaha1);
        B5R22C.setTextfield(B5R22D);
        jLayeredPane1.add(B5R22C, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1370, 30, 30));

        B5R22D.setNextType(true);
        B5R22D.setPanel(blok5deUsaha1);
        B5R22D.setTextfield(B5R22D_LAIN);
        B5R22D.setTextfieldKhusus(true);
        jLayeredPane1.add(B5R22D, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 30, 30));

        B5R22D_LAIN.setCharType('2');
        B5R22D_LAIN.setLength(30);
        B5R22D_LAIN.setNextType(true);
        B5R22D_LAIN.setPanel(blok5deUsaha1);
        B5R22D_LAIN.setTextfield(B5R22E);
        jLayeredPane1.add(B5R22D_LAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 310, 230, 25));

        B5R22E.setNextType(true);
        B5R22E.setPanel(blok5deUsaha1);
        B5R22E.setTextfield(B5R22F);
        jLayeredPane1.add(B5R22E, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 30, 30));

        B5R22F.setNextType(true);
        B5R22F.setPanel(blok5deUsaha1);
        B5R22F.setTextfield(B5R22FLainnya);
        jLayeredPane1.add(B5R22F, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 30, 30));

        B5R22G1.setNextType(true);
        B5R22G1.setPanel(blok5deUsaha1);
        B5R22G1.setTextfield(B5R22G2);
        jLayeredPane1.add(B5R22G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 30, -1));

        B5R22G2.setNextType(true);
        B5R22G2.setPanel(blok5deUsaha1);
        B5R22G2.setTextfield(B5R22G3);
        jLayeredPane1.add(B5R22G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 680, 30, -1));

        B5R22G3.setNextType(true);
        B5R22G3.setPanel(blok5deUsaha1);
        B5R22G3.setTextfield(B5R22G4);
        jLayeredPane1.add(B5R22G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 700, 30, -1));

        B5R22G4.setNextType(true);
        B5R22G4.setPanel(blok5deUsaha1);
        B5R22G4.setTextfield(B5R22G5);
        jLayeredPane1.add(B5R22G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 720, 30, -1));

        B5R22G5.setNextType(true);
        B5R22G5.setPanel(blok5deUsaha1);
        B5R22G5.setTextfield(B5R22G6);
        jLayeredPane1.add(B5R22G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 740, 30, -1));

        B5R22G6.setNextType(true);
        B5R22G6.setPanel(blok5deUsaha1);
        B5R22G6.setTextfield(B5R22G7);
        jLayeredPane1.add(B5R22G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 760, 30, -1));

        B5R22G7.setNextType(true);
        B5R22G7.setPanel(blok5deUsaha1);
        B5R22G7.setTextfield(B5R22G8);
        jLayeredPane1.add(B5R22G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 780, 30, -1));

        B5R22G8.setNextType(true);
        B5R22G8.setPanel(blok5deUsaha1);
        B5R22G8.setTextfield(B5R22G9_LAIN);
        jLayeredPane1.add(B5R22G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 810, 30, -1));

        B5R22G9_LAIN.setCharType('2');
        B5R22G9_LAIN.setLength(30);
        B5R22G9_LAIN.setNextType(true);
        B5R22G9_LAIN.setPanel(blok5deUsaha1);
        B5R22G9_LAIN.setTextfield(B5R23A);
        jLayeredPane1.add(B5R22G9_LAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 830, 180, -1));

        B5R23A.setNextType(true);
        B5R23A.setPanel(blok5deUsaha1);
        B5R23A.setTextfield(B5R23ALainnya);
        jLayeredPane1.add(B5R23A, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 910, 30, 30));

        B5R23B1.setNextType(true);
        B5R23B1.setPanel(blok5deUsaha1);
        B5R23B1.setTextfield(B5R23B2);
        B5R23B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5R23B1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(B5R23B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1115, 30, 25));

        B5R23B2.setNextType(true);
        B5R23B2.setPanel(blok5deUsaha1);
        B5R23B2.setTextfield(B5R23B3);
        jLayeredPane1.add(B5R23B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1140, 30, 25));

        B5R23B3.setNextType(true);
        B5R23B3.setPanel(blok5deUsaha1);
        B5R23B3.setTextfield(B5R23B4);
        jLayeredPane1.add(B5R23B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1165, 30, 25));

        B5R23B4.setNextType(true);
        B5R23B4.setPanel(blok5deUsaha1);
        B5R23B4.setTextfield(B5R23B5);
        jLayeredPane1.add(B5R23B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1190, 30, 25));

        B5R23B5.setNextType(true);
        B5R23B5.setPanel(blok5deUsaha1);
        B5R23B5.setTextfield(B5R23B6);
        jLayeredPane1.add(B5R23B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1220, 30, 25));

        B5R23B6.setNextType(true);
        B5R23B6.setPanel(blok5deUsaha1);
        B5R23B6.setTextfield(B5R23B7);
        jLayeredPane1.add(B5R23B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1245, 30, 25));

        B5R23B7.setNextType(true);
        B5R23B7.setPanel(blok5deUsaha1);
        B5R23B7.setTextfield(B5R23B8);
        jLayeredPane1.add(B5R23B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1270, 30, 25));

        B5R23B8.setNextType(true);
        B5R23B8.setPanel(blok5deUsaha1);
        B5R23B8.setTextfield(B5R23B9);
        jLayeredPane1.add(B5R23B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1295, 30, 25));

        B5R23B9.setNextType(true);
        B5R23B9.setPanel(blok5deUsaha1);
        B5R23B9.setTextfield(B5R23B10);
        jLayeredPane1.add(B5R23B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1325, 30, 25));

        B5R23B10.setNextType(true);
        B5R23B10.setPanel(blok5deUsaha1);
        B5R23B10.setTextfield(B5R23B11);
        jLayeredPane1.add(B5R23B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1355, 30, 25));

        B5R23B11.setNextType(true);
        B5R23B11.setPanel(blok5deUsaha1);
        B5R23B11.setTextfield(B5R23B13_LAIN);
        jLayeredPane1.add(B5R23B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1390, 30, 25));

        B5R23B13_LAIN.setCharType('2');
        B5R23B13_LAIN.setLength(30);
        B5R23B13_LAIN.setPanel(blok5deUsaha1);
        jLayeredPane1.add(B5R23B13_LAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1405, 190, 25));

        B5R21Lainnya.setCharType('2');
        B5R21Lainnya.setLength(30);
        B5R21Lainnya.setNextType(true);
        B5R21Lainnya.setPanel(blok5deUsaha1);
        B5R21Lainnya.setTextfield(B5R22A);
        jLayeredPane1.add(B5R21Lainnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 970, 270, 25));

        B5R22BLainnya.setCharType('2');
        B5R22BLainnya.setLength(30);
        B5R22BLainnya.setNextType(true);
        B5R22BLainnya.setPanel(blok5deUsaha1);
        B5R22BLainnya.setTextfield(B5R22C);
        jLayeredPane1.add(B5R22BLainnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1290, 250, 25));

        B5R22FLainnya.setCharType('2');
        B5R22FLainnya.setLength(30);
        B5R22FLainnya.setNextType(true);
        B5R22FLainnya.setPanel(blok5deUsaha1);
        B5R22FLainnya.setTextfield(B5R22G1);
        jLayeredPane1.add(B5R22FLainnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 250, 25));

        B5R23ALainnya.setCharType('2');
        B5R23ALainnya.setLength(30);
        B5R23ALainnya.setNextType(true);
        B5R23ALainnya.setPanel(blok5deUsaha1);
        B5R23ALainnya.setTextfield(B5R23B1);
        jLayeredPane1.add(B5R23ALainnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1030, 260, 30));

        javax.swing.GroupLayout blok5deUsaha1Layout = new javax.swing.GroupLayout(blok5deUsaha1);
        blok5deUsaha1.setLayout(blok5deUsaha1Layout);
        blok5deUsaha1Layout.setHorizontalGroup(
            blok5deUsaha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        blok5deUsaha1Layout.setVerticalGroup(
            blok5deUsaha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok5deUsaha1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(blok5deUsaha1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void B5R23B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5R23B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B5R23B1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static pkl53.component.Textfield B5R18A;
    private pkl53.component.Textfield B5R18B_LAKI;
    private pkl53.component.Textfield B5R18B_PR;
    private pkl53.component.Textfield B5R19_LAIN;
    private pkl53.component.Textfield B5R19_LL;
    private pkl53.component.Textfield B5R19_UTAMA;
    private pkl53.component.Textfield B5R20A;
    private pkl53.component.Textfield B5R20B;
    private pkl53.component.Textfield B5R21;
    private pkl53.component.Textfield B5R21Lainnya;
    private pkl53.component.Textfield B5R22A;
    private pkl53.component.Textfield B5R22B;
    private pkl53.component.Textfield B5R22BLainnya;
    private pkl53.component.Textfield B5R22C;
    private pkl53.component.Textfield B5R22D;
    private pkl53.component.Textfield B5R22D_LAIN;
    private pkl53.component.Textfield B5R22E;
    private pkl53.component.Textfield B5R22F;
    private pkl53.component.Textfield B5R22FLainnya;
    private pkl53.component.Textfield B5R22G1;
    private pkl53.component.Textfield B5R22G2;
    private pkl53.component.Textfield B5R22G3;
    private pkl53.component.Textfield B5R22G4;
    private pkl53.component.Textfield B5R22G5;
    private pkl53.component.Textfield B5R22G6;
    private pkl53.component.Textfield B5R22G7;
    private pkl53.component.Textfield B5R22G8;
    private pkl53.component.Textfield B5R22G9_LAIN;
    private pkl53.component.Textfield B5R23A;
    private pkl53.component.Textfield B5R23ALainnya;
    private pkl53.component.Textfield B5R23B1;
    private pkl53.component.Textfield B5R23B10;
    private pkl53.component.Textfield B5R23B11;
    private pkl53.component.Textfield B5R23B13_LAIN;
    private pkl53.component.Textfield B5R23B2;
    private pkl53.component.Textfield B5R23B3;
    private pkl53.component.Textfield B5R23B4;
    private pkl53.component.Textfield B5R23B5;
    private pkl53.component.Textfield B5R23B6;
    private pkl53.component.Textfield B5R23B7;
    private pkl53.component.Textfield B5R23B8;
    private pkl53.component.Textfield B5R23B9;
    private pkl53.model.tambahan.B3RinciusahaTambahan b3RinciusahaTambahan1;
    private pkl53.imageClass.BlokUsaha5C blok5deUsaha1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the B5R18A
     */
    public static pkl53.component.Textfield getB5R18A() {
        return B5R18A;
    }

    /**
     * @param B5R18A the B5R18A to set
     */
    public void setB5R18A(pkl53.component.Textfield B5R18A) {
        this.B5R18A = B5R18A;
    }

    /**
     * @return the B5R18B_LAKI
     */
    public pkl53.component.Textfield getB5R18B_LAKI() {
        return B5R18B_LAKI;
    }

    /**
     * @param B5R18B_LAKI the B5R18B_LAKI to set
     */
    public void setB5R18B_LAKI(pkl53.component.Textfield B5R18B_LAKI) {
        this.B5R18B_LAKI = B5R18B_LAKI;
    }

    /**
     * @return the B5R18B_PR
     */
    public pkl53.component.Textfield getB5R18B_PR() {
        return B5R18B_PR;
    }

    /**
     * @param B5R18B_PR the B5R18B_PR to set
     */
    public void setB5R18B_PR(pkl53.component.Textfield B5R18B_PR) {
        this.B5R18B_PR = B5R18B_PR;
    }

    /**
     * @return the B5R19_LAIN
     */
    public pkl53.component.Textfield getB5R19_LAIN() {
        return B5R19_LAIN;
    }

    /**
     * @param B5R19_LAIN the B5R19_LAIN to set
     */
    public void setB5R19_LAIN(pkl53.component.Textfield B5R19_LAIN) {
        this.B5R19_LAIN = B5R19_LAIN;
    }

    /**
     * @return the B5R19_LL
     */
    public pkl53.component.Textfield getB5R19_LL() {
        return B5R19_LL;
    }

    /**
     * @param B5R19_LL the B5R19_LL to set
     */
    public void setB5R19_LL(pkl53.component.Textfield B5R19_LL) {
        this.B5R19_LL = B5R19_LL;
    }

    /**
     * @return the B5R19_UTAMA
     */
    public pkl53.component.Textfield getB5R19_UTAMA() {
        return B5R19_UTAMA;
    }

    /**
     * @param B5R19_UTAMA the B5R19_UTAMA to set
     */
    public void setB5R19_UTAMA(pkl53.component.Textfield B5R19_UTAMA) {
        this.B5R19_UTAMA = B5R19_UTAMA;
    }

    /**
     * @return the B5R20A
     */
    public pkl53.component.Textfield getB5R20A() {
        return B5R20A;
    }

    /**
     * @param B5R20A the B5R20A to set
     */
    public void setB5R20A(pkl53.component.Textfield B5R20A) {
        this.B5R20A = B5R20A;
    }

    /**
     * @return the B5R20B
     */
    public pkl53.component.Textfield getB5R20B() {
        return B5R20B;
    }

    /**
     * @param B5R20B the B5R20B to set
     */
    public void setB5R20B(pkl53.component.Textfield B5R20B) {
        this.B5R20B = B5R20B;
    }

    /**
     * @return the B5R21
     */
    public pkl53.component.Textfield getB5R21() {
        return B5R21;
    }

    /**
     * @param B5R21 the B5R21 to set
     */
    public void setB5R21(pkl53.component.Textfield B5R21) {
        this.B5R21 = B5R21;
    }

    /**
     * @return the B5R21Lainnya
     */
    public pkl53.component.Textfield getB5R21Lainnya() {
        return B5R21Lainnya;
    }

    /**
     * @param B5R21Lainnya the B5R21Lainnya to set
     */
    public void setB5R21Lainnya(pkl53.component.Textfield B5R21Lainnya) {
        this.B5R21Lainnya = B5R21Lainnya;
    }

    /**
     * @return the B5R22A
     */
    public pkl53.component.Textfield getB5R22A() {
        return B5R22A;
    }

    /**
     * @param B5R22A the B5R22A to set
     */
    public void setB5R22A(pkl53.component.Textfield B5R22A) {
        this.B5R22A = B5R22A;
    }

    /**
     * @return the B5R22B
     */
    public pkl53.component.Textfield getB5R22B() {
        return B5R22B;
    }

    /**
     * @param B5R22B the B5R22B to set
     */
    public void setB5R22B(pkl53.component.Textfield B5R22B) {
        this.B5R22B = B5R22B;
    }

    /**
     * @return the B5R22BLainnya
     */
    public pkl53.component.Textfield getB5R22BLainnya() {
        return B5R22BLainnya;
    }

    /**
     * @param B5R22BLainnya the B5R22BLainnya to set
     */
    public void setB5R22BLainnya(pkl53.component.Textfield B5R22BLainnya) {
        this.B5R22BLainnya = B5R22BLainnya;
    }

    /**
     * @return the B5R22C
     */
    public pkl53.component.Textfield getB5R22C() {
        return B5R22C;
    }

    /**
     * @param B5R22C the B5R22C to set
     */
    public void setB5R22C(pkl53.component.Textfield B5R22C) {
        this.B5R22C = B5R22C;
    }

    /**
     * @return the B5R22D
     */
    public pkl53.component.Textfield getB5R22D() {
        return B5R22D;
    }

    /**
     * @param B5R22D the B5R22D to set
     */
    public void setB5R22D(pkl53.component.Textfield B5R22D) {
        this.B5R22D = B5R22D;
    }

    /**
     * @return the B5R22D_LAIN
     */
    public pkl53.component.Textfield getB5R22D_LAIN() {
        return B5R22D_LAIN;
    }

    /**
     * @param B5R22D_LAIN the B5R22D_LAIN to set
     */
    public void setB5R22D_LAIN(pkl53.component.Textfield B5R22D_LAIN) {
        this.B5R22D_LAIN = B5R22D_LAIN;
    }

    /**
     * @return the B5R22E
     */
    public pkl53.component.Textfield getB5R22E() {
        return B5R22E;
    }

    /**
     * @param B5R22E the B5R22E to set
     */
    public void setB5R22E(pkl53.component.Textfield B5R22E) {
        this.B5R22E = B5R22E;
    }

    /**
     * @return the B5R22F
     */
    public pkl53.component.Textfield getB5R22F() {
        return B5R22F;
    }

    /**
     * @param B5R22F the B5R22F to set
     */
    public void setB5R22F(pkl53.component.Textfield B5R22F) {
        this.B5R22F = B5R22F;
    }

    /**
     * @return the B5R22FLainnya
     */
    public pkl53.component.Textfield getB5R22FLainnya() {
        return B5R22FLainnya;
    }

    /**
     * @param B5R22FLainnya the B5R22FLainnya to set
     */
    public void setB5R22FLainnya(pkl53.component.Textfield B5R22FLainnya) {
        this.B5R22FLainnya = B5R22FLainnya;
    }

    /**
     * @return the B5R22G1
     */
    public pkl53.component.Textfield getB5R22G1() {
        return B5R22G1;
    }

    /**
     * @param B5R22G1 the B5R22G1 to set
     */
    public void setB5R22G1(pkl53.component.Textfield B5R22G1) {
        this.B5R22G1 = B5R22G1;
    }

    /**
     * @return the B5R22G2
     */
    public pkl53.component.Textfield getB5R22G2() {
        return B5R22G2;
    }

    /**
     * @param B5R22G2 the B5R22G2 to set
     */
    public void setB5R22G2(pkl53.component.Textfield B5R22G2) {
        this.B5R22G2 = B5R22G2;
    }

    /**
     * @return the B5R22G3
     */
    public pkl53.component.Textfield getB5R22G3() {
        return B5R22G3;
    }

    /**
     * @param B5R22G3 the B5R22G3 to set
     */
    public void setB5R22G3(pkl53.component.Textfield B5R22G3) {
        this.B5R22G3 = B5R22G3;
    }

    /**
     * @return the B5R22G4
     */
    public pkl53.component.Textfield getB5R22G4() {
        return B5R22G4;
    }

    /**
     * @param B5R22G4 the B5R22G4 to set
     */
    public void setB5R22G4(pkl53.component.Textfield B5R22G4) {
        this.B5R22G4 = B5R22G4;
    }

    /**
     * @return the B5R22G5
     */
    public pkl53.component.Textfield getB5R22G5() {
        return B5R22G5;
    }

    /**
     * @param B5R22G5 the B5R22G5 to set
     */
    public void setB5R22G5(pkl53.component.Textfield B5R22G5) {
        this.B5R22G5 = B5R22G5;
    }

    /**
     * @return the B5R22G6
     */
    public pkl53.component.Textfield getB5R22G6() {
        return B5R22G6;
    }

    /**
     * @param B5R22G6 the B5R22G6 to set
     */
    public void setB5R22G6(pkl53.component.Textfield B5R22G6) {
        this.B5R22G6 = B5R22G6;
    }

    /**
     * @return the B5R22G7
     */
    public pkl53.component.Textfield getB5R22G7() {
        return B5R22G7;
    }

    /**
     * @param B5R22G7 the B5R22G7 to set
     */
    public void setB5R22G7(pkl53.component.Textfield B5R22G7) {
        this.B5R22G7 = B5R22G7;
    }

    /**
     * @return the B5R22G8
     */
    public pkl53.component.Textfield getB5R22G8() {
        return B5R22G8;
    }

    /**
     * @param B5R22G8 the B5R22G8 to set
     */
    public void setB5R22G8(pkl53.component.Textfield B5R22G8) {
        this.B5R22G8 = B5R22G8;
    }

    /**
     * @return the B5R22G9_LAIN
     */
    public pkl53.component.Textfield getB5R22G9_LAIN() {
        return B5R22G9_LAIN;
    }

    /**
     * @param B5R22G9_LAIN the B5R22G9_LAIN to set
     */
    public void setB5R22G9_LAIN(pkl53.component.Textfield B5R22G9_LAIN) {
        this.B5R22G9_LAIN = B5R22G9_LAIN;
    }

    /**
     * @return the B5R23A
     */
    public pkl53.component.Textfield getB5R23A() {
        return B5R23A;
    }

    /**
     * @param B5R23A the B5R23A to set
     */
    public void setB5R23A(pkl53.component.Textfield B5R23A) {
        this.B5R23A = B5R23A;
    }

    /**
     * @return the B5R23B1
     */
    public pkl53.component.Textfield getB5R23B1() {
        return B5R23B1;
    }

    /**
     * @param B5R23B1 the B5R23B1 to set
     */
    public void setB5R23B1(pkl53.component.Textfield B5R23B1) {
        this.B5R23B1 = B5R23B1;
    }

    /**
     * @return the B5R23B10
     */
    public pkl53.component.Textfield getB5R23B10() {
        return B5R23B10;
    }

    /**
     * @param B5R23B10 the B5R23B10 to set
     */
    public void setB5R23B10(pkl53.component.Textfield B5R23B10) {
        this.B5R23B10 = B5R23B10;
    }

    /**
     * @return the B5R23B11
     */
    public pkl53.component.Textfield getB5R23B11() {
        return B5R23B11;
    }

    /**
     * @param B5R23B11 the B5R23B11 to set
     */
    public void setB5R23B11(pkl53.component.Textfield B5R23B11) {
        this.B5R23B11 = B5R23B11;
    }

    /**
     * @return the B5R23B13_LAIN
     */
    public pkl53.component.Textfield getB5R23B13_LAIN() {
        return B5R23B13_LAIN;
    }

    /**
     * @param B5R23B13_LAIN the B5R23B13_LAIN to set
     */
    public void setB5R23B13_LAIN(pkl53.component.Textfield B5R23B13_LAIN) {
        this.B5R23B13_LAIN = B5R23B13_LAIN;
    }

    /**
     * @return the B5R23B2
     */
    public pkl53.component.Textfield getB5R23B2() {
        return B5R23B2;
    }

    /**
     * @param B5R23B2 the B5R23B2 to set
     */
    public void setB5R23B2(pkl53.component.Textfield B5R23B2) {
        this.B5R23B2 = B5R23B2;
    }

    /**
     * @return the B5R23B3
     */
    public pkl53.component.Textfield getB5R23B3() {
        return B5R23B3;
    }

    /**
     * @param B5R23B3 the B5R23B3 to set
     */
    public void setB5R23B3(pkl53.component.Textfield B5R23B3) {
        this.B5R23B3 = B5R23B3;
    }

    /**
     * @return the B5R23B4
     */
    public pkl53.component.Textfield getB5R23B4() {
        return B5R23B4;
    }

    /**
     * @param B5R23B4 the B5R23B4 to set
     */
    public void setB5R23B4(pkl53.component.Textfield B5R23B4) {
        this.B5R23B4 = B5R23B4;
    }

    /**
     * @return the B5R23B5
     */
    public pkl53.component.Textfield getB5R23B5() {
        return B5R23B5;
    }

    /**
     * @param B5R23B5 the B5R23B5 to set
     */
    public void setB5R23B5(pkl53.component.Textfield B5R23B5) {
        this.B5R23B5 = B5R23B5;
    }

    /**
     * @return the B5R23B6
     */
    public pkl53.component.Textfield getB5R23B6() {
        return B5R23B6;
    }

    /**
     * @param B5R23B6 the B5R23B6 to set
     */
    public void setB5R23B6(pkl53.component.Textfield B5R23B6) {
        this.B5R23B6 = B5R23B6;
    }

    /**
     * @return the B5R23B7
     */
    public pkl53.component.Textfield getB5R23B7() {
        return B5R23B7;
    }

    /**
     * @param B5R23B7 the B5R23B7 to set
     */
    public void setB5R23B7(pkl53.component.Textfield B5R23B7) {
        this.B5R23B7 = B5R23B7;
    }

    /**
     * @return the B5R23B8
     */
    public pkl53.component.Textfield getB5R23B8() {
        return B5R23B8;
    }

    /**
     * @param B5R23B8 the B5R23B8 to set
     */
    public void setB5R23B8(pkl53.component.Textfield B5R23B8) {
        this.B5R23B8 = B5R23B8;
    }

    /**
     * @return the B5R23B9
     */
    public pkl53.component.Textfield getB5R23B9() {
        return B5R23B9;
    }

    /**
     * @param B5R23B9 the B5R23B9 to set
     */
    public void setB5R23B9(pkl53.component.Textfield B5R23B9) {
        this.B5R23B9 = B5R23B9;
    }

    /**
     * @return the B5R23ALainnya
     */
    public pkl53.component.Textfield getB5R23ALainnya() {
        return B5R23ALainnya;
    }

    /**
     * @return the b3RinciusahaTambahan1
     */
    public pkl53.model.tambahan.B3RinciusahaTambahan getB3RinciusahaTambahan1() {
        return b3RinciusahaTambahan1;
    }

    
    
}
