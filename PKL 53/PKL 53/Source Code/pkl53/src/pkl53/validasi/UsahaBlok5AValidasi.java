/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;
import pkl53.converter.IntegerConverter;
import pkl53.model.B2Umumusaha;
import pkl53.model.tambahan.B2Tambahan;
import pkl53.view.BlokUsaha4;

/**
 *
 * @author Prima
 */
public class UsahaBlok5AValidasi extends AbstractValidasi {

    private pkl53.view.BlokUsaha5 panelUsahaBlok5A;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB5AUsaha = new ArrayList<Textfield>();

    static int kodePertanianAtauBukan = 0;
    static int jumlahJaminanSosialYgDiberikan = 0;
    static int omsetBulanLalu = 0;
    static int kepemilikanTempatUsaha = 0;

    public pkl53.view.BlokUsaha5 getPanelUsahaBlok5A() {
        return panelUsahaBlok5A;
    }

    public void setPanelUsahaBlok5A(pkl53.view.BlokUsaha5 panelUsahaBlok5A) {
        this.panelUsahaBlok5A = panelUsahaBlok5A;
    }

    public void registerValidasi() {
        panelUsahaBlok5A.getB5R1NAMA().setValidator(new ValidasiB5R1A());
        panelUsahaBlok5A.getB5R1NOART().setValidator(new ValidasiB5R1B());
        panelUsahaBlok5A.getB5R2().setValidator(new ValidasiB5R2());
        panelUsahaBlok5A.getB5R3().setValidator(new ValidasiB5R3());
        panelUsahaBlok5A.getB5R4BULAN().setValidator(new ValidasiB5R4Bulan());
        panelUsahaBlok5A.getB5R4TAHUN().setValidator(new ValidasiB5R4Tahun());
        panelUsahaBlok5A.getB5R5().setValidator(new ValidasiB5R5());
        panelUsahaBlok5A.getB5R5_10_LAIN().setValidator(new ValidasiB5R5Isian());
        panelUsahaBlok5A.getB5R5_13_LAIN().setValidator(new ValidasiB5R5Isian());
        panelUsahaBlok5A.getB5R6().setValidator(new ValidasiB5R6());
        panelUsahaBlok5A.getB5R7().setValidator(new ValidasiB5R7());
        panelUsahaBlok5A.getB5R7DIBAYAR().setValidator(new ValidasiB5R7Dibayar());
        panelUsahaBlok5A.getB5R8().setValidator(new ValidasiB5R8());
        panelUsahaBlok5A.getB5R9().setValidator(new ValidasiB5R9());
        panelUsahaBlok5A.getB5R10().setValidator(new ValidasiB5R10());
        panelUsahaBlok5A.getB5R11A().setValidator(new ValidasiB5R11A());
        panelUsahaBlok5A.getB5R11B().setValidator(new ValidasiB5R11B());
        panelUsahaBlok5A.getB5R11C().setValidator(new ValidasiB5R11C());
        panelUsahaBlok5A.getB5R11D().setValidator(new ValidasiB5R11D());
        panelUsahaBlok5A.getB5R11E_LAIN().setValidator(new ValidasiB5R11Elainnya());
        panelUsahaBlok5A.getB5R12A().setValidator(new ValidasiB5R12A());
        panelUsahaBlok5A.getB5R12B().setValidator(new ValidasiB5R12B());
        panelUsahaBlok5A.getB5R12C().setValidator(new ValidasiB5R12C());
        panelUsahaBlok5A.getB5R12D().setValidator(new ValidasiB5R12D());
        panelUsahaBlok5A.getB5R12JUML().setValidator(new ValidasiB5R12JUMLAH());
        panelUsahaBlok5A.getB5R13HARI_APR().setValidator(new ValidasiB5R13HARIAPRIL());
        panelUsahaBlok5A.getB5R13HARI_MEI().setValidator(new ValidasiB5R13HARIMEI());
        panelUsahaBlok5A.getB5R13HARI_JUN().setValidator(new ValidasiB5R13HARIJUNI());
        panelUsahaBlok5A.getB5R13HARI_JUL().setValidator(new ValidasiB5R13HARIJULI());
        panelUsahaBlok5A.getB5R13HARI_AGT().setValidator(new ValidasiB5R13HARIAGUSTUS());
        panelUsahaBlok5A.getB5R13HARI_SEP().setValidator(new ValidasiB5R13HARISEPT());
        panelUsahaBlok5A.getB5R13HARI_OKT().setValidator(new ValidasiB5R13HARIOKTO());
        panelUsahaBlok5A.getB5R13HARI_NOV().setValidator(new ValidasiB5R13HARINOVEM());
        panelUsahaBlok5A.getB5R13HARI_DES().setValidator(new ValidasiB5R13HARIDES());
        panelUsahaBlok5A.getB5R13HARI_JAN().setValidator(new ValidasiB5R13HARIJAN());
        panelUsahaBlok5A.getB5R13HARI_FEB().setValidator(new ValidasiB5R13HARIFEB());
        panelUsahaBlok5A.getB5R13HARI_MAR().setValidator(new ValidasiB5R13HARIMARET());
        panelUsahaBlok5A.getB5R13KODE_APR().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_MEI().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_JUN().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_JUL().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_AGT().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_SEP().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_OKT().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_NOV().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_DES().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_JAN().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_FEB().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R13KODE_MAR().setValidator(new ValidasiB5R13KODEKEGIATAN());
        panelUsahaBlok5A.getB5R14().setValidator(new ValidasiB5R14());

    }

    public void setListB5AUsaha() {
        listB5AUsaha.add(panelUsahaBlok5A.getB5R1NAMA()); //INDEX 0
        listB5AUsaha.add(panelUsahaBlok5A.getB5R1NOART()); //INDEX 1
        listB5AUsaha.add(panelUsahaBlok5A.getB5R2()); //INDEX 2
        listB5AUsaha.add(panelUsahaBlok5A.getB5R3()); //INDEX 3
        listB5AUsaha.add(panelUsahaBlok5A.getB5R4BULAN()); //INDEX 4
        listB5AUsaha.add(panelUsahaBlok5A.getB5R4TAHUN()); //INDEX 5
        listB5AUsaha.add(panelUsahaBlok5A.getB5R5()); //INDEX 6
        listB5AUsaha.add(panelUsahaBlok5A.getB5R5_10_LAIN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R5_13_LAIN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R6());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R7()); //INDEX 10
        listB5AUsaha.add(panelUsahaBlok5A.getB5R7DIBAYAR()); //INDEX 11
        listB5AUsaha.add(panelUsahaBlok5A.getB5R8()); //INDEX 12
        listB5AUsaha.add(panelUsahaBlok5A.getB5R9());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R10());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R11A()); //INDEX 15
        listB5AUsaha.add(panelUsahaBlok5A.getB5R11B());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R11C());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R11D());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R11E_LAIN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R12A()); //INDEX 20
        listB5AUsaha.add(panelUsahaBlok5A.getB5R12B()); //INDEX 21
        listB5AUsaha.add(panelUsahaBlok5A.getB5R12C());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R12D());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R12JUML());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_APR());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_APR()); //INDEX 26
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_MEI()); //INDEX 27
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_MEI()); //INDEX 28
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_JUN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_JUN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_JUL()); //INDEX salah
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_JUL()); //INDEX 31
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_AGT());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_AGT());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_SEP());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_SEP()); //INDEX 35
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_OKT()); //INDEX 36
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_OKT()); //INDEX 37
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_NOV());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_NOV());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_DES()); //INDEX 40
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_DES());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_JAN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_JAN());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_FEB());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_FEB()); //INDEX 45
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13HARI_MAR());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R13KODE_MAR());
        listB5AUsaha.add(panelUsahaBlok5A.getB5R14()); //INDEX 48

        setListTextFields(listB5AUsaha);

    }

    private class ValidasiB5R1A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelUsahaBlok5A.getB5R1NAMA().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Isikan Nama");
                return true;
            }
        }

    }

    private class ValidasiB5R1B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<B2Tambahan> dataListb4 = BlokUsaha4.getB2TambahanList();
            String noART = panelUsahaBlok5A.getB5R1NOART().getText();
            String nama = "";
            for (B2Tambahan bt : dataListb4) {
                if (noART.equals(bt.getB4r1())) {
                    nama = bt.getB4r2();
                }
            }
            if (nama.equals(panelUsahaBlok5A.getB5R1NAMA().getText())) {
                return true;
            } else {
                if ("".equals(nama)) {
                    JOptionPane.showMessageDialog(null, "Penulisan Nomor ART Salah\nNomor Art " + noART + " tidak ada isiannya.");
                    return false;
                } else {
                    JOptionPane.showMessageDialog(null, "Penulisan Nomor ART Salah\nNomor Art " + noART + " itu milik " + nama +"\nSilakan Perbaiki Isian Nama");
                    return false;
                }
            }
        }

    }

    private class ValidasiB5R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<B2Tambahan> dataListb4 = BlokUsaha4.getB2TambahanList();
            String noART = panelUsahaBlok5A.getB5R1NOART().getText();
            int temp = 0;
            for (B2Tambahan bt : dataListb4) {
                if (noART.equals(bt.getB4r1()) && panelUsahaBlok5A.getB5R2().getText().equals(bt.getB2r4())) {
                    temp++;
                }
            }
            
            if (temp==1) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan No Urut Pekerjaan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            kodePertanianAtauBukan = 0;
            
            List<B2Tambahan> dataListb4 = BlokUsaha4.getB2TambahanList();
            String noART = panelUsahaBlok5A.getB5R1NOART().getText();
            String noPekerjaan = panelUsahaBlok5A.getB5R2().getText();
            String KBLITemp = "";
            for (B2Tambahan bt : dataListb4) {
                if (noART.equals(bt.getB4r1()) && noPekerjaan.equals(bt.getB2r4())) {
                    KBLITemp = bt.getB2r6();
                }
            }
            
            if(panelUsahaBlok5A.getB5R3().getText().equals(KBLITemp)){
                if (panelUsahaBlok5A.getB5R3().getText().equals("1")) {
                    kodePertanianAtauBukan = 1;
                } else {
                    kodePertanianAtauBukan = 2;
                }                
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Kode KBLI Tidak Sesuai dengan Blok 4");
                return false;
            }
        }

    }

    private class ValidasiB5R4Bulan implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R4BULAN().getText().matches("[1-9]") || panelUsahaBlok5A.getB5R4BULAN().getText().matches("[0-9][0-9]")) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R4BULAN().getText()) < 0 || intconvert.convertForward(panelUsahaBlok5A.getB5R4BULAN().getText()) > 12) {
                    JOptionPane.showMessageDialog(null, "Format Bulan Salah");
                    return false;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R4Tahun implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R4TAHUN().getText().matches("[0-9][0-9][0-9][0-9]")) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R4TAHUN().getText()) < 1900 || intconvert.convertForward(panelUsahaBlok5A.getB5R4TAHUN().getText()) > 2014) {
                    JOptionPane.showMessageDialog(null, "Format Tahun Tidak Wajar");
                    return false;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Tahun Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R5().getText().matches("[1-9]") || panelUsahaBlok5A.getB5R5().getText().matches("[0-9][0-9]")) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) < 1 || intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) > 13) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Tipe Tempat Salah");
                    return false;
                } else {
                    EditableTo(listB5AUsaha, 7, 10);
                    if (intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) > 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) < 10) {
                        skipTo(listB5AUsaha, 7, 9);
                        field.setTextfield(panelUsahaBlok5A.getB5R6());
                        return true;
                    } else if (panelUsahaBlok5A.getB5R5().getText().equals("10")) {
                        skipTo(listB5AUsaha, 8, 9);
                        field.setTextfield(panelUsahaBlok5A.getB5R5_10_LAIN());
                        return true;
                    } else if (panelUsahaBlok5A.getB5R5().getText().equals("13")) {
                        skipTo(listB5AUsaha, 7, 8);
                        skipTo(listB5AUsaha, 9, 10);
                        field.setTextfield(panelUsahaBlok5A.getB5R5_13_LAIN());
                        return true;
                    } else if (intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) > 10 && intconvert.convertForward(panelUsahaBlok5A.getB5R5().getText()) < 13) {
                        skipTo(listB5AUsaha, 7, 10);
                        field.setTextfield(panelUsahaBlok5A.getB5R7());
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipe Tempat Tidak Dikenal");
                        return false;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R5Isian implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            kepemilikanTempatUsaha = 0;
            if (panelUsahaBlok5A.getB5R6().getText().matches("[1-5]")) {
                if(panelUsahaBlok5A.getB5R6().getText().matches("[2]")){
                    kepemilikanTempatUsaha = 2;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan \nStatus Kepemilikan Usaha Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R7 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<B2Tambahan> dataListb4 = BlokUsaha4.getB2TambahanList();
            String noART = panelUsahaBlok5A.getB5R1NOART().getText();
            String noPekerjaan = panelUsahaBlok5A.getB5R2().getText();
            String StatusPekerjaan = "";
            for (B2Tambahan bt : dataListb4) {
                if (noART.equals(bt.getB4r1()) && noPekerjaan.equals(bt.getB2r4())) {
                    StatusPekerjaan = bt.getB2r7();
                }
            }
            if(!StatusPekerjaan.equals("1") && panelUsahaBlok5A.getB5R7().getText().equals("1")){
                JOptionPane.showMessageDialog(null, "Status Pekerjaan 2 atau 3\nHarusnya punya pekerja");
                return false;
            }            
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R7().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R7().getText()) <= 98) {
                return true;
            } else if (panelUsahaBlok5A.getB5R7().getText().equals("99")) {
                JOptionPane.showMessageDialog(null, "Nilai Maksimal yang Diizinkan: 98");
                return false;
            } else {
                JOptionPane.showMessageDialog(null, "Mohon Gunakan Angka");
                return false;
            }
        }

    }

    private class ValidasiB5R7Dibayar implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R7().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R7().getText()) <= 98) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R7DIBAYAR().getText()) > intconvert.convertForward(panelUsahaBlok5A.getB5R7().getText())) {
                    JOptionPane.showMessageDialog(null, "Melebihi Jumlah Pekerja");
                    return false;
                } else {
                    return true;
                }
            } else if (panelUsahaBlok5A.getB5R7().getText().equals("99")) {
                JOptionPane.showMessageDialog(null, "Nilai Maksimal yang Diizinkan: 98");
                return false;
            } else {
                JOptionPane.showMessageDialog(null, "Mohon Gunakan Angka");
                return false;
            }
        }

    }

    private class ValidasiB5R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R8().getText().matches("[0-9]") || panelUsahaBlok5A.getB5R8().getText().matches("[0-9][0-9]")) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R8().getText()) > 31) {
                    JOptionPane.showMessageDialog(null, "Hari Kerja Tidak Wajar");
                    return false;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<B2Tambahan> dataListb4 = BlokUsaha4.getB2TambahanList();
            String noART = panelUsahaBlok5A.getB5R1NOART().getText();
            String noPekerjaan = panelUsahaBlok5A.getB5R2().getText();
            int statusPekerjaan = 0;
            for (B2Tambahan bt : dataListb4) {
                if (noART.equals(bt.getB4r1()) && noPekerjaan.equals(bt.getB2r4())) {
                    statusPekerjaan = intconvert.convertForward(bt.getB2r7());
                }
            }
            EditableTo(listB5AUsaha, 14, 24);

            if (panelUsahaBlok5A.getB5R9().getText().matches("[1-9]") || panelUsahaBlok5A.getB5R9().getText().matches("[0-9][0-9]")) {
                if (intconvert.convertForward(panelUsahaBlok5A.getB5R9().getText()) > 12) {
                    JOptionPane.showMessageDialog(null, "Bulan Kerja Tidak Wajar");
                    return false;
                } else {
                    if (statusPekerjaan != 3) {
                        skipTo(listB5AUsaha, 14, 24);
                        field.setTextfield(panelUsahaBlok5A.getB5R13HARI_APR());
                        return true;
                    } else {
                        field.setTextfield(panelUsahaBlok5A.getB5R10());
                        return true;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    //HANYA MASUK KESINI JIKA STATUS PEKERJAAN BERKODE 3; BELUM DIBUAT LOGIKANYA
    private class ValidasiB5R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R10().getText().matches("[1-5]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R11A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R11A().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid");
                return false;
            }
        }

    }

    private class ValidasiB5R11B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R11B().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid");
                return false;
            }
        }

    }

    private class ValidasiB5R11C implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R11C().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid");
                return false;
            }
        }

    }

    private class ValidasiB5R11D implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R11D().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid");
                return false;
            }
        }

    }

    private class ValidasiB5R11Elainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R12A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            panelUsahaBlok5A.getB5R12JUML().setText(intconvert.convertReverse(hitungJaminanSosial()));
            return true;
        }

    }

    private class ValidasiB5R12B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            panelUsahaBlok5A.getB5R12JUML().setText(intconvert.convertReverse(hitungJaminanSosial()));
            return true;
        }

    }

    private class ValidasiB5R12C implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            panelUsahaBlok5A.getB5R12JUML().setText(intconvert.convertReverse(hitungJaminanSosial()));
            return true;
        }

    }

    private class ValidasiB5R12D implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            panelUsahaBlok5A.getB5R12JUML().setText(intconvert.convertReverse(hitungJaminanSosial()));
            return true;
        }

    }

    //JUMLAH BELUM OTOMATIS
    //BETULKAN
    private class ValidasiB5R12JUMLAH implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5A.getB5R12JUML().getText().equals(intconvert.convertReverse(hitungJaminanSosial()))) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Jangan Merubah Total Isian");
                return false;
            }

        }

    }

    private class ValidasiB5R13HARIAPRIL implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_APR().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_APR().getText()) <= 30 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIMEI implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_MEI().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_MEI().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIJUNI implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JUN().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JUN().getText()) <= 30 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIJULI implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JUL().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JUL().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIAGUSTUS implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_AGT().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_AGT().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARISEPT implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_SEP().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_SEP().getText()) <= 30 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIOKTO implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_OKT().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_OKT().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARINOVEM implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_NOV().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_NOV().getText()) <= 30 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIDES implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_DES().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_DES().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIJAN implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JAN().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_JAN().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIFEB implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_FEB().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_FEB().getText()) <= 28 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13HARIMARET implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<Textfield> listKuesYgMinta = new ArrayList<Textfield>();
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_AGT());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_APR());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_DES());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_FEB());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_JAN());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_JUL());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_JUN());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_MAR());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_MEI());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_NOV());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_OKT());
            listKuesYgMinta.add(panelUsahaBlok5A.getB5R13HARI_SEP());
            int tempKuesYgMintaINT = 0;

            for (Textfield tf : listKuesYgMinta) {
                if (!tf.getText().equals("0")) {
                    tempKuesYgMintaINT++;
                }
            }

            if (tempKuesYgMintaINT != intconvert.convertForward(panelUsahaBlok5A.getB5R9().getText())) {

                EditableTo(listB5AUsaha, 24, 48);
                JOptionPane.showMessageDialog(null, "Mismatch B5R9 dan B5R13 pada Kuesioner\nHubungi Seksi Kuesioner untuk Perbaikan");
                field.setTextfield(panelUsahaBlok5A.getB5R13HARI_APR());
                return true;
            } else if (intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_MAR().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5A.getB5R13HARI_MAR().getText()) <= 31 && !field.getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Hari Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R13KODEKEGIATAN implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (field.getText().matches("[0-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Kode Kegiatan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R14 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            omsetBulanLalu = 0;
            omsetBulanLalu = intconvert.convertForward(panelUsahaBlok5A.getB5R14().getText());
            jumlahJaminanSosialYgDiberikan = hitungJaminanSosial();
            return true;
        }

    }

    private int hitungJaminanSosial() {
        int jumlahJaminanSosialYgDiberikanTemp = 0;
        jumlahJaminanSosialYgDiberikanTemp += intconvert.convertForward(panelUsahaBlok5A.getB5R12A().getText());
        jumlahJaminanSosialYgDiberikanTemp += intconvert.convertForward(panelUsahaBlok5A.getB5R12B().getText());
        jumlahJaminanSosialYgDiberikanTemp += intconvert.convertForward(panelUsahaBlok5A.getB5R12C().getText());
        jumlahJaminanSosialYgDiberikanTemp += intconvert.convertForward(panelUsahaBlok5A.getB5R12D().getText());
        return jumlahJaminanSosialYgDiberikanTemp;
    }
}
