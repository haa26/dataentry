/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import pkl53.converter.DateConverter;
import pkl53.converter.IntegerConverter;
import pkl53.converter.KetRTConverter;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetKuesioner;
import pkl53.model.tambahan.KetRTTambahan;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.model.Kortimpencacah;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.model.OpsiB4r3;
import pkl53.model.OpsiB4r7;
import pkl53.model.OpsiB4r8;
import pkl53.model.OpsiJeniskelamin;
import pkl53.model.OpsiListingB4r16;
import pkl53.model.Petugasentri;
import pkl53.model.UserModel;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4Listing;

/**
 *
 * @author HP G42 (RILLA)
 */
public class SubmitListingController {

    int i = 0;

    /**
     * @return the listKetRT
     */
    public ArrayList<KetRt> getListKetRT() {
        return listKetRT;
    }

    /**
     * @param aListKetRT the listKetRT to set
     */
    public void setListKetRT(ArrayList<KetRt> aListKetRT) {
        listKetRT = aListKetRT;
    }

    /**
     * @return the listKetaRT
     */
    public ArrayList<KetRTTambahan> getListKetaRT() {
        return listKetaRTTambahan;
    }

    /**
     * @param aListKetaRT the listKetaRT to set
     */
    public void setListKetaRTambahan(ArrayList<KetRTTambahan> aListKetaRT) {
        listKetaRTTambahan = aListKetaRT;
    }
    private KetKuesioner modelListingB123;
    private KetRt modelKetRumahTangga;
    private KetRtanggota modelKetAnggotaRumahTangga;
    private Blok123Listing blok123;
    private Blok4Listing blok4;
    private String kks;
    private String KksArtNup;
    private IntegerConverter intConverter = new IntegerConverter();
    private DateConverter dateConverter = new DateConverter();
    private KetRTConverter ketRTConverter = new KetRTConverter();
    private ArrayList<KetRt> listKetRT = new ArrayList<KetRt>();
    private ArrayList<KetRTTambahan> listKetaRTTambahan = new ArrayList<KetRTTambahan>();
    private Petugasentri Petugasentri;

    public void insertAllBlok(int waktu) {

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            seti(waktu);
            Petugasentri = getModelMonitoring();
            em.merge(Petugasentri);

            modelListingB123 = getModelListingBlok123();
            em.merge(modelListingB123);

            for (KetRTTambahan art : listKetaRTTambahan) {
                int a = intConverter.convertForward(art.getB4r5());
                KetRt rt = new KetRt();
                if (a != 0 && art.getB4r9().equals("1")) {
                    System.out.println(rt.getB4r2());
                    rt.setKks(new KetKuesioner(getKKS()));
                    rt.setKksrt(getKKS() + art.getB4r1() + art.getB4r3() + art.getB4r4() + art.getB4r5());
                    rt.setB4r1(art.getB4r1());
                    rt.setB4r2(art.getB4r2());
                    rt.setB4r3(art.getB4r3());
                    rt.setB4r4(art.getB4r4());
                    rt.setB4r5(art.getB4r5());
                    rt.setB4r6(intConverter.convertForward(art.getB4r6()));
                    rt.setB4r24(intConverter.convertForward(art.getB4r24()));
                    rt.setB4r2526(art.getB4r25());
                    rt.setB4r30(intConverter.convertForward(art.getB4r30()));
                    rt.setB4r31(art.getB4r31());

                    em.persist(rt);

                }

            }
            for (KetRTTambahan artTambahan : listKetaRTTambahan) {
                KetRtanggota art = new KetRtanggota();
                int a = intConverter.convertForward(artTambahan.getB4r5());
                if (a != 0) {

                    art.setKKSArt(getKKS() + artTambahan.getB4r1() + artTambahan.getB4r3() + artTambahan.getB4r4() + artTambahan.getB4r5() + artTambahan.getB4r7());
                    art.setKksrt(new KetRt(getKKS() + artTambahan.getB4r1() + artTambahan.getB4r3() + artTambahan.getB4r4() + artTambahan.getB4r5()));
                    art.setB4r7(intConverter.convertForward(artTambahan.getB4r7()));
                    art.setB4r8(artTambahan.getB4r8());
                    art.setB4r9(new OpsiB4r3(artTambahan.getB4r9()));
                    art.setB4r10(new OpsiJeniskelamin(artTambahan.getB4r10()));
                    art.setB4r11(intConverter.convertForward(artTambahan.getB4r11()));
                    art.setB4r12(artTambahan.getB4r12());
                    art.setB4r13(artTambahan.getB4r13());
                    art.setB4r14(artTambahan.getB4r14());
                    art.setB4r15(artTambahan.getB4r15());

                    if (artTambahan.getB4r16().isEmpty()) {
                        art.setB4r16(new OpsiListingB4r16("10"));
                    } else {
                        art.setB4r16(new OpsiListingB4r16(artTambahan.getB4r16()));
                    }

                    art.setB4r17(artTambahan.getB4r17());

                    if (artTambahan.getB4r18().equals("")) {

                        art.setB4r18(new OpsiB4r7("10"));
                    } else {
                        art.setB4r18(new OpsiB4r7(artTambahan.getB4r18()));
                    }

                    if (artTambahan.getB4r19().equals("")) {
                        art.setB4r19(new OpsiB4r8("10"));
                    } else {
                        art.setB4r19(new OpsiB4r8(artTambahan.getB4r19()));
                    }

                    em.persist(art);

                }

            }
//        Blok4Listing.resetArray();
//        String a= listKetRT.get(listKetRT.size()-1).getB4r3();
//        String b= listKetRT.get(listKetRT.size()-1).getB4r4();
//        Blok4Listing.resetLoop(a,b);

//      
            em.getTransaction().commit();
            em.close();
            
//            int tempaArt = 0;
//            int tempArtUI = 0;
//            int tempArtUI = 0;
//            int tempArtUI = 0;
//            int tempArtUI = 0;
//            int tempArtUI = 0;
//            for (KetRTTambahan art : listKetaRTTambahan) {
//
//                int a = intConverter.convertForward(art.getB4r7());
//
//                if (a == 1) {
//                    tempArtUI = intConverter.convertForward(art.getB4r24()) + tempArtUI;
//                    tempaArt = intConverter.convertForward(art.getB4r6()) + temp;
//                }
//            }
//            
//          
//            Blok123Listing.setB2R2(String.valueOf(tempaArt));
//            Blok123Listing.setB2R3(Blok4Listing.getTotalArtUsahaInformaltextfield().getText());
            
            
                
            

            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            Blok4Listing.resetLoop();
        } catch (PersistenceException p) {

            JOptionPane.showMessageDialog(null, "Gagal Mengirim ke Database");
            JOptionPane.showMessageDialog(null, p.getMessage());

        }

    }

    public List<Kecamatan> getKecamatan(String kodeKecamatan) {
        List<Kecamatan> kecamatanList = new ArrayList<Kecamatan>();
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Query s = em.createQuery("SELECT k FROM Kecamatan k WHERE k.kecamatanId = :kecamatanId").setParameter("kecamatanId", kodeKecamatan);
            kecamatanList = s.getResultList();
            em.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kecamatanList;
    }

    public List<Kelurahan> getKelurahan(String kodeKelurahan) {
        List<Kelurahan> kelurahanList = new ArrayList<Kelurahan>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT k FROM Kelurahan k WHERE k.kelurahanId = :kelurahanId").setParameter("kelurahanId", kodeKelurahan);
        kelurahanList = s.getResultList();
        em.close();

        return kelurahanList;
    }

    public List<NoBs> getBS(String kodeBS) {
        List<NoBs> BSList = new ArrayList<NoBs>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT n FROM NoBs n WHERE n.nobsId = :nobsId").setParameter("nobsId", kodeBS);
        BSList = s.getResultList();
        em.close();

        return BSList;
    }

    public List<Kortimpencacah> getKortimPencacah(String kodeNim) {
        List<Kortimpencacah> KortimPencacahList = new ArrayList<Kortimpencacah>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT k FROM Kortimpencacah k WHERE k.nimPencacah = :nimPencacah").setParameter("nimPencacah", kodeNim);
        KortimPencacahList = s.getResultList();
        em.close();
        return KortimPencacahList;
    }

    public List<Mahasiswa> getMahasiswa(String kodeNim) {
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Query s = em.createQuery("SELECT m FROM Mahasiswa m WHERE m.nim = :nim").setParameter("nim", kodeNim);
            mahasiswaList = s.getResultList();
            em.close();

        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Gagal Mengirim ke Database");
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return mahasiswaList;
    }

    public String getKKS() {
        String s = blok123.getB1R1().getText()
                + blok123.getB1R2().getText()
                + blok123.getB1R3().getText() + blok123.getB1R5().getText();
        return s;
    }

    /**
     * @return the modelListingBlok123
     */
    public KetKuesioner getModelListingBlok123() {
        KetKuesioner modelListingBlok123 = new KetKuesioner();
        modelListingBlok123.setKks(getKKS());
        modelListingBlok123.setB1r1(new Kabupatenkota(blok123.getB1R1().getText()));
        modelListingBlok123.setB1r2(new Kecamatan(blok123.getB1R1().getText() + blok123.getB1R2().getText()));
        modelListingBlok123.setB1r3(new Kelurahan(blok123.getB1R1().getText() + blok123.getB1R2().getText() + blok123.getB1R3().getText()));
        modelListingBlok123.setB1r4(blok123.getB1R4().getText());
        modelListingBlok123.setB1r5(new NoBs(blok123.getB1R1().getText() + blok123.getB1R2().getText() + blok123.getB1R3().getText() + blok123.getB1R5().getText()));
        modelListingBlok123.setB1r6((blok123.getB1R6().getText()));
        modelListingBlok123.setB2r1(intConverter.convertForward(blok123.getB2R1().getText()));
        modelListingBlok123.setB2r2(intConverter.convertForward(blok123.getB2R2().getText()));
        modelListingBlok123.setB2r3(intConverter.convertForward(blok123.getB2R3().getText()));
        modelListingBlok123.setB2r4(intConverter.convertForward(blok123.getB2R4().getText()));
        modelListingBlok123.setB2r5(intConverter.convertForward(blok123.getB2R5().getText()));
        modelListingBlok123.setB2r6(intConverter.convertForward(blok123.getB2R6().getText()));
        modelListingBlok123.setB2r7(intConverter.convertForward(blok123.getB2R7().getText()));
        modelListingBlok123.setB2r8(intConverter.convertForward(blok123.getB2R8().getText()));
        modelListingBlok123.setNimPencacah(new Mahasiswa(blok123.getB3nimPencacah().getText()));
        modelListingBlok123.setTanggalPencacahan(dateConverter.convertForward(blok123.getB3tglPencacah().getText()));
        modelListingBlok123.setTanggalPemeriksaan(dateConverter.convertForward((blok123.getB3tglKortim().getText())));
        modelListingBlok123.setCatatan("catatan");

        return modelListingBlok123;
    }

    public void seti(int i) {
        this.i = i;
    }

    public Petugasentri getModelMonitoring() {

        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        Petugasentri Petugasentri = new Petugasentri();
        Petugasentri.setKks(getKKS());
//        Petugasentri.setKksrt(getKKS() + intConverter.convertForward(blok123.getB2R2().getText()));
        Petugasentri.setNim(UserModel.getUsername());

        mahasiswaList = getMahasiswa(UserModel.getUsername());

        for (Mahasiswa mhs : mahasiswaList) {
//            Petugasentri.setNama((mhs.getNama().toUpperCase()));
        }
//
//        Petugasentri.setJumlahrt(intConverter.convertForward(blok123.getB2R2().getText()));
//        Petugasentri.setTanggal(null);
        Petugasentri.setWaktu(i);

        return Petugasentri;
    }

    /**
     * @param modelListingBlok123 the modelListingBlok123 to set
     */
    public void setModelListingB123(KetKuesioner modelListingBlok123) {
        this.modelListingB123 = modelListingBlok123;
    }

    /**
     * @return the modelKetRumahTangga
     */
    public KetRt getModelKetRumahTangga() {
        return modelKetRumahTangga;
    }

    /**
     * @param modelKetRumahTangga the modelKetRumahTangga to set
     */
    public void setModelKetRumahTangga(KetRt modelKetRumahTangga) {
        this.modelKetRumahTangga = modelKetRumahTangga;
    }

    /**
     * @return the modelKetAnggotaRumahTangga
     */
    public KetRtanggota getModelKetAnggotaRumahTangga() {
        return modelKetAnggotaRumahTangga;
    }

    /**
     * @param modelKetAnggotaRumahTangga the modelKetAnggotaRumahTangga to set
     */
    public void setModelKetAnggotaRumahTangga(KetRtanggota modelKetAnggotaRumahTangga) {
        this.modelKetAnggotaRumahTangga = modelKetAnggotaRumahTangga;
    }

    /**
     * @return the blok123
     */
    public Blok123Listing getBlok123() {
        return blok123;
    }

    /**
     * @param blok123 the blok123 to set
     */
    public void setBlok123(Blok123Listing blok123) {
        this.blok123 = blok123;
    }

    /**
     * @return the blok4
     */
    public Blok4Listing getBlok4() {
        return blok4;
    }

    /**
     * @param blok4 the blok4 to set
     */
    public void setBlok4(Blok4Listing blok4) {
        this.blok4 = blok4;
    }

}
