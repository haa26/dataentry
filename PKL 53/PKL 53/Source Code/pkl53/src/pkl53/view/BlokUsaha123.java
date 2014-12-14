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
import pkl53.validasi.B123UsahaValidasi;
import pkl53.validasi.UsahaBlok123Validasi;


/**
 *
 * @author HP G42 (RILLA)
 */
public class BlokUsaha123 extends javax.swing.JPanel {

    /**
     * @return the kecamatanLabel
     */
    public static javax.swing.JLabel getKecamatanLabel() {
        return kecamatanLabel;
    }

    /**
     * @param aKecamatanLabel the kecamatanLabel to set
     */
    public static void setKecamatanLabel(javax.swing.JLabel aKecamatanLabel) {
        kecamatanLabel = aKecamatanLabel;
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
    public static void setKelurahanLabel(javax.swing.JLabel aKelurahanLabel) {
        kelurahanLabel = aKelurahanLabel;
    }
    
    /**
     * Creates new form Blok123
     */
   private ArrayList<Textfield> listTextFieldBlok123Usaha = new ArrayList<Textfield>();
    
   private ArrayList<JLabel> listLabelBlok123 = new ArrayList<JLabel>();
    /**
     * Creates new form blok123
     */
    public BlokUsaha123() {
        initComponents();
        addListTextfield();
        
        UsahaBlok123Validasi val = new UsahaBlok123Validasi();
        val.setBlokUsaha123(this);
        val.registerValidasi();
        
        
    }
    
    public List<Textfield> getListTextFieldBlok123Usaha() {
        return listTextFieldBlok123Usaha;
    }

    public void addListTextfield() {
        //10 textfield
        listTextFieldBlok123Usaha.add(getB1R1());
        listTextFieldBlok123Usaha.add(getB1R2());
        listTextFieldBlok123Usaha.add(getB1R3());
        listTextFieldBlok123Usaha.add(getB1R4());
        listTextFieldBlok123Usaha.add(getB1R5a());
        listTextFieldBlok123Usaha.add(getB1R5b());
        listTextFieldBlok123Usaha.add(getB1R6());
        listTextFieldBlok123Usaha.add(getNimPencacah());
        listTextFieldBlok123Usaha.add(getTanggalPemeriksaan());
        listTextFieldBlok123Usaha.add(getTanggalPencacahan());
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        b1TempatTambahan1 = new pkl53.model.tambahan.B1TempatTambahan();
        blok123Usaha1 = new pkl53.imageClass.BlokUsaha123();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        B1R1 = new pkl53.component.Textfield();
        B1R2 = new pkl53.component.Textfield();
        B1R3 = new pkl53.component.Textfield();
        B1R4 = new pkl53.component.Textfield();
        B1R5a = new pkl53.component.Textfield();
        B1R5b = new pkl53.component.Textfield();
        B1R6 = new pkl53.component.Textfield();
        nimPencacah = new pkl53.component.Textfield();
        tanggalPemeriksaan = new pkl53.component.Textfield();
        tanggalPencacahan = new pkl53.component.Textfield();
        namaPenacacahLabel = new javax.swing.JLabel();
        namaKortimLabel = new javax.swing.JLabel();
        nimKortimLabel = new javax.swing.JLabel();
        AlamatLabel = new javax.swing.JLabel();
        namaKrtLabel = new javax.swing.JLabel();
        kelurahanLabel = new javax.swing.JLabel();
        kecamatanLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R1, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r1"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R2, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r2"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R3, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r3"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R4, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r4"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R5a, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r5a"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R5b, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r5b"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, B1R6, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("b1r6"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, nimPencacah, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("nimPencacah"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tanggalPemeriksaan, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("tanggalPemeriksaanKU"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tanggalPencacahan, org.jdesktop.beansbinding.ELProperty.create("${text}"), b1TempatTambahan1, org.jdesktop.beansbinding.BeanProperty.create("tanggalPencacahan"));
        bindingGroup.addBinding(binding);

        setPreferredSize(new java.awt.Dimension(1367, 724));
        setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1367, 724));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1R1.setLength(2);
        B1R1.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 35, 30));

        B1R2.setLength(3);
        B1R2.setPanel(blok123Usaha1);
        B1R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1R2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(B1R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 417, 70, 30));

        B1R3.setLength(3);
        B1R3.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 467, 70, 30));

        B1R4.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 35, 30));

        B1R5a.setCharType('2');
        B1R5a.setLength(4);
        B1R5a.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 100, 27));

        B1R5b.setCharType('2');
        B1R5b.setLength(4);
        B1R5b.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R5b, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 100, 27));

        B1R6.setCharType('3');
        B1R6.setLength(3);
        B1R6.setPanel(blok123Usaha1);
        jLayeredPane1.add(B1R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 660, 50, 27));

        nimPencacah.setCharType('3');
        nimPencacah.setLength(7);
        nimPencacah.setNextType(true);
        nimPencacah.setPanel(blok123Usaha1);
        nimPencacah.setTextfield(tanggalPencacahan);
        jLayeredPane1.add(nimPencacah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 971, 330, 30));

        tanggalPemeriksaan.setLength(2);
        tanggalPemeriksaan.setNextType(true);
        tanggalPemeriksaan.setPanel(blok123Usaha1);
        jLayeredPane1.add(tanggalPemeriksaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1010, 40, 30));

        tanggalPencacahan.setLength(2);
        tanggalPencacahan.setNextType(true);
        tanggalPencacahan.setPanel(blok123Usaha1);
        tanggalPencacahan.setTextfield(tanggalPemeriksaan);
        jLayeredPane1.add(tanggalPencacahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1010, 40, 30));

        namaPenacacahLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaPenacacahLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaPenacacahLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 940, 270, 20));

        namaKortimLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 940, 290, 20));

        nimKortimLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nimKortimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(nimKortimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 978, 200, 20));

        AlamatLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AlamatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(AlamatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 770, 470, 30));

        namaKrtLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaKrtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(namaKrtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, 340, 25));

        kelurahanLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kelurahanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(kelurahanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 150, 20));

        kecamatanLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kecamatanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(kecamatanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 150, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- APRIL -2014");
        jLabel1.setOpaque(true);
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 1017, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("- APRIL -2014");
        jLabel2.setOpaque(true);
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1017, 90, -1));

        javax.swing.GroupLayout blok123Usaha1Layout = new javax.swing.GroupLayout(blok123Usaha1);
        blok123Usaha1.setLayout(blok123Usaha1Layout);
        blok123Usaha1Layout.setHorizontalGroup(
            blok123Usaha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok123Usaha1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        blok123Usaha1Layout.setVerticalGroup(
            blok123Usaha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1543, Short.MAX_VALUE)
        );

        add(blok123Usaha1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void B1R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1R2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlamatLabel;
    private static pkl53.component.Textfield B1R1;
    private static pkl53.component.Textfield B1R2;
    private static pkl53.component.Textfield B1R3;
    private pkl53.component.Textfield B1R4;
    private static pkl53.component.Textfield B1R5a;
    private pkl53.component.Textfield B1R5b;
    private static pkl53.component.Textfield B1R6;
    private pkl53.model.tambahan.B1TempatTambahan b1TempatTambahan1;
    private pkl53.imageClass.BlokUsaha123 blok123Usaha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private static javax.swing.JLabel kecamatanLabel;
    private static javax.swing.JLabel kelurahanLabel;
    private static javax.swing.JLabel namaKortimLabel;
    private javax.swing.JLabel namaKrtLabel;
    private static javax.swing.JLabel namaPenacacahLabel;
    private static javax.swing.JLabel nimKortimLabel;
    private pkl53.component.Textfield nimPencacah;
    private pkl53.component.Textfield tanggalPemeriksaan;
    private pkl53.component.Textfield tanggalPencacahan;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

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
    public static void setB1R6(pkl53.component.Textfield B1R6s) {
        B1R6 = B1R6s;
    }

   

    /**
     * @return the b1TempatTambahan1
     */
    public pkl53.model.tambahan.B1TempatTambahan getB1TempatTambahan1() {
        return b1TempatTambahan1;
    }

    /**
     * @param b1TempatTambahan1 the b1TempatTambahan1 to set
     */
    public void setB1TempatTambahan1(pkl53.model.tambahan.B1TempatTambahan b1TempatTambahan1) {
        this.b1TempatTambahan1 = b1TempatTambahan1;
    }

    /**
     * @return the blok123Usaha1
     */
    public pkl53.imageClass.BlokUsaha123 getBlok123Usaha1() {
        return blok123Usaha1;
    }

    /**
     * @param blok123Usaha1 the blok123Usaha1 to set
     */
    public void setBlok123Usaha1(pkl53.imageClass.BlokUsaha123 blok123Usaha1) {
        this.blok123Usaha1 = blok123Usaha1;
    }

    /**
     * @return the jLayeredPane1
     */
    public javax.swing.JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    /**
     * @param jLayeredPane1 the jLayeredPane1 to set
     */
    public void setjLayeredPane1(javax.swing.JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    /**
     * @return the nimPencacah
     */
    public pkl53.component.Textfield getNimPencacah() {
        return nimPencacah;
    }

    /**
     * @param nimPencacah the nimPencacah to set
     */
    public void setNimPencacah(pkl53.component.Textfield nimPencacah) {
        this.nimPencacah = nimPencacah;
    }

    /**
     * @return the tanggalPemeriksaan
     */
    public pkl53.component.Textfield getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }

    /**
     * @param tanggalPemeriksaan the tanggalPemeriksaan to set
     */
    public void setTanggalPemeriksaan(pkl53.component.Textfield tanggalPemeriksaan) {
        this.tanggalPemeriksaan = tanggalPemeriksaan;
    }

    /**
     * @return the tanggalPencacahan
     */
    public pkl53.component.Textfield getTanggalPencacahan() {
        return tanggalPencacahan;
    }

    /**
     * @param tanggalPencacahan the tanggalPencacahan to set
     */
    public void setTanggalPencacahan(pkl53.component.Textfield tanggalPencacahan) {
        this.tanggalPencacahan = tanggalPencacahan;
    }

    /**
     * @return the AlamatLabel
     */
    public javax.swing.JLabel getAlamatLabel() {
        return AlamatLabel;
    }

    /**
     * @param AlamatLabel the AlamatLabel to set
     */
    public void setAlamatLabel(javax.swing.JLabel AlamatLabel) {
        this.AlamatLabel = AlamatLabel;
    }

    /**
     * @return the namaKrtLabel
     */
    public javax.swing.JLabel getNamaKrtLabel() {
        return namaKrtLabel;
    }

    /**
     * @param namaKrtLabel the namaKrtLabel to set
     */
    public void setNamaKrtLabel(javax.swing.JLabel namaKrtLabel) {
        this.namaKrtLabel = namaKrtLabel;
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
    public static  javax.swing.JLabel getNimKortimLabel() {
        return nimKortimLabel;
    }

    /**
     * @param nimKortimLabel the nimKortimLabel to set
     */
    public void setNimKortimLabel(javax.swing.JLabel nimKortimLabel) {
        this.nimKortimLabel = nimKortimLabel;
    }
    
    

}
