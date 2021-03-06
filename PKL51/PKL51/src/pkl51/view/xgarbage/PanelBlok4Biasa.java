/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */

/*
 * PanelBlok4Biasa.java
 *
 * Created on Feb 8, 2012, 6:51:33 AM
 */
package pkl51.view.xgarbage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hindarwan
 */
public class PanelBlok4Biasa extends javax.swing.JPanel {

    private List<PanelRowART> listRowART;
    private int jumlahART;

    public List<PanelRowART> getListRowART() {
        return listRowART;
    }

    public void setListRowART(List<PanelRowART> listRowART) {
        this.listRowART = listRowART;
    }

    /** Creates new form PanelBlok4Biasa */
    public PanelBlok4Biasa() {
        listRowART = new ArrayList<PanelRowART>();
        initComponents();
    }

    public int getJumlahART() {
        return jumlahART;
    }

    public void setJumlahART(int jumlahART) {
        this.jumlahART = jumlahART;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(830, 436));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IV. KETERANGAN ANGGOTA RUMAH TANGGA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(4)");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2);
        jLabel2.setBounds(340, 150, 80, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>\n<center>\nJenis Kelamin<br>\n1. Laki-laki<br>\n2. Perempuan<br>\n</center>\n</html>");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3);
        jLabel3.setBounds(340, 50, 80, 100);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nama Anggota Rumah Tangga");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel4);
        jLabel4.setBounds(30, 50, 250, 100);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<center>\nHubungan<br>\ndengan<br>\nKepala<br>\nRumah<br>\nTangga<br>\n</center>\n</html>");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel5);
        jLabel5.setBounds(280, 50, 60, 100);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html>\n<center>\nUmur<br>\n(tahun)<br>\n</center>\n</html>");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel6);
        jLabel6.setBounds(420, 50, 50, 100);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>\n<center>\nStatus<br>\nPerkawinan<br>\n(Hanya<br>\nuntuk ART<br>\n10 tahun ke<br>\natas)\n</center>\n</html>");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel7);
        jLabel7.setBounds(470, 50, 70, 100);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>\n<center>\nAktivitas<br>\nUtama<br>\nSeminggu<br>\nyang lalu\n</center>\n</html>");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel8);
        jLabel8.setBounds(540, 50, 60, 100);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Jika (K.7=1)");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel9);
        jLabel9.setBounds(600, 50, 120, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html>\n<center>\nJenis<br>\nPekerjaan\n</center>\n</html>");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel10);
        jLabel10.setBounds(600, 80, 60, 70);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html>\n<center>\nStatus<br>\nPekerjaan\n</center>\n</html>");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel11);
        jLabel11.setBounds(660, 80, 60, 70);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html>\n<center>\nStatus<br>\nPendidikan\n</center>\n</html>");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel12);
        jLabel12.setBounds(720, 50, 60, 100);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html>\n<center>\nJika<br>\n(K.10=2,3)<br>\nTingkat<br>\nPendidikan\n</center>\n</html>");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel13);
        jLabel13.setBounds(780, 50, 60, 100);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html>\n<center>\nBisa Baca/Tulis<br>\nHuruf Latin<br>\n1. Ya<br>\n2.Tidak<br>\n(hanya untuk<br>\nART 5 tahun<br>\nke atas)\n</center>\n</html>");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel14);
        jLabel14.setBounds(840, 50, 80, 100);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html><center>No.<br>Urut</center></html>");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel15);
        jLabel15.setBounds(0, 50, 30, 100);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("(2)");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel17);
        jLabel17.setBounds(30, 150, 250, 20);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("(5)");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel18);
        jLabel18.setBounds(420, 150, 50, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("(6)");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel19);
        jLabel19.setBounds(470, 150, 70, 20);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("(7)");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel20);
        jLabel20.setBounds(540, 150, 60, 20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("(8)");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel21);
        jLabel21.setBounds(600, 150, 60, 20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("(9)");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel22);
        jLabel22.setBounds(660, 150, 60, 20);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("(11)");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel23);
        jLabel23.setBounds(780, 150, 60, 20);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("(10)");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel24);
        jLabel24.setBounds(720, 150, 60, 20);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("(12)");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel25);
        jLabel25.setBounds(840, 150, 80, 20);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("(3)");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel26);
        jLabel26.setBounds(280, 150, 60, 20);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("(1)");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel27);
        jLabel27.setBounds(0, 150, 30, 20);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void addListRowART(int jmlART) {
        for (int i = 0; i < jmlART; i++) {
            listRowART.add(new PanelRowART());
            addPanelRowART(listRowART.get(i), i);
        }
       
        revalidate();
    }

    public void addPanelRowART(PanelRowART panelRowART, int i) {
        add(panelRowART);
        panelRowART.setBounds(0, 170 + i * 40, 920, 40);
    }
}
