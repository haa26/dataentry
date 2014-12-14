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
import javax.persistence.Query;
import javax.swing.JOptionPane;
import pkl53.converter.DateConverter;
import pkl53.converter.IntegerConverter;
import pkl53.model.B1Keterangantempat;
import pkl53.model.B4Art;
import pkl53.model.B4Keteranganumumtenagakerja;
import pkl53.model.B5Keteranganumumtenagakerjainformal;
import pkl53.model.B6Keteranganumumpekerjaaninformalutama;
import pkl53.model.B7KepalaArt;
import pkl53.model.B8Keteranganperumahandanaset;
import pkl53.model.Blok4PekerjaBinding;
import pkl53.model.Kabupatenkota;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetKuesioner;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.model.OpsiB4r18;
import pkl53.model.OpsiB4r3;
import pkl53.model.OpsiB4r7;
import pkl53.model.OpsiB4r8;
import pkl53.model.OpsiB5r11;
import pkl53.model.OpsiB5r13;
import pkl53.model.OpsiB5r5;
import pkl53.model.OpsiB5r9;
import pkl53.model.OpsiB6r12a;
import pkl53.model.OpsiB6r16;
import pkl53.model.OpsiB6r17;
import pkl53.model.OpsiB6r18;
import pkl53.model.OpsiB6r22a;
import pkl53.model.OpsiB6r3;
import pkl53.model.OpsiB6r6utamalain;

import pkl53.model.OpsiB7r3;
import pkl53.model.OpsiB7r4;
import pkl53.model.OpsiB8r1;
import pkl53.model.OpsiB8r2;
import pkl53.model.OpsiB8r3;
import pkl53.model.OpsiB8r5a;
import pkl53.model.OpsiB8r5b;
import pkl53.model.OpsiB8r6;
import pkl53.model.OpsiB8r7a;
import pkl53.model.OpsiB8r7b;
import pkl53.model.OpsiB8r8;
import pkl53.model.OpsiB8r9;
import pkl53.model.OpsiRincianLapUsaha;
import pkl53.model.OpsiYaDalamprosesTidakTidaktahu;
import pkl53.model.OpsiYaTidak;
import pkl53.model.OpsiYaTidakTidaktau;
import pkl53.model.Petugasentri;
import pkl53.model.UserModel;
import pkl53.model.tambahan.Blok56BTamabahan;
import pkl53.view.Blok123;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4;
import pkl53.view.Blok4B;
import pkl53.view.Blok56;
import pkl53.view.Blok56B;
import pkl53.view.Blok789;

/**
 *
 * @author HP G42 (RILLA)
 */
public class SubmitControllerPekerjaan {

    int i = 0;
    private B5Keteranganumumtenagakerjainformal modelBlok5 = new B5Keteranganumumtenagakerjainformal();
    private B7KepalaArt modelBlok7 = new B7KepalaArt();
    private B8Keteranganperumahandanaset modelBlok8 = new B8Keteranganperumahandanaset();
    private B6Keteranganumumpekerjaaninformalutama modelBlok6 = new B6Keteranganumumpekerjaaninformalutama();
    private B1Keterangantempat modelBlok1 = new B1Keterangantempat();
    private B4Art modelBlok4Art = new B4Art();
    private B4Keteranganumumtenagakerja modelBlok4KetArt = new B4Keteranganumumtenagakerja();

    private Blok123 blok1;
    private Blok789 blok789;

    private String kks;
    private String KksArtNup;

    private List<Blok4PekerjaBinding> b4APekerjaBinding = Blok4.getB4PekerjaanBindingList();
    private List<Blok4PekerjaBinding> b4BPekerjaBinding = Blok4B.getB4PekerjaBinding();

    private List<B5Keteranganumumtenagakerjainformal> b5ModelList = new ArrayList<B5Keteranganumumtenagakerjainformal>();
    private List<B6Keteranganumumpekerjaaninformalutama> b6ModelList = new ArrayList<B6Keteranganumumpekerjaaninformalutama>();
    private List<Blok56BTamabahan> b5List = new ArrayList<Blok56BTamabahan>();
    private List<Blok56BTamabahan> b6List = new ArrayList<Blok56BTamabahan>();

    private List<B4Keteranganumumtenagakerja> b4ModelList = new ArrayList<B4Keteranganumumtenagakerja>();
    private IntegerConverter Int = new IntegerConverter();
    private DateConverter dateConverter = new DateConverter();

    Petugasentri Petugasentri = new Petugasentri();

    public void insertAllBlok(int waktu) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            seti(waktu);
            Petugasentri = getModelMonitoring();
            em.merge(Petugasentri);

            B1Keterangantempat b1 = getModelB1();
            em.persist(b1);

            for (B4Art b4Art : getB4ArtList()) {
                em.persist(b4Art);
            }
//
            for (B4Keteranganumumtenagakerja b4 : getListKeteranganUmumTenagaKerja()) {
                em.persist(b4);
            }
//             blok 5 dan 6 ad looping
            for (B5Keteranganumumtenagakerjainformal b5 : getModelB5()) {
                em.persist(b5);
            }
//
            for (B6Keteranganumumpekerjaaninformalutama b6 : getModelB6()) {
                em.persist(b6);
            }

            em.persist(getModelB7());
            em.persist(getModelB8());
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan ke Database");

        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan ke Database");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void seti(int i) {
        this.i = i;
    }

    public List<NoBs> getBS(String kodeBS) {
        List<NoBs> BSList = new ArrayList<NoBs>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT n FROM NoBs n WHERE n.nobsId = :nobsId ").setParameter("nobsId", kodeBS);
        BSList = s.getResultList();
        em.close();

        return BSList;
    }

    public Petugasentri getModelMonitoring() {

        Petugasentri Petugasentri = new Petugasentri();
        Petugasentri.setKks(getKKS());

        Petugasentri.setNim(UserModel.getUsername());

        Petugasentri.setWaktu(i);

        return Petugasentri;
    }

    public List<KetRt> getketRt(KetKuesioner kks, String kodeRT) {
        List<KetRt> rtList = new ArrayList<KetRt>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT k FROM KetRt k WHERE k.kks = :kks AND k.b4r5=:b4r5").setParameter("kks", kks).setParameter("b4r5", kodeRT);
        rtList = s.getResultList();
        em.close();

        return rtList;
    }

    public List<KetRtanggota> getketRtAnggota(String kodeRT, int noKrt, KetKuesioner kks) {

        List<KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query s = em.createQuery("SELECT j FROM KetRtanggota  j JOIN j.kksrt k WHERE k.kks=:kks AND k.b4r5=:b4r5 AND j.b4r7=:b4r7").setParameter("b4r5", kodeRT).setParameter("b4r7", noKrt);
        s.setParameter("kks", kks);
        rtAnggotaList = s.getResultList();
        em.close();

        return rtAnggotaList;
    }

    public List<KetRtanggota> getAllketRtAnggota(String kodeRT, KetKuesioner kks) {

        List<KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query s = em.createQuery("SELECT j FROM KetRtanggota j JOIN j.kksrt k WHERE k.b4r5=:b4r5 AND k.kks=:kks").setParameter("b4r5", kodeRT);
        s.setParameter("kks", kks);
        rtAnggotaList = s.getResultList();
        em.close();

        return rtAnggotaList;
    }

    public List<Kecamatan> getKecamatan(String kodeKecamatan) {
        List<Kecamatan> kecamatanList = new ArrayList<Kecamatan>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query s = em.createQuery("SELECT k FROM Kecamatan k WHERE k.kecamatanId = :b1r2").setParameter("b1r2", kodeKecamatan);
        kecamatanList = s.getResultList();
        em.close();

        return kecamatanList;

//        List <B1Keterangantempat> b1List = new ArrayList<B1Keterangantempat>();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53PU");
//        EntityManager em = emf.createEntityManager();
//        B1Keterangantempat b1 = new B1Keterangantempat();
//        Query s = em.createNamedQuery("B1Keterangantempat.findAll");
//        List <B1Keterangantempat> b1List = new ArrayList<B1Keterangantempat>();
//        b1List = s.getResultList();
//        em.close();
//        for(B1Keterangantempat b2 : b1List){
//            System.out.println(b2.getKks());
//        }
//        
    }

    public void print() {
        System.out.println(getBlok1().getB1R1().getText());
    }

    public String getKKS() {
        return getBlok1().getB1R1().getText()
                + getBlok1().getB1R2().getText()
                + getBlok1().getB1R3().getText()
                + getBlok1().getB1R5a().getText()
                + getBlok1().getB1R6().getText();
    }

    public B1Keterangantempat getModelB1() {
        List<KetRt> rtList = new ArrayList<KetRt>();

        getModelBlok1().setKks(getKKS());
        getModelBlok1().setB1r1(new Kabupatenkota(getBlok1().getB1R1().getText()));
        getModelBlok1().setB1r2(new Kecamatan(getBlok1().getB1R1().getText() + getBlok1().getB1R2().getText()));
        getModelBlok1().setB1r3(new Kelurahan(getBlok1().getB1R1().getText() + getBlok1().getB1R2().getText() + getBlok1().getB1R3().getText()));
        getModelBlok1().setB1r4(getBlok1().getB1R4().getText());

        getModelBlok1().setB1r5a(new NoBs(getBlok1().getB1R1().getText() + getBlok1().getB1R2().getText() + getBlok1().getB1R3().getText() + getBlok1().getB1R5a().getText()));
        getModelBlok1().setB1r5b(getBlok1().getB1R5b().getText());
        rtList = getketRt(new KetKuesioner(getKKS()), getBlok1().getB1R6().getText());
        if (rtList.size() > 0) {
            for (KetRt rt : rtList) {
                getModelBlok1().setB1r6(new KetRt(rt.getKksrt()));
            }
        }
        getModelBlok1().setB1r7(getBlok1().getNamaKrtLabel().getText());
        getModelBlok1().setB1r8(getBlok1().getAlamatLabel().getText());
        if (!getBlok1().getB3C1R2().getText().isEmpty()) {
            getModelBlok1().setNimPencacah(new Mahasiswa(getBlok1().getB3C1R2().getText()));
        }
        getModelBlok1().setTanggalPemeriksaanKP(getDateConverter().convertForward(getBlok1().getB3C1R3a().getText()));
        getModelBlok1().setTanggalPencacahan(getDateConverter().convertForward(getBlok1().getB3C2R3a().getText()));
        return getModelBlok1();

    }

    public List<B4Art> getB4ArtList() {
        List<B4Art> b4List = new ArrayList<B4Art>();

        for (Blok4PekerjaBinding b4 : getB4APekerjaBinding()) {
            if (Int.convertForward(b4.getB4r4()) == 1) {
                B4Art b4Art = new B4Art();
                b4Art.setKks(new B1Keterangantempat(getKKS()));
                b4Art.setKKSArt(getKKS() + b4.getB4r1());
                b4Art.setB4r1(b4.getB4r1());
                b4Art.setB4r2(b4.getB4r2());

                if (!b4.getB4r3().isEmpty()) {

                    b4Art.setB4r3(new OpsiB4r3(b4.getB4r3()));
                }

                b4List.add(b4Art);
            }
        }

        return b4List;
    }

    public List<B4Keteranganumumtenagakerja> getListKeteranganUmumTenagaKerja() {

        for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {

            B4Keteranganumumtenagakerja b4tenagakerja = new B4Keteranganumumtenagakerja();

            b4tenagakerja.setKKSArt(new B4Art(getKKS() + b4.getB4r1()));
            b4tenagakerja.setKKSArtNup(getKKS() + b4.getB4r1() + b4.getB4r4());
            b4tenagakerja.setB4r4(b4.getB4r4());

            if (!b4.getB4r5().isEmpty()) {
                b4tenagakerja.setB4r5((b4.getB4r5()));
            }

            b4tenagakerja.setB4r6(b4.getB4r6());

            if (!b4.getB4r7().isEmpty()) {
                b4tenagakerja.setB4r7(new OpsiB4r7(b4.getB4r7()));
            }
            if (!b4.getB4r8().isEmpty()) {
                b4tenagakerja.setB4r8(new OpsiB4r8(b4.getB4r8()));
            }
            if (!b4.getB4r9().isEmpty()) {
                b4tenagakerja.setB4r9(new OpsiYaTidakTidaktau(b4.getB4r9()));
            }

            if (!b4.getB4r10().isEmpty()) {
                b4tenagakerja.setB4r10(new OpsiYaTidakTidaktau(b4.getB4r10()));
            }
            if (!b4.getB4r11().isEmpty()) {
                b4tenagakerja.setB4r11(new OpsiYaTidakTidaktau(b4.getB4r11()));
            }
            if (!b4.getB4r12().isEmpty()) {
                b4tenagakerja.setB4r12(new OpsiYaTidakTidaktau(b4.getB4r12()));
            }
            if (!b4.getB4r13().isEmpty()) {
                b4tenagakerja.setB4r13(new OpsiYaTidakTidaktau(b4.getB4r13()));
            }

            if (!b4.getB4r14().isEmpty()) {
                b4tenagakerja.setB4r14((b4.getB4r14()));
            }
            if (!b4.getB4r15().isEmpty()) {
                b4tenagakerja.setB4r15((b4.getB4r15()));
            }

            for (Blok4PekerjaBinding b4b : Blok4B.getB4PekerjaBinding()) {
                if (getInt().convertForward(b4b.getB4r4()) == getInt().convertForward(b4b.getB4r4())) {

                    if (!b4b.getB4r16().isEmpty()) {
                        b4tenagakerja.setB4r16(new OpsiYaTidak(b4b.getB4r16()));
                    }
                    if (!b4b.getB4r17().isEmpty()) {
                        b4tenagakerja.setB4r17(new OpsiYaTidakTidaktau(b4b.getB4r17()));
                    }

                    if (!b4b.getB4r18().isEmpty()) {
                        b4tenagakerja.setB4r18(new OpsiB4r18(b4b.getB4r18()));
                    }

                    if (!b4b.getB4r19().isEmpty()) {
                        b4tenagakerja.setB4r19(new OpsiYaDalamprosesTidakTidaktahu(b4b.getB4r19()));
                    }
                    if (!b4b.getB4r20().isEmpty()) {
                        b4tenagakerja.setB4r20(new OpsiYaDalamprosesTidakTidaktahu(b4b.getB4r20()));
                    }
                    if (!b4b.getB4r21().isEmpty()) {
                        b4tenagakerja.setB4r21(new OpsiYaDalamprosesTidakTidaktahu(b4b.getB4r21()));
                    }
                    if (!b4b.getB4r22().isEmpty()) {
                        b4tenagakerja.setB4r22(new OpsiYaDalamprosesTidakTidaktahu(b4b.getB4r22()));
                    }

                    if (!b4b.getB4r23().isEmpty()) {
                        b4tenagakerja.setB4r23((b4b.getB4r23()));
                    }
                    if (!b4b.getB4r24().isEmpty()) {
                        b4tenagakerja.setB4r24((b4b.getB4r24()));
                    }
                }
            }
            b4ModelList.add(b4tenagakerja);

        }
        return b4ModelList;
    }

    public List<B5Keteranganumumtenagakerjainformal> getModelB5() {
        for (Blok56BTamabahan b5 : b5List) {
            B5Keteranganumumtenagakerjainformal b5ket = new B5Keteranganumumtenagakerjainformal();

            b5ket.setKKSArtNup(getKKS() + b5.getB5r1art() + b5.getB5r2());
            b5ket.setB5r1a(b5.getB5r1nama());
            b5ket.setB5r1b(getInt().convertForward(b5.getB5r1art()));
            b5ket.setB5r2(b5.getB5r2());
            if (!b5.getB5r3().isEmpty()) {
                b5ket.setB5r3(b5.getB5r3());
            }
            b5ket.setB5r4(getInt().convertForward(b5.getB5r3()));

            if (!b5.getB5r5().isEmpty()) {
                b5ket.setB5r5(new OpsiB5r5(b5.getB5r5()));
            }

            b5ket.setB5r6a(b5.getB5r6a());
            b5ket.setB5r6b(b5.getB5r6b());
            b5ket.setB5r7a(b5.getB5r7a());
            b5ket.setB5r7b(b5.getB5r7b());
            b5ket.setB5r8(b5.getB5r8());

            if (!b5.getB5r9().isEmpty()) {
                b5ket.setB5r9(new OpsiB5r9(b5.getB5r9()));
            }

            if (!b5.getB5r10().isEmpty()) {
                b5ket.setB5r10(b5.getB5r10());
            }

            if (!b5.getB5r11().isEmpty()) {
                b5ket.setB5r11(new OpsiB5r11(b5.getB5r11()));
            }

            b5ket.setB5r12(b5.getB5r12());

            if (!b5.getB5r13().isEmpty()) {
                b5ket.setB5r13(new OpsiB5r13(b5.getB5r13()));
            }

            b5ket.setB5r14a(b5.getB5r14a());
            b5ket.setB5r14b(b5.getB5r14b());
            if (!b5.getB5r15().isEmpty()) {
                b5ket.setB5r15(b5.getB5r15());
            }
            if (!b5.getB5r16().isEmpty()) {
                b5ket.setB5r16(b5.getB5r16());
            }
            if (!b5.getB5r17a().isEmpty()) {
                b5ket.setB5r17a(b5.getB5r17a());
            }
            if (!b5.getB5r17b().isEmpty()) {
                b5ket.setB5r17b(b5.getB5r17b());
            }
            b5ModelList.add(b5ket);
        }
        return b5ModelList;

    }

    public List<B6Keteranganumumpekerjaaninformalutama> getModelB6() {

        for (int i = 0; i < getB5List().size(); i++) {

            B6Keteranganumumpekerjaaninformalutama b6ket = new B6Keteranganumumpekerjaaninformalutama();

            b6ket.setKKSArtNup(getKKS() + b5List.get(i).getB5r1art() + b5List.get(i).getB5r2());
            b6ket.setB6r1(b5List.get(i).getB6r1());
            b6ket.setB6r2(b5List.get(i).getB6r2());

            if (!b5List.get(i).getB6r3().isEmpty()) {
                b6ket.setB6r3(new OpsiB6r3(String.valueOf(Int.convertForward(b5List.get(i).getB6r3()))));
            }

            if (b5List.get(i).getB6r310lain().equals("") && !b5List.get(i).getB6r313lain().equals("")) {
                b6ket.setB6R3Lainnya(b5List.get(i).getB6r313lain());
            } else if (b5List.get(i).getB6r313lain().equals("") && !b5List.get(i).getB6r310lain().equals("")) {
                b6ket.setB6R3Lainnya(b5List.get(i).getB6r310lain());
            } else {
                b6ket.setB6R3Lainnya("");
            }

            b6ket.setB6r4a(getInt().convertForward(b5List.get(i).getB6r4a()));
            b6ket.setB6r4b(getInt().convertForward(b5List.get(i).getB6r4b()));
            b6ket.setB6r5a(getInt().convertForward(b5List.get(i).getB6r5a()));
            b6ket.setB6r5b(getInt().convertForward(b5List.get(i).getB6r5b()));

            if (!b5List.get(i).getB6r6utama().isEmpty()) {
                b6ket.setB6R6utama(new OpsiB6r6utamalain(getInt().convertForward(b5List.get(i).getB6r6utama())));
            }

            if (!b5List.get(i).getB6r6lain().isEmpty()) {
                b6ket.setB6R6utama(new OpsiB6r6utamalain(getInt().convertForward(b5List.get(i).getB6r6lain())));
            }

            b6ket.setB6R6lainnya(b5List.get(i).getB6r6lainnya());
            b6ket.setB6r7a(getInt().convertForward(b5List.get(i).getB6r7a()));
            b6ket.setB6r7b(getInt().convertForward(b5List.get(i).getB6r7b()));
            b6ket.setB6r8a(getInt().convertForward(b5List.get(i).getB6r8a()));

            b6ket.setB6R8BSen(getInt().convertForward(b5List.get(i).getB6r8bSen()));
            b6ket.setB6R8BSel(getInt().convertForward(b5List.get(i).getB6r8bSel()));
            b6ket.setB6R8BRab(getInt().convertForward(b5List.get(i).getB6r8bRab()));
            b6ket.setB6R8BKam(getInt().convertForward(b5List.get(i).getB6r8bKam()));
            b6ket.setB6R8BJum(getInt().convertForward(b5List.get(i).getB6r8bJum()));
            b6ket.setB6R8BSab(getInt().convertForward(b5List.get(i).getB6r8bSab()));
            b6ket.setB6R8BMing(getInt().convertForward(b5List.get(i).getB6r8bMin()));
            b6ket.setB6R8BJumlah(getInt().convertForward(b5List.get(i).getB6r8bJuml()));
            if (!b5List.get(i).getB6r9a().isEmpty()) {
                b6ket.setB6r9a(b5List.get(i).getB6r9a());
            }
            if (!b5List.get(i).getB6r9b().isEmpty()) {
                b6ket.setB6r9b(b5List.get(i).getB6r9b());
            }
            if (!b5List.get(i).getB6r10().isEmpty()) {
                b6ket.setB6r10(b5List.get(i).getB6r10());
            }

            for (int j = 0; j < getB6List().size(); j++) {
                if (i == j) {

                    if (!b6List.get(i).getB6r11().isEmpty()) {
                        b6ket.setB6r11(b6List.get(j).getB6r11());
                    }

                    if (!b6List.get(j).getB6r12a().isEmpty()) {
                        b6ket.setB6r12a(new OpsiB6r12a(b6List.get(j).getB6r12a()));
                    }

                    if (!b6List.get(j).getB6r12b().isEmpty()) {
                        b6ket.setB6r12b(b6List.get(j).getB6r12b());
                    }
                    if (!b6List.get(j).getB6r13().isEmpty()) {
                        b6ket.setB6r13((b6List.get(j).getB6r13()));
                    }
                    if (!b6List.get(j).getB6r14().isEmpty()) {
                        b6ket.setB6r14(b6List.get(j).getB6r14());
                    }
                    b6ket.setB6r15a(getInt().convertForward(b6List.get(j).getB6r15a()));
                    b6ket.setB6r15b(getInt().convertForward(b6List.get(j).getB6r15b()));

                    if (!b6List.get(j).getB6r16().isEmpty()) {
                        b6ket.setB6r16(new OpsiB6r16(b6List.get(j).getB6r16()));
                    }

                    if (!b6List.get(j).getB6r17().isEmpty()) {
                        b6ket.setB6r17(new OpsiB6r17(b6List.get(j).getB6r17()));
                    }

                    b6ket.setB6R17lainnya(b6List.get(j).getB6r17lain());

                    if (!b6List.get(j).getB6r18().isEmpty()) {
                        b6ket.setB6r18(new OpsiB6r18(b6List.get(j).getB6r18()));
                    }

                    if (!b6List.get(j).getB6r19().isEmpty()) {
                        b6ket.setB6r19((b6List.get(j).getB6r19()));
                    }
                    b6ket.setB6r20a(getInt().convertForward(b6List.get(j).getB6r20a()));
                    b6ket.setB6r20b(getInt().convertForward(b6List.get(j).getB6r20b()));
                    if (!b6List.get(j).getB6r21a().isEmpty()) {
                        b6ket.setB6r21a((b6List.get(j).getB6r21a()));
                    }
                    if (!b6List.get(j).getB6r21b().isEmpty()) {
                        b6ket.setB6r21b((b6List.get(j).getB6r21b()));
                    }
                    if (!b6List.get(j).getB6r21c().isEmpty()) {
                        b6ket.setB6r21c((b6List.get(j).getB6r21c()));
                    }

                    if (!b6List.get(j).getB6r22a().isEmpty()) {
                        b6ket.setB6r22a(new OpsiB6r22a(b6List.get(j).getB6r22a()));
                    }

                    if (!b6List.get(j).getB6r22b().isEmpty()) {
                        b6ket.setB6r22b(b6List.get(j).getB6r22b());
                    }
                    b6ket.setB6R22Blainnya(b6List.get(j).getB6r22blain());

                }
            }
            b6ModelList.add(b6ket);

        }
        return b6ModelList;

    }

    public B7KepalaArt getModelB7() {

        //modelBlok7.setKKSArt(getkksart);
        getModelBlok7().setKKSArt(getBlok1().getB1R1().getText()
                + getBlok1().getB1R2().getText()
                + getBlok1().getB1R3().getText()
                + getBlok1().getB1R5a().getText() 
                + getBlok1().getB1R6().getText() + 1
        );
        if (!getBlok789().getB7R1().getText().isEmpty()) {
            getModelBlok7().setB7r1(getBlok789().getB7R1().getText());
        }
        getModelBlok7().setB7r2(getInt().convertForward(getBlok789().getB7R2().getText()));

        if (!getBlok789().getB7R3().getText().isEmpty()) {
            getModelBlok7().setB7r3(new OpsiB7r3(getBlok789().getB7R3().getText()));
        }

        if (!getBlok789().getB7R4().getText().isEmpty()) {
            getModelBlok7().setB7r4(new OpsiB7r4(getBlok789().getB7R4().getText()));
        }

        getModelBlok7().setB7r5(getInt().convertForward(getBlok789().getB7R5().getText()));

        return getModelBlok7();

    }

    public B8Keteranganperumahandanaset getModelB8() {

        getModelBlok8().setKks(getKKS());

        if (!getBlok789().getB8R1().getText().isEmpty()) {
            getModelBlok8().setB8r1(new OpsiB8r1(getBlok789().getB8R1().getText()));
        }

        if (!getBlok789().getB8R2().getText().isEmpty()) {
            getModelBlok8().setB8r2(new OpsiB8r2(getBlok789().getB8R2().getText()));
        }

        if (!getBlok789().getB8R3().getText().isEmpty()) {
            getModelBlok8().setB8r3(new OpsiB8r3(getBlok789().getB8R3().getText()));
        }

        getModelBlok8().setB8r4(getInt().convertForward(getBlok789().getB8R4().getText()));

        if (!getBlok789().getB8R5a().getText().isEmpty()) {
            getModelBlok8().setB8r5a(new OpsiB8r5a(getBlok789().getB8R5a().getText()));
        }

        if (!getBlok789().getB8R5b().getText().isEmpty()) {
            getModelBlok8().setB8r5b(new OpsiB8r5b(String.valueOf(Int.convertForward(getBlok789().getB8R5b().getText()))));
        }

        if (!getBlok789().getB8R6().getText().isEmpty()) {
            getModelBlok8().setB8r6(new OpsiB8r6(String.valueOf(Int.convertForward(getBlok789().getB8R6().getText()))));
            JOptionPane.showMessageDialog(null, getModelBlok8().getB8r6());
        }

        if (!getBlok789().getB8R7a().getText().isEmpty()) {
            getModelBlok8().setB8r7a(new OpsiB8r7a(getBlok789().getB8R7a().getText()));
        }

        if (!getBlok789().getB8R7b().getText().isEmpty()) {
            getModelBlok8().setB8r7b(new OpsiB8r7b(getBlok789().getB8R7b().getText()));
        }
        if (!getBlok789().getB8R8().getText().isEmpty()) {
            getModelBlok8().setB8r8(new OpsiB8r8(getBlok789().getB8R8().getText()));
        }
        if (!getBlok789().getB8R9().getText().isEmpty()) {
            getModelBlok8().setB8r9(new OpsiB8r9(getBlok789().getB8R9().getText()));
        }

        if (!getBlok789().getB8R10a().getText().isEmpty()) {
            getModelBlok8().setB8r10a(getBlok789().getB8R10a().getText());
        }
        if (!getBlok789().getB8R10b().getText().isEmpty()) {
            getModelBlok8().setB8r10b(getBlok789().getB8R10b().getText());
        }
        if (!getBlok789().getB8R10c().getText().isEmpty()) {
            getModelBlok8().setB8r10c(getBlok789().getB8R10c().getText());
        }
        if (!getBlok789().getB8R10d().getText().isEmpty()) {
            getModelBlok8().setB8r10d(getBlok789().getB8R10d().getText());
        }
        if (!getBlok789().getB8R10e().getText().isEmpty()) {
            getModelBlok8().setB8r10e(getBlok789().getB8R10e().getText());
        }
        if (!getBlok789().getB8R10f().getText().isEmpty()) {
            getModelBlok8().setB8r10f(getBlok789().getB8R10f().getText());
        }
        if (!getBlok789().getB8R10g().getText().isEmpty()) {
            getModelBlok8().setB8r10g(getBlok789().getB8R10g().getText());
        }
        if (!getBlok789().getB8R10h().getText().isEmpty()) {
            getModelBlok8().setB8r10h(getBlok789().getB8R10h().getText());
        }
        if (!getBlok789().getB8R10i().getText().isEmpty()) {
            getModelBlok8().setB8r10i(getBlok789().getB8R10i().getText());
        }
        if (!getBlok789().getB8R10j().getText().isEmpty()) {
            getModelBlok8().setB8r10j(getBlok789().getB8R10j().getText());
        }
        return getModelBlok8();

    }

    /**
     * @return the modelBlok5
     */
    public B5Keteranganumumtenagakerjainformal getModelBlok5() {
        return modelBlok5;
    }

    /**
     * @param modelBlok5 the modelBlok5 to set
     */
    public void setModelBlok5(B5Keteranganumumtenagakerjainformal modelBlok5) {
        this.modelBlok5 = modelBlok5;
    }

    /**
     * @return the modelBlok7
     */
    public B7KepalaArt getModelBlok7() {
        return modelBlok7;
    }

    /**
     * @param modelBlok7 the modelBlok7 to set
     */
    public void setModelBlok7(B7KepalaArt modelBlok7) {
        this.modelBlok7 = modelBlok7;
    }

    /**
     * @return the modelBlok8
     */
    public B8Keteranganperumahandanaset getModelBlok8() {
        return modelBlok8;
    }

    /**
     * @param modelBlok8 the modelBlok8 to set
     */
    public void setModelBlok8(B8Keteranganperumahandanaset modelBlok8) {
        this.modelBlok8 = modelBlok8;
    }

    /**
     * @return the modelBlok6
     */
    public B6Keteranganumumpekerjaaninformalutama getModelBlok6() {
        return modelBlok6;
    }

    /**
     * @param modelBlok6 the modelBlok6 to set
     */
    public void setModelBlok6(B6Keteranganumumpekerjaaninformalutama modelBlok6) {
        this.modelBlok6 = modelBlok6;
    }

    /**
     * @return the modelBlok1
     */
    public B1Keterangantempat getModelBlok1() {
        return modelBlok1;
    }

    /**
     * @param modelBlok1 the modelBlok1 to set
     */
    public void setModelBlok1(B1Keterangantempat modelBlok1) {
        this.modelBlok1 = modelBlok1;
    }

    /**
     * @return the modelBlok4Art
     */
    public B4Art getModelBlok4Art() {
        return modelBlok4Art;
    }

    /**
     * @param modelBlok4Art the modelBlok4Art to set
     */
    public void setModelBlok4Art(B4Art modelBlok4Art) {
        this.modelBlok4Art = modelBlok4Art;
    }

    /**
     * @return the modelBlok4KetArt
     */
    public B4Keteranganumumtenagakerja getModelBlok4KetArt() {
        return modelBlok4KetArt;
    }

    /**
     * @param modelBlok4KetArt the modelBlok4KetArt to set
     */
    public void setModelBlok4KetArt(B4Keteranganumumtenagakerja modelBlok4KetArt) {
        this.modelBlok4KetArt = modelBlok4KetArt;
    }

    /**
     * @return the blok1
     */
    public Blok123 getBlok1() {
        return blok1;
    }

    /**
     * @param blok1 the blok1 to set
     */
    public void setBlok1(Blok123 blok1) {
        this.blok1 = blok1;
    }

    /**
     * @return the blok789
     */
    public Blok789 getBlok789() {
        return blok789;
    }

    /**
     * @param blok789 the blok789 to set
     */
    public void setBlok789(Blok789 blok789) {
        this.blok789 = blok789;
    }

    /**
     * @return the kks
     */
    public String getKks() {
        return kks;
    }

    /**
     * @param kks the kks to set
     */
    public void setKks(String kks) {
        this.kks = kks;
    }

    /**
     * @return the KksArtNup
     */
    public String getKksArtNup() {
        return KksArtNup;
    }

    /**
     * @param KksArtNup the KksArtNup to set
     */
    public void setKksArtNup(String KksArtNup) {
        this.KksArtNup = KksArtNup;
    }

    /**
     * @return the b4APekerjaBinding
     */
    public List<Blok4PekerjaBinding> getB4APekerjaBinding() {
        return b4APekerjaBinding;
    }

    /**
     * @param b4APekerjaBinding the b4APekerjaBinding to set
     */
    public void setB4APekerjaBinding(List<Blok4PekerjaBinding> b4APekerjaBinding) {
        this.b4APekerjaBinding = b4APekerjaBinding;
    }

    /**
     * @return the b4BPekerjaBinding
     */
    public List<Blok4PekerjaBinding> getB4BPekerjaBinding() {
        return b4BPekerjaBinding;
    }

    /**
     * @param b4BPekerjaBinding the b4BPekerjaBinding to set
     */
    public void setB4BPekerjaBinding(List<Blok4PekerjaBinding> b4BPekerjaBinding) {
        this.b4BPekerjaBinding = b4BPekerjaBinding;
    }

    /**
     * @return the b5ModelList
     */
    public List<B5Keteranganumumtenagakerjainformal> getB5ModelList() {
        return b5ModelList;
    }

    /**
     * @param b5ModelList the b5ModelList to set
     */
    public void setB5ModelList(ArrayList<B5Keteranganumumtenagakerjainformal> b5ModelList) {
        this.b5ModelList = b5ModelList;
    }

    /**
     * @return the b6ModelList
     */
    public List<B6Keteranganumumpekerjaaninformalutama> getB6ModelList() {
        return b6ModelList;
    }

    /**
     * @param b6ModelList the b6ModelList to set
     */
    public void setB6ModelList(ArrayList<B6Keteranganumumpekerjaaninformalutama> b6ModelList) {
        this.b6ModelList = b6ModelList;
    }

    /**
     * @return the b5List
     */
    public List<Blok56BTamabahan> getB5List() {
        return b5List;
    }

    /**
     * @param b5List the b5List to set
     */
    public void setB5List(ArrayList<Blok56BTamabahan> b5List) {
        this.b5List = b5List;
    }

    /**
     * @return the b6List
     */
    public List<Blok56BTamabahan> getB6List() {
        return b6List;
    }

    /**
     * @param b6List the b6List to set
     */
    public void setB6List(ArrayList<Blok56BTamabahan> b6List) {
        this.b6List = b6List;
    }

    /**
     * @return the b4ModelList
     */
    public List<B4Keteranganumumtenagakerja> getB4ModelList() {
        return b4ModelList;
    }

    /**
     * @param b4ModelList the b4ModelList to set
     */
    public void setB4ModelList(List<B4Keteranganumumtenagakerja> b4ModelList) {
        this.b4ModelList = b4ModelList;
    }

    /**
     * @return the Int
     */
    public IntegerConverter getInt() {
        return Int;
    }

    /**
     * @param Int the Int to set
     */
    public void setInt(IntegerConverter Int) {
        this.Int = Int;
    }

    /**
     * @return the dateConverter
     */
    public DateConverter getDateConverter() {
        return dateConverter;
    }

    /**
     * @param dateConverter the dateConverter to set
     */
    public void setDateConverter(DateConverter dateConverter) {
        this.dateConverter = dateConverter;
    }

}
