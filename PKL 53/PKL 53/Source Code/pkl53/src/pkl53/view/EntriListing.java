/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.Icon;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.IconUIResource;
import pkl53.component.Textfield;
import pkl53.controller.BackupKuesioner;
import pkl53.controller.KuesionerController;
import pkl53.controller.KuesionerControllerListing;
import pkl53.controller.SubmitControllerPekerjaan;
import pkl53.controller.SubmitListingController;
import pkl53.converter.IntegerConverter;
import pkl53.model.B5Keteranganumumtenagakerjainformal;
import pkl53.model.B6Keteranganumumpekerjaaninformalutama;
import pkl53.model.B7KepalaArt;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author User
 */
public class EntriListing extends javax.swing.JPanel {

    int i = 0;
    private static int jumlahPekerja;
    private static String KKS;
    private static int jumlahRt;

    /**
     * @return the jumlahPekerja
     */
    public static int getJumlahPekerja() {
        return jumlahPekerja;
    }

    /**
     * @return the KKS
     */
    public static String getKKS() {
        return KKS;
    }

    /**
     * @param aKKS the KKS to set
     */
    public static void setKKS(String aKKS) {
        KKS = aKKS;
    }

    /**
     * @return the jScrollPane1
     */
    public static javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @return the jumlahRt
     */
    public static int getJumlahRt() {
        return jumlahRt;
    }

    /**
     * @param aJumlahRt the jumlahRt to set
     */
    public static void setJumlahRt(int aJumlahRt) {
        jumlahRt = aJumlahRt;
    }

    /**
     * @return the jumlahPekerja
     */
    CardLayout card;
    private JPanel panel;
    private KuesionerControllerListing kuesionerControllerListing = new KuesionerControllerListing();
    private int loop = 1;
    private ArrayList<B5Keteranganumumtenagakerjainformal> b5List = new ArrayList<B5Keteranganumumtenagakerjainformal>();
    private ArrayList<B6Keteranganumumpekerjaaninformalutama> b6List = new ArrayList<B6Keteranganumumpekerjaaninformalutama>();
    private ArrayList<B7KepalaArt> b7List = new ArrayList<B7KepalaArt>();
    private ArrayList<Textfield> isianWajibBlok123 = new ArrayList<Textfield>();

    /**
     * Creates new form dataEntriPanel
     */
    public EntriListing() {
        initComponents();
        editButton.setMnemonic('D');
        final TimerTask t = new TimerTask() {

            @Override
            public void run() {

                i++;
                jLabel1.setText(String.valueOf(i));
            }
        };
        new java.util.Timer().scheduleAtFixedRate(
                t,
                0, // run first occurrence immediatetly
                1000
        );
        Submit.setMnemonic('S');

        kuesionerControllerListing.setBlok123Listing(blok123Listing1);
        blok123Listing1.setName("blok123");
        addIsianWajib123();

//  
////
//        blok123.setName("blok123");
//        blok4.setName("blok4");
//        blok4B.setName("blok4B");
//        blok56.setName("blok56");
//        blok56B.setName("blok56B");
//        blok789.setName("blok789");
    }

    static void setJumlahPekerja(int jp) {
        jumlahPekerja = jp;
    }

    public void setmainFrame(JPanel panel) {
        this.panel = panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLain1 = new pkl53.imageClass.BackgroundLain();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        blok123Listing1 = new pkl53.view.Blok123Listing();
        blok4Listing2 = new pkl53.view.Blok4Listing();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1368, 768));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/next.png"))); // NOI18N
        nextButton.setContentAreaFilled(false);
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextButtonMouseExited(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/prev.png"))); // NOI18N
        previousButton.setContentAreaFilled(false);
        previousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previousButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previousButtonMouseExited(evt);
            }
        });
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/home.png"))); // NOI18N
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/reset2.png"))); // NOI18N
        Save.setContentAreaFilled(false);
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/submit.png"))); // NOI18N
        Submit.setContentAreaFilled(false);
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitMouseExited(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setMaximumSize(new java.awt.Dimension(2127, 789));
        containerPanel.setPreferredSize(new java.awt.Dimension(2127, 800));
        containerPanel.setLayout(new java.awt.CardLayout());
        containerPanel.add(blok123Listing1, "card2");
        containerPanel.add(blok4Listing2, "card3");

        jScrollPane1.setViewportView(containerPanel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("waktu  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("(s)");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Listing");

        editButton.setContentAreaFilled(false);
        editButton.setOpaque(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLain1Layout = new javax.swing.GroupLayout(backgroundLain1);
        backgroundLain1.setLayout(backgroundLain1Layout);
        backgroundLain1Layout.setHorizontalGroup(
            backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLain1Layout.createSequentialGroup()
                .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        backgroundLain1Layout.setVerticalGroup(
            backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLain1Layout.createSequentialGroup()
                .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeButton)
                            .addComponent(Submit)
                            .addComponent(Save)
                            .addComponent(previousButton)
                            .addComponent(nextButton))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLain1Layout.createSequentialGroup()
                        .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLain1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(backgroundLain1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        card = (CardLayout) getContainerPanel().getLayout();
        card.next(getContainerPanel());

//        if (getCurrentCard().getName().equals("blok123")) {
//            if (IsianSalah()) {
//                JOptionPane.showMessageDialog(null, "Gagal Lanjut \nMasih ada Isian Salah / Kosong");
//            } else {
//                card = (CardLayout) getContainerPanel().getLayout();
//                card.next(getContainerPanel());
//                Blok4Listing.getfocused();
//                getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
//            }
//        } else {
//            card = (CardLayout) getContainerPanel().getLayout();
//            card.next(getContainerPanel());
//            Blok4Listing.getfocused();
//            getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
//        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        card = (CardLayout) getContainerPanel().getLayout();
        card.previous(getContainerPanel());
        getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
    }//GEN-LAST:event_previousButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Reset?", "Confirm", 0);
        if (x == 0) {
            kuesionerControllerListing.resetBlok123();
            card = (CardLayout) panel.getLayout();
            card.show(panel, "homePanel");
            
            
            for(Textfield field : Blok123Listing.getListTextFieldBlok123()){
                field.setText(null);
                field.setBackground(Color.WHITE);
            
            }
            Blok4Listing.resetLoop();
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Reset Blok 4?", "Reset", 0);
        if (x == 0) {
            Blok4Listing.resetLoop();

        }
        

    }//GEN-LAST:event_SaveActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Yakin Mengsubmit Entrian?", "Confirm", 0);
        if (x == 0) {
            SubmitListingController submit = new SubmitListingController();
            submit.setBlok123(blok123Listing1);
            submit.setBlok4(blok4Listing2);
            submit.setListKetRT(blok4Listing2.getlistRT());
            submit.setListKetaRTambahan(blok4Listing2.getlistaRTambahan());
            submit.insertAllBlok(i);
            i = 0;

        }

//        
//        
//         
//        
//        
//        B5Keteranganumumtenagakerjainformal b5 = new B5Keteranganumumtenagakerjainformal();
//        b5=blok562.getB5Keteranganumumtenagakerjainformal1();
//        b5.setKKSArtNup("123");
//        
//        System.out.println(b5.getKKSArtNup());
//    
//        
//        OpsiB5r11 b5r11 = new OpsiB5r11(blok562.getB5R11().getText());
//        OpsiB5r13 b5r13 = new OpsiB5r13(blok562.getB5R13().getText());
//        OpsiB5r15 b5r15 = new OpsiB5r15(blok562.getB5R15().getText());
//        OpsiB5r9 b5r9 = new OpsiB5r9(blok562.getB5R9().getText());
//        
//        b5.setB5r11(b5r11);
//        b5.setB5r13(b5r13);
//        b5.setB5r15(b5r15);
//        b5.setB5r9(b5r9);
//        
//        B6Keteranganumumpekerjaaninformalutama b6 = new B6Keteranganumumpekerjaaninformalutama();
////        b6 = blok562.getB6Keteranganumumpekerjaaninformalutama();
//        
//        
//        b6.setKKSArtNup("123");
//        
////        OpsiB6r19 b6r19= new OpsiB6r19(blok671.getB6R19().getText());
////        OpsiB6r17 b6r17 = new OpsiB6r17(blok671.getB6R17().getText());
////        OpsiB6r16 b6r16 = new OpsiB6r16(blok671.getB6R16().getText());
////        OpsiB6r13a b6r13a = new OpsiB6r13a(blok671.getB6R13a().getText());
////        OpsiB6r10 b6r10 = new OpsiB6r10(blok671.getB6R10().getText());
////        OpsiB6r6utamaLain b6R6lain = new OpsiB6r6utamaLain(Integer.parseInt(blok562.getB6R6().getText()));
////       
////        OpsiB6r3 b6r3 = new OpsiB6r3(blok562.getB6R3().getText());
////        OpsiB6r23 b6r23 = new OpsiB6r23(blok671.getB6R22a().getText());
////        
////        b6.setB6r19(b6r19);
////        b6.setB6r17(b6r17);
////        b6.setB6r16(b6r16);
////        b6.setB6r13a(b6r13a);
////        b6.setB6r10(b6r10);
////        b6.setB6R6utama(b6R6lain);
////        b6.setB6R6lain(b6R6lain);
////        b6.setB6r3(b6r3);
////        b6.setB6r23(b6r23);
//        
//        
//        
//        
//        
//        
//        
//        
//        B7KepalaArt b7 = new B7KepalaArt("123");
//        String b7r4 = new String(blok671.getB7Kebahagiaanhidup1().getB7r4());
//        OpsiB7r7 b7r7= new OpsiB7r7(blok671.getB7R7().getText());
//        OpsiB7r6 b7r6 = new  OpsiB7r6(blok671.getB7R6().getText());
//        OpsiB7r5 b7r5 = new OpsiB7r5(blok671.getB7R5().getText());
//        OpsiB7r3 b7r3 = new OpsiB7r3(blok671.getB7R3().getText());
//        OpsiB7r2 b7r2 = new OpsiB7r2(blok671.getB7R2().getText());
//        OpsiB7r1 b7r1 = new OpsiB7r1(blok671.getB7R1().getText());
//        
//        
//        B8Keteranganperumahandanaset b8 = new B8Keteranganperumahandanaset();
//        b8 = blok891.getB8Keteranganperumahandanaset();
//         System.out.println(b8.getB8r10f());
//         b8.setKks("");
//       
//        
//        OpsiB8r7b b8r7b = new OpsiB8r7b(blok891.getB8R7b().getText()); 
//        OpsiB8r7a b8r7a= new OpsiB8r7a(blok891.getB8R7a().getText());
//        OpsiB8r6 b8r6 = new OpsiB8r6(blok891.getB8R6().getText());
//        OpsiB8r5b b8r5b = new OpsiB8r5b(blok891.getB8R5a().getText());
//        OpsiB8r5a b8r5a = new OpsiB8r5a(blok891.getB8R5b().getText());
//        OpsiB8r3 b8r3 = new OpsiB8r3(blok891.getB8R3().getText());
//        OpsiB8r2 b8r2 = new OpsiB8r2(blok891.getB8R2().getText()); 
//        OpsiB8r1 b8r1 = new OpsiB8r1(blok891.getB8R1().getText());
//        OpsiB8r9 b8r9 = new OpsiB8r9(blok891.getB8R9().getText());
//        OpsiB8r8 b8r8 = new OpsiB8r8(blok891.getB8R8().getText());
//        
//        b8.setB8r1(b8r1);
//        b8.setB8r2(b8r2);
//        b8.setB8r3(b8r3);
//        b8.setB8r5a(b8r5a);
//        b8.setB8r5b(b8r5b);
//        b8.setB8r6(b8r6);
//        b8.setB8r7a(b8r7a);
//        b8.setB8r7b(b8r7b);
//        b8.setB8r8(b8r8);
//        b8.setB8r9(b8r9);
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
//        EntityManager em = emf.createEntityManager();
////        
////        em.getTransaction().begin();
////        em.persist(b8);
////        em.persist(b7);
////        em.persist(b5);
////        em.persist(b6);
////        em.getTransaction().commit();
////        em.close();
//        
//        
//        
//        
//        
//        
////        em.getTransaction().begin();
////        //em.persist(b5);
////        em.persist(b8);
////        em.getTransaction().commit();
////        em.close();

    }//GEN-LAST:event_SubmitActionPerformed

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/homehover.png")));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // TODO add your handling code here:
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/home.png")));
    }//GEN-LAST:event_homeButtonMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        // TODO add your handling code here:
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/reset2hover.png")));
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        // TODO add your handling code here:
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/reset2.png")));
    }//GEN-LAST:event_SaveMouseExited

    private void SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseEntered
        // TODO add your handling code here:
        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/submithover.png")));
    }//GEN-LAST:event_SubmitMouseEntered

    private void SubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseExited
        // TODO add your handling code here:
        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/submit.png")));
    }//GEN-LAST:event_SubmitMouseExited

    private void previousButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseEntered
        // TODO add your handling code here:
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/prevhover.png")));
    }//GEN-LAST:event_previousButtonMouseEntered

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        // TODO add your handling code here:
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/nexthover.png")));
    }//GEN-LAST:event_nextButtonMouseEntered

    private void previousButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseExited
        // TODO add your handling code here:
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/prev.png")));
    }//GEN-LAST:event_previousButtonMouseExited

    private void nextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseExited
        // TODO add your handling code here:
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/next.png")));
    }//GEN-LAST:event_nextButtonMouseExited

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String x  = JOptionPane.showInputDialog(null, "Masukkan jumlah RT terakhir yang mau dihapus !!!",
                "Delete Rumah Tangga Terakhir",
                JOptionPane.WARNING_MESSAGE
        );
        IntegerConverter intconvert = new IntegerConverter();
        if(!x.equals("")){
        Blok4Listing.deleteLoop(intconvert.convertForward(x));}
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton Submit;
    private pkl53.imageClass.BackgroundLain backgroundLain1;
    private pkl53.view.Blok123Listing blok123Listing1;
    private pkl53.view.Blok4Listing blok4Listing2;
    private static javax.swing.JPanel containerPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    // End of variables declaration//GEN-END:variables

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

    private JPanel getCurrentCard() {
        JPanel card = null;
        for (Component comp : containerPanel.getComponents()) {
            if (comp.isVisible() == true) {
                card = (JPanel) comp;
            }
        }
        return card;
    }

    private boolean IsianSalah() {

        for (Textfield tf : isianWajibBlok123) {
            if (tf.getBackground().toString().equals(new Color(251, 64, 64).toString()) || tf.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean IsianBlok4Salah() {
        for (Loop4Listing l4l : Blok4Listing.getListIsianWajibBlok4()) {
            if (!l4l.getB4R5().getText().equals("000")) {
                if (l4l.getB4R1().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R1().getText().isEmpty()
                        || l4l.getB4R2().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R2().getText().isEmpty()
                        || l4l.getB4R3().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R3().getText().isEmpty()
                        || l4l.getB4R4().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R4().getText().isEmpty()
                        || l4l.getB4R5().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R5().getText().isEmpty()
                        || l4l.getB4R6().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R6().getText().isEmpty()
                        || l4l.getB4R7().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R7().getText().isEmpty()
                        || l4l.getB4R8().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R8().getText().isEmpty()
                        || l4l.getB4R9().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R9().getText().isEmpty()
                        || l4l.getB4R10().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R10().getText().isEmpty()
                        || l4l.getB4R11().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R11().getText().isEmpty()) {
                    return true;
                }
            } else {
                if (l4l.getB4R1().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R1().getText().isEmpty()
                        || l4l.getB4R2().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R2().getText().isEmpty()
                        || l4l.getB4R3().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R3().getText().isEmpty()
                        || l4l.getB4R4().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R4().getText().isEmpty()
                        || l4l.getB4R5().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R5().getText().isEmpty()
                        || l4l.getB4R8().getBackground().toString().equals(new Color(251, 64, 64).toString()) || l4l.getB4R8().getText().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void addIsianWajib123() {
        isianWajibBlok123.add(blok123Listing1.getB1R1());
        isianWajibBlok123.add(blok123Listing1.getB1R2());
        isianWajibBlok123.add(blok123Listing1.getB1R3());
        isianWajibBlok123.add(blok123Listing1.getB1R4());
        isianWajibBlok123.add(blok123Listing1.getB1R5());
        isianWajibBlok123.add(blok123Listing1.getB1R6());
        isianWajibBlok123.add(blok123Listing1.getB3nimPencacah());
        isianWajibBlok123.add(blok123Listing1.getB3tglKortim());
        isianWajibBlok123.add(blok123Listing1.getB3tglPencacah());
    }

}
