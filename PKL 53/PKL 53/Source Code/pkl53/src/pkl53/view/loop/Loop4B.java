/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view.loop;

import pkl53.converter.OpsiB4R18Converter;
import pkl53.converter.OpsiYaDalamProsesTidakTidakTahuConverter;
import pkl53.converter.OpsiYaTidakConverter;
import pkl53.converter.OpsiYaTidakTidakTahuConverter;
import pkl53.validasi.Blok4Validasi;

/**
 *
 * @author Guest_
 */
public class Loop4B extends javax.swing.JPanel {

    /**
     * @return the loopPanel
     */
    public static javax.swing.JPanel getLoopPanel() {
        return loopPanel;
    }

    /**
     * Creates new form loop4B
     */
    public Loop4B() {
        initComponents();
         Blok4Validasi val = new Blok4Validasi();
        val.setPanelBlok4B(this);
        val.setListB4B();
        val.registerValidasi4B();
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

        blok4BBinding = new pkl53.model.Blok4PekerjaBinding();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        loopPanel = new javax.swing.JPanel();
        B4R2 = new pkl53.component.Textfield();
        B4R1 = new pkl53.component.Textfield();
        B4R16 = new pkl53.component.Textfield();
        B4R21 = new pkl53.component.Textfield();
        B4R23 = new pkl53.component.Textfield();
        B4R24 = new pkl53.component.Textfield();
        B4R22 = new pkl53.component.Textfield();
        B4R20 = new pkl53.component.Textfield();
        B4R19 = new pkl53.component.Textfield();
        B4R18 = new pkl53.component.Textfield();
        B4R17 = new pkl53.component.Textfield();
        B4R4 = new pkl53.component.Textfield();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R1, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R16, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r16"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R17, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r17"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R18, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r18"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R19, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r19"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R2, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R20, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r20"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R21, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r21"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R22, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r22"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R23, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r23"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R24, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r24"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R4, org.jdesktop.beansbinding.ELProperty.create("${text}"), blok4BBinding, org.jdesktop.beansbinding.BeanProperty.create("b4r4"));
        bindingGroup.addBinding(binding);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1762, 102));
        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1762, 100));

        loopPanel.setAlignmentX(1.0F);
        loopPanel.setAlignmentY(1.0F);
        loopPanel.setOpaque(false);
        loopPanel.setPreferredSize(new java.awt.Dimension(1762, 34));

        B4R2.setBlok4PU(true);
        B4R2.setCharType('2');
        B4R2.setLength(30);
        B4R2.setPanel(loopPanel);

        B4R1.setBlok4PU(true);
        B4R1.setPanel(loopPanel);

        B4R16.setBlok4PU(true);
        B4R16.setPanel(loopPanel);

        B4R21.setBlok4PU(true);
        B4R21.setPanel(loopPanel);

        B4R23.setBlok4PU(true);
        B4R23.setPanel(loopPanel);

        B4R24.setBlok4PU(true);
        B4R24.setPanel(loopPanel);

        B4R22.setBlok4PU(true);
        B4R22.setPanel(loopPanel);

        B4R20.setBlok4PU(true);
        B4R20.setPanel(loopPanel);

        B4R19.setBlok4PU(true);
        B4R19.setPanel(loopPanel);

        B4R18.setBlok4PU(true);
        B4R18.setPanel(loopPanel);

        B4R17.setBlok4PU(true);
        B4R17.setPanel(loopPanel);

        B4R4.setBlok4PU(true);
        B4R4.setPanel(loopPanel);

        javax.swing.GroupLayout loopPanelLayout = new javax.swing.GroupLayout(loopPanel);
        loopPanel.setLayout(loopPanelLayout);
        loopPanelLayout.setHorizontalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loopPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(B4R16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(B4R17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(B4R18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(B4R19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(B4R20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(B4R21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(B4R22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(B4R23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(B4R24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        loopPanelLayout.setVerticalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loopPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1786, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1786, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(loopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 66, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(loopPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        add(jLayeredPane1, java.awt.BorderLayout.PAGE_START);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static pkl53.component.Textfield B4R1;
    private pkl53.component.Textfield B4R16;
    private pkl53.component.Textfield B4R17;
    private pkl53.component.Textfield B4R18;
    private pkl53.component.Textfield B4R19;
    private pkl53.component.Textfield B4R2;
    private pkl53.component.Textfield B4R20;
    private pkl53.component.Textfield B4R21;
    private pkl53.component.Textfield B4R22;
    private pkl53.component.Textfield B4R23;
    private pkl53.component.Textfield B4R24;
    private pkl53.component.Textfield B4R4;
    private pkl53.model.Blok4PekerjaBinding blok4BBinding;
    private javax.swing.JLayeredPane jLayeredPane1;
    private static javax.swing.JPanel loopPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public static pkl53.component.Textfield getB4R1() {
        return B4R1;
    }

    /**
     * @param B4R1 the B4R1 to set
     */
    public void setB4R1(pkl53.component.Textfield B4R1) {
        this.B4R1 = B4R1;
    }

    /**
     * @return the B4R16
     */
    public pkl53.component.Textfield getB4R16() {
        return B4R16;
    }

    /**
     * @param B4R16 the B4R16 to set
     */
    public void setB4R16(pkl53.component.Textfield B4R16) {
        this.B4R16 = B4R16;
    }

    /**
     * @return the B4R17
     */
    public pkl53.component.Textfield getB4R17() {
        return B4R17;
    }

    /**
     * @param B4R17 the B4R17 to set
     */
    public void setB4R17(pkl53.component.Textfield B4R17) {
        this.B4R17 = B4R17;
    }

    /**
     * @return the B4R18
     */
    public pkl53.component.Textfield getB4R18() {
        return B4R18;
    }

    /**
     * @param B4R18 the B4R18 to set
     */
    public void setB4R18(pkl53.component.Textfield B4R18) {
        this.B4R18 = B4R18;
    }

    /**
     * @return the B4R19
     */
    public pkl53.component.Textfield getB4R19() {
        return B4R19;
    }

    /**
     * @param B4R19 the B4R19 to set
     */
    public void setB4R19(pkl53.component.Textfield B4R19) {
        this.B4R19 = B4R19;
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
     * @return the B4R20
     */
    public pkl53.component.Textfield getB4R20() {
        return B4R20;
    }

    /**
     * @param B4R20 the B4R20 to set
     */
    public void setB4R20(pkl53.component.Textfield B4R20) {
        this.B4R20 = B4R20;
    }

    /**
     * @return the B4R21
     */
    public pkl53.component.Textfield getB4R21() {
        return B4R21;
    }

    /**
     * @param B4R21 the B4R21 to set
     */
    public void setB4R21(pkl53.component.Textfield B4R21) {
        this.B4R21 = B4R21;
    }

    /**
     * @return the B4R22
     */
    public pkl53.component.Textfield getB4R22() {
        return B4R22;
    }

    /**
     * @param B4R22 the B4R22 to set
     */
    public void setB4R22(pkl53.component.Textfield B4R22) {
        this.B4R22 = B4R22;
    }

    /**
     * @return the B4R23
     */
    public pkl53.component.Textfield getB4R23() {
        return B4R23;
    }

    /**
     * @param B4R23 the B4R23 to set
     */
    public void setB4R23(pkl53.component.Textfield B4R23) {
        this.B4R23 = B4R23;
    }

    /**
     * @return the B4R24
     */
    public pkl53.component.Textfield getB4R24() {
        return B4R24;
    }

    /**
     * @param B4R24 the B4R24 to set
     */
    public void setB4R24(pkl53.component.Textfield B4R24) {
        this.B4R24 = B4R24;
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
     * @return the blok4BBinding
     */
    public pkl53.model.Blok4PekerjaBinding getBlok4BBinding() {
        return blok4BBinding;
    }

    /**
     * @param blok4BBinding the blok4BBinding to set
     */
    public void setBlok4BBinding(pkl53.model.Blok4PekerjaBinding blok4BBinding) {
        this.blok4BBinding = blok4BBinding;
    }
}