/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;
import pkl53.converter.IntegerConverter;
import pkl53.model.tambahan.KetRTTambahan;
import pkl53.model.KetRt;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4Listing;
import pkl53.view.EntriListing;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author Prima
 */
public class ListingB4Validasi extends AbstractValidasi {

    private Loop4Listing panelB4Listing;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB4Listing = new ArrayList<Textfield>();
    private static ArrayList<Loop4Listing> listtextfieldloop = Blok4Listing.getListTextFieldLoop();
    static int noruta = 1;
    static int nobs = 1;
    static int nobf = 1;
    static int b2r4 = 0;
    static int b2r5 = 0;
    static int b2r6 = 0;
    static int jumlahart = 0;
    static int jumlahartUI = 0;
    static int jumlahartPI = 0;
    static int jumlahartPInformal = 0;
    int jumlahrt = 0;
    private ArrayList<KetRTTambahan> listKetaRTTambahan = Blok4Listing.getlistaRTambahan();
    private KetRTTambahan ketart;

    public Loop4Listing getPanelB4Listing() {
        return panelB4Listing;
    }

    public void setPanelB4Listing(Loop4Listing panelB4Listing) {
        this.panelB4Listing = panelB4Listing;
    }

    public void setKetArt(KetRTTambahan ketArt) {
        this.ketart = ketArt;
    }

    public void resetListLoop() {
        listtextfieldloop.clear();
    }

    public boolean cek10RT() {
        boolean bool = false;
        ArrayList<KetRTTambahan> listKetaRTTambahan1 = Blok4Listing.getlistaRTambahan();
        for (KetRTTambahan art : listKetaRTTambahan1) {

            int a = intconvert.convertForward(art.getB4r7());
            KetRt rt = new KetRt();
            if (a == 1) {
                jumlahrt++;
            }
            String nilai = String.valueOf(jumlahrt);
            if (nilai.length() == 1) {
                nilai = "00" + nilai;
            }
            if (nilai.length() == 2) {
                nilai = "0" + nilai;
            }
            if (nilai.matches("[0][0][0]")) {
                return false;

            }
            if (nilai.matches("[0-9][0-9][0]")) {
                EntriListing.setJumlahRt(jumlahrt);

                bool = true;
            }
        }
        return bool;

    }

    public void setList() {
        Textfield B4R1 = panelB4Listing.getB4R1();
        Textfield B4R2 = panelB4Listing.getB4R2();
        Textfield B4R3 = panelB4Listing.getB4R3();
        Textfield B4R4 = panelB4Listing.getB4R4();
        Textfield B4R5 = panelB4Listing.getB4R5();
        Textfield B4R6 = panelB4Listing.getB4R6();
        Textfield B4R7 = panelB4Listing.getB4R7();
        Textfield B4R8 = panelB4Listing.getB4R8();
        Textfield B4R9 = panelB4Listing.getB4R9();
        Textfield B4R10 = panelB4Listing.getB4R10();
        Textfield B4R11 = panelB4Listing.getB4R11();
        Textfield B4R12 = panelB4Listing.getB4R12();
        Textfield B4R13 = panelB4Listing.getB4R13();
        Textfield B4R14 = panelB4Listing.getB4R14();
        Textfield B4R15 = panelB4Listing.getB4R15();
        Textfield B4R16 = panelB4Listing.getB4R16();
        Textfield B4R17 = panelB4Listing.getB4R17();
        Textfield B4R18 = panelB4Listing.getB4R18();
        Textfield B4R19 = panelB4Listing.getB4R19();
        Textfield B4R24 = panelB4Listing.getB4R24();
        Textfield B4R25 = panelB4Listing.getB4R25();
        Textfield B4R30 = panelB4Listing.getB4R30();
        Textfield B4R31 = panelB4Listing.getB4R31();

        listB4Listing.add(B4R1);
        listB4Listing.add(B4R2);
        listB4Listing.add(B4R3);
        listB4Listing.add(B4R4);
        listB4Listing.add(B4R5);
        listB4Listing.add(B4R6);
        listB4Listing.add(B4R7);
        listB4Listing.add(B4R8);
        listB4Listing.add(B4R9);
        listB4Listing.add(B4R10);
        listB4Listing.add(B4R11);
        listB4Listing.add(B4R12);
        listB4Listing.add(B4R13);
        listB4Listing.add(B4R14);
        listB4Listing.add(B4R15);
        listB4Listing.add(B4R16);
        listB4Listing.add(B4R17);
        listB4Listing.add(B4R18);
        listB4Listing.add(B4R19);
        listB4Listing.add(B4R24);
        listB4Listing.add(B4R25);
        listB4Listing.add(B4R30);
        listB4Listing.add(B4R31);

        setListTextFields(listB4Listing);
    }

    public void registerValidasi() {
        panelB4Listing.getB4R1().setValidator(new ValidasiB1R1());
        panelB4Listing.getB4R2().setValidator(new ValidasiB1R2());
        panelB4Listing.getB4R3().setValidator(new ValidasiB1R3());
        panelB4Listing.getB4R4().setValidator(new ValidasiB1R4());
        panelB4Listing.getB4R5().setValidator(new ValidasiB1R5());
        panelB4Listing.getB4R6().setValidator(new ValidasiB4R6());
        panelB4Listing.getB4R7().setValidator(new ValidasiB4R7());
        panelB4Listing.getB4R8().setValidator(new ValidasiB4R8());
        panelB4Listing.getB4R9().setValidator(new ValidasiB4R9());

        panelB4Listing.getB4R10().setValidator(new ValidasiB4R10());
        panelB4Listing.getB4R11().setValidator(new ValidasiB4R11());
        panelB4Listing.getB4R12().setValidator(new ValidasiB4R12());
        panelB4Listing.getB4R13().setValidator(new ValidasiB4R13());
        panelB4Listing.getB4R14().setValidator(new ValidasiB4R14());
        panelB4Listing.getB4R15().setValidator(new ValidasiB4R15());
        panelB4Listing.getB4R16().setValidator(new ValidasiB4R16());
        panelB4Listing.getB4R17().setValidator(new ValidasiB4R17());
        panelB4Listing.getB4R18().setValidator(new ValidasiB4R18());
        panelB4Listing.getB4R19().setValidator(new ValidasiB4R19());
        panelB4Listing.getB4R24().setValidator(new ValidasiB4R24());
        panelB4Listing.getB4R25().setValidator(new ValidasiB4R25());
        panelB4Listing.getB4R30().setValidator(new ValidasiB4R30());
        panelB4Listing.getB4R31().setValidator(new ValidasiB4R31());

    }

    private class ValidasiB1R1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R1().getText().matches("[Ss][0-9][0-9][0-9]")) {
                //EditableTo(listB4Listing, 2, 2);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Nomor Segmen Salah");
                //EditableTo(listB4Listing, 1, 1);
                //skipTo(listB4Listing, 1, 23);
                return false;
            }
        }

      
    }

    private class ValidasiB1R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelB4Listing.getB4R2().getText().isEmpty()) {
                if (!panelB4Listing.getB4R3().getText().isEmpty()) {
                    //EditableTo(listB4Listing, 4, 4);
                    return true;
                }
                //EditableTo(listB4Listing, 3, 3);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Harap Isikan Alamat yang Benar");
                //EditableTo(listB4Listing, 2, 2);
                //skipTo(listB4Listing, 2, 23);
                return false;
            }
        }

      
    }

    private class ValidasiB1R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<KetRt> listRT = Blok4Listing.getlistRT();
            if (panelB4Listing.getB4R3().getText().matches("[0-9][0-9][0-9]")) {
//                if (panelB4Listing.getB4R3().getText().matches("[0][0][0]")) {
//
//                    JOptionPane.showMessageDialog(null, "No Urut Bangunan fisik Tidak Boleh nol");
//                    //EditableTo(listB4Listing, 3, 3);
//                    //skipTo(listB4Listing, 3, 23);
//                    return false;
//                }
//                else {
//
//                    if (listRT.size() >= 2) {
//                        if (intconvert.convertForward(listRT.get(listRT.size() - 1).getB4r3()) < intconvert.convertForward(listRT.get(listRT.size() - 2).getB4r3())) {
//                            JOptionPane.showMessageDialog(null, "Penomoran BF Salah.");
//                            //EditableTo(listB4Listing, 4, 4);
//                            //skipTo(listB4Listing, 4, 23);
//                            return false;
//                        }
//                    }
//
////                    if (panelB4Listing.getB4R3().getText().equals(listRT.get(listRT.size() - 1).getB4r3())) {
////                        //EditableTo(listB4Listing, 4, 4);
////                        return true;
////                    }
//                    //mengecek apakah nomor bf urut/tidak
//                    for (int i = listRT.size() - 2; i >= 0; i--) {
//                        String temp = listRT.get(i).getB4r3();
//                        if (!temp.equals("000")) {
//                            if (intconvert.convertForward(panelB4Listing.getB4R3().getText()) - intconvert.convertForward(temp) > 1) {
//                                JOptionPane.showMessageDialog(null, "Nomor Urut BF Tidak Urut");
//                                //EditableTo(listB4Listing, 3, 3);
//                                skipTo(listB4Listing, 3, 23);
//                                return false;
//                            } else {
//                                //EditableTo(listB4Listing, 4, 4);
//                                skipTo(listB4Listing, 4, 23);
//                                return true;
//                            }
//                        }
//                    }
//
//                    //end pengecekan keurutan
//                }

                //EditableTo(listB4Listing, 4, 4);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Nomor Bangunan Fisik Salah");
                //EditableTo(listB4Listing, 3, 3);
//                skipTo(listB4Listing, 3, 23);
                return false;
            }
        }

       
    }

    private class ValidasiB1R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<KetRt> listRT = Blok4Listing.getlistRT();
            if (panelB4Listing.getB4R4().getText().matches("[0-9][0-9][0-9]")) {
//                if (panelB4Listing.getB4R4().getText().matches("[0][0][0]")) {
//
//                    JOptionPane.showMessageDialog(null, "No Urut Bangunan Sensus Tidak Boleh nol");
//                    //EditableTo(listB4Listing, 4, 4);
//                    //skipTo(listB4Listing, 4, 23);
//                    return false;
//                }//nd pengecekan keurutan

                //EditableTo(listB4Listing, 5, 5);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Nomor Bangunan Sensus Salah");
                //EditableTo(listB4Listing, 4, 4);
                //skipTo(listB4Listing, 4, 23);
                return false;
            }
        }

       

    }

    public class ValidasiB1R5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (panelB4Listing.getB4R5().getText().matches("[0-9][0-9][0-9]")) {

                if (panelB4Listing.getB4R5().getText().matches("[0][0][0]")) {

                    skipTo(listB4Listing, 5, 7);
                    skipTo(listB4Listing, 8, 23);
                    if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                        seTextTo(listB4Listing, 5, 23);
                    } else {
                        seTextTo(listB4Listing, 7, 23);
                    }

                    return true;
                } else if (!panelB4Listing.getB4R5().getText().matches("[0][0][0]")) {

                    //skipTo(listB4Listing, 6, 8);;
                    EditableTo(listB4Listing, 5, 23);
                    return true;

                }

            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Nomor Urut Rumah Tangga Salah");
                //EditableTo(listB4Listing, 5, 5);
                // skipTo(listB4Listing, 5, 23);
                return false;
            }
//                }  else {
//
//                    for (int i = 0; i < listRT.size() - 1; i++) {
//                        if (panelB4Listing.getB4R5().getText().equals(listRT.get(i).getB4r5())) {
//                            JOptionPane.showMessageDialog(null, "Penulisan Nomor Urut Rumah Tangga Tidak Boleh Sama");
//                            //EditableTo(listB4Listing, 5, 5);
//                            //skipTo(listB4Listing, 5, 23);
//                            return false;
//                        }
//                    }
//
//                    //mengecek apakah nomor ruta urut/tidak
//                    for (int i = listRT.size() - 2; i >= 0; i--) {
//                        String temp = listRT.get(i).getB4r5();
//                        if (!temp.equals("000")) {
//                            if (intconvert.convertForward(panelB4Listing.getB4R5().getText()) - intconvert.convertForward(temp) > 1) {
//                                JOptionPane.showMessageDialog(null, "Nomor Urut Ruta Tidak Urut");
//                                //EditableTo(listB4Listing, 5, 5);
//                                //skipTo(listB4Listing, 5, 23);
//                                return false;
//                            } else {
//                                EditableTo(listB4Listing, 6, 23);
//                                //skipTo(listB4Listing, 6, 23);
//                                return true;
//                            }
//                        }
//                    }
//                    //end pengecekan keurutan
//                }
            return true;
        }

       

    }

    public class ValidasiB4R6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (panelB4Listing.getB4R6().getText().matches("[0-9][0-9]") || panelB4Listing.getB4R6().getText().matches("[0-9]")) {
                boolean bool = true;
                if (intconvert.convertForward(panelB4Listing.getB4R6().getText()) != 0) {
                    //hapus loop

                    panelB4Listing.setB4R7("1");
                    panelB4Listing.getB4R7().setPropertiesTextField();
                    int x = intconvert.convertForward(panelB4Listing.getB4R6().getText());

                    int d = x - 2;
                    while (x != 1) {

                        int c = x - (d);

                        Blok4Listing.addLoop(panelB4Listing.getB4R1().getText(), panelB4Listing.getB4R2().getText(), panelB4Listing.getB4R3().getText(),
                                panelB4Listing.getB4R4().getText(), panelB4Listing.getB4R5().getText(), panelB4Listing.getB4R6().getText(),
                                String.valueOf(c));
                        x--;
                        d = d - 2;
                    }
                    panelB4Listing.getB4R6().setFocusable(false);
                    panelB4Listing.getB4R7().setFocusable(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Jumlah ART tidak boleh nol");
                    return false;

                }
                if (bool == true) {
                    if (panelB4Listing.getB4R7().getText().equals("1")) {
                        int temp = intconvert.convertForward(Blok4Listing.getTotalArtTextfield().getText());
                        int temp2 = intconvert.convertForward(panelB4Listing.getB4R6().getText());

                        Blok4Listing.setTotalArtTextfield(String.valueOf(temp + temp2));
                        Blok123Listing.setB2R2(String.valueOf(temp + temp2));
//
//                    EditableTo(listB4Listing, 8, 8);
                    }

                } else {
                    //EditableTo(listB4Listing, 6, 6);
                    //skipTo(listB4Listing, 6, 23);
                }
                return bool;
            } else {
                //EditableTo(listB4Listing, 6, 6);
                //skipTo(listB4Listing, 6, 23);
                return false;
            }
        }

        

    }

    public class ValidasiB4R7 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            ////EditableTo(listB4Listing, 8, 23);
            return true;

        }

       

    }

    public class ValidasiB4R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelB4Listing.getB4R8().getText().isEmpty()) {

                if (panelB4Listing.getB4R5().getText().equals("000")) {
                    int x = JOptionPane.showConfirmDialog(null, "Tambah Bangunan Fisik?", "confirm", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        Blok4Listing.addNewLoop("000");
                        skipTo(listB4Listing, 8, 23);
                        return true;
                    }
                } else if (intconvert.convertForward(panelB4Listing.getB4R6().getText()) == intconvert.convertForward(panelB4Listing.getB4R7().getText())) {
                    int x = JOptionPane.showConfirmDialog(null, "Tambah Bangunan Fisik?", "confirm", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        Blok4Listing.addNewLoop(panelB4Listing.getB4R5().getText());
                    }
                }

                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                //EditableTo(listB4Listing, 8, 8);
                //skipTo(listB4Listing, 8, 23);
                return false;
            }
        }

       

    }

    public class ValidasiB4R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            boolean bool = true;

            if (panelB4Listing.getB4R7().getText().matches("[1]") && !panelB4Listing.getB4R9().getText().matches("[1]")) {
                JOptionPane.showMessageDialog(null, "KRT Sebaiknya Dituliskan Pertama Kali");
                //EditableTo(listB4Listing, 9, 9);
                //skipTo(listB4Listing, 9, 23);
                return false;

            }
            if (panelB4Listing.getB4R9().getText().matches("[1]")) {
                int tempKRT = 0;
                for (KetRTTambahan listKetaRTTambahan1 : listKetaRTTambahan) {
                    if (listKetaRTTambahan1.getB4r9().equals("1") && listKetaRTTambahan1.getB4r5().equals(panelB4Listing.getB4R5().getText() )) {
                        // && listKetaRTTambahan1.getB4r5().equals(panelB4Listing.getB4R5().getText()
                        tempKRT++;
                    }
                }
                if (tempKRT > 1) {
                    JOptionPane.showMessageDialog(null, "KRT Cuma Boleh Ada Satu / No Urut Rumah Tangga tidak boleh sama");
                    return false;
                } else {
                    //EditableTo(listB4Listing, 10, 10);
                    return true;
                }
            }

            if (panelB4Listing.getB4R9().getText().matches("[2]")) {
                int tempIst = 0;
                for (KetRTTambahan listKetaRTTambahan1 : listKetaRTTambahan) {
                    if (listKetaRTTambahan1.getB4r9().equals("2") && listKetaRTTambahan1.getB4r5().equals(panelB4Listing.getB4R5().getText())) {
                        tempIst++;
                    }
                }
                if (tempIst > 1) {
                    JOptionPane.showMessageDialog(null, "Tidak Mendukung Poligami");
                    return false;
                } else {
                    //EditableTo(listB4Listing, 10, 10);
                    return true;
                }
            }

            if (panelB4Listing.getB4R9().getText().matches("[3-9]")) {
                //EditableTo(listB4Listing, 10, 10);
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Hubungan dengan KRT Salah");
                //EditableTo(listB4Listing, 9, 9);
                //skipTo(listB4Listing, 9, 23);
                return false;
            }

            return bool;
        }

       

    }

//    public class ValidasiB4R9 implements Validator {
//
//        @Override
//        public boolean onCheckValue(Textfield field) {
//            boolean bool = true;
//
//            if (panelB4Listing.getB4R7().getText().matches("[1]") && !panelB4Listing.getB4R9().getText().matches("[1]")) {
//                JOptionPane.showMessageDialog(null, "KRT Sebaiknya Dituliskan Pertama Kali");
//                //EditableTo(listB4Listing, 9, 9);
//                skipTo(listB4Listing, 9, 23);
//
//            }
////            if (panelB4Listing.getB4R9().getText().matches("[1]")) {
////                int tempKRT = 0;
////                for (KetRTTambahan listKetaRTTambahan1 : listKetaRTTambahan) {
////                    if (listKetaRTTambahan1.getB4r9().equals("1")) {
////                        tempKRT++;
////                    }
////                }
////                if (tempKRT > 1) {
////                    JOptionPane.showMessageDialog(null, "KRT Cuma Boleh Ada Satu");
////                    return false;
////                } else {
////                    //EditableTo(listB4Listing, 10, 10);
////                    return true;
////                }
////            }
//
////            if (panelB4Listing.getB4R9().getText().matches("[2]")) {
////                int tempIst = 0;
////                for (KetRTTambahan listKetaRTTambahan1 : listKetaRTTambahan) {
////                    if (listKetaRTTambahan1.getB4r9().equals("2")) {
////                        tempIst++;
////                    }
////                }
////                if (tempIst > 1) {
////                    JOptionPane.showMessageDialog(null, "Tidak Mendukung Poligami");
////                    return false;
////                } else {
////                    //EditableTo(listB4Listing, 10, 10);
////                    return true;
////                }
//            if (panelB4Listing.getB4R9().getText().matches("[1-9]")) {
//                //EditableTo(listB4Listing, 10, 10);
//            } else {
//                JOptionPane.showMessageDialog(null, "Penulisan Hubungan dengan KRT Salah");
//                //EditableTo(listB4Listing, 9, 9);
//                skipTo(listB4Listing, 9, 23);
//                return false;
//            }
//
//            return bool;
//        }
//    }
    public class ValidasiB4R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (panelB4Listing.getB4R10().getText().matches("[1-2]")) {
                boolean bool = true;

                if (panelB4Listing.getB4R9().getText().equals("2")) {
                    int tempJK = 0;
                    for (KetRTTambahan listKetaRTTambahan1 : listKetaRTTambahan) {
                        if (listKetaRTTambahan1.getB4r10().equals(panelB4Listing.getB4R10().getText()) && listKetaRTTambahan1.getB4r5().equals(panelB4Listing.getB4R5().getText())) {
                            tempJK++;
                        }
                    }
                    if (tempJK > 1) {
                        JOptionPane.showMessageDialog(null, "Tidak Mendukung Pernikahan Sejenis");
                        bool = false;
                        return false;
                    } else {
                        EditableTo(listB4Listing, 11, 11);
                        return true;
                    }
                }

                return bool;

//                boolean bool = true;
//                if (panelB4Listing.getB4R9().getText().equals("2")) {
//                    for (Loop4Listing l4l : listtextfieldloop) {
//                        if (l4l.getKetRTTambahan().getB4r9().equals("1") && l4l.getKetRTTambahan().getB4r10().equals(panelB4Listing.getB4R10().getText())) {
//                            JOptionPane.showMessageDialog(null, "Tidak Mendukung Pernikahan Sejenis");
//                            return false;
//                        }
//                    }
//                }
//                if (bool == true) {
//                    EditableTo(listB4Listing, 11, 11);
//                } else {
//                    EditableTo(listB4Listing, 10, 10);
//                    skipTo(listB4Listing, 10, 23);
//                }
//
//                return bool;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jenis Kelamin Salah");
//                EditableTo(listB4Listing, 10, 10);
//                skipTo(listB4Listing, 10, 23);
                return false;

            }
        }


    }

    public class ValidasiB4R11 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            boolean bool = true;
            if (panelB4Listing.getB4R11().getText().matches("[0-9][0-9]") || panelB4Listing.getB4R11().getText().matches("[0-9]")) {
                if (panelB4Listing.getB4R9().getText().equals("1") && intconvert.convertForward(panelB4Listing.getB4R11().getText()) < 15) {
                    JOptionPane.showMessageDialog(null, "Usia KRT tidak boleh kurang dari 15 tahun");
                    return false;
                } else if (panelB4Listing.getB4R9().getText().equals("2") && intconvert.convertForward(panelB4Listing.getB4R11().getText()) < 15) {
                    JOptionPane.showMessageDialog(null, "Usia Suami/Istri KRT tidak boleh kurang dari 15 tahun");
                    return false;
                } else if (intconvert.convertForward(panelB4Listing.getB4R11().getText()) < 15) {
                    bool = true;

                    skipTo(listB4Listing, 11, 23);
                    seTextTo(listB4Listing, 11, 23);

                } else {
                    EditableTo(listB4Listing, 11, 23);
                    //EditableTo(listB4Listing, 11, 11);
                    // skipTo(listB4Listing, 11, 23);
                }
                return bool;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Umur Salah");
                //EditableTo(listB4Listing, 11, 11);
                //skipTo(listB4Listing, 11, 23);
                return false;
            }
        }


    }

    public class ValidasiB4R12 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R12().getText().matches("[1]")) {

                skipTo(listB4Listing, 12, 16);
                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                    seTextTo(listB4Listing, 12, 16);
                } else {
                    skipTo(listB4Listing, 19, 23);
                    seTextTo(listB4Listing, 19, 23);
                }

                //EditableTo(listB4Listing, 17, 17);
                return true;
            } else if (panelB4Listing.getB4R12().getText().matches("[2]")) {
                EditableTo(listB4Listing, 12, 16);
                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {

                    seTextTo(listB4Listing, 12, 23);
                } else {

                    seTextTo(listB4Listing, 12, 18);
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 12, 12);
                //skipTo(listB4Listing, 12, 23);
                return false;
            }
        }

        

    }

    public class ValidasiB4R13 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R13().getText().matches("[1]")) {
                skipTo(listB4Listing, 13, 16);
                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                    seTextTo(listB4Listing, 13, 16);
                } else {
                    skipTo(listB4Listing, 19, 23);
                    seTextTo(listB4Listing, 19, 23);
                }

                return true;
            } else if (panelB4Listing.getB4R13().getText().matches("[2]")) {
                EditableTo(listB4Listing, 13, 16);
                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                    EditableTo(listB4Listing, 13, 23);
                    seTextTo(listB4Listing, 13, 23);
                } else {
                    EditableTo(listB4Listing, 14, 19);
                    seTextTo(listB4Listing, 13, 19);
                }
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 13, 13);
                //skipTo(listB4Listing, 13, 23);
                return false;
            }
        }


    }

    public class ValidasiB4R14 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (panelB4Listing.getB4R14().getText().matches("[1-2]")) {
//                EditableTo(listB4Listing, 15, 15);
//                seTextTo(listB4Listing, 14, 23);
//                return true;
//
            if (panelB4Listing.getB4R14().getText().matches("[1]")) {
//                skipTo(listB4Listing, 14, 19);
                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                    EditableTo(listB4Listing, 14, 23);
                    seTextTo(listB4Listing, 14, 23);
                } else {
                    skipTo(listB4Listing, 19, 23);
                    seTextTo(listB4Listing, 19, 23);
                }
                return true;
//                            if (panelB4Listing.getB4R9().getText().matches("[1]")) {
//                                skipTo(listB4Listing, 14, 19);
//                                return true;
//                            } else {
//                                skipTo(listB4Listing, 14, 23);
//                                return true;
//                            }
//                EditableTo(listB4Listing, 16, 23);
            } else if (panelB4Listing.getB4R14().getText().matches("[2]")) {

                if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                    EditableTo(listB4Listing, 14, 23);
                    seTextTo(listB4Listing, 14, 23);
                } else {
                    EditableTo(listB4Listing, 14, 19);
                    seTextTo(listB4Listing, 14, 19);
                }
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 14, 14);
                //skipTo(listB4Listing, 14, 23);
                return false;
            }
        }


    }

    public class ValidasiB4R15 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R15().getText().matches("[1]")) {
                skipTo(listB4Listing, 15, 19);
                if (intconvert.convertForward(panelB4Listing.getB4R9().getText()) == 1) {
                    seTextTo(listB4Listing, 15, 19);
                    return true;
                } else {
                    skipTo(listB4Listing, 15, 23);
                    seTextTo(listB4Listing, 15, 23);
                    return true;
                }

                ////EditableTo(listB4Listing, 17, 23);
            } else if (panelB4Listing.getB4R15().getText().matches("[2]")) {
                if (panelB4Listing.getB4R14().getText().equals("2")) {
                    if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                        EditableTo(listB4Listing, 15, 23);
                        seTextTo(listB4Listing, 15, 23);
                    } else {
                        EditableTo(listB4Listing, 15, 19);
                        seTextTo(listB4Listing, 15, 19);
                    }
                } else {
                    if (intconvert.convertForward(panelB4Listing.getB4R7().getText()) == 1) {
                        skipTo(listB4Listing, 15, 19);
                    } else {
                        skipTo(listB4Listing, 15, 23);
                        seTextTo(listB4Listing, 15, 23);
                    }

                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 15, 15);
                //skipTo(listB4Listing, 15, 23);
                return false;
            }
        }

       
    }

    public class ValidasiB4R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R16().getText().matches("[1-8]")) {
                ////EditableTo(listB4Listing, 18, 23);
                if (panelB4Listing.getB4R9().getText().matches("[1]")) {
                    skipTo(listB4Listing, 16, 19);
                    seTextTo(listB4Listing, 16, 19);
                    return true;

                } else {
                    skipTo(listB4Listing, 16, 23);
                    seTextTo(listB4Listing, 16, 23);
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 16, 16);
                //skipTo(listB4Listing, 16, 23);
                return false;
            }
        }

       

    }

    public class ValidasiB4R17 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R17().getText().matches("[1-9]")) {
                //EditableTo(listB4Listing, 18, 18);
                seTextTo(listB4Listing, 17, 23);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Pekerjaan Salah");
                //EditableTo(listB4Listing, 17, 17);
                //skipTo(listB4Listing, 17, 23);
                return false;
            }
        }

       

    }

    public class ValidasiB4R18 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R18().getText().matches("[1-9]")) {
                seTextTo(listB4Listing, 18, 23);

                //EditableTo(listB4Listing, 19, 19);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan KBLI 9 Digit Salah");
                //EditableTo(listB4Listing, 18, 18);
                //skipTo(listB4Listing, 18, 23);
                return false;
            }
        }

      

    }

    public class ValidasiB4R19 implements Validator {

        String a, b, c, d, e, f;

        @Override
        public boolean onCheckValue(Textfield field) {

            if (panelB4Listing.getB4R19().getText().matches("[1-7]")) {
                //resetListLoop();
                seTextTo(listB4Listing, 19, 23);

                //EditableTo(listB4Listing, 20, 20);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Status Pekerjaan Salah");
                //EditableTo(listB4Listing, 19, 19);
//                skipTo(listB4Listing, 19, 23);
                return false;
            }

        }

        public void setC(String a) {
            c = a;

        }

        public void setD(String a) {
            d = a;

        }

    }

    private class ValidasiB4R24 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R24().getText().matches("[0-9][0-9]") || panelB4Listing.getB4R24().getText().matches("[0-9]")) {
                seTextTo(listB4Listing, 20, 23);
                boolean bool = true;

                if (bool == true) {
                    if (panelB4Listing.getB4R7().getText().equals("1")) {
                        int temp = intconvert.convertForward(Blok4Listing.getTotalArtUsahaInformaltextfield().getText());
                        int temp2 = intconvert.convertForward(panelB4Listing.getB4R24().getText());

                        Blok4Listing.setTotalArtUsahaInformaltextfield(String.valueOf(temp + temp2));
                        Blok123Listing.setB2R3(String.valueOf(temp + temp2));
//
//                    EditableTo(listB4Listing, 8, 8);
                    }

                }

                if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) > intconvert.convertForward(panelB4Listing.getB4R6().getText())) {
                    bool = false;
                    JOptionPane.showMessageDialog(null, "Jumlahnya melebihi Jumlah ART");
                }

                if (bool == true) {
                    //EditableTo(listB4Listing, 21, 21);

                } else {
                    //EditableTo(listB4Listing, 20, 20);
                    //skipTo(listB4Listing, 20, 23);
                }
                return bool;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                //EditableTo(listB4Listing, 20, 20);
                //skipTo(listB4Listing, 20, 23);
                return false;
            }
        }

       

    }

    public class ValidasiB4R25 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R25().getText().matches("[0-2]")) {
                seTextTo(listB4Listing, 21, 23);

                panelB4Listing.getB4R30().setText("");
                panelB4Listing.getB4R31().setText("");

                if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) > 0 && panelB4Listing.getB4R25().getText().matches("[0]")) {
                    JOptionPane.showMessageDialog(null, "Isikan Jenis Usaha Rumah Tangga");
                    return false;
                }

                if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) == 1) {
                    if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) == 0) {
                        JOptionPane.showMessageDialog(null, "Isian Salah, Cek kembali kolom  sebelumnya");
                        return false;
                    }
                }

                if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) == 0) {
                    if (intconvert.convertForward(panelB4Listing.getB4R24().getText()) == 1) {
                        JOptionPane.showMessageDialog(null, "Isian Salah, Cek kembali kolom  sebelumnya");
                        return false;
                    }
                }

                boolean bool = true;
                if (bool == true) {

                    if (panelB4Listing.getB4R7().getText().equals("1")) {
                        int tempb2r4 = intconvert.convertForward(Blok123Listing.getB2R4().getText());
                        int tempb2r5 = intconvert.convertForward(Blok123Listing.getB2R5().getText());

                        if (panelB4Listing.getB4R25().getText().equals("1")) {
                            tempb2r4 = tempb2r4 + 1;
                        }
                        if (panelB4Listing.getB4R25().getText().equals("2")) {
                            tempb2r5 = tempb2r5 + 1;
                        }

                        Blok123Listing.setB2R4(String.valueOf(tempb2r4));
                        Blok123Listing.setB2R5(String.valueOf(tempb2r5));
                        Blok123Listing.setB2R6(String.valueOf(tempb2r4 + tempb2r5));
//
//                    EditableTo(listB4Listing, 8, 8);
                    }

                }

                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                //EditableTo(listB4Listing, 21, 21);
                //skipTo(listB4Listing, 21, 23);
                return false;
            }
        }

       
    }

    public class ValidasiB4R30 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R30().getText().matches("[0-9][0-9]") || panelB4Listing.getB4R30().getText().matches("[0-9]")) {
                seTextTo(listB4Listing, 22, 23);

                boolean bool = true;

                if (bool == true) {

                    if (panelB4Listing.getB4R7().getText().equals("1")) {
                        int tempb2r30Total = intconvert.convertForward(Blok4Listing.getTotalArtPekerjaInformaltextfield().getText());
                        int tempb2r30 = intconvert.convertForward(panelB4Listing.getB4R30().getText());

                        Blok4Listing.setTotalArtPekerjaInformaltextfield(String.valueOf(tempb2r30 + tempb2r30Total));
                        Blok123Listing.setB2R7(String.valueOf(tempb2r30 + tempb2r30Total));

//
//                    EditableTo(listB4Listing, 8, 8);
                    }

                }

                if (intconvert.convertForward(panelB4Listing.getB4R30().getText()) + intconvert.convertForward(panelB4Listing.getB4R24().getText()) > intconvert.convertForward(panelB4Listing.getB4R6().getText())) {
                    JOptionPane.showMessageDialog(null, "Jumlah R24 + R30 melebihi jumlah ART");
                    return false;
                }

                if (bool == true) {
                    //EditableTo(listB4Listing, 23, 23);
                } else {
                //EditableTo(listB4Listing, 22, 20);
                    //skipTo(listB4Listing, 22, 23);
                }

                return bool;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }

        }

       

    }

    public class ValidasiB4R31 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelB4Listing.getB4R31().getText().matches("[0-1]")) {

                if (panelB4Listing.getB4R7().getText().equals("1")) {
                    int tempb2r31Total = intconvert.convertForward(Blok4Listing.getTotalArtPekerjaInformaltextfield().getText());
                    int tempb2r31 = intconvert.convertForward(panelB4Listing.getB4R31().getText());
                    if (tempb2r31 == 1) {
                        tempb2r31Total = tempb2r31Total + 1;
                    }
                    Blok4Listing.setTotalRtInformaltextfield(String.valueOf(tempb2r31Total));
                    Blok123Listing.setB2R8(String.valueOf(tempb2r31Total));

//
//                    EditableTo(listB4Listing, 8, 8);
                }
                if (intconvert.convertForward(panelB4Listing.getB4R31().getText()) == 1) {
                    if ((intconvert.convertForward(panelB4Listing.getB4R30().getText()) + intconvert.convertForward(panelB4Listing.getB4R24().getText())) == 0) {
                        JOptionPane.showMessageDialog(null, " R24 + R30 = 0, cek Kembali isian Sebelumnya!!!");
                        return false;
                    }
                }
                if (intconvert.convertForward(panelB4Listing.getB4R31().getText()) == 0) {
                    if ((intconvert.convertForward(panelB4Listing.getB4R30().getText()) + intconvert.convertForward(panelB4Listing.getB4R24().getText())) > 0) {
                        JOptionPane.showMessageDialog(null, " R24 + R30 > 0, cek Kembali isian Sebelumnya!!!");
                        return false;
                    }
                }

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

       

    }
}
