/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import pkl53.converter.DateConverter;
import pkl53.converter.IntegerConverter;
import pkl53.model.B1Tempat;
import pkl53.model.B2Art;
import pkl53.model.B2Umumusaha;
import pkl53.model.B3Rinciusaha;
import pkl53.model.B3r15Pekerja;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.model.OpsiB3R34R35;
import pkl53.model.OpsiB3r10;
import pkl53.model.OpsiB3r13b;
import pkl53.model.OpsiB3r15e;
import pkl53.model.OpsiB3r15f;
import pkl53.model.OpsiB3r15i;
import pkl53.model.OpsiB3r15j;
import pkl53.model.OpsiB3r21;
import pkl53.model.OpsiB3r22b;
import pkl53.model.OpsiB3r22d;
import pkl53.model.OpsiB3r22f;
import pkl53.model.OpsiB3r23a;
import pkl53.model.OpsiB3r26;
import pkl53.model.OpsiB3r36;
import pkl53.model.OpsiB3r5;
import pkl53.model.OpsiB3r6;
import pkl53.model.OpsiJeniskelamin;
import pkl53.model.OpsiRincianLapUsaha;
import pkl53.model.OpsiYaDalamprosesTidakTidaktahu;
import pkl53.model.OpsiYaTidakTidaktau;
import pkl53.model.Petugasentri;
import pkl53.model.UserModel;
import pkl53.model.tambahan.B2Tambahan;
import pkl53.model.tambahan.B3RinciusahaTambahan;
import pkl53.model.tambahan.B3r15PekerjaTambahan;
import pkl53.view.BlokUsaha123;
import pkl53.view.BlokUsaha4;
import pkl53.view.BlokUsaha5;
import pkl53.view.BlokUsaha5B;
import pkl53.view.BlokUsaha5C;
import pkl53.view.BlokUsaha5D;

/**
 *
 * @author akhul
 */
public class SubmitAllControllerUsaha {
   int i=0;
    private BlokUsaha123 panelBlok123;
    private BlokUsaha4 panelBlok4;
    private BlokUsaha5 panelBlok5;
    private BlokUsaha5B panelBlok5b;
    private BlokUsaha5C panelBlok5c;
    private BlokUsaha5D panelBlok5d;

    private B1Tempat b1KeterangantempatModel = new B1Tempat();

    private ArrayList<B3Rinciusaha> listB3Model = new ArrayList<B3Rinciusaha>();
    private ArrayList<ArrayList<B3r15PekerjaTambahan>> listAllB3R15 = new ArrayList<ArrayList<B3r15PekerjaTambahan>>();
    IntegerConverter ic = new IntegerConverter();
    DateConverter dc = new DateConverter();

    private ArrayList<B2Tambahan> b2TambahanList = BlokUsaha4.getB2TambahanList();
    private ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListA;
    private ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListB;
    private ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListC;
    private ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListD;
Petugasentri  Petugasentri = new Petugasentri();
    public void insertAllBlok(int waktu) {
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            
            
              seti(waktu);
            Petugasentri = getModelMonitoring();
            em.merge(Petugasentri);
            
            B1Tempat b1 = getModelB1();
            em.persist(b1);

            for (B2Art b2Art : getListB2Art()) {
                em.persist(b2Art);
                JOptionPane.showMessageDialog(null, "nama" + b2Art.getB2r2());

            }

            for (B2Umumusaha b2 : getListB2Umumusaha()) {
                em.persist(b2);
            }
            // blok 3 ada looping
            for (B3Rinciusaha b3 : getModelB3()) {
                em.persist(b3);
            }

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(panelBlok123, "Data berhasil disimpan ke database");
            JOptionPane.showMessageDialog(panelBlok123, "Silahkan reset kuesioner atau kembali ke home");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan ke Database");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   
    public String getKKS() {
        return getPanelBlok123().getB1R1().getText()
                + getPanelBlok123().getB1R2().getText()
                + getPanelBlok123().getB1R3().getText()
                + getPanelBlok123().getB1R5a().getText()
                + getPanelBlok123().getB1R6().getText();
    }

    /**
     * @param listB3Model the listB3Model to set
     */
    public void setListB3Model(ArrayList<B3Rinciusaha> listB3Model) {
        this.listB3Model = listB3Model;
    }
 public void seti(int i) {
        this.i = i;
    }
 public Petugasentri getModelMonitoring() {

       
        Petugasentri Petugasentri = new Petugasentri();
        Petugasentri.setKks(getKKS());
        
        Petugasentri.setNim(UserModel.getUsername());

      

       
       
        Petugasentri.setWaktu(i);

        return Petugasentri;
    }
    /**
     * @param listAllB3R15 the listAllB3R15 to set
     */
    public void setListAllB3R15(ArrayList<ArrayList<B3r15PekerjaTambahan>> listAllB3R15) {
        this.listAllB3R15 = listAllB3R15;
    }

    /**
     * @return the panelBlok123
     */
    public BlokUsaha123 getPanelBlok123() {
        return panelBlok123;
    }

    /**
     * @param panelBlok123 the panelBlok123 to set
     */
    public void setPanelBlok123(BlokUsaha123 panelBlok123) {
        this.panelBlok123 = panelBlok123;
    }

    /**
     * @return the panelBlok4
     */
    public BlokUsaha4 getPanelBlok4() {
        return panelBlok4;
    }

    /**
     * @param panelBlok4 the panelBlok4 to set
     */
    public void setPanelBlok4(BlokUsaha4 panelBlok4) {
        this.panelBlok4 = panelBlok4;
    }

    /**
     * @return the panelBlok5
     */
    public BlokUsaha5 getPanelBlok5() {
        return panelBlok5;
    }

    /**
     * @param panelBlok5 the panelBlok5 to set
     */
    public void setPanelBlok5(BlokUsaha5 panelBlok5) {
        this.panelBlok5 = panelBlok5;
    }

    /**
     * @return the panelBlok5b
     */
    public BlokUsaha5B getPanelBlok5b() {
        return panelBlok5b;
    }

    /**
     * @param panelBlok5b the panelBlok5b to set
     */
    public void setPanelBlok5b(BlokUsaha5B panelBlok5b) {
        this.panelBlok5b = panelBlok5b;
    }

    /**
     * @return the panelBlok5c
     */
    public BlokUsaha5C getPanelBlok5c() {
        return panelBlok5c;
    }

    /**
     * @param panelBlok5c the panelBlok5c to set
     */
    public void setPanelBlok5c(BlokUsaha5C panelBlok5c) {
        this.panelBlok5c = panelBlok5c;
    }

    /**
     * @return the panelBlok5d
     */
    public BlokUsaha5D getPanelBlok5d() {
        return panelBlok5d;
    }

    /**
     * @param panelBlok5d the panelBlok5d to set
     */
    public void setPanelBlok5d(BlokUsaha5D panelBlok5d) {
        this.panelBlok5d = panelBlok5d;
    }

    /**
     * @return the b1KeterangantempatModel
     */
    public B1Tempat getB1KeterangantempatModel() {
        return b1KeterangantempatModel;
    }

    /**
     * @param b1KeterangantempatModel the b1KeterangantempatModel to set
     */
    public void setB1KeterangantempatModel(B1Tempat b1KeterangantempatModel) {
        this.b1KeterangantempatModel = b1KeterangantempatModel;
    }

    private B1Tempat getModelB1() {
        getB1KeterangantempatModel().setKks(getKKS());
        getB1KeterangantempatModel().setB1r1(new Kabupatenkota(getPanelBlok123().getB1R1().getText()));
        getB1KeterangantempatModel().setB1r2(new Kecamatan(getPanelBlok123().getB1R1().getText() + getPanelBlok123().getB1R2().getText()));
        getB1KeterangantempatModel().setB1r3(new Kelurahan(getPanelBlok123().getB1R1().getText() + getPanelBlok123().getB1R2().getText() + getPanelBlok123().getB1R3().getText()));
        getB1KeterangantempatModel().setB1r4(getPanelBlok123().getB1R4().getText());

        getB1KeterangantempatModel().setB1r5a(new NoBs(getPanelBlok123().getB1R1().getText() + getPanelBlok123().getB1R2().getText() + getPanelBlok123().getB1R3().getText() + getPanelBlok123().getB1R5a().getText()));
        getB1KeterangantempatModel().setB1r5b(getPanelBlok123().getB1R5b().getText());
        getB1KeterangantempatModel().setB1r6(getPanelBlok123().getB1R6().getText());
        getB1KeterangantempatModel().setB1r7(getPanelBlok123().getNamaKrtLabel().getText());
        getB1KeterangantempatModel().setB1r8(getPanelBlok123().getAlamatLabel().getText());
        if(!getPanelBlok123().getNimPencacah().getText().isEmpty()){
            getB1KeterangantempatModel().setNimPencacah(new Mahasiswa(getPanelBlok123().getNimPencacah().getText()));
        }
        getB1KeterangantempatModel().setTanggalPemeriksaanKU(dc.convertForward(getPanelBlok123().getTanggalPemeriksaan().getText()));
        getB1KeterangantempatModel().setTanggalPencacahan(dc.convertForward(getPanelBlok123().getTanggalPencacahan().getText()));
        return getB1KeterangantempatModel();
    }

    public List<B2Art> getListB2Art() {
        List<B2Art> b2List = new ArrayList<B2Art>();
        System.out.println("Submit Blok 4"+getB2TambahanList().size());
        for (B2Tambahan b2 : getB2TambahanList()) {
            if (ic.convertForward(b2.getB2r4()) == 1) {
                B2Art b2Art = new B2Art();
                b2Art.setKks(new B1Tempat(getKKS()));
                b2Art.setKKSArt(getKKS() + b2.getB4r1());
                b2Art.setB2r1(ic.convertForward(b2.getB4r1()));
                b2Art.setB2r2(b2.getB4r2());
                b2Art.setB2r3(b2.getB4r3());
                b2List.add(b2Art);
                System.out.println("KKSART "+getKKS() + b2.getB4r1());
            }
        }
        return b2List;
    }

    public ArrayList<B2Umumusaha> getListB2Umumusaha() {
        ArrayList<B2Umumusaha> b2list = new ArrayList<B2Umumusaha>();

        for (B2Tambahan b2 : getB2TambahanList()) {
            B2Umumusaha b2Umumusaha = new B2Umumusaha();
            b2Umumusaha.setKKSArt(new B2Art(getKKS() + b2.getB4r1()));
            b2Umumusaha.setKKSArtNup(getKKS() + b2.getB4r1() + b2.getB2r4());
            b2Umumusaha.setB2r4(ic.convertForward(b2.getB2r4()));
            if (!b2.getB2r5().isEmpty()) {
                b2Umumusaha.setB2r5((b2.getB2r5()));
            }
            b2Umumusaha.setB2r6(b2.getB2r6());
            if (!b2.getB2r7().isEmpty()) {
                b2Umumusaha.setB2r7((b2.getB2r7()));
            }
            if (!b2.getB2r8().isEmpty()) {
                b2Umumusaha.setB2r8(b2.getB2r8());
            }
            if (!b2.getB2r9().isEmpty()) {
                b2Umumusaha.setB2r9(new OpsiYaTidakTidaktau(b2.getB2r9()));
            }
            b2Umumusaha.setB2r10(ic.convertForward(b2.getB2r10()));
            if (!b2.getB2r11().isEmpty()) {
                b2Umumusaha.setB2r11(new OpsiYaDalamprosesTidakTidaktahu(b2.getB2r11()));
            }
            if (!b2.getB2r12().isEmpty()) {
                b2Umumusaha.setB2r12(new OpsiYaDalamprosesTidakTidaktahu(b2.getB2r12()));
            }
            if (!b2.getB2r13().isEmpty()) {
                b2Umumusaha.setB2r13(new OpsiYaDalamprosesTidakTidaktahu(b2.getB2r13()));
            }
            if (!b2.getB2r14().isEmpty()) {
                b2Umumusaha.setB2r14(new OpsiYaDalamprosesTidakTidaktahu(b2.getB2r14()));
            }
            b2Umumusaha.setB2r15(ic.convertForward(b2.getB2r15()));
            b2Umumusaha.setB2r16(ic.convertForward(b2.getB2r16()));

            b2list.add(b2Umumusaha);

        }
        return b2list;
    }

    private ArrayList<B3Rinciusaha> getModelB3() {

        for (int i = 0; i < getB3RinciusahaTambahanListA().size(); i++) {
            B3Rinciusaha b3Usaha = new B3Rinciusaha();
            b3Usaha.setKKSArt(new B2Art(getKKS() + getB3RinciusahaTambahanListA().get(i).getB5R1NOART()));
            b3Usaha.setKKSArtNup(getKKS() + getB3RinciusahaTambahanListA().get(i).getB5R1NOART() + getB3RinciusahaTambahanListA().get(i).getB5R2());
            b3Usaha.setB3r1a(getB3RinciusahaTambahanListA().get(i).getB5R1NAMA());
            b3Usaha.setB3r1b(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R1NOART()));
            b3Usaha.setB3r2(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R2()));
            b3Usaha.setB3r3(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R3()));
            b3Usaha.setB3r4a(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R4BULAN()));
            b3Usaha.setB3r4b(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R4TAHUN()));

            if (!getB3RinciusahaTambahanListA().get(i).getB5R5().isEmpty()) {
                b3Usaha.setB3r5(new OpsiB3r5(String.valueOf(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R5()))));
            }

            if (!(getB3RinciusahaTambahanListA().get(i).getB5R5_10_LAIN().isEmpty() && getB3RinciusahaTambahanListA().get(i).getB5R5_13_LAIN().isEmpty())) {
                if (getB3RinciusahaTambahanListA().get(i).getB5R5_13_LAIN().equals("")) {
                    b3Usaha.setB3R5lainnya((getB3RinciusahaTambahanListA().get(i).getB5R5_10_LAIN()));
                } else {
                    b3Usaha.setB3R5lainnya((getB3RinciusahaTambahanListA().get(i).getB5R5_13_LAIN()));
                }
            }

            if (!getB3RinciusahaTambahanListA().get(i).getB5R6().isEmpty()) {
                b3Usaha.setB3r6(new OpsiB3r6(getB3RinciusahaTambahanListA().get(i).getB5R6()));
            }

            b3Usaha.setB3r7a(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R7()));
            b3Usaha.setB3r7b(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R7DIBAYAR()));
            b3Usaha.setB3r8(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R8()));
            b3Usaha.setB3r9(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R9()));
            if (!getB3RinciusahaTambahanListA().get(i).getB5R10().isEmpty()) {
                b3Usaha.setB3r10(new OpsiB3r10(getB3RinciusahaTambahanListA().get(i).getB5R10()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R11A().isEmpty()) {
                b3Usaha.setB3r11a(new OpsiYaTidakTidaktau(getB3RinciusahaTambahanListA().get(i).getB5R11A()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R11B().isEmpty()) {
                b3Usaha.setB3r11b(new OpsiYaTidakTidaktau(getB3RinciusahaTambahanListA().get(i).getB5R11B()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R11C().isEmpty()) {
                b3Usaha.setB3r11c(new OpsiYaTidakTidaktau(getB3RinciusahaTambahanListA().get(i).getB5R11C()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R11D().isEmpty()) {
                b3Usaha.setB3r11d(new OpsiYaTidakTidaktau(getB3RinciusahaTambahanListA().get(i).getB5R11D()));
            }
            b3Usaha.setB3R11Elainnya(getB3RinciusahaTambahanListA().get(i).getB5R11E_LAIN());
            b3Usaha.setB3r12a(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R12A()));
            b3Usaha.setB3r12b(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R12B()));
            b3Usaha.setB3r12c(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R12C()));
            b3Usaha.setB3r12d(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R12D()));
            b3Usaha.setB3R12jumlah(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R12JUML()));
            b3Usaha.setB3R13Aagt13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_AGT()));
            b3Usaha.setB3R13Aapr13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_APR()));
            b3Usaha.setB3R13Ades13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_DES()));
            b3Usaha.setB3R13Afeb14(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_FEB()));
            b3Usaha.setB3R13Ajan14(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_JAN()));
            b3Usaha.setB3R13Ajul13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_JUL()));
            b3Usaha.setB3R13Ajun13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_JUN()));
            b3Usaha.setB3R13Amar14(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_MAR()));
            b3Usaha.setB3R13Amei13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_MEI()));
            b3Usaha.setB3R13Anov13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_NOV()));
            b3Usaha.setB3R13Aokt13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_OKT()));
            b3Usaha.setB3R13Asep13(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R13HARI_SEP()));

            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_AGT().isEmpty()) {
                b3Usaha.setB3R13Bagt13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_AGT()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_APR().isEmpty()) {
                b3Usaha.setB3R13Bapr13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_APR()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_DES().isEmpty()) {
                b3Usaha.setB3R13Bdes13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_DES()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_FEB().isEmpty()) {
                b3Usaha.setB3R13Bfeb14(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_FEB()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JAN().isEmpty()) {
                b3Usaha.setB3R13Bjan14(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JAN()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JUL().isEmpty()) {
                b3Usaha.setB3R13Bjul13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JUL()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JUN().isEmpty()) {
                b3Usaha.setB3R13Bjun13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_JUN()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_MAR().isEmpty()) {
                b3Usaha.setB3R13Bmar14(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_MAR()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_MEI().isEmpty()) {
                b3Usaha.setB3R13Bmei13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_MEI()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_NOV().isEmpty()) {
                b3Usaha.setB3R13Bnov13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_NOV()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_OKT().isEmpty()) {
                b3Usaha.setB3R13Bokt13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_OKT()));
            }
            if (!getB3RinciusahaTambahanListA().get(i).getB5R13KODE_SEP().isEmpty()) {
                b3Usaha.setB3R13Bsep13(new OpsiB3r13b(getB3RinciusahaTambahanListA().get(i).getB5R13KODE_SEP()));
            }
            b3Usaha.setB3r14(ic.convertForward(getB3RinciusahaTambahanListA().get(i).getB5R14()));

            //Panel B5B
            for (int j = 0; j < getB3RinciusahaTambahanListB().size(); j++) {
                if (i == j) {
                    ArrayList<B3r15Pekerja> b3r15PList = new ArrayList<B3r15Pekerja>();
                    for (int k = 0; k < listAllB3R15.size(); k++) {
                        if (i == k) {
                            for (B3r15PekerjaTambahan b3r15 : listAllB3R15.get(i)) {
                                B3r15Pekerja b3r15P = new B3r15Pekerja();
                                b3r15P.setKKSArtNup(new B3Rinciusaha(getKKS() + getB3RinciusahaTambahanListA().get(i).getB5R1NOART() + getB3RinciusahaTambahanListA().get(i).getB5R2()));
                                b3r15P.setKKSArtNupNp(getKKS() + getB3RinciusahaTambahanListA().get(i).getB5R1NOART() + getB3RinciusahaTambahanListA().get(i).getB5R2() + b3r15.getB3r15a());
                                b3r15P.setB3r15a(ic.convertForward(b3r15.getB3r15a()));
                                b3r15P.setB3r15b(b3r15.getB3r15b());

                                if (!b3r15.getB3r15c().isEmpty()) {
                                    b3r15P.setB3r15c(new OpsiJeniskelamin(b3r15.getB3r15c()));
                                }
                                b3r15P.setB3r15d(ic.convertForward(b3r15.getB3r15d()));
                                if (!b3r15.getB3r15e().isEmpty()) {
                                    b3r15P.setB3r15e(new OpsiB3r15e(b3r15.getB3r15e()));
                                }
                                if (!b3r15.getB3r15f().isEmpty()) {
                                    b3r15P.setB3r15f(new OpsiB3r15f(b3r15.getB3r15f()));
                                }
                                b3r15P.setB3r15g(ic.convertForward(b3r15.getB3r15g()));
                                b3r15P.setB3r15h(ic.convertForward(b3r15.getB3r15h()));
                                if (!b3r15.getB3r15i().isEmpty()) {
                                    b3r15P.setB3r15i(new OpsiB3r15i(b3r15.getB3r15i()));
                                }
                                if (!b3r15.getB3r15j().isEmpty()) {
                                    b3r15P.setB3r15j(new OpsiB3r15j(b3r15.getB3r15j()));
                                }
                                b3r15P.setB3r15k(ic.convertForward(b3r15.getB3r15k()));
                                b3r15PList.add(b3r15P);
                            }
                            b3Usaha.setB3r15PekerjaList(b3r15PList);
                        }
                    }

                    b3Usaha.setB3r16(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R16()));

                    if (getB3RinciusahaTambahanListB().get(i).getB5R17A_PERT().equals("")) {
                        b3Usaha.setB3r17a1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17A_NON()));
                        b3Usaha.setB3r17b1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17B_NON()));
                        b3Usaha.setB3r17c1a(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CI_NON()));
                        b3Usaha.setB3r17c1b(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CII_NON()));
                        b3Usaha.setB3r17c1c(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CIII_NON()));
                        b3Usaha.setB3r17d1a(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17DI_NON()));
                        b3Usaha.setB3r17d1b(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17DII_NON()));
                        b3Usaha.setB3r17e1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17E_NON()));
                        b3Usaha.setB3r17f1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17F_NON()));
                        b3Usaha.setB3r17g1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17G_NON()));
                        b3Usaha.setB3r17h1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17H_NON()));
                        b3Usaha.setB3r17i1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17I_NON()));
                        b3Usaha.setB3r17j1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17J_NON()));
                        b3Usaha.setB3r17k1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17K_NON()));
                        b3Usaha.setB3r17l1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17L_NON()));
                        b3Usaha.setB3R17totalPengeluaran(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17TOT_NON()));
                        b3Usaha.setB3R17labarugi(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17LABA_NON()));
                    } else {
                        b3Usaha.setB3r17a1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17A_PERT()));
                        b3Usaha.setB3r17b1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17B_PERT()));
                        b3Usaha.setB3r17c1a(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CI_PERT()));
                        b3Usaha.setB3r17c1b(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CII_PERT()));
                        b3Usaha.setB3r17c1c(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17CIII_PERT()));
                        b3Usaha.setB3r17d1a(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17DI_PERT()));
                        b3Usaha.setB3r17d1b(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17DII_PERT()));
                        b3Usaha.setB3r17e1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17E_PERT()));
                        b3Usaha.setB3r17f1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17F_PERT()));
                        b3Usaha.setB3r17g1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17G_PERT()));
                        b3Usaha.setB3r17h1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17H_PERT()));
                        b3Usaha.setB3r17i1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17I_PERT()));
                        b3Usaha.setB3r17j1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17J_PERT()));
                        b3Usaha.setB3r17k1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17K_PERT()));
                        b3Usaha.setB3r17l1(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17L_PERT()));
                        b3Usaha.setB3R17totalPengeluaran(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17TOT_PERT()));
                        b3Usaha.setB3R17labarugi(ic.convertForward(getB3RinciusahaTambahanListB().get(i).getB5R17LABA_PERT()));
                    }
                }
            }

            //Panel B5C
            for (int j = 0; j < getB3RinciusahaTambahanListC().size(); j++) {
                if (i == j) {

                    if (!getB3RinciusahaTambahanListC().get(i).getB5R18A().isEmpty()) {
                        b3Usaha.setB3r18a(getB3RinciusahaTambahanListC().get(i).getB5R18A());
                    }
                    b3Usaha.setB3r18b1(ic.convertForward(getB3RinciusahaTambahanListC().get(i).getB5R18B_LAKI()));
                    b3Usaha.setB3r18b2(ic.convertForward(getB3RinciusahaTambahanListC().get(i).getB5R18B_PR()));
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R19_UTAMA().isEmpty()) {
                        b3Usaha.setB3R19utama(getB3RinciusahaTambahanListC().get(i).getB5R19_UTAMA());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R19_LAIN().isEmpty()) {
                        b3Usaha.setB3R19lainnya(getB3RinciusahaTambahanListC().get(i).getB5R19_LAIN());
                    }
                    b3Usaha.setB3R19lainnyasebutkan(getB3RinciusahaTambahanListC().get(i).getB5R19_LL());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R20A().isEmpty()) {
                        b3Usaha.setB3r20a(getB3RinciusahaTambahanListC().get(i).getB5R20A());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R20B().isEmpty()) {
                        b3Usaha.setB3r20b(getB3RinciusahaTambahanListC().get(i).getB5R20B());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R21().isEmpty()) {
                        b3Usaha.setB3r21(new OpsiB3r21(getB3RinciusahaTambahanListC().get(i).getB5R21()));
                    }

                    b3Usaha.setB3R21lainnya(getB3RinciusahaTambahanListC().get(i).getB5R21Lainnya());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22A().isEmpty()) {
                        b3Usaha.setB3r22a(getB3RinciusahaTambahanListC().get(i).getB5R22A());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22B().isEmpty()) {
                        b3Usaha.setB3r22b(new OpsiB3r22b(getB3RinciusahaTambahanListC().get(i).getB5R22B()));
                    }
                    b3Usaha.setB3R22Blainnya(getB3RinciusahaTambahanListC().get(i).getB5R22BLainnya());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22C().isEmpty()) {
                        b3Usaha.setB3r22c(getB3RinciusahaTambahanListC().get(i).getB5R22C());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22D().isEmpty()) {
                        b3Usaha.setB3r22d(new OpsiB3r22d(getB3RinciusahaTambahanListC().get(i).getB5R22D()));
                    }
                    b3Usaha.setB3R22Dlainnya(getB3RinciusahaTambahanListC().get(i).getB5R22D_LAIN());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22E().isEmpty()) {
                        b3Usaha.setB3r22e(getB3RinciusahaTambahanListC().get(i).getB5R22E());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22F().isEmpty()) {
                        b3Usaha.setB3r22f(new OpsiB3r22f(getB3RinciusahaTambahanListC().get(i).getB5R22F()));
                    }
                    b3Usaha.setB3R22Flainnya(getB3RinciusahaTambahanListC().get(i).getB5R22FLainnya());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G1().isEmpty()) {
                        b3Usaha.setB3r22g1(getB3RinciusahaTambahanListC().get(i).getB5R22G1());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G2().isEmpty()) {
                        b3Usaha.setB3r22g2(getB3RinciusahaTambahanListC().get(i).getB5R22G2());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G3().isEmpty()) {
                        b3Usaha.setB3r22g3(getB3RinciusahaTambahanListC().get(i).getB5R22G3());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G4().isEmpty()) {
                        b3Usaha.setB3r22g4(getB3RinciusahaTambahanListC().get(i).getB5R22G4());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G5().isEmpty()) {
                        b3Usaha.setB3r22g5(getB3RinciusahaTambahanListC().get(i).getB5R22G5());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G6().isEmpty()) {
                        b3Usaha.setB3r22g6(getB3RinciusahaTambahanListC().get(i).getB5R22G6());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G7().isEmpty()) {
                        b3Usaha.setB3r22g7(getB3RinciusahaTambahanListC().get(i).getB5R22G7());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R22G8().isEmpty()) {
                        b3Usaha.setB3r22g8(getB3RinciusahaTambahanListC().get(i).getB5R22G8());
                    }
                    b3Usaha.setB3R22G9lainnya(getB3RinciusahaTambahanListC().get(i).getB5R22G9_LAIN());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23A().isEmpty()) {
                        b3Usaha.setB3r23a(new OpsiB3r23a(getB3RinciusahaTambahanListC().get(i).getB5R23A()));
                    }
                    b3Usaha.setB3R23ALainnya(getB3RinciusahaTambahanListC().get(i).getB5R23ALainnya());
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B1().isEmpty()) {
                        b3Usaha.setB3r23b1(getB3RinciusahaTambahanListC().get(i).getB5R23B1());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B2().isEmpty()) {
                        b3Usaha.setB3r23b2(getB3RinciusahaTambahanListC().get(i).getB5R23B2());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B3().isEmpty()) {
                        b3Usaha.setB3r23b3(getB3RinciusahaTambahanListC().get(i).getB5R23B3());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B4().isEmpty()) {
                        b3Usaha.setB3r23b4(getB3RinciusahaTambahanListC().get(i).getB5R23B4());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B5().isEmpty()) {
                        b3Usaha.setB3r23b5(getB3RinciusahaTambahanListC().get(i).getB5R23B5());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B6().isEmpty()) {
                        b3Usaha.setB3r23b6(getB3RinciusahaTambahanListC().get(i).getB5R23B6());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B7().isEmpty()) {
                        b3Usaha.setB3r23b7(getB3RinciusahaTambahanListC().get(i).getB5R23B7());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B8().isEmpty()) {
                        b3Usaha.setB3r23b8(getB3RinciusahaTambahanListC().get(i).getB5R23B8());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B9().isEmpty()) {
                        b3Usaha.setB3r23b9(getB3RinciusahaTambahanListC().get(i).getB5R23B9());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B10().isEmpty()) {
                        b3Usaha.setB3r23b10(getB3RinciusahaTambahanListC().get(i).getB5R23B10());
                    }
                    if (!getB3RinciusahaTambahanListC().get(i).getB5R23B11().isEmpty()) {
                        b3Usaha.setB3r23b11(getB3RinciusahaTambahanListC().get(i).getB5R23B11());
                    }
                    b3Usaha.setB3R23B12lainnya(getB3RinciusahaTambahanListC().get(i).getB5R23B13_LAIN());

                }
            }

            //Panel B5D
            for (int j = 0; j < getB3RinciusahaTambahanListD().size(); j++) {
                if (i == j) {

                    if (!getB3RinciusahaTambahanListD().get(i).getB5R24().isEmpty()) {
                        b3Usaha.setB3r24(getB3RinciusahaTambahanListD().get(i).getB5R24());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25A().isEmpty()) {
                        b3Usaha.setB3r25a(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25B().isEmpty()) {
                        b3Usaha.setB3r25b(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25C().isEmpty()) {
                        b3Usaha.setB3r25c(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25D().isEmpty()) {
                        b3Usaha.setB3r25d(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25E().isEmpty()) {
                        b3Usaha.setB3r25e(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25F().isEmpty()) {
                        b3Usaha.setB3r25f(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25G().isEmpty()) {
                        b3Usaha.setB3r25g(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25H().isEmpty()) {
                        b3Usaha.setB3r25h(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25I().isEmpty()) {
                        b3Usaha.setB3r25i(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25J().isEmpty()) {
                        b3Usaha.setB3r25j(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25K().isEmpty()) {
                        b3Usaha.setB3r25k(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R25L().isEmpty()) {
                        b3Usaha.setB3r25l(getB3RinciusahaTambahanListD().get(i).getB5R25A());
                    }

                    b3Usaha.setB3R25Mlainnya(getB3RinciusahaTambahanListD().get(i).getB5R25M_LAIN());
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R26A().isEmpty()) {
                        b3Usaha.setB3r26(new OpsiB3r26(getB3RinciusahaTambahanListD().get(i).getB5R26A()));
                    }
                    b3Usaha.setB3R26lainnya(getB3RinciusahaTambahanListD().get(i).getB5R26Lainnya());
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_1().isEmpty()) {
                        b3Usaha.setB3r27a(getB3RinciusahaTambahanListD().get(i).getB5R27_1());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_2().isEmpty()) {
                        b3Usaha.setB3r27b(getB3RinciusahaTambahanListD().get(i).getB5R27_2());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_3().isEmpty()) {
                        b3Usaha.setB3r27c(getB3RinciusahaTambahanListD().get(i).getB5R27_3());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_4().isEmpty()) {
                        b3Usaha.setB3r27d(getB3RinciusahaTambahanListD().get(i).getB5R27_4());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_5().isEmpty()) {
                        b3Usaha.setB3r27e(getB3RinciusahaTambahanListD().get(i).getB5R27_5());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_6().isEmpty()) {
                        b3Usaha.setB3r27f(getB3RinciusahaTambahanListD().get(i).getB5R27_6());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_7().isEmpty()) {
                        b3Usaha.setB3r27g(getB3RinciusahaTambahanListD().get(i).getB5R27_7());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_8().isEmpty()) {
                        b3Usaha.setB3r27h(getB3RinciusahaTambahanListD().get(i).getB5R27_8());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R27_9().isEmpty()) {
                        b3Usaha.setB3r27i(getB3RinciusahaTambahanListD().get(i).getB5R27_9());
                    }
                    b3Usaha.setB3R27Jlainnya(getB3RinciusahaTambahanListD().get(i).getB5R27_10_LAIN());
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R28().isEmpty()) {
                        b3Usaha.setB3r28(getB3RinciusahaTambahanListD().get(i).getB5R28());
                    }
                    b3Usaha.setB3r29a(getB3RinciusahaTambahanListD().get(i).getB5R29_1());
                    b3Usaha.setB3r29b(getB3RinciusahaTambahanListD().get(i).getB5R29_2());
                    b3Usaha.setB3r29c(getB3RinciusahaTambahanListD().get(i).getB5R29_3());
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30A().isEmpty()) {
                        b3Usaha.setB3r30a(getB3RinciusahaTambahanListD().get(i).getB5R30A());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30B().isEmpty()) {
                        b3Usaha.setB3r30b(getB3RinciusahaTambahanListD().get(i).getB5R30B());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30C().isEmpty()) {
                        b3Usaha.setB3r30c(getB3RinciusahaTambahanListD().get(i).getB5R30C());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30D().isEmpty()) {
                        b3Usaha.setB3r30d(getB3RinciusahaTambahanListD().get(i).getB5R30D());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30E().isEmpty()) {
                        b3Usaha.setB3r30e(getB3RinciusahaTambahanListD().get(i).getB5R30E());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30F().isEmpty()) {
                        b3Usaha.setB3r30f(getB3RinciusahaTambahanListD().get(i).getB5R30F());
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R30G().isEmpty()) {
                        b3Usaha.setB3r30g(getB3RinciusahaTambahanListD().get(i).getB5R30G());
                    }

                    if (!getB3RinciusahaTambahanListD().get(i).getB5R31().isEmpty()) {
                        b3Usaha.setB3r31(getB3RinciusahaTambahanListD().get(i).getB5R31());
                    }
                    b3Usaha.setB3r32(ic.convertForward(getB3RinciusahaTambahanListD().get(i).getB5R32()));
                    b3Usaha.setB3r33(String.valueOf(ic.convertForward(getB3RinciusahaTambahanListD().get(i).getB5R33())));
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R34().isEmpty()) {
                        b3Usaha.setB3r34(new OpsiB3R34R35(getB3RinciusahaTambahanListD().get(i).getB5R34()));
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R35().isEmpty()) {
                        b3Usaha.setB3r35(new OpsiB3R34R35(getB3RinciusahaTambahanListD().get(i).getB5R35()));
                    }
                    if (!getB3RinciusahaTambahanListD().get(i).getB5R36().isEmpty()) {
                        b3Usaha.setB3r36(new OpsiB3r36(getB3RinciusahaTambahanListD().get(i).getB5R36()));
                    }
                }
            }
            listB3Model.add(b3Usaha);
        }

        return listB3Model;
    }

    /**
     * @return the b2TambahanList
     */
    public ArrayList<B2Tambahan> getB2TambahanList() {
        return b2TambahanList;
    }

    /**
     * @param b2TambahanList the b2TambahanList to set
     */
    public void setB2TambahanList(ArrayList<B2Tambahan> b2TambahanList) {
        this.b2TambahanList = b2TambahanList;
    }

    /**
     * @return the b3RinciusahaTambahanListA
     */
    public ArrayList<B3RinciusahaTambahan> getB3RinciusahaTambahanListA() {
        return b3RinciusahaTambahanListA;
    }

    /**
     * @param b3RinciusahaTambahanListA the b3RinciusahaTambahanListA to set
     */
    public void setB3RinciusahaTambahanListA(ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListA) {
        this.b3RinciusahaTambahanListA = b3RinciusahaTambahanListA;
    }

    /**
     * @return the b3RinciusahaTambahanListB
     */
    public ArrayList<B3RinciusahaTambahan> getB3RinciusahaTambahanListB() {
        return b3RinciusahaTambahanListB;
    }

    /**
     * @param b3RinciusahaTambahanListB the b3RinciusahaTambahanListB to set
     */
    public void setB3RinciusahaTambahanListB(ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListB) {
        this.b3RinciusahaTambahanListB = b3RinciusahaTambahanListB;
    }

    /**
     * @return the b3RinciusahaTambahanListC
     */
    public ArrayList<B3RinciusahaTambahan> getB3RinciusahaTambahanListC() {
        return b3RinciusahaTambahanListC;
    }

    /**
     * @param b3RinciusahaTambahanListC the b3RinciusahaTambahanListC to set
     */
    public void setB3RinciusahaTambahanListC(ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListC) {
        this.b3RinciusahaTambahanListC = b3RinciusahaTambahanListC;
    }

    /**
     * @return the b3RinciusahaTambahanListD
     */
    public ArrayList<B3RinciusahaTambahan> getB3RinciusahaTambahanListD() {
        return b3RinciusahaTambahanListD;
    }

    /**
     * @param b3RinciusahaTambahanListD the b3RinciusahaTambahanListD to set
     */
    public void setB3RinciusahaTambahanListD(ArrayList<B3RinciusahaTambahan> b3RinciusahaTambahanListD) {
        this.b3RinciusahaTambahanListD = b3RinciusahaTambahanListD;
    }

}
