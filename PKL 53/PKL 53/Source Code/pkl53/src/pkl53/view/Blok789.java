/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.view;

import java.util.ArrayList;
import java.util.List;
import pkl53.component.Textfield;
import pkl53.controller.SubmitControllerPekerjaan;
import pkl53.converter.IntegerConverter;
import pkl53.model.KetKuesioner;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.validasi.Blok789Validasi;

/**
 *
 * @author Ema Yulandika SP
 */
public class Blok789 extends javax.swing.JPanel {

    private Blok123 panelBlok123;
    private ArrayList<Textfield> listTextFieldBlok789 = new ArrayList<Textfield>();

    /**
     * Creates new form Blok789
     */
    public Blok789() {
        initComponents();
        addListTextfield();
        Blok789Validasi val = new Blok789Validasi();
        val.setPanelBlok789(this);
        val.registerValidasi();
        val.setList();
    }

    public void addListTextfield() {
        listTextFieldBlok789.add(0,  getB7R1());
          listTextFieldBlok789.add(1,  getB8R10j());
        listTextFieldBlok789.add(2,  getB7R2());
        listTextFieldBlok789.add(3,  getB7R3());
        listTextFieldBlok789.add(4,  getB7R4());
        listTextFieldBlok789.add(5,  getB7R5());
        listTextFieldBlok789.add(6,  getB8R1());
        listTextFieldBlok789.add(7,  getB8R2());
        listTextFieldBlok789.add(8,  getB8R3());
        listTextFieldBlok789.add(9,  getB8R4());
        listTextFieldBlok789.add(10,  getB8R5a());
        listTextFieldBlok789.add(11,  getB8R5b());
        listTextFieldBlok789.add(12,  getB8R6());
        listTextFieldBlok789.add(13,  getB8R7a());
        listTextFieldBlok789.add(14,  getB8R7b());
        listTextFieldBlok789.add(15,  getB8R8());
        listTextFieldBlok789.add(16,  getB8R9());
        listTextFieldBlok789.add(17,  getB8R10a());
        listTextFieldBlok789.add(18,  getB8R10b());
        listTextFieldBlok789.add(19,  getB8R10c());
        listTextFieldBlok789.add(20,  getB8R10d());
        listTextFieldBlok789.add(21,  getB8R10e());
        listTextFieldBlok789.add(22,  getB8R10f());
        listTextFieldBlok789.add(23,  getB8R10g());
        listTextFieldBlok789.add(24,  getB8R10h());
        listTextFieldBlok789.add(25,  getB8R10i());
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textfield1 = new pkl53.component.Textfield();
        blokPekerja7891 = new pkl53.imageClass.BlokPekerja789();
        jLayeredPane = new javax.swing.JLayeredPane();
        B7R1 = new pkl53.component.Textfield();
        B7R2 = new pkl53.component.Textfield();
        B7R3 = new pkl53.component.Textfield();
        B7R4 = new pkl53.component.Textfield();
        B7R5 = new pkl53.component.Textfield();
        B8R1 = new pkl53.component.Textfield();
        B8R2 = new pkl53.component.Textfield();
        B8R3 = new pkl53.component.Textfield();
        B8R4 = new pkl53.component.Textfield();
        B8R5a = new pkl53.component.Textfield();
        B8R5b = new pkl53.component.Textfield();
        B8R6 = new pkl53.component.Textfield();
        B8R7a = new pkl53.component.Textfield();
        B8R7b = new pkl53.component.Textfield();
        B8R8 = new pkl53.component.Textfield();
        B8R9 = new pkl53.component.Textfield();
        B8R10a = new pkl53.component.Textfield();
        B8R10b = new pkl53.component.Textfield();
        B8R10c = new pkl53.component.Textfield();
        B8R10d = new pkl53.component.Textfield();
        B8R10e = new pkl53.component.Textfield();
        B8R10f = new pkl53.component.Textfield();
        B8R10g = new pkl53.component.Textfield();
        B8R10h = new pkl53.component.Textfield();
        B8R10i = new pkl53.component.Textfield();
        B8R10j = new pkl53.component.Textfield();

        textfield1.setText("textfield1");

        setBackground(new java.awt.Color(255, 255, 255));

        blokPekerja7891.setBackground(new java.awt.Color(255, 255, 255));
        blokPekerja7891.setPreferredSize(new java.awt.Dimension(1070, 1762));

        jLayeredPane.setPreferredSize(new java.awt.Dimension(1070, 1762));
        jLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B7R1.setCharType('2');
        B7R1.setLength(30);
        B7R1.setNextType(true);
        B7R1.setPanel(blokPekerja7891);
        B7R1.setTextfield(B7R2);
        B7R1.setTextfieldKhusus(true);
        jLayeredPane.add(B7R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 330, 30));

        B7R2.setLength(2);
        B7R2.setNextType(true);
        B7R2.setPanel(blokPekerja7891);
        B7R2.setTextfield(B7R3);
        jLayeredPane.add(B7R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 50, 30));

        B7R3.setNextType(true);
        B7R3.setPanel(blokPekerja7891);
        B7R3.setTextfield(B7R4);
        jLayeredPane.add(B7R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 40, 30));

        B7R4.setNextType(true);
        B7R4.setPanel(blokPekerja7891);
        B7R4.setTextfield(B7R5);
        B7R4.setTextfieldKhusus(true);
        jLayeredPane.add(B7R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 40, 30));

        B7R5.setLength(2);
        B7R5.setNextType(true);
        B7R5.setPanel(blokPekerja7891);
        B7R5.setTextfield(B8R1);
        jLayeredPane.add(B7R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 40, 30));

        B8R1.setNextType(true);
        B8R1.setPanel(blokPekerja7891);
        B8R1.setTextNew("<Not Set>");
        B8R1.setTextfield(B8R2);
        jLayeredPane.add(B8R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 30, 30));

        B8R2.setNextType(true);
        B8R2.setPanel(blokPekerja7891);
        B8R2.setTextfield(B8R3);
        jLayeredPane.add(B8R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 30, 30));

        B8R3.setNextType(true);
        B8R3.setPanel(blokPekerja7891);
        B8R3.setTextfield(B8R4);
        jLayeredPane.add(B8R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 30, 30));

        B8R4.setLength(4);
        B8R4.setNextType(true);
        B8R4.setPanel(blokPekerja7891);
        B8R4.setTextfield(B8R5a);
        jLayeredPane.add(B8R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 60, 30));

        B8R5a.setLength(2);
        B8R5a.setNextType(true);
        B8R5a.setPanel(blokPekerja7891);
        B8R5a.setTextfield(B8R5b);
        jLayeredPane.add(B8R5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 860, 40, 30));

        B8R5b.setNextType(true);
        B8R5b.setPanel(blokPekerja7891);
        B8R5b.setTextfield(B8R6);
        jLayeredPane.add(B8R5b, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1070, 40, 30));

        B8R6.setLength(2);
        B8R6.setNextType(true);
        B8R6.setPanel(blokPekerja7891);
        B8R6.setTextfield(B8R7a);
        jLayeredPane.add(B8R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1150, 40, 30));

        B8R7a.setNextType(true);
        B8R7a.setPanel(blokPekerja7891);
        B8R7a.setTextfield(B8R7b);
        B8R7a.setTextfieldKhusus(true);
        jLayeredPane.add(B8R7a, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 30, 30));

        B8R7b.setNextType(true);
        B8R7b.setPanel(blokPekerja7891);
        B8R7b.setTextfield(B8R8);
        jLayeredPane.add(B8R7b, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 30, 30));

        B8R8.setNextType(true);
        B8R8.setPanel(blokPekerja7891);
        B8R8.setTextfield(B8R9);
        jLayeredPane.add(B8R8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 30, 30));

        B8R9.setNextType(true);
        B8R9.setPanel(blokPekerja7891);
        B8R9.setTextfield(B8R10a);
        jLayeredPane.add(B8R9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 30, 30));

        B8R10a.setNextType(true);
        B8R10a.setPanel(blokPekerja7891);
        B8R10a.setTextfield(B8R10b);
        B8R10a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8R10aActionPerformed(evt);
            }
        });
        jLayeredPane.add(B8R10a, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 970, 30, 30));

        B8R10b.setNextType(true);
        B8R10b.setPanel(blokPekerja7891);
        B8R10b.setTextfield(B8R10c);
        jLayeredPane.add(B8R10b, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1010, 30, 30));

        B8R10c.setNextType(true);
        B8R10c.setPanel(blokPekerja7891);
        B8R10c.setTextfield(B8R10d);
        jLayeredPane.add(B8R10c, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1040, 30, 30));

        B8R10d.setNextType(true);
        B8R10d.setPanel(blokPekerja7891);
        B8R10d.setTextfield(B8R10e);
        jLayeredPane.add(B8R10d, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1080, 30, 30));

        B8R10e.setNextType(true);
        B8R10e.setPanel(blokPekerja7891);
        B8R10e.setTextfield(B8R10f);
        jLayeredPane.add(B8R10e, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1110, 30, 30));

        B8R10f.setNextType(true);
        B8R10f.setPanel(blokPekerja7891);
        B8R10f.setTextfield(B8R10g);
        jLayeredPane.add(B8R10f, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1140, 30, 30));

        B8R10g.setNextType(true);
        B8R10g.setPanel(blokPekerja7891);
        B8R10g.setTextfield(B8R10h);
        jLayeredPane.add(B8R10g, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1180, 30, 30));

        B8R10h.setNextType(true);
        B8R10h.setPanel(blokPekerja7891);
        B8R10h.setTextfield(B8R10i);
        jLayeredPane.add(B8R10h, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1220, 30, 30));

        B8R10i.setNextType(true);
        B8R10i.setPanel(blokPekerja7891);
        B8R10i.setTextfield(B8R10j);
        jLayeredPane.add(B8R10i, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1250, 30, 30));

        B8R10j.setPanel(blokPekerja7891);
        jLayeredPane.add(B8R10j, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1280, 30, 30));

        javax.swing.GroupLayout blokPekerja7891Layout = new javax.swing.GroupLayout(blokPekerja7891);
        blokPekerja7891.setLayout(blokPekerja7891Layout);
        blokPekerja7891Layout.setHorizontalGroup(
            blokPekerja7891Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blokPekerja7891Layout.createSequentialGroup()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        blokPekerja7891Layout.setVerticalGroup(
            blokPekerja7891Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blokPekerja7891Layout.createSequentialGroup()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(blokPekerja7891, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(blokPekerja7891, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B8R10aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8R10aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B8R10aActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static pkl53.component.Textfield B7R1;
    private pkl53.component.Textfield B7R2;
    private pkl53.component.Textfield B7R3;
    private pkl53.component.Textfield B7R4;
    private pkl53.component.Textfield B7R5;
    private pkl53.component.Textfield B8R1;
    private pkl53.component.Textfield B8R10a;
    private pkl53.component.Textfield B8R10b;
    private pkl53.component.Textfield B8R10c;
    private pkl53.component.Textfield B8R10d;
    private pkl53.component.Textfield B8R10e;
    private pkl53.component.Textfield B8R10f;
    private pkl53.component.Textfield B8R10g;
    private pkl53.component.Textfield B8R10h;
    private pkl53.component.Textfield B8R10i;
    private pkl53.component.Textfield B8R10j;
    private pkl53.component.Textfield B8R2;
    private pkl53.component.Textfield B8R3;
    private pkl53.component.Textfield B8R4;
    private pkl53.component.Textfield B8R5a;
    private pkl53.component.Textfield B8R5b;
    private pkl53.component.Textfield B8R6;
    private pkl53.component.Textfield B8R7a;
    private pkl53.component.Textfield B8R7b;
    private pkl53.component.Textfield B8R8;
    private pkl53.component.Textfield B8R9;
    private pkl53.imageClass.BlokPekerja789 blokPekerja7891;
    private javax.swing.JLayeredPane jLayeredPane;
    private pkl53.component.Textfield textfield1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the B7R1
     */
    public static pkl53.component.Textfield getB7R1() {
        return B7R1;
    }

    /**
     * @param B7R1 the B7R1 to set
     */
    public void setB7R1(pkl53.component.Textfield B7R1) {
        this.B7R1 = B7R1;
    }

    /**
     * @return the B7R2
     */
    public pkl53.component.Textfield getB7R2() {
        return B7R2;
    }

    /**
     * @param B7R2 the B7R2 to set
     */
    public void setB7R2(pkl53.component.Textfield B7R2) {
        this.B7R2 = B7R2;
    }

    /**
     * @return the B7R3
     */
    public pkl53.component.Textfield getB7R3() {
        return B7R3;
    }

    /**
     * @param B7R3 the B7R3 to set
     */
    public void setB7R3(pkl53.component.Textfield B7R3) {
        this.B7R3 = B7R3;
    }

    /**
     * @return the B7R4
     */
    public pkl53.component.Textfield getB7R4() {
        return B7R4;
    }

    /**
     * @param B7R4 the B7R4 to set
     */
    public void setB7R4(pkl53.component.Textfield B7R4) {
        this.B7R4 = B7R4;
    }

    /**
     * @return the B7R5
     */
    public pkl53.component.Textfield getB7R5() {
        return B7R5;
    }

    /**
     * @param B7R5 the B7R5 to set
     */
    public void setB7R5(pkl53.component.Textfield B7R5) {
        this.B7R5 = B7R5;
    }

    /**
     * @return the B8R1
     */
    public pkl53.component.Textfield getB8R1() {
        return B8R1;
    }

    /**
     * @param B8R1 the B8R1 to set
     */
    public void setB8R1(pkl53.component.Textfield B8R1) {
        this.B8R1 = B8R1;
    }

    /**
     * @return the B8R10a
     */
    public pkl53.component.Textfield getB8R10a() {
        return B8R10a;
    }

    /**
     * @param B8R10a the B8R10a to set
     */
    public void setB8R10a(pkl53.component.Textfield B8R10a) {
        this.B8R10a = B8R10a;
    }

    /**
     * @return the B8R10b
     */
    public pkl53.component.Textfield getB8R10b() {
        return B8R10b;
    }

    /**
     * @param B8R10b the B8R10b to set
     */
    public void setB8R10b(pkl53.component.Textfield B8R10b) {
        this.B8R10b = B8R10b;
    }

    /**
     * @return the B8R10c
     */
    public pkl53.component.Textfield getB8R10c() {
        return B8R10c;
    }

    /**
     * @param B8R10c the B8R10c to set
     */
    public void setB8R10c(pkl53.component.Textfield B8R10c) {
        this.B8R10c = B8R10c;
    }

    /**
     * @return the B8R10d
     */
    public pkl53.component.Textfield getB8R10d() {
        return B8R10d;
    }

    /**
     * @param B8R10d the B8R10d to set
     */
    public void setB8R10d(pkl53.component.Textfield B8R10d) {
        this.B8R10d = B8R10d;
    }

    /**
     * @return the B8R10e
     */
    public pkl53.component.Textfield getB8R10e() {
        return B8R10e;
    }

    /**
     * @param B8R10e the B8R10e to set
     */
    public void setB8R10e(pkl53.component.Textfield B8R10e) {
        this.B8R10e = B8R10e;
    }

    /**
     * @return the B8R10f
     */
    public pkl53.component.Textfield getB8R10f() {
        return B8R10f;
    }

    /**
     * @param B8R10f the B8R10f to set
     */
    public void setB8R10f(pkl53.component.Textfield B8R10f) {
        this.B8R10f = B8R10f;
    }

    /**
     * @return the B8R10g
     */
    public pkl53.component.Textfield getB8R10g() {
        return B8R10g;
    }

    /**
     * @param B8R10g the B8R10g to set
     */
    public void setB8R10g(pkl53.component.Textfield B8R10g) {
        this.B8R10g = B8R10g;
    }

    /**
     * @return the B8R10h
     */
    public pkl53.component.Textfield getB8R10h() {
        return B8R10h;
    }

    /**
     * @param B8R10h the B8R10h to set
     */
    public void setB8R10h(pkl53.component.Textfield B8R10h) {
        this.B8R10h = B8R10h;
    }

    /**
     * @return the B8R10i
     */
    public pkl53.component.Textfield getB8R10i() {
        return B8R10i;
    }

    /**
     * @param B8R10i the B8R10i to set
     */
    public void setB8R10i(pkl53.component.Textfield B8R10i) {
        this.B8R10i = B8R10i;
    }

    /**
     * @return the B8R10j
     */
    public pkl53.component.Textfield getB8R10j() {
        return B8R10j;
    }

    /**
     * @param B8R10j the B8R10j to set
     */
    public void setB8R10j(pkl53.component.Textfield B8R10j) {
        this.B8R10j = B8R10j;
    }

    /**
     * @return the B8R2
     */
    public pkl53.component.Textfield getB8R2() {
        return B8R2;
    }

    /**
     * @param B8R2 the B8R2 to set
     */
    public void setB8R2(pkl53.component.Textfield B8R2) {
        this.B8R2 = B8R2;
    }

    /**
     * @return the B8R3
     */
    public pkl53.component.Textfield getB8R3() {
        return B8R3;
    }

    /**
     * @param B8R3 the B8R3 to set
     */
    public void setB8R3(pkl53.component.Textfield B8R3) {
        this.B8R3 = B8R3;
    }

    /**
     * @return the B8R4
     */
    public pkl53.component.Textfield getB8R4() {
        return B8R4;
    }

    /**
     * @param B8R4 the B8R4 to set
     */
    public void setB8R4(pkl53.component.Textfield B8R4) {
        this.B8R4 = B8R4;
    }

    /**
     * @return the B8R5a
     */
    public pkl53.component.Textfield getB8R5a() {
        return B8R5a;
    }

    /**
     * @param B8R5a the B8R5a to set
     */
    public void setB8R5a(pkl53.component.Textfield B8R5a) {
        this.B8R5a = B8R5a;
    }

    /**
     * @return the B8R5b
     */
    public pkl53.component.Textfield getB8R5b() {
        return B8R5b;
    }

    /**
     * @param B8R5b the B8R5b to set
     */
    public void setB8R5b(pkl53.component.Textfield B8R5b) {
        this.B8R5b = B8R5b;
    }

    /**
     * @return the B8R6
     */
    public pkl53.component.Textfield getB8R6() {
        return B8R6;
    }

    /**
     * @param B8R6 the B8R6 to set
     */
    public void setB8R6(pkl53.component.Textfield B8R6) {
        this.B8R6 = B8R6;
    }

    /**
     * @return the B8R7a
     */
    public pkl53.component.Textfield getB8R7a() {
        return B8R7a;
    }

    /**
     * @param B8R7a the B8R7a to set
     */
    public void setB8R7a(pkl53.component.Textfield B8R7a) {
        this.B8R7a = B8R7a;
    }

    /**
     * @return the B8R7b
     */
    public pkl53.component.Textfield getB8R7b() {
        return B8R7b;
    }

    /**
     * @param B8R7b the B8R7b to set
     */
    public void setB8R7b(pkl53.component.Textfield B8R7b) {
        this.B8R7b = B8R7b;
    }

    /**
     * @return the B8R8
     */
    public pkl53.component.Textfield getB8R8() {
        return B8R8;
    }

    /**
     * @param B8R8 the B8R8 to set
     */
    public void setB8R8(pkl53.component.Textfield B8R8) {
        this.B8R8 = B8R8;
    }

    /**
     * @return the B8R9
     */
    public pkl53.component.Textfield getB8R9() {
        return B8R9;
    }

    /**
     * @param B8R9 the B8R9 to set
     */
    public void setB8R9(pkl53.component.Textfield B8R9) {
        this.B8R9 = B8R9;
    }

    /**
     * @return the blokPekerja7891
     */
    public pkl53.imageClass.BlokPekerja789 getBlokPekerja7891() {
        return blokPekerja7891;
    }

    /**
     * @param blokPekerja7891 the blokPekerja7891 to set
     */
    public void setBlokPekerja7891(pkl53.imageClass.BlokPekerja789 blokPekerja7891) {
        this.blokPekerja7891 = blokPekerja7891;
    }

    /**
     * @return the listTextFieldBlok789
     */
    public ArrayList<Textfield> getListTextFieldBlok789() {
        return listTextFieldBlok789;
    }

    /**
     * @return the panelBlok123
     */
    public Blok123 getpanelBlok123() {
        return panelBlok123;
    }

    /**
     * @param panelBlok123 the panelBlok123 to set
     */
    public void setpanelBlok123(Blok123 panelBlok123) {
        this.panelBlok123 = panelBlok123;
    }

    public void setBlok7Database() {
        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        List<KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        List<KetRt> rtList = new ArrayList<KetRt>();

        IntegerConverter ic = new IntegerConverter();
        rtAnggotaList = submit.getketRtAnggota(panelBlok123.getB1R6().getText(), 1, new KetKuesioner(panelBlok123.getB1R1().getText()
                + panelBlok123.getB1R2().getText()
                + panelBlok123.getB1R3().getText()
                + panelBlok123.getB1R5a().getText()));
        rtList = submit.getketRt(new KetKuesioner(panelBlok123.getB1R1().getText()
                + panelBlok123.getB1R2().getText()
                + panelBlok123.getB1R3().getText()
                + panelBlok123.getB1R5a().getText()), panelBlok123.getB1R6().getText());
        if (rtAnggotaList.size() > 0) {
            for (KetRtanggota rt : rtAnggotaList) {
                if(ic.convertReverse(rt.getB4r7()).equals("1")){
                    B7R1.setText(rt.getB4r8());
                    B7R2.setText(ic.convertReverse(rt.getB4r11()));
                    
                }
                
            }
            for (KetRt rt : rtList) {
                B7R5.setText(ic.convertReverse(rt.getB4r6()));
            }
        }
    }
}