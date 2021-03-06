/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JLabel;
import pkl53.component.Textfield;
import pkl53.converter.DateConverter;
import pkl53.converter.IntegerConverter;
import pkl53.validasi.B123PekerjaValidasi;


/**
 *
 * @author HP G42 (RILLA)
 */
public class Blok123 extends javax.swing.JPanel {
   
    /**
     * Creates new form BlokPekerja123
     */
   private ArrayList<Textfield> listTextFieldBlok123 = new ArrayList<Textfield>();
   private ArrayList<JLabel> listLabelBlok123 = new ArrayList<JLabel>();
    /**
     * Creates new form blok123
     */
    public Blok123() {
        initComponents();
        addListTextfield();
        B123PekerjaValidasi val = new B123PekerjaValidasi();
        val.setPanelBlok123(this);
        val.registerValidasi();
       
        
    }
    
    public List<Textfield> getListTextFieldBlok123() {
        return listTextFieldBlok123;
    }

    public void addListTextfield() {
        getListTextFieldBlok123().add(0, getB1R1());
        getListTextFieldBlok123().add(1, getB1R2());
        getListTextFieldBlok123().add(2, getB1R3());
        
        getListTextFieldBlok123().add(3, getB1R4());
        getListTextFieldBlok123().add(4, getB1R5a());
        getListTextFieldBlok123().add(5, getB1R5b());
        getListTextFieldBlok123().add(6, getB1R6());
        getListTextFieldBlok123().add(7, getB2R1());
        getListTextFieldBlok123().add(8, getB2R2());
        getListTextFieldBlok123().add(9, getB2R3 ());
        getListTextFieldBlok123().add(10, getB3C1R2());
        getListTextFieldBlok123().add(11, getB3C1R3a());
        getListTextFieldBlok123().add(12, getB3C2R3a());
        
       
//        getListTextFieldBlok123().add(8, getB1R9());
//     
//        getListTextFieldBlok123().add(10, getB2R1());
//        getListTextFieldBlok123().add(11, getB2R2());
//        getListTextFieldBlok123().add(12, getB3C1R1());
//        getListTextFieldBlok123().add(13, getB3C2R1());
//        getListTextFieldBlok123().add(14, getB3C1R2());
//        getListTextFieldBlok123().add(15, getB3C2R2());
//        getListTextFieldBlok123().add(16, getB3C1R3a());
//        getListTextFieldBlok123().add(17, getB3C1R3b());
//        getListTextFieldBlok123().add(18, getB3C2R3a());
//        getListTextFieldBlok123().add(19, getB3C2R3b());
    }
    public void addLabel() {
        listLabelBlok123.add(namaKortimLabel);
        listLabelBlok123.add(namaKrtLabel);
        listLabelBlok123.add(namaPenacacahLabel);
        listLabelBlok123.add(AlamatLabel);
        listLabelBlok123.add(kecamatanLabel);
        listLabelBlok123.add(kelurahanLabel);
        listLabelBlok123.add(nimKortimLabel);
    
    }
     public ArrayList<JLabel> getListLabelBlok123() {
        return listLabelBlok123;
    }
    
    private EntityManager em;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blok1232 = new pkl53.imageClass.BlokPekerja123();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        B1R2 = new pkl53.component.Textfield();
        B1R1 = new pkl53.component.Textfield();
        B1R3 = new pkl53.component.Textfield();
        B1R4 = new pkl53.component.Textfield();
        B1R5a = new pkl53.component.Textfield();
        B1R5b = new pkl53.component.Textfield();
        B1R6 = new pkl53.component.Textfield();
        B2R1 = new pkl53.component.Textfield();
        B2R2 = new pkl53.component.Textfield();
        B3C1R2 = new pkl53.component.Textfield();
        B3C2R3a = new pkl53.component.Textfield();
        B3C1R3a = new pkl53.component.Textfield();
        B2R3 = new pkl53.component.Textfield();
        namaPenacacahLabel = new javax.swing.JLabel();
        namaKortimLabel = new javax.swing.JLabel();
        nimKortimLabel = new javax.swing.JLabel();
        AlamatLabel = new javax.swing.JLabel();
        namaKrtLabel = new javax.swing.JLabel();
        kelurahanLabel = new javax.swing.JLabel();
        kecamatanLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1070, 1765));

        blok1232.setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1367, 724));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1R2.setLength(3);
        B1R2.setPanel(blok1232);
        jLayeredPane1.add(B1R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 465, 70, 30));

        B1R1.setLength(2);
        B1R1.setPanel(blok1232);
        jLayeredPane1.add(B1R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 397, 35, 30));

        B1R3.setLength(3);
        B1R3.setPanel(blok1232);
        jLayeredPane1.add(B1R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 70, 30));

        B1R4.setPanel(blok1232);
        jLayeredPane1.add(B1R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 35, 30));

        B1R5a.setCharType('2');
        B1R5a.setLength(4);
        B1R5a.setPanel(blok1232);
        jLayeredPane1.add(B1R5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 90, 30));

        B1R5b.setCharType('2');
        B1R5b.setLength(4);
        B1R5b.setPanel(blok1232);
        jLayeredPane1.add(B1R5b, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 90, 30));

        B1R6.setLength(3);
        B1R6.setPanel(blok1232);
        B1R6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                B1R6FocusLost(evt);
            }
        });
        jLayeredPane1.add(B1R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 700, 60, 30));

        B2R1.setLength(2);
        B2R1.setNextType(true);
        B2R1.setPanel(blok1232);
        B2R1.setTextfield(B2R2);
        B2R1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                B2R1FocusLost(evt);
            }
        });
        B2R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2R1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(B2R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 970, 35, 30));

        B2R2.setLength(2);
        B2R2.setNextType(true);
        B2R2.setPanel(blok1232);
        B2R2.setTextfield(B2R3);
        B2R2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                B2R2FocusLost(evt);
            }
        });
        jLayeredPane1.add(B2R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 1020, 35, 30));

        B3C1R2.setCharType('3');
        B3C1R2.setLength(7);
        B3C1R2.setNextType(true);
        B3C1R2.setPanel(blok1232);
        B3C1R2.setTextfield(B3C1R3a);
        jLayeredPane1.add(B3C1R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1270, 280, 30));

        B3C2R3a.setLength(2);
        B3C2R3a.setPanel(blok1232);
        jLayeredPane1.add(B3C2R3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1307, 40, 30));

        B3C1R3a.setLength(2);
        B3C1R3a.setNextType(true);
        B3C1R3a.setPanel(blok1232);
        B3C1R3a.setTextfield(B3C2R3a);
        jLayeredPane1.add(B3C1R3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1307, 40, 30));

        B2R3.setLength(2);
        B2R3.setNextType(true);
        B2R3.setPanel(blok1232);
        B2R3.setTextfield(B3C1R2);
        jLayeredPane1.add(B2R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 1070, 35, 30));

        namaPenacacahLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namaPenacacahLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaPenacacahLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 1237, 270, 20));

        namaKortimLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namaKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1237, 290, 20));

        nimKortimLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nimKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(nimKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 1275, 150, 20));

        AlamatLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AlamatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(AlamatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 810, 470, 30));

        namaKrtLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namaKrtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaKrtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 750, 340, 25));

        kelurahanLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kelurahanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(kelurahanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 150, 20));

        kecamatanLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kecamatanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(kecamatanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 150, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1315, 120, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1315, 120, -1));

        javax.swing.GroupLayout blok1232Layout = new javax.swing.GroupLayout(blok1232);
        blok1232.setLayout(blok1232Layout);
        blok1232Layout.setHorizontalGroup(
            blok1232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        blok1232Layout.setVerticalGroup(
            blok1232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1761, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blok1232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blok1232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B2R2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B2R2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_B2R2FocusLost

    private void B2R1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B2R1FocusLost
        // TODO add your handling code here:
        IntegerConverter intcovert = new IntegerConverter();
        DataEntriPekerjaanPanel.setJumlahPekerja(intcovert.convertForward(B2R1.getText()));
    }//GEN-LAST:event_B2R1FocusLost

    private void B2R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2R1ActionPerformed

    private void B1R6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B1R6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_B1R6FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel AlamatLabel;
    private static pkl53.component.Textfield B1R1;
    private static pkl53.component.Textfield B1R2;
    private static pkl53.component.Textfield B1R3;
    private static pkl53.component.Textfield B1R4;
    private static pkl53.component.Textfield B1R5a;
    private pkl53.component.Textfield B1R5b;
    private static pkl53.component.Textfield B1R6;
    private pkl53.component.Textfield B2R1;
    private pkl53.component.Textfield B2R2;
    private pkl53.component.Textfield B2R3;
    private pkl53.component.Textfield B3C1R2;
    private pkl53.component.Textfield B3C1R3a;
    private pkl53.component.Textfield B3C2R3a;
    private pkl53.imageClass.BlokPekerja123 blok1232;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private static javax.swing.JLabel kecamatanLabel;
    private static javax.swing.JLabel kelurahanLabel;
    private static javax.swing.JLabel namaKortimLabel;
    private static javax.swing.JLabel namaKrtLabel;
    private static javax.swing.JLabel namaPenacacahLabel;
    private static javax.swing.JLabel nimKortimLabel;
    // End of variables declaration//GEN-END:variables

    
    /**
     * @return the kecamatanLabel
     */
    public static javax.swing.JLabel getKecamatanLabel() {
        return kecamatanLabel;
    }

    /**
     * @param aKecamatanLabel the kecamatanLabel to set
     */
    public static void setKecamatanLabel(String aKecamatanLabel) {
        kecamatanLabel.setText(aKecamatanLabel);
    }
    public static String getKKS() {
        return B1R1.getText()+B1R2.getText()+B1R3.getText()+B1R5a.getText();
    }

    /**
     * @return the kelurahanLabel
     */
    public static javax.swing.JLabel getKelurahanLabel() {
        return kelurahanLabel;
    }

    /**
     * @param aKelurahanLabel the kelurahanLabel to set
     */
    public static void setKelurahanLabel(String aKelurahanLabel) {
        kelurahanLabel.setText(aKelurahanLabel);}
   
    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the B1R1
     */
    public static pkl53.component.Textfield getB1R1() {
        return B1R1;
    }

    /**
     * @param B1R1 the B1R1 to set
     */
    public void setB1R1(pkl53.component.Textfield B1R1) {
        this.B1R1 = B1R1;
    }

    /**
     * @return the B1R2
     */
    public pkl53.component.Textfield getB1R2() {
        return B1R2;
    }

    /**
     * @param B1R2 the B1R2 to set
     */
    public void setB1R2(pkl53.component.Textfield B1R2) {
        this.B1R2 = B1R2;
    }

    /**
     * @return the B1R3
     */
    public pkl53.component.Textfield getB1R3() {
        return B1R3;
    }

    /**
     * @param B1R3 the B1R3 to set
     */
    public void setB1R3(pkl53.component.Textfield B1R3) {
        this.B1R3 = B1R3;
    }

    /**
     * @return the B1R4
     */
    public pkl53.component.Textfield getB1R4() {
        return B1R4;
    }

    /**
     * @param B1R4 the B1R4 to set
     */
    public void setB1R4(pkl53.component.Textfield B1R4) {
        this.B1R4 = B1R4;
    }

    /**
     * @return the B1R5a
     */
    public pkl53.component.Textfield getB1R5a() {
        return B1R5a;
    }

    /**
     * @param B1R5a the B1R5a to set
     */
    public void setB1R5a(pkl53.component.Textfield B1R5a) {
        this.B1R5a = B1R5a;
    }

    /**
     * @return the B1R5b
     */
    public pkl53.component.Textfield getB1R5b() {
        return B1R5b;
    }

    /**
     * @param B1R5b the B1R5b to set
     */
    public void setB1R5b(pkl53.component.Textfield B1R5b) {
        this.B1R5b = B1R5b;
    }

    /**
     * @return the B1R6
     */
    public static pkl53.component.Textfield getB1R6() {
        return B1R6;
    }

    /**
     * @param B1R6 the B1R6 to set
     */
    public void setB1R6(pkl53.component.Textfield B1R6) {
        this.B1R6 = B1R6;
    }

   
//    /**
//     * @return the B1R9
//     */
//    public pkl53.component.Textfield getB1R9() {
//        return B2R1;
//    }
//
//    /**
//     * @param B1R9 the B1R9 to set
//     */
//    public void setB1R9(pkl53.component.Textfield B1R9) {
//        this.B2R1 = B1R9;
//    }

    /**
     * @return the B2R1
     */
    public pkl53.component.Textfield getB2R1() {
        return B2R1;
    }

    /**
     * @param B2R1 the B2R1 to set
     */
    public void setB2R1(pkl53.component.Textfield B2R1) {
        this.setB2R2(B2R1);
    }


    
    public pkl53.component.Textfield getB3C1R2() {
        return B3C1R2;
    }

    /**
     * @param B3C1R2 the B3C1R2 to set
     */
    public void setB3C1R2(pkl53.component.Textfield B3C1R2) {
        this.B3C1R2 = B3C1R2;
    }

    /**
     * @return the B3C1R3a
     */
    public pkl53.component.Textfield getB3C1R3a() {
        return B3C1R3a;
    }

    /**
     * @param B3C1R3a the B3C1R3a to set
     */
    public void setB3C1R3a(pkl53.component.Textfield B3C1R3a) {
        this.B3C1R3a = B3C1R3a;
    }

    /**
     * @return the B3C1R3b
    
  
 
    /**
     * @return the B3C2R3a
     */
    public pkl53.component.Textfield getB3C2R3a() {
        return B3C2R3a;
    }

    /**
     * @param B3C2R3a the B3C2R3a to set
     */
    public void setB3C2R3a(pkl53.component.Textfield B3C2R3a) {
        this.B3C2R3a = B3C2R3a;
    }

    /**
     * @return the B3C2R3b
   
    /**
     * @return the blok1231
     */
    public pkl53.imageClass.BlokPekerja123 getBlok1231() {
        return getBlok1232();
    }

    /**
     * @param blok1231 the blok1231 to set
     */
    public void setBlok1231(pkl53.imageClass.BlokPekerja123 blok1231) {
        this.setBlok1232(blok1231);
    }

    /**
     * @return the B2R3
     */
    public pkl53.component.Textfield getB2R3() {
        return B2R3;
    }

    /**
     * @param B2R3 the B2R3 to set
     */
    public void setB2R3(pkl53.component.Textfield B2R3) {
        this.B2R3 = B2R3;
    }

   




    /**
     * @return the blok1232
     */
    public pkl53.imageClass.BlokPekerja123 getBlok1232() {
        return blok1232;
    }

    /**
     * @param blok1232 the blok1232 to set
     */
    public void setBlok1232(pkl53.imageClass.BlokPekerja123 blok1232) {
        this.blok1232 = blok1232;
    }

    /**
     * @return the B2R2
     */
    public pkl53.component.Textfield getB2R2() {
        return B2R2;
    }

    /**
     * @param B2R2 the B2R2 to set
     */
    public void setB2R2(pkl53.component.Textfield B2R2) {
        this.B2R2 = B2R2;
    }

    /**
     * @return the namaKortimLabel
     */
    public static javax.swing.JLabel getNamaKortimLabel() {
        return namaKortimLabel;
    }

    /**
     * @param namaKortimLabel the namaKortimLabel to set
     */
    public void setNamaKortimLabel(javax.swing.JLabel namaKortimLabel) {
        this.namaKortimLabel = namaKortimLabel;
    }

    /**
     * @return the namaPenacacahLabel
     */
    public static javax.swing.JLabel getNamaPenacacahLabel() {
        return namaPenacacahLabel;
    }

    /**
     * @param namaPenacacahLabel the namaPenacacahLabel to set
     */
    public void setNamaPenacacahLabel(javax.swing.JLabel namaPenacacahLabel) {
        this.namaPenacacahLabel = namaPenacacahLabel;
    }

    /**
     * @return the nimKortimLabel
     */
    public static javax.swing.JLabel getNimKortimLabel() {
        return nimKortimLabel;
    }

    /**
     * @param nimKortimLabel the nimKortimLabel to set
     */
    public void setNimKortimLabel(javax.swing.JLabel nimKortimLabel) {
        this.nimKortimLabel = nimKortimLabel;
    }

    /**
     * @return the AlamatLabel
     */
    public static javax.swing.JLabel getAlamatLabel() {
        return AlamatLabel;
    }

    /**
     * @param AlamatLabel the AlamatLabel to set
     */
    public static void setAlamatLabel(javax.swing.JLabel AlamatLabels) {
        AlamatLabel = AlamatLabels;
    }

    /**
     * @return the namaKrtLabel
     */
    public static javax.swing.JLabel getNamaKrtLabel() {
        return namaKrtLabel;
    }

    /**
     * @param namaKrtLabel the namaKrtLabel to set
     */
    public static void setNamaKrtLabel(javax.swing.JLabel namaKrtLabels) {
        namaKrtLabel = namaKrtLabels;
    }
}
