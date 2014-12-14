/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JPanel;
import javax.swing.JTextField;
import pkl53.component.Textfield;
import pkl53.component.dateConverter;

import pkl53.model.B4Art;
import pkl53.model.B4Keteranganumumtenagakerja;
import pkl53.validasi.B123ListingValidasi;
import pkl53.view.loop.Loop4A;
import pkl53.view.loop.Loop4Listing;


/**
 *
 * @author HP G42 (RILLA)
 */
public class Blok123Listing extends javax.swing.JPanel {
  

    /**
     * @return the loop
     */
    public static Loop4Listing getLoop() {
        return loop;
    }

    /**
     * @param aLoop the loop to set
     */
    public static void setLoop(Loop4Listing aLoop) {
        loop = aLoop;
    }

    /**
     * @return the B2R1
     */
    public static pkl53.component.Textfield getB2R1() {
        return B2R1;
    }

    /**
     * @param aB2R1 the B2R1 to set
     */
    public static void setB2R1(String aB2R1) {
        B2R1.setText(aB2R1);
    }

    /**
     * @return the B2R2
     */
    public static pkl53.component.Textfield getB2R2() {
        return B2R2;
    }

    /**
     * @param aB2R2 the B2R2 to set
     */
    public static void setB2R2(pkl53.component.Textfield aB2R2) {
        B2R2 = aB2R2;
    }
     public static void setB2R2(String aB2R1) {
        B2R2.setText(aB2R1);}

    /**
     * @return the B2R3
     */
    public static pkl53.component.Textfield getB2R3() {
        return B2R3;
    }

    /**
     * @param aB2R3 the B2R3 to set
     */
    public static void setB2R3(pkl53.component.Textfield aB2R3) {
        B2R3 = aB2R3;
    }
    public static void setB2R3(String aB2R1) {
        B2R3.setText(aB2R1);}

    /**
     * @return the B2R4
     */
    public static pkl53.component.Textfield getB2R4() {
        return B2R4;
    }

    /**
     * @param aB2R4 the B2R4 to set
     */
    public static void setB2R4(pkl53.component.Textfield aB2R4) {
        B2R4 = aB2R4;
    }
    public static void setB2R4(String aB2R1) {
        B2R4.setText(aB2R1);}

    /**
     * @return the B2R5
     */
    public static pkl53.component.Textfield getB2R8() {
        return B2R8;
    }

    /**
     * @param aB2R5 the B2R5 to set
     */
    public static void setB2R8(pkl53.component.Textfield aB2R5) {
        B2R8 = aB2R5;
    }
    public static void setB2R8(String aB2R1) {
        B2R8.setText(aB2R1);}

    /**
     * @return the B2R6
     */
    public static pkl53.component.Textfield getB2R5() {
        return B2R5;
    }

    /**
     * @param aB2R6 the B2R6 to set
     */
    public static void setB2R5(pkl53.component.Textfield aB2R6) {
        B2R5 = aB2R6;
    }
    public static void setB2R5(String aB2R1) {
        B2R5.setText(aB2R1);}

    /**
     * @return the B2R7
     */
    public static pkl53.component.Textfield getB2R6() {
        return B2R6;
    }

    /**
     * @param aB2R7 the B2R7 to set
     */
    public static void setB2R6(pkl53.component.Textfield aB2R7) {
        B2R6 = aB2R7;
    }
    public static void setB2R6(String aB2R1) {
        B2R6.setText(aB2R1);}

    /**
     * @return the B2R8
     */
    public static pkl53.component.Textfield getB2R7() {
        return B2R7;
    }

    /**
     * @param aB2R8 the B2R8 to set
     */
    public static void setB2R7(pkl53.component.Textfield aB2R8) {
        B2R7 = aB2R8;
    }
    public static void setB2R7(String aB2R1) {
        B2R7.setText(aB2R1);}

    /**
     * @return the namaKortimLabel
     */
    public static javax.swing.JLabel getNamaKortimLabel() {
        return namaKortimLabel;
    }

  
    public static void setNamaKortimLabel(String aNamaKortimLabel) {
        namaKortimLabel.setText(aNamaKortimLabel);
    }

    /**
     * @return the namaPencacahLabel
     */
    public static javax.swing.JLabel getNamaPencacahLabel() {
        return namaPencacahLabel;
    }

   
    public static void setNamaPencacahLabel(String aNamaPencacahLabel) {
        namaPencacahLabel.setText(aNamaPencacahLabel);
    }

    /**
     * @return the nimKortimLabel
     */
    public static javax.swing.JLabel getNimKortimLabel() {
        return nimKortimLabel;
    }

    /**
     * @param aNimKortimLabel the nimKortimLabel to set
     */
    public static void setNimKortimLabel(String aNimKortimLabel) {
        nimKortimLabel.setText(aNimKortimLabel);
    }

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
     * Creates new form BlokPekerja123
     */
   private static ArrayList<Textfield> listTextFieldBlok123 = new ArrayList<Textfield>();
   private static  Loop4Listing loop;
       /**
     * Creates new form blok123
     */
    public Blok123Listing() {
        initComponents();
        addListTextfield();
        B123ListingValidasi val = new B123ListingValidasi();
        val.setBlok123Listing(this);
        val.registerValidasi();
        B2R1.setPropertiesTextField();
        B2R2.setPropertiesTextField();
        B2R3.setPropertiesTextField();
        B2R4.setPropertiesTextField();
        B2R8.setPropertiesTextField();
        B2R5.setPropertiesTextField();
        B2R6.setPropertiesTextField();
        B2R7.setPropertiesTextField();
        B2R7.setPropertiesTextField();
        B2R7.setPropertiesTextField();
        B2R7.setPropertiesTextField();
        B2R7.setPropertiesTextField();
        
    }
    
    public static List<Textfield> getListTextFieldBlok123() {
        return listTextFieldBlok123;
    }
    
     
   

    public void addListTextfield() {
       
        getListTextFieldBlok123().add(B1R1);
        getListTextFieldBlok123().add(B1R2);
        getListTextFieldBlok123().add(B1R3);
        getListTextFieldBlok123().add(B1R4);
        getListTextFieldBlok123().add(B1R5);
        getListTextFieldBlok123().add(B1R6);
        getListTextFieldBlok123().add(B2R1);
        getListTextFieldBlok123().add(B2R2);
        getListTextFieldBlok123().add(B2R3);
        getListTextFieldBlok123().add(B2R4);
        getListTextFieldBlok123().add(B2R8);
        getListTextFieldBlok123().add(B2R5);
        getListTextFieldBlok123().add(B2R6);
        getListTextFieldBlok123().add(B2R7);
        getListTextFieldBlok123().add(B3nimPencacah1);
        getListTextFieldBlok123().add(B3tglPencacahan);
        getListTextFieldBlok123().add(B3tglPemeriksaan);
        
        
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

        blok123Listing = new pkl53.imageClass.Blok123Listing();
        layeredPaneUtama = new javax.swing.JLayeredPane();
        B1R1 = new pkl53.component.Textfield();
        B1R2 = new pkl53.component.Textfield();
        B1R3 = new pkl53.component.Textfield();
        B1R4 = new pkl53.component.Textfield();
        B1R5 = new pkl53.component.Textfield();
        B1R6 = new pkl53.component.Textfield();
        B2R1 = new pkl53.component.Textfield();
        B2R2 = new pkl53.component.Textfield();
        B2R4 = new pkl53.component.Textfield();
        B2R3 = new pkl53.component.Textfield();
        B2R7 = new pkl53.component.Textfield();
        B2R6 = new pkl53.component.Textfield();
        B2R5 = new pkl53.component.Textfield();
        B3nimPencacah1 = new pkl53.component.Textfield();
        B2R8 = new pkl53.component.Textfield();
        jLabel1 = new javax.swing.JLabel();
        B3tglPemeriksaan = new pkl53.component.Textfield();
        jLabel2 = new javax.swing.JLabel();
        B3tglPencacahan = new pkl53.component.Textfield();
        nimKortimLabel = new javax.swing.JLabel();
        namaPencacahLabel = new javax.swing.JLabel();
        namaKortimLabel = new javax.swing.JLabel();
        kelurahanLabel = new javax.swing.JLabel();
        kecamatanLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(2616, 900));
        setLayout(new java.awt.BorderLayout());

        blok123Listing.setBackground(new java.awt.Color(255, 255, 255));

        layeredPaneUtama.setPreferredSize(new java.awt.Dimension(1367, 724));
        layeredPaneUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1R1.setBackground(new java.awt.Color(204, 204, 255));
        B1R1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R1.setLength(2);
        B1R1.setNextType(true);
        B1R1.setPanel(this);
        B1R1.setTextfield(B1R2);
        layeredPaneUtama.add(B1R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 30, 30));

        B1R2.setBackground(new java.awt.Color(204, 204, 255));
        B1R2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R2.setLength(3);
        B1R2.setNextType(true);
        B1R2.setPanel(this);
        B1R2.setTextfield(B1R3);
        layeredPaneUtama.add(B1R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 310, 74, 30));

        B1R3.setBackground(new java.awt.Color(204, 204, 255));
        B1R3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R3.setLength(3);
        B1R3.setNextType(true);
        B1R3.setPanel(this);
        B1R3.setTextfield(B1R4);
        layeredPaneUtama.add(B1R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 364, 74, 30));

        B1R4.setBackground(new java.awt.Color(204, 204, 255));
        B1R4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R4.setNextType(true);
        B1R4.setPanel(this);
        B1R4.setTextfield(B1R5);
        layeredPaneUtama.add(B1R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1171, 236, 30, 30));

        B1R5.setBackground(new java.awt.Color(204, 204, 255));
        B1R5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R5.setCharType('2');
        B1R5.setLength(4);
        B1R5.setNextType(true);
        B1R5.setPanel(this);
        B1R5.setTextfield(B1R6);
        layeredPaneUtama.add(B1R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 278, 70, 30));

        B1R6.setBackground(new java.awt.Color(204, 204, 255));
        B1R6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1R6.setCharType('2');
        B1R6.setLength(30);
        B1R6.setNextType(true);
        B1R6.setPanel(this);
        B1R6.setTextfield(B3nimPencacah1);
        layeredPaneUtama.add(B1R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 364, 358, 30));

        B2R1.setBackground(new java.awt.Color(204, 204, 255));
        B2R1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R1.setLength(3);
        B2R1.setNextType(true);
        B2R1.setPanel(this);
        layeredPaneUtama.add(B2R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 444, 30, 30));

        B2R2.setBackground(new java.awt.Color(204, 204, 255));
        B2R2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R2.setLength(3);
        B2R2.setNextType(true);
        B2R2.setPanel(this);
        layeredPaneUtama.add(B2R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 485, 30, 30));

        B2R4.setBackground(new java.awt.Color(204, 204, 255));
        B2R4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R4.setLength(3);
        B2R4.setNextType(true);
        B2R4.setPanel(this);
        layeredPaneUtama.add(B2R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 567, 30, 30));

        B2R3.setBackground(new java.awt.Color(204, 204, 255));
        B2R3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R3.setLength(3);
        B2R3.setNextType(true);
        B2R3.setPanel(this);
        layeredPaneUtama.add(B2R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 526, 30, 30));

        B2R7.setBackground(new java.awt.Color(204, 204, 255));
        B2R7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R7.setLength(3);
        B2R7.setNextType(true);
        B2R7.setPanel(this);
        layeredPaneUtama.add(B2R7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 526, 30, 30));

        B2R6.setBackground(new java.awt.Color(204, 204, 255));
        B2R6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R6.setLength(3);
        B2R6.setNextType(true);
        B2R6.setPanel(this);
        layeredPaneUtama.add(B2R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 485, 30, 30));

        B2R5.setBackground(new java.awt.Color(204, 204, 255));
        B2R5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R5.setLength(3);
        B2R5.setNextType(true);
        B2R5.setPanel(this);
        layeredPaneUtama.add(B2R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 444, 30, 30));

        B3nimPencacah1.setBackground(new java.awt.Color(204, 204, 255));
        B3nimPencacah1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B3nimPencacah1.setCharType('3');
        B3nimPencacah1.setLength(7);
        B3nimPencacah1.setNextType(true);
        B3nimPencacah1.setPanel(this);
        B3nimPencacah1.setTextfield(B3tglPencacahan);
        layeredPaneUtama.add(B3nimPencacah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 706, 345, 30));

        B2R8.setBackground(new java.awt.Color(204, 204, 255));
        B2R8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2R8.setLength(3);
        B2R8.setNextType(true);
        B2R8.setPanel(this);
        layeredPaneUtama.add(B2R8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 567, 30, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- APRIL - 2014");
        layeredPaneUtama.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 756, -1, -1));

        B3tglPemeriksaan.setBackground(new java.awt.Color(204, 204, 255));
        B3tglPemeriksaan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B3tglPemeriksaan.setLength(2);
        B3tglPemeriksaan.setPanel(this);
        layeredPaneUtama.add(B3tglPemeriksaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 57, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("- APRIL - 2014");
        layeredPaneUtama.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 756, -1, -1));

        B3tglPencacahan.setBackground(new java.awt.Color(204, 204, 255));
        B3tglPencacahan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B3tglPencacahan.setLength(2);
        B3tglPencacahan.setNextType(true);
        B3tglPencacahan.setPanel(this);
        B3tglPencacahan.setTextfield(B3tglPemeriksaan);
        layeredPaneUtama.add(B3tglPencacahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, 57, 30));

        nimKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layeredPaneUtama.add(nimKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 340, 20));

        namaPencacahLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layeredPaneUtama.add(namaPencacahLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 340, 20));

        namaKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layeredPaneUtama.add(namaKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, 340, 20));

        kelurahanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layeredPaneUtama.add(kelurahanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 367, 150, 20));

        kecamatanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layeredPaneUtama.add(kecamatanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 315, 150, 20));

        javax.swing.GroupLayout blok123ListingLayout = new javax.swing.GroupLayout(blok123Listing);
        blok123Listing.setLayout(blok123ListingLayout);
        blok123ListingLayout.setHorizontalGroup(
            blok123ListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok123ListingLayout.createSequentialGroup()
                .addComponent(layeredPaneUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        blok123ListingLayout.setVerticalGroup(
            blok123ListingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok123ListingLayout.createSequentialGroup()
                .addComponent(layeredPaneUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(blok123Listing, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl53.component.Textfield B1R1;
    private pkl53.component.Textfield B1R2;
    private pkl53.component.Textfield B1R3;
    private pkl53.component.Textfield B1R4;
    private pkl53.component.Textfield B1R5;
    private pkl53.component.Textfield B1R6;
    private static pkl53.component.Textfield B2R1;
    private static pkl53.component.Textfield B2R2;
    private static pkl53.component.Textfield B2R3;
    private static pkl53.component.Textfield B2R4;
    private static pkl53.component.Textfield B2R5;
    private static pkl53.component.Textfield B2R6;
    private static pkl53.component.Textfield B2R7;
    private static pkl53.component.Textfield B2R8;
    private pkl53.component.Textfield B3nimPencacah1;
    private pkl53.component.Textfield B3tglPemeriksaan;
    private pkl53.component.Textfield B3tglPencacahan;
    private pkl53.imageClass.Blok123Listing blok123Listing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel kecamatanLabel;
    private static javax.swing.JLabel kelurahanLabel;
    private static javax.swing.JLayeredPane layeredPaneUtama;
    private static javax.swing.JLabel namaKortimLabel;
    private static javax.swing.JLabel namaPencacahLabel;
    private static javax.swing.JLabel nimKortimLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @param listTextFieldBlok123 the listTextFieldBlok123 to set
     */
    public void setListTextFieldBlok123(ArrayList<Textfield> listTextFieldBlok123) {
        this.listTextFieldBlok123 = listTextFieldBlok123;
    }

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
    public pkl53.component.Textfield getB1R1() {
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
     * @return the B1R5
     */
    public pkl53.component.Textfield getB1R5() {
        return B1R5;
    }

    /**
     * @param B1R5 the B1R5 to set
     */
    public void setB1R5(pkl53.component.Textfield B1R5) {
        this.B1R5 = B1R5;
    }

    /**
     * @return the B1R6
     */
    public pkl53.component.Textfield getB1R6() {
        return B1R6;
    }

    /**
     * @param B1R6 the B1R6 to set
     */
    public void setB1R6(pkl53.component.Textfield B1R6) {
        this.B1R6 = B1R6;
    }

    


    /**
     * @return the B3nimPencacah1
     */
    public pkl53.component.Textfield getB3nimPencacah() {
        return B3nimPencacah1;
    }

    /**
     * @param B3nimPencacah1 the B3nimPencacah1 to set
     */
    public void setB3nimPencacah(pkl53.component.Textfield B3nimPencacah1) {
        this.B3nimPencacah1 = B3nimPencacah1;
    }

    /**
     * @return the B3tglKortim
     */
    public pkl53.component.Textfield getB3tglKortim() {
        return B3tglPencacahan;
    }

    /**
     * @param B3tglKortim the B3tglKortim to set
     */
    public void setB3tglKortim(pkl53.component.Textfield B3tglKortim) {
        this.B3tglPencacahan = B3tglKortim;
    }

    /**
     * @return the B3tglPencacah
     */
    public pkl53.component.Textfield getB3tglPencacah() {
        return B3tglPemeriksaan;
    }

    /**
     * @param B3tglPencacah the B3tglPencacah to set
     */
    public void setB3tglPencacah(pkl53.component.Textfield B3tglPencacah) {
        this.B3tglPemeriksaan = B3tglPencacah;
    }

    /**
     * @return the blok123Listing
     */
    public pkl53.imageClass.Blok123Listing getBlok123Listing() {
        return blok123Listing;
    }

    /**
     * @param blok123Listing the blok123Listing to set
     */
    public void setBlok123Listing(pkl53.imageClass.Blok123Listing blok123Listing) {
        this.blok123Listing = blok123Listing;
    }

   
    

}
