/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view.loop;

import pkl53.validasi.UsahaBlok4Validasi;


/**
 *
 * @author Guest_
 */
public class Loop4Usaha extends javax.swing.JPanel {

    /**
     * Creates new form loop4B
     */
    public Loop4Usaha() {
        initComponents();
        UsahaBlok4Validasi val = new UsahaBlok4Validasi();
        val.setPanelUsahaBlok4(this);
        val.registerValidasi();
        val.setListB4Usaha();
    }
    public Loop4Usaha(String i) {
         initComponents();
        this.setName(i);
        loopPanel.setOpaque(false);
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

        b2Tambahan1 = new pkl53.model.tambahan.B2Tambahan();
        loopPanel = new javax.swing.JPanel();
        B4R2 = new pkl53.component.Textfield();
        B4R1 = new pkl53.component.Textfield();
        B4R6 = new pkl53.component.Textfield();
        B4R15 = new pkl53.component.Textfield();
        B4R13 = new pkl53.component.Textfield();
        B4R12 = new pkl53.component.Textfield();
        B4R9 = new pkl53.component.Textfield();
        B4R8 = new pkl53.component.Textfield();
        B4R3 = new pkl53.component.Textfield();
        B4R5 = new pkl53.component.Textfield();
        B4R4 = new pkl53.component.Textfield();
        B4R10 = new pkl53.component.Textfield();
        B4R11 = new pkl53.component.Textfield();
        B4R14 = new pkl53.component.Textfield();
        B4R16 = new pkl53.component.Textfield();
        B4R7 = new pkl53.component.Textfield();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R10, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r10"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R11, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r11"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R12, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r12"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R13, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r13"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R14, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r14"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R15, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r15"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R16, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r16"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R4, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r4"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R5, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r5"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R6, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r6"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R7, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r7"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R8, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r8"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R9, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b2r9"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R1, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b4r1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R2, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b4r2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B4R3, org.jdesktop.beansbinding.ELProperty.create("${text}"), b2Tambahan1, org.jdesktop.beansbinding.BeanProperty.create("b4r3"));
        bindingGroup.addBinding(binding);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        loopPanel.setAlignmentX(1.0F);
        loopPanel.setAlignmentY(1.0F);
        loopPanel.setOpaque(false);
        loopPanel.setPreferredSize(new java.awt.Dimension(1291, 34));

        B4R2.setBlok4PU(true);
        B4R2.setCharType('2');
        B4R2.setLength(30);
        B4R2.setPanel(loopPanel);

        B4R1.setBlok4PU(true);
        B4R1.setPanel(loopPanel);

        B4R6.setBlok4PU(true);
        B4R6.setLength(2);
        B4R6.setPanel(loopPanel);

        B4R15.setBlok4PU(true);
        B4R15.setPanel(loopPanel);

        B4R13.setBlok4PU(true);
        B4R13.setPanel(loopPanel);

        B4R12.setBlok4PU(true);
        B4R12.setPanel(loopPanel);

        B4R9.setBlok4PU(true);
        B4R9.setPanel(loopPanel);

        B4R8.setBlok4PU(true);
        B4R8.setPanel(loopPanel);

        B4R3.setBlok4PU(true);
        B4R3.setPanel(loopPanel);

        B4R5.setBlok4PU(true);
        B4R5.setCharType('2');
        B4R5.setLength(30);
        B4R5.setPanel(loopPanel);

        B4R4.setBlok4PU(true);
        B4R4.setPanel(loopPanel);

        B4R10.setBlok4PU(true);
        B4R10.setPanel(loopPanel);

        B4R11.setBlok4PU(true);
        B4R11.setPanel(loopPanel);

        B4R14.setBlok4PU(true);
        B4R14.setPanel(loopPanel);

        B4R16.setBlok4PU(true);
        B4R16.setPanel(loopPanel);

        B4R7.setBlok4PU(true);
        B4R7.setPanel(loopPanel);

        javax.swing.GroupLayout loopPanelLayout = new javax.swing.GroupLayout(loopPanel);
        loopPanel.setLayout(loopPanelLayout);
        loopPanelLayout.setHorizontalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loopPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(B4R3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(B4R5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(B4R6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(B4R7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(B4R8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(B4R9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(B4R10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(B4R11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B4R12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(B4R13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(B4R14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(B4R15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(B4R16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        loopPanelLayout.setVerticalGroup(
            loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loopPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(loopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4R2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4R7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        add(loopPanel, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl53.component.Textfield B4R1;
    private pkl53.component.Textfield B4R10;
    private pkl53.component.Textfield B4R11;
    private pkl53.component.Textfield B4R12;
    private pkl53.component.Textfield B4R13;
    private pkl53.component.Textfield B4R14;
    private pkl53.component.Textfield B4R15;
    private pkl53.component.Textfield B4R16;
    private pkl53.component.Textfield B4R2;
    private pkl53.component.Textfield B4R3;
    private pkl53.component.Textfield B4R4;
    private pkl53.component.Textfield B4R5;
    private pkl53.component.Textfield B4R6;
    private pkl53.component.Textfield B4R7;
    private pkl53.component.Textfield B4R8;
    private pkl53.component.Textfield B4R9;
    private pkl53.model.tambahan.B2Tambahan b2Tambahan1;
    private javax.swing.JPanel loopPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the b2Tambahan1
     */
    public pkl53.model.tambahan.B2Tambahan getB2Tambahan1() {
        return b2Tambahan1;
    }

    /**
     * @return the B4R1
     */
    public pkl53.component.Textfield getB4R1() {
        return B4R1;
    }

    /**
     * @return the B4R10
     */
    public pkl53.component.Textfield getB4R10() {
        return B4R10;
    }

    /**
     * @return the B4R11
     */
    public pkl53.component.Textfield getB4R11() {
        return B4R11;
    }

    /**
     * @return the B4R12
     */
    public pkl53.component.Textfield getB4R12() {
        return B4R12;
    }

    /**
     * @return the B4R13
     */
    public pkl53.component.Textfield getB4R13() {
        return B4R13;
    }

    /**
     * @return the B4R14
     */
    public pkl53.component.Textfield getB4R14() {
        return B4R14;
    }

    /**
     * @return the B4R15
     */
    public pkl53.component.Textfield getB4R15() {
        return B4R15;
    }

    /**
     * @return the B4R16
     */
    public pkl53.component.Textfield getB4R16() {
        return B4R16;
    }

    /**
     * @return the B4R2
     */
    public pkl53.component.Textfield getB4R2() {
        return B4R2;
    }

    /**
     * @return the B4R3
     */
    public pkl53.component.Textfield getB4R3() {
        return B4R3;
    }

    /**
     * @return the B4R4
     */
    public pkl53.component.Textfield getB4R4() {
        return B4R4;
    }

    /**
     * @return the B4R5
     */
    public pkl53.component.Textfield getB4R5() {
        return B4R5;
    }

    /**
     * @return the B4R6
     */
    public pkl53.component.Textfield getB4R6() {
        return B4R6;
    }

    /**
     * @return the B4R7
     */
    public pkl53.component.Textfield getB4R7() {
        return B4R7;
    }

    /**
     * @return the B4R8
     */
    public pkl53.component.Textfield getB4R8() {
        return B4R8;
    }

    /**
     * @return the B4R9
     */
    public pkl53.component.Textfield getB4R9() {
        return B4R9;
    }

    /**
     * @return the loopPanel
     */
    public javax.swing.JPanel getLoopPanel() {
        return loopPanel;
    }

}
