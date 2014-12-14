/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.view;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pkl53.controller.BackupKuesioner;
import pkl53.controller.KuesionerController;
import pkl53.controller.SubmitControllerPekerjaan;

import pkl53.model.B5Keteranganumumtenagakerjainformal;
import pkl53.model.B6Keteranganumumpekerjaaninformalutama;
import pkl53.model.B7KepalaArt;
import pkl53.model.tambahan.Blok56BTamabahan;
import pkl53.view.loop.Loop4A;
import pkl53.view.loop.Loop4B;

/**
 *
 * @author User
 */
public class DataEntriPekerjaanPanel extends javax.swing.JPanel {

    int i = 0;
    private static int jumlahPekerja = 0;
    private static String KKS;

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
     * @param ajScrollPane1 the jScrollPane1 to set
     */
    public static void setjScrollPane1(javax.swing.JScrollPane ajScrollPane1) {
        jScrollPane1 = ajScrollPane1;
    }

    /**
     * @return the jumlahPekerja
     */
    private static CardLayout card;
    private JPanel panel;
    private boolean create = true;
    private KuesionerController kuesionerController;
    private int loop = 0;
    private static Blok123 blok123;
    private static Blok4 blok4;
    private static Blok4B blok4b;
    Blok56 blok56;
    Blok56B blok56b;
    Blok789 blok789;
    private ArrayList<Blok56BTamabahan> b5List = new ArrayList<Blok56BTamabahan>();
    private ArrayList<Blok56BTamabahan> b6List = new ArrayList<Blok56BTamabahan>();

    /**
     * Creates new form dataEntriPanel
     */
    public DataEntriPekerjaanPanel() {
        initComponents();
        final TimerTask t = new TimerTask() {

            @Override
            public void run() {

                i++;
                jLabelTime.setText(String.valueOf(i));
            }
        };
        new java.util.Timer().scheduleAtFixedRate(
                t,
                0, // run first occurrence immediatetly
                1000
        );

//        kuesionerController = new KuesionerController();
//        kuesionerController.setDataEntriUsahaPanel(this);
//        kuesionerController.setBlok123(blok123);
//        kuesionerController.setBlok4(blok4);
//        kuesionerController.setBlok4b(blok4B);
//        kuesionerController.setBlok56(blok56);
//        kuesionerController.setBlok56B(blok56B);
//        b5List.add(blok56.getBlok56BTamabahan());
//        b6List.add(blok56B.getBlok56BTamabahan());
//        blok56B.setBlok56(blok56);
    }

    public static void intanceNewBlok() {
        blok123 = new Blok123();
        blok4 = new Blok4();
        blok4b = new Blok4B();
        blok123.setName("blok123");
        blok4.setName("blok4");
        blok4b.setName("blok4B");
        card = (CardLayout) containerPanel.getLayout();
        containerPanel.setLayout(card);
        containerPanel.add(blok123);
        containerPanel.add(blok4);
        containerPanel.add(blok4b);
//        blok123.getB1R1().requestFocusInWindow();

    }

    static void setJumlahPekerja(int jp) {
        jumlahPekerja = jp;
    }

    private int getJumlahPekerjaBlok4() {
        int j = 0;
        System.out.println("g1111");

        System.out.println(Blok4.getLoopPanel().getComponents().length);
        if (Blok4.getLoopPanel().getComponents().length > 0) {

            Component[] comp = Blok4.getLoopPanel().getComponents();
            for (int i = 0; i < comp.length; i++) {
                System.out.println("g3333");
                Loop4A loops = (Loop4A) comp[i];
//                Loop4B loop4bs = (Loop4B) Blok4B.getLoopPanel().getComponent(i);
                if (loops.getB4R15().getText().equals("1")) {
                    System.out.println("g444");
                    j++;
                    System.out.println("j");
                }
            }
        }
        if (Blok4B.getLoopPanel().getComponents().length > 0) {
            System.out.println("g2222");
            Component[] comp = Blok4B.getLoopPanel().getComponents();
            for (int i = 0; i < comp.length; i++) {
                System.out.println("g3333");
                Loop4B loops = (Loop4B) comp[i];
//                Loop4B loop4bs = (Loop4B) Blok4B.getLoopPanel().getComponent(i);
                if (loops.getB4R24().getText().equals("1")) {
                    System.out.println("g444");
                    j++;
                    System.out.println("j");
                }
            }
        }
        return j;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1368, 768));

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1070, 1070));

        containerPanel.setBackground(new java.awt.Color(204, 255, 204));
        containerPanel.setOpaque(false);
        containerPanel.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(containerPanel);

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/next.png"))); // NOI18N
        nextButton.setContentAreaFilled(false);
        nextButton.setMaximumSize(new java.awt.Dimension(57, 57));
        nextButton.setMinimumSize(new java.awt.Dimension(57, 57));
        nextButton.setPreferredSize(new java.awt.Dimension(57, 57));
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
        previousButton.setMaximumSize(new java.awt.Dimension(57, 57));
        previousButton.setMinimumSize(new java.awt.Dimension(57, 57));
        previousButton.setPreferredSize(new java.awt.Dimension(57, 57));
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
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeButton.setMaximumSize(new java.awt.Dimension(57, 57));
        homeButton.setMinimumSize(new java.awt.Dimension(57, 57));
        homeButton.setPreferredSize(new java.awt.Dimension(57, 57));
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
        Save.setMaximumSize(new java.awt.Dimension(57, 57));
        Save.setMinimumSize(new java.awt.Dimension(57, 57));
        Save.setPreferredSize(new java.awt.Dimension(57, 57));
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
        Submit.setMaximumSize(new java.awt.Dimension(57, 57));
        Submit.setMinimumSize(new java.awt.Dimension(57, 57));
        Submit.setPreferredSize(new java.awt.Dimension(57, 57));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Entri");

        jLabelTime.setBackground(new java.awt.Color(0, 153, 0));
        jLabelTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 153, 0));
        jLabelTime.setText("00");

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Waktu : ");

        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("(s)");

        javax.swing.GroupLayout backgroundLain1Layout = new javax.swing.GroupLayout(backgroundLain1);
        backgroundLain1.setLayout(backgroundLain1Layout);
        backgroundLain1Layout.setHorizontalGroup(
            backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLain1Layout.createSequentialGroup()
                .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTime)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addGap(1048, 1048, 1048)))
                .addGap(138, 138, 138))
        );
        backgroundLain1Layout.setVerticalGroup(
            backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLain1Layout.createSequentialGroup()
                .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLain1Layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLain1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelTime)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        card = (CardLayout) getContainerPanel().getLayout();

        if (getCurrentCard().getName() != null) {
            

            if (getCurrentCard().getName().equals("blok4B")) {
              

                setJumlahPekerja(getJumlahPekerjaBlok4());

                if (jumlahPekerja != 0) {
                    
                    Component[] comp = containerPanel.getComponents();

                    if (comp.length == 3) {
                        while (getLoop() < getJumlahPekerja()) {
                           

                            blok56 = new Blok56();
                            blok56b = new Blok56B(this);
                            blok56.setName("b56" + String.valueOf(getLoop() + 1));
                            blok56b.setName(String.valueOf(getLoop() + 1));

                            containerPanel.add(blok56);
                            containerPanel.add(blok56b);

                            b5List.add(blok56.getBlok56BTamabahan());
                            b6List.add(blok56b.getBlok56BTamabahan());
                            setLoop(getLoop() + 1);
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(panel, "Cek Rincian 16");
                    return;
                }
            }

            if (getCurrentCard().getName().equals("blok123")) {
                if (Blok4.getLoopPanel().getComponents().length < 1) {
                    blok4.setLOOP();
                    i = 0;
                    
                    card.next(getContainerPanel());
                    
                
                    getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                    return;

                }
            }
            if (getCurrentCard().getName().equals("blok4")) {
                if (Blok4B.getLoopPanel().getComponents().length < 1) {
                    blok4b.setLOOP();
                    card.next(getContainerPanel());
                    
                    getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                    return;

                }
            }

            if (getCurrentCard().getName().matches("[0-9]")) {
                if (!(getCurrentCard().getName().equals(String.valueOf(getJumlahPekerja())))) {
                    getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                    JOptionPane.showMessageDialog(this, "Lanjut input entri ke-" + String.valueOf(Integer.parseInt(getCurrentCard().getName()) + 1));

                    card.next(getContainerPanel());
                    Blok56.getB5R1Nama().requestFocusInWindow();
                    
                    getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                    return;

                }

            }

            if (getCurrentCard().getName().equals(String.valueOf(jumlahPekerja))) {
//                   

                System.out.println("masuk if else");
                JOptionPane.showMessageDialog(this, "Lanjut ke blok 8");
                if (isCreate()) {
                    blok789 = new Blok789();
                    containerPanel.add(blok789);
                    blok789.setName("blok789");
                    blok789.setpanelBlok123(blok123);
                    blok789.setBlok7Database();
                    setCreate(false);
                    Blok789.getB7R1().requestFocusInWindow();

                }
                card.next(getContainerPanel());
                getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
                return;

            }

            if (getCurrentCard().getName().equals("blok789")) {
                System.out.println("masuk else if");

                JOptionPane.showMessageDialog(this, "Sudah selesai. Silakan submit");
                return;

            }
            System.out.println("masuk else");
            card.next(getContainerPanel());
            Blok56.getB5R1Nama().requestFocusInWindow();
            Blok56B.getB6R11().requestFocusInWindow();
            getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));

        } else {
            System.out.println("masuk else terluar");
            card.next(getContainerPanel());
            getjScrollPane1().getViewport().setViewPosition(new java.awt.Point(0, 0));
        }
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
            int c = containerPanel.getComponentCount();
            System.out.println(c);

            b5List.clear();
            b6List.clear();
            setLoop(0);
            setCreate(true);

//            card = ((CardLayout) getContainerPanel().getLayout());
//            card.show(getContainerPanel(), "blok123");
            card = (CardLayout) panel.getLayout();
            card.show(panel, "pupanel");
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Yakin Ingin Mereset Datanya?", "Confirm", 0);
        if (x == 0) {
            containerPanel.removeAll();
            b5List.clear();
            b6List.clear();
            setLoop(0);
            setCreate(true);
            DataEntriPekerjaanPanel.intanceNewBlok();

        }

    }//GEN-LAST:event_SaveActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:

        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        submit.setBlok1(blok123);
        submit.setBlok789(blok789);
        submit.setB5List(getB5List());
        submit.setB6List(getB6List());
        submit.insertAllBlok(i);
        i = 0;


    }//GEN-LAST:event_SubmitActionPerformed

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        // TODO add your handling code here:
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/nexthover.png")));

    }//GEN-LAST:event_nextButtonMouseEntered

    private void nextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseExited
        // TODO add your handling code here:
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/next.png")));

    }//GEN-LAST:event_nextButtonMouseExited

    private void previousButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseEntered
        // TODO add your handling code here:
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/prevhover.png")));

    }//GEN-LAST:event_previousButtonMouseEntered

    private void previousButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseExited
        // TODO add your handling code here:
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/prev.png")));

    }//GEN-LAST:event_previousButtonMouseExited

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

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/homehover.png")));


    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // TODO add your handling code here:
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl53/image/tombol/home.png")));

    }//GEN-LAST:event_homeButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton Submit;
    private pkl53.imageClass.BackgroundLain backgroundLain1;
    private static javax.swing.JPanel containerPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTime;
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

    public JPanel getCurrentCard() {
        JPanel card = null;
        for (Component comp : containerPanel.getComponents()) {
            if (comp.isVisible() == true) {
                card = (JPanel) comp;
            }
        }
        return card;
    }

    /**
     * @return the b5List
     */
    public ArrayList<Blok56BTamabahan> getB5List() {
        return b5List;
    }

    /**
     * @return the b6List
     */
    public ArrayList<Blok56BTamabahan> getB6List() {
        return b6List;
    }

    public void addBlok1sampai6() {
        containerPanel.add(blok123, "blok123");
        containerPanel.add(blok4, "blok4");
        containerPanel.add(blok4, "card7");
        containerPanel.add(blok56, "card5");
        containerPanel.add(blok56b, "card6");
    }

    /**
     * @return the loop
     */
    public int getLoop() {
        return loop;
    }

    /**
     * @param loop the loop to set
     */
    public void setLoop(int loop) {
        this.loop = loop;
    }

    /**
     * @return the create
     */
    public boolean isCreate() {
        return create;
    }

    /**
     * @param create the create to set
     */
    public void setCreate(boolean create) {
        this.create = create;
    }
}
