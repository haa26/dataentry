/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import pkl53.component.Textfield;
import pkl53.converter.IntegerConverter;
import pkl53.model.B4Art;
import pkl53.model.B4Keteranganumumtenagakerja;
import pkl53.model.KetKuesioner;
import pkl53.model.tambahan.KetRTTambahan;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.view.loop.Loop4A;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author HP G42 (RILLA)
 */
public class Blok4Listing extends javax.swing.JPanel {

    /**
     * @return the containerPanel
     */
    public static javax.swing.JPanel getContainerPanel() {
        return containerPanel;
    }

    /**
     * @param aContainerPanel the containerPanel to set
     */
    public static void setContainerPanel(javax.swing.JPanel aContainerPanel) {
        containerPanel = aContainerPanel;
    }

    /**
     * @return the lisIsianWajibBlok4
     */
    public static ArrayList<Loop4Listing> getListIsianWajibBlok4() {
        return listIsianWajibBlok4;
    }

    /**
     * @param aLisIsianWajibBlok4 the lisIsianWajibBlok4 to set
     */
    public static void setListIsianWajibBlok4(ArrayList<Loop4Listing> aLisIsianWajibBlok4) {
        listIsianWajibBlok4 = aLisIsianWajibBlok4;
    }

    /**
     * Creates new form BlokPekerja123
     */
    private ArrayList<Textfield> listTextFieldBlok123 = new ArrayList<Textfield>();
    private static ArrayList<Loop4Listing> listTextFieldLoop = new ArrayList<Loop4Listing>();
    private static ArrayList<KetRt> listKetRT = new ArrayList<KetRt>();
    private static ArrayList<KetRTTambahan> listKetaRTTambahan = new ArrayList<KetRTTambahan>();
    private static Loop4Listing loop;
    private static IntegerConverter intConverter = new IntegerConverter();
    private static int jumlahRT = 0;
    private static ArrayList<Loop4Listing> listIsianWajibBlok4 = new ArrayList<Loop4Listing>();

    /**
     * Creates new form blok123
     */
    public Blok4Listing() {
        initComponents();

        scrollPaneKedua.getViewport().setOpaque(false);

        loop = new Loop4Listing();
        containerPanel.add(loop);
        loop.getB4R1().requestFocusInWindow();

        listTextFieldLoop.add(loop);
        listKetRT.add(loop.getKetRt());
        
        
        
        listKetaRTTambahan.add(loop.getKetRTTambahan());
        //masukkan dulu loop+propertisnya ke array baru add ke panel

        GridLayout grid = new GridLayout(100, 1, 0, 0);
        containerPanel.setLayout(grid);

        loop.getB4R1().requestFocusInWindow();

    }

    public static ArrayList<Loop4Listing> getListTextFieldLoop() {
        return listTextFieldLoop;

    }

    public static ArrayList<KetRt> getlistRT() {
        return listKetRT;

    }

    public static ArrayList<KetRTTambahan> getlistaRTambahan() {
        return listKetaRTTambahan;

    }

    public static void getfocused() {
        loop.getB4R1().requestFocusInWindow();

    }

    public List<Textfield> getListTextFieldBlok123() {
        return listTextFieldBlok123;
    }

    public static void addLoop(String b4r1, String b4r2, String b4r3, String b4r4, String b4r5, String b4r6, String b4r7) {
        loop = new Loop4Listing();
        getContainerPanel().add(loop);

        listTextFieldLoop.add(loop);
        listKetRT.add(loop.getKetRt());
        listKetaRTTambahan.add(loop.getKetRTTambahan());
        loop.getB4R8().setEnabled(true);

        //masukkan dulu loop+propertisnya ke array baru add ke panel
        loop.getB4R1().setText(b4r1);
        loop.getB4R2().setText(b4r2);
        loop.getB4R3().setText(b4r3);
        loop.getB4R4().setText(b4r4);
        loop.getB4R5().setText(b4r5);
        loop.getB4R6().setText(b4r6);
        loop.getB4R7().setText(b4r7);
        loop.getB4R1().setFocusable(false);
        loop.getB4R2().setFocusable(false);
        loop.getB4R3().setFocusable(false);
        loop.getB4R4().setFocusable(false);
        loop.getB4R5().setFocusable(false);
        loop.getB4R6().setFocusable(false);
        loop.getB4R7().setFocusable(false);

        loop.getB4R1().setPropertiesTextField();
        loop.getB4R2().setPropertiesTextField();
        loop.getB4R3().setPropertiesTextField();
        loop.getB4R4().setPropertiesTextField();
        loop.getB4R5().setPropertiesTextField();
        loop.getB4R6().setPropertiesTextField();
        loop.getB4R7().setPropertiesTextField();
        loop.getB4R24().setPropertiesTextField();
        loop.getB4R25().setPropertiesTextField();
        loop.getB4R30().setPropertiesTextField();
        loop.getB4R31().setPropertiesTextField();

    }

    public static void addNewLoop(String b4r5) {
        //sebelum dilakukan method ini berarti rumah tangga lum bertambah

        loop = new Loop4Listing();
        getContainerPanel().add(loop);
        if (b4r5.equals("000")) {
            loop.getB4R1().requestFocusInWindow();
        }

        listTextFieldLoop.clear();
        //kosongkan dulu utuk reset validasi perrumah tangga
        listTextFieldLoop.add(loop);
        listKetRT.add(loop.getKetRt());
        listKetaRTTambahan.add(loop.getKetRTTambahan());
        //masukkan dulu loop+propertisnya ke array baru add ke panel

    }

    public static boolean CekERoorB4r24() {
        int jumlahPekerja = 0;
        int jumlahUsahaPekerjaan = 0;

        int jumlahartUI = 0;
        int jumlahart = listTextFieldLoop.size();
        boolean bool = true;
        for (Loop4Listing loop : listTextFieldLoop) {
            if (loop.getKetRTTambahan().getB4r7().matches("[1]")
                    && loop.getKetRTTambahan().getB4r9().matches("[1]")) {
                jumlahartUI = intConverter.convertForward(loop.getKetRTTambahan().getB4r24());

            }
            if (loop.getKetRTTambahan().getB4r12().matches("[1]")) {
                jumlahPekerja++;
            }

        }

        for (Loop4Listing loop1 : listTextFieldLoop) {
            if (loop1.getKetRTTambahan().getB4r19().matches("[1-3]")) {
                jumlahUsahaPekerjaan++;
            }
        }

        for (Loop4Listing loop2 : listTextFieldLoop) {
            if (intConverter.convertForward(loop2.getB4R6().getText()) == intConverter.convertForward(loop2.getB4R7().getText())) {
                if (jumlahartUI <= jumlahUsahaPekerjaan) {
                    bool = true;

                } else {
                    bool = false;
                    int index = containerPanel.getComponents().length - jumlahart;
                    Loop4Listing loop;
                    loop = (Loop4Listing) Blok4Listing.getContainerPanel().getComponent(index);
                    loop.getB4R24().setBackground(new Color(251, 64, 64));
                    loop.getB4R25().setBackground(new Color(251, 64, 64));
                    JOptionPane.showMessageDialog(null, "ERROR!!!!!");
                    loop.getB4R24().requestFocusInWindow();
                    return bool;

                }
            } else {
                bool = true;

            }
        }

        return bool;
    }

    public static boolean CekERoorB4r30() {
        int jumlahPekerja = 0;

        int jumlahPekerjaPekerjaaan = 0;
        int jumlahartUI = 0;
        int jumlahart = listTextFieldLoop.size();
        boolean bool = true;
        for (Loop4Listing loop : listTextFieldLoop) {
            if (loop.getKetRTTambahan().getB4r7().matches("[1]")
                    && loop.getKetRTTambahan().getB4r9().matches("[1]")) {
                jumlahartUI = intConverter.convertForward(loop.getKetRTTambahan().getB4r30());

            }
            if (loop.getKetRTTambahan().getB4r12().matches("[1]")) {
                jumlahPekerja++;
            }

        }

        for (Loop4Listing loop1 : listTextFieldLoop) {
            if (loop1.getKetRTTambahan().getB4r19().matches("[4-7]")) {
                jumlahPekerjaPekerjaaan++;
            }
        }

        for (Loop4Listing loop2 : listTextFieldLoop) {
            if (intConverter.convertForward(loop2.getB4R6().getText()) == intConverter.convertForward(loop2.getB4R7().getText())) {
                if (jumlahartUI <= jumlahPekerjaPekerjaaan) {
                    bool = true;

                } else {
                    bool = false;
                    int index = containerPanel.getComponents().length - jumlahart;
                    Loop4Listing loop;
                    loop = (Loop4Listing) Blok4Listing.getContainerPanel().getComponent(index);
                    loop.getB4R30().setBackground(new Color(251, 64, 64));
                    loop.getB4R31().setBackground(new Color(251, 64, 64));
                    JOptionPane.showMessageDialog(null, "ERROR!!!!!");
                    loop.getB4R30().requestFocusInWindow();
                    return bool;

                }
            } else {
                bool = true;

            }
        }

        return bool;
    }

    public static void resetLoop() {
        for (Component comp : getContainerPanel().getComponents()) {

            if (comp instanceof Loop4Listing) {
                getContainerPanel().remove(comp);
                getContainerPanel().updateUI();
            }
        }
        loop = new Loop4Listing();

        listTextFieldLoop.clear();
        listKetaRTTambahan.clear();

        getContainerPanel().add(loop);
        listTextFieldLoop.add(loop);
        listKetRT.add(loop.getKetRt());
        listKetaRTTambahan.add(loop.getKetRTTambahan());
        loop.getB4R1().requestFocusInWindow();
//         

    }

    public static JPanel getpanelutama() {
        return blok123Listing2;
    }

    public static JPanel getpanelu() {
        return getContainerPanel();
    }

    public static void resetArray() {
        listKetRT.clear();
        listKetaRTTambahan.clear();

    }

    public void addListTextfield() {

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

    public static void deleteLoop(int jumlahRT) {

        int rt = 1;
        Component[] comp = getContainerPanel().getComponents();
        //cara mengambil banyak record ya da samapai jumpa 1 kepala rumah tangga?

        for (int i = comp.length - 1; i > 0; i--) {
            Loop4Listing bl = (Loop4Listing) comp[i];
            containerPanel.remove(i);
            listKetaRTTambahan.remove(i);
            containerPanel.updateUI();
            if (bl.getB4R7().getText().equals("1")) {
                
                Blok4Listing.setTotalArtTextfield(String.valueOf(intConverter.convertForward(getTotalArtTextfield().getText())
                        - intConverter.convertForward(bl.getB4R6().getText())));
                Blok4Listing.setTotalArtUsahaInformaltextfield(String.valueOf(intConverter.convertForward(getTotalArtUsahaInformaltextfield().getText())
                        - intConverter.convertForward(bl.getB4R24().getText())));
                Blok4Listing.setTotalArtPekerjaInformaltextfield(String.valueOf(intConverter.convertForward(getTotalArtPekerjaInformaltextfield().getText())
                        - intConverter.convertForward(bl.getB4R30().getText())));
                Blok4Listing.setTotalRtInformaltextfield(String.valueOf(intConverter.convertForward(getTotalRtInformaltextfield().getText()) - 1));

                Blok123Listing.setB2R1(String.valueOf(intConverter.convertForward(Blok123Listing.getB2R1().getText()) - 1));
                Blok123Listing.setB2R2(getTotalArtTextfield());
                Blok123Listing.setB2R3(getTotalArtUsahaInformaltextfield());
                
                if (bl.getB4R25().getText().equals("1")) {
                    Blok123Listing.setB2R4(String.valueOf(intConverter.convertForward(Blok123Listing.getB2R4().getText()) - 1));
                }
                if (bl.getB4R25().getText().equals("2")) {
                    Blok123Listing.setB2R5(String.valueOf(intConverter.convertForward(Blok123Listing.getB2R5().getText()) - 1));
                }
                Blok123Listing.setB2R6(String.valueOf(intConverter.convertForward(Blok123Listing.getB2R4().getText()) + intConverter.convertForward(Blok123Listing.getB2R5().getText())));
                
                Blok123Listing.setB2R7(getTotalArtPekerjaInformaltextfield());
                Blok123Listing.setB2R8(getTotalRtInformaltextfield());

                rt++;
                if (rt > jumlahRT) {

                    break;
                }
            }

        }
        if (comp.length == 1) {
            listKetaRTTambahan.clear();
            for (Component comp1 : getContainerPanel().getComponents()) {

                if (comp1 instanceof Loop4Listing) {
                    getContainerPanel().remove(comp1);
                    getContainerPanel().updateUI();
                }
            }
        }
        addNewLoop("000");

//            if (rt != jumlahRT) {
//                getContainerPanel().remove(i);
//            
//            if (bl.getB4R9().getText().equals("1")) {
//                rt++;
//            }
//            }
//            else{
//            break;
//            }
    }
        //        getListTextFieldBlok123().add(11, getB2R2());
    //        getListTextFieldBlok123().add(12, getB3C1R1());
    //        getListTextFieldBlok123().add(13, getB3C2R1());
    //        getListTextFieldBlok123().add(14, getB3C1R2());
    //        getListTextFieldBlok123().add(15, getB3C2R2());
    //        getListTextFieldBlok123().add(16, getB3C1R3a());
    //        getListTextFieldBlok123().add(17, getB3C1R3b());
    //        getListTextFieldBlok123().add(18, getB3C2R3a());
    //        getListTextFieldBlok123().add(19, getB3C2R3b());

    private EntityManager em;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blok123Listing2 = new pkl53.imageClass.Blok4Listing();
        layeredPaneUtama = new javax.swing.JLayeredPane();
        totalArtTextfield = new pkl53.component.Textfield();
        totalArtUsahaInformaltextfield = new pkl53.component.Textfield();
        totalArtPekerjaInformaltextfield = new pkl53.component.Textfield();
        totalRtInformaltextfield = new pkl53.component.Textfield();
        scrollPaneKedua = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(2127, 789));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        blok123Listing2.setBackground(new java.awt.Color(255, 255, 255));

        layeredPaneUtama.setPreferredSize(new java.awt.Dimension(1367, 724));
        layeredPaneUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalArtTextfield.setEditable(false);
        totalArtTextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalArtTextfield.setText("00");
        totalArtTextfield.setLength(3);
        totalArtTextfield.setPanel(this);
        totalArtTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalArtTextfieldActionPerformed(evt);
            }
        });
        layeredPaneUtama.add(totalArtTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 587, 80, 27));

        totalArtUsahaInformaltextfield.setEditable(false);
        totalArtUsahaInformaltextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalArtUsahaInformaltextfield.setText("00");
        totalArtUsahaInformaltextfield.setLength(3);
        totalArtUsahaInformaltextfield.setPanel(this);
        layeredPaneUtama.add(totalArtUsahaInformaltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1703, 587, 120, 27));

        totalArtPekerjaInformaltextfield.setEditable(false);
        totalArtPekerjaInformaltextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalArtPekerjaInformaltextfield.setText("00");
        totalArtPekerjaInformaltextfield.setLength(3);
        totalArtPekerjaInformaltextfield.setPanel(this);
        layeredPaneUtama.add(totalArtPekerjaInformaltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1922, 587, 105, 27));

        totalRtInformaltextfield.setEditable(false);
        totalRtInformaltextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalRtInformaltextfield.setText("00");
        totalRtInformaltextfield.setLength(3);
        totalRtInformaltextfield.setPanel(this);
        layeredPaneUtama.add(totalRtInformaltextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(2020, 587, 95, 27));

        scrollPaneKedua.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneKedua.setOpaque(false);

        containerPanel.setOpaque(false);
        containerPanel.setPreferredSize(new java.awt.Dimension(1020, 3600));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2101, Short.MAX_VALUE)
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3600, Short.MAX_VALUE)
        );

        scrollPaneKedua.setViewportView(containerPanel);

        layeredPaneUtama.add(scrollPaneKedua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 2120, 355));

        javax.swing.GroupLayout blok123Listing2Layout = new javax.swing.GroupLayout(blok123Listing2);
        blok123Listing2.setLayout(blok123Listing2Layout);
        blok123Listing2Layout.setHorizontalGroup(
            blok123Listing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok123Listing2Layout.createSequentialGroup()
                .addComponent(layeredPaneUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 2127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        blok123Listing2Layout.setVerticalGroup(
            blok123Listing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blok123Listing2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layeredPaneUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(blok123Listing2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void totalArtTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalArtTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalArtTextfieldActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static pkl53.imageClass.Blok4Listing blok123Listing2;
    private static javax.swing.JPanel containerPanel;
    private static javax.swing.JLayeredPane layeredPaneUtama;
    private static javax.swing.JScrollPane scrollPaneKedua;
    private static pkl53.component.Textfield totalArtPekerjaInformaltextfield;
    private static pkl53.component.Textfield totalArtTextfield;
    private static pkl53.component.Textfield totalArtUsahaInformaltextfield;
    private static pkl53.component.Textfield totalRtInformaltextfield;
    // End of variables declaration//GEN-END:variables

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
     * @return the scrollPaneKedua
     */
    public static javax.swing.JScrollPane getScrollPaneKedua() {
        return scrollPaneKedua;
    }

    /**
     * @return the totalArtPekerjaInformaltextfield
     */
    public static pkl53.component.Textfield getTotalArtPekerjaInformaltextfield() {
        return totalArtPekerjaInformaltextfield;
    }

    /**
     * @param totalArtPekerjaInformaltextfield the
     * totalArtPekerjaInformaltextfield to set
     */
    public static void setTotalArtPekerjaInformaltextfield(pkl53.component.Textfield totalArtPekerjaInformaltextfields) {
        totalArtPekerjaInformaltextfield = totalArtPekerjaInformaltextfields;
    }

    public static void setTotalArtPekerjaInformaltextfield(String totalArtPekerjaInformaltextfields) {
        totalArtPekerjaInformaltextfield.setText(totalArtPekerjaInformaltextfields);
    }

    /**
     * @return the totalArtTextfield
     */
    public static pkl53.component.Textfield getTotalArtTextfield() {
        return totalArtTextfield;
    }

    /**
     * @param totalArtTextfield the totalArtTextfield to set
     */
    public static void setTotalArtTextfield(pkl53.component.Textfield totalArtTextfields) {
        totalArtTextfield = totalArtTextfields;
    }

    public static void setTotalArtTextfield(String totalArtTextfields) {
        totalArtTextfield.setText(totalArtTextfields);
    }

    /**
     * @return the totalArtUsahaInformaltextfield
     */
    public static pkl53.component.Textfield getTotalArtUsahaInformaltextfield() {
        return totalArtUsahaInformaltextfield;
    }

    /**
     * @param totalArtUsahaInformaltextfield the totalArtUsahaInformaltextfield
     * to set
     */
    public static void setTotalArtUsahaInformaltextfield(pkl53.component.Textfield totalArtUsahaInformaltextfields) {
        totalArtUsahaInformaltextfield = totalArtUsahaInformaltextfields;
    }

    public static void setTotalArtUsahaInformaltextfield(String totalArtUsahaInformaltextfields) {
        totalArtUsahaInformaltextfield.setText(totalArtUsahaInformaltextfields);
    }

    /**
     * @return the totalRtInformaltextfield
     */
    public static pkl53.component.Textfield getTotalRtInformaltextfield() {
        return totalRtInformaltextfield;
    }

    /**
     * @param totalRtInformaltextfield the totalRtInformaltextfield to set
     */
    public static void setTotalRtInformaltextfield(pkl53.component.Textfield totalRtInformaltextfields) {
        totalRtInformaltextfield = totalRtInformaltextfields;
    }

    public static void setTotalRtInformaltextfield(String totalRtInformaltextfields) {
        totalRtInformaltextfield.setText(totalRtInformaltextfields);
    }

    /**
     * @return the jumlahRT
     */
    public static int getJumlahRT() {
        return jumlahRT;
    }

    /**
     * @param jumlahRT the jumlahRT to set
     */
    public static void setJumlahRT(int jumlahRTs) {
        jumlahRT += jumlahRTs;
    }

}
