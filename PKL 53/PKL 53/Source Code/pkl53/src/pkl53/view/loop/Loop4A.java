/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view.loop;

import pkl53.converter.KKSArtConverter;
import pkl53.converter.OpsiB4R3converter;
import pkl53.converter.OpsiB4R8Converter;
import pkl53.converter.OpsiB4r7Converter;
import pkl53.converter.OpsiRincianLapUsahaConverter;
import pkl53.converter.OpsiYaTidakTidakTahuConverter;
import pkl53.validasi.Blok4Validasi;

/**
 *
 * @author HP G42 (RILLA)
 */
public class Loop4A extends javax.swing.JPanel {

    /**
     * Creates new form loop
     */
    public Loop4A() {
        initComponents();
        this.setOpaque(false);
        loopPanel.setOpaque(false);
        Blok4Validasi val = new Blok4Validasi();
        val.setPanelBlok4A(this);
        val.setListB4A();
        val.registerValidasi4A();
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        blok4ABinding = new pkl53.model.Blok4PekerjaBinding();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        loopPanel = new javax.swing.JPanel();
        B4R2 = new pkl53.component.Textfield();
        B4R1 = new pkl53.component.Textfield();
        B4R4 = new pkl53.component.Textfield();
        B4R3 = new pkl53.component.Textfield();
        B4R7 = new pkl53.component.Textfield();
        B4R8 = new pkl53.component.Textfield();
        B4R6 = new pkl53.component.Textfield();
        B4R5 = new pkl53.component.Textfield();
        B4R13 = new pkl53.component.Textfield();
        B4R15 = new pkl53.component.Textfield();
        B4R14 = new pkl53.component.Textfield();
        B4R12 = new pkl53.component.Textfield();
        B4R11 = new pkl53.component.Textfield();
        B4R10 = new pkl53.component.Textfield();
        B4R9 = new pkl53.component.Textfield();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R1, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R10, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r10"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R11, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r11"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R12, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r12"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R13, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r13"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R14, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r14"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R15, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r15"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R2, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R3, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r3"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R4, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r4"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R5, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r5"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R6, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r6"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R7, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r7"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R8, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r8"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R9, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4ABinding, org.jdesktop.beansbinding.BeanProperty.create("b4r9"));
        bindingGroup.addBinding(binding);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        loopPanel.setAlignmentX(1.0F);
        loopPanel.setAlignmentY(1.0F);
        loopPanel.setOpaque(false);

        B4R2.setBlok4PU(true);
        B4R2.setCharType('2');
        B4R2.setLength(30);
        B4R2.setPanel(loopPanel);

        B4R1.setBlok4PU(true);
        B4R1.setPanel(loopPanel);

        B4R4.setBlok4PU(true);
        B4R4.setPanel(loopPanel);

        B4R3.setBlok4PU(true);
        B4R3.setPanel(loopPanel);

        B4R7.setBlok4PU(true);
        B4R7.setPanel(loopPanel);

        B4R8.setBlok4PU(true);
        B4R8.setPanel(loopPanel);

        B4R6.setBlok4PU(true);
        B4R6.setLength(2);
        B4R6.setPanel(loopPanel);
        B4R6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4R6ActionPerformed(evt);
            }
        });

        B4R5.setBlok4PU(true);
        B4R5.setCharType('2');
        B4R5.setLength(30);
        B4R5.setPanel(loopPanel);

        B4R13.setBlok4PU(true);
        B4R13.setPanel(loopPanel);

        B4R15.setBlok4PU(true);
        B4R15.setPanel(loopPanel);

        B4R14.setBlok4PU(true);
        B4R14.setPanel(loopPanel);

        B4R12.setBlok4PU(true);
        B4R12.setPanel(loopPanel);

        B4R11.setBlok4PU(true);
        B4R11.setPanel(loopPanel);

        B4R10.setBlok4PU(true);
        B4R10.setPanel(loopPanel);

        B4R9.setBlok4PU(true);
        B4R9.setPanel(loopPanel);

        javax.swing.GroupLayout loopPanelLayout = new javax.swing.GroupLayout(loopPanel);
        loopPanel.setLayout(loopPanelLayout);
        loopPanelLayout.setHorizontalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(B4R5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(B4R9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(B4R10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(B4R11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(B4R12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(B4R13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(B4R14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(B4R15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        loopPanelLayout.setVerticalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loopPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(loopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(loopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(loopPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        add(jLayeredPane2, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void B4R6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4R6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B4R6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static pkl53.component.Textfield B4R1;
    private pkl53.component.Textfield B4R10;
    private pkl53.component.Textfield B4R11;
    private pkl53.component.Textfield B4R12;
    private pkl53.component.Textfield B4R13;
    private pkl53.component.Textfield B4R14;
    private pkl53.component.Textfield B4R15;
    private pkl53.component.Textfield B4R2;
    private pkl53.component.Textfield B4R3;
    private pkl53.component.Textfield B4R4;
    private pkl53.component.Textfield B4R5;
    private pkl53.component.Textfield B4R6;
    private pkl53.component.Textfield B4R7;
    private pkl53.component.Textfield B4R8;
    private pkl53.component.Textfield B4R9;
    private pkl53.model.Blok4PekerjaBinding blok4ABinding;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel loopPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the loopPanel
     */
    public javax.swing.JPanel getLoopPanel() {
        return loopPanel;
    }

    /**
     * @param loopPanel the loopPanel to set
     */
    public void setLoopPanel(javax.swing.JPanel loopPanel) {
        this.loopPanel = loopPanel;
    }

    /**
     * @return the B4R1
     */
    public  pkl53.component.Textfield getB4R1() {
        return B4R1;
    }

    /**
     * @param B4R1 the B4R1 to set
     */
    public void setB4R1(pkl53.component.Textfield B4R1) {
        this.B4R1 = B4R1;
    }

    /**
     * @return the B4R10
     */
    public pkl53.component.Textfield getB4R10() {
        return B4R10;
    }

    /**
     * @param B4R10 the B4R10 to set
     */
    public void setB4R10(pkl53.component.Textfield B4R10) {
        this.B4R10 = B4R10;
    }

    /**
     * @return the B4R11
     */
    public pkl53.component.Textfield getB4R11() {
        return B4R11;
    }

    /**
     * @param B4R11 the B4R11 to set
     */
    public void setB4R11(pkl53.component.Textfield B4R11) {
        this.B4R11 = B4R11;
    }

    /**
     * @return the B4R12
     */
    public pkl53.component.Textfield getB4R12() {
        return B4R12;
    }

    /**
     * @param B4R12 the B4R12 to set
     */
    public void setB4R12(pkl53.component.Textfield B4R12) {
        this.B4R12 = B4R12;
    }

    /**
     * @return the B4R13
     */
    public pkl53.component.Textfield getB4R13() {
        return B4R13;
    }

    /**
     * @param B4R13 the B4R13 to set
     */
    public void setB4R13(pkl53.component.Textfield B4R13) {
        this.B4R13 = B4R13;
    }

    /**
     * @return the B4R14
     */
    public pkl53.component.Textfield getB4R14() {
        return B4R14;
    }

    /**
     * @param B4R14 the B4R14 to set
     */
    public void setB4R14(pkl53.component.Textfield B4R14) {
        this.B4R14 = B4R14;
    }

    /**
     * @return the B4R15
     */
    public pkl53.component.Textfield getB4R15() {
        return B4R15;
    }

    /**
     * @param B4R15 the B4R15 to set
     */
    public void setB4R15(pkl53.component.Textfield B4R15) {
        this.B4R15 = B4R15;
    }

   
  

   


    /**
     * @return the B4R2
     */
    public pkl53.component.Textfield getB4R2() {
        return B4R2;
    }

    /**
     * @param B4R2 the B4R2 to set
     */
    public void setB4R2(pkl53.component.Textfield B4R2) {
        this.B4R2 = B4R2;
    }

  

   

    
  
  

    /**
     * @return the B4R3
     */
    public pkl53.component.Textfield getB4R3() {
        return B4R3;
    }

    /**
     * @param B4R3 the B4R3 to set
     */
    public void setB4R3(pkl53.component.Textfield B4R3) {
        this.B4R3 = B4R3;
    }

    /**
     * @return the B4R4
     */
    public pkl53.component.Textfield getB4R4() {
        return B4R4;
    }

    /**
     * @param B4R4 the B4R4 to set
     */
    public void setB4R4(pkl53.component.Textfield B4R4) {
        this.B4R4 = B4R4;
    }

    /**
     * @return the B4R5
     */
    public pkl53.component.Textfield getB4R5() {
        return B4R5;
    }

    /**
     * @param B4R5 the B4R5 to set
     */
    public void setB4R5(pkl53.component.Textfield B4R5) {
        this.B4R5 = B4R5;
    }

    /**
     * @return the B4R6
     */
    public pkl53.component.Textfield getB4R6() {
        return B4R6;
    }

    /**
     * @param B4R6 the B4R6 to set
     */
    public void setB4R6(pkl53.component.Textfield B4R6) {
        this.B4R6 = B4R6;
    }

    /**
     * @return the B4R7
     */
    public pkl53.component.Textfield getB4R7() {
        return B4R7;
    }

    /**
     * @param B4R7 the B4R7 to set
     */
    public void setB4R7(pkl53.component.Textfield B4R7) {
        this.B4R7 = B4R7;
    }

    /**
     * @return the B4R8
     */
    public pkl53.component.Textfield getB4R8() {
        return B4R8;
    }

    /**
     * @param B4R8 the B4R8 to set
     */
    public void setB4R8(pkl53.component.Textfield B4R8) {
        this.B4R8 = B4R8;
    }

    /**
     * @return the B4R9
     */
    public pkl53.component.Textfield getB4R9() {
        return B4R9;
    }

    /**
     * @param B4R9 the B4R9 to set
     */
    public void setB4R9(pkl53.component.Textfield B4R9) {
        this.B4R9 = B4R9;
    }

    /**
  
   

    /**
     * @return the blok4Binding
     */
    public pkl53.model.Blok4PekerjaBinding getBlok4ABinding() {
        return blok4ABinding;
    }

    /**
     * @param blok4Binding the blok4Binding to set
     */
    public void setBlok4ABinding(pkl53.model.Blok4PekerjaBinding blok4Binding) {
        this.blok4ABinding = blok4Binding;
    }

    /**
     * @return the b4Keteranganumumtenagakerja
     */
    

   


   
    
}