/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;
import pkl53.controller.SubmitControllerPekerjaan;
import pkl53.controller.SubmitListingController;
import pkl53.converter.IntegerConverter;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetKuesioner;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.model.Kortimpencacah;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.view.Blok123;
import pkl53.view.BlokUsaha123;

/**
 *
 * @author Prima
 */
public class UsahaBlok123Validasi extends AbstractValidasi {

    private BlokUsaha123 blokUsaha123;

    public BlokUsaha123 getBlokUsaha123() {
        return blokUsaha123;
    }

    public void setBlokUsaha123(BlokUsaha123 blokUsaha123) {
        this.blokUsaha123 = blokUsaha123;
    }

    public void registerValidasi() {
        blokUsaha123.getB1R1().setValidator(new ValidasiB1R1());
        blokUsaha123.getB1R2().setValidator(new ValidasiB1R2());
        blokUsaha123.getB1R3().setValidator(new ValidasiB1R3());
        blokUsaha123.getB1R4().setValidator(new ValidasiB1R4());
        blokUsaha123.getB1R5a().setValidator(new ValidasiB1R5a());
        blokUsaha123.getB1R5b().setValidator(new ValidasiB1R5b());
        blokUsaha123.getB1R6().setValidator(new ValidasiB1R6());
        blokUsaha123.getNimPencacah().setValidator(new ValidasiB3NimPencacahan());
        blokUsaha123.getTanggalPemeriksaan().setValidator(new ValidasiTanggal());
        blokUsaha123.getTanggalPencacahan().setValidator(new ValidasiTanggal());
    }

    private class ValidasiB1R1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (blokUsaha123.getB1R1().getText().equals("05") || blokUsaha123.getB1R1().getText().equals("10")
                    || blokUsaha123.getB1R1().getText().equals("71")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "kode Kabupaten/Kota salah");
                return false;
            }

        }
    }

    private class ValidasiB1R2 implements Validator {

        SubmitListingController submit = new SubmitListingController();
        List<Kecamatan> kecamatanList = new ArrayList<Kecamatan>();

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R1().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya");
                return false;
            }
            kecamatanList = submit.getKecamatan(blokUsaha123.getB1R1().getText() + blokUsaha123.getB1R2().getText());
            if (kecamatanList.size() > 0) {
                for (Kecamatan mhs : kecamatanList) {
                    BlokUsaha123.getKecamatanLabel().setText(mhs.getNamaKecamatan().toUpperCase());
                }

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Kecamatan salah!");
                return false;
            }
        }

    }

    private class ValidasiB1R3 implements Validator {

        SubmitListingController submit = new SubmitListingController();
        List<Kelurahan> kelurahanList = new ArrayList<Kelurahan>();

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya");
                return false;
            }
            kelurahanList = submit.getKelurahan(blokUsaha123.getB1R1().getText() + blokUsaha123.getB1R2().getText()
                    + blokUsaha123.getB1R3().getText());
            if (kelurahanList.size() > 0) {
                for (Kelurahan mhs : kelurahanList) {
                    BlokUsaha123.getKelurahanLabel().setText(mhs.getNamaKelurahan().toUpperCase());
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Kelurahan salah!");
                return false;
            }
        }

    }

    private class ValidasiB1R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya.");
                return false;
            } else if (blokUsaha123.getB1R4().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "kode Klasifikasi Desa/Kelurahan salah");
                return false;
            }
        }

    }

    private class ValidasiB1R5a implements Validator {

        SubmitListingController submit = new SubmitListingController();
        List<NoBs> noBsList = new ArrayList<NoBs>();

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            noBsList = submit.getBS(blokUsaha123.getB1R1().getText()
                    + blokUsaha123.getB1R2().getText()
                    + blokUsaha123.getB1R3().getText()
                    + blokUsaha123.getB1R5a().getText());

            if (noBsList.size() > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Blok Sensus salah!");
                return false;
            }

        }

    }

    private class ValidasiB1R5b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R5b().getText().matches("[Ss][0-9][0-9][0-9]")) {
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

    private class ValidasiB1R6 implements Validator {

        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        List<KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        List<KetRt> rtList = new ArrayList<KetRt>();

        @Override
        public boolean onCheckValue(Textfield field) {

            if (blokUsaha123.getB1R5a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya");
                return false;

            } else if (blokUsaha123.getB1R6().getText().matches("[0-9][0-9][0-9]")) {
                rtAnggotaList = submit.getketRtAnggota(blokUsaha123.getB1R6().getText(), 1, new KetKuesioner(blokUsaha123.getB1R1().getText()
                        + blokUsaha123.getB1R2().getText()
                        + blokUsaha123.getB1R3().getText()
                        + blokUsaha123.getB1R5a().getText()));
                rtList = submit.getketRt(new KetKuesioner(blokUsaha123.getB1R1().getText()
                        + blokUsaha123.getB1R2().getText()
                        + blokUsaha123.getB1R3().getText()
                        + blokUsaha123.getB1R5a().getText()), blokUsaha123.getB1R6().getText());

                if (rtAnggotaList.size() > 0) {
                    for (KetRtanggota rt : rtAnggotaList) {
                        blokUsaha123.getNamaKrtLabel().setText(rt.getB4r8());
                    }
                    for (KetRt rt : rtList) {
                        blokUsaha123.getAlamatLabel().setText(rt.getB4r2());
                    }
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Kode No RT salah!");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kode No RT salah!");
                return false;
            }

        }
    }

    private class ValidasiB3NimPencacahan implements Validator {

        SubmitListingController submit = new SubmitListingController();
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        List<Kortimpencacah> kortimpencacahList = new ArrayList<Kortimpencacah>();
        String nimKortim;

        @Override
        public boolean onCheckValue(Textfield field) {
            if (blokUsaha123.getB1R6().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya");
                return false;
            }

            kortimpencacahList = submit.getKortimPencacah(blokUsaha123.getNimPencacah().getText());
            if (kortimpencacahList.size() > 0) {

                mahasiswaList = submit.getMahasiswa(blokUsaha123.getNimPencacah().getText());

                for (Mahasiswa mhs : mahasiswaList) {
                    BlokUsaha123.getNamaPenacacahLabel().setText(mhs.getNama().toUpperCase());
                }
                for (Kortimpencacah mhs : kortimpencacahList) {
                    List<Mahasiswa> mahasiswaList1 = new ArrayList<Mahasiswa>();
                    mahasiswaList1 = submit.getMahasiswa(mhs.getNimKortim().getNim());
                    for (Mahasiswa mhsw : mahasiswaList1) {
                        BlokUsaha123.getNamaKortimLabel().setText(mhsw.getNama().toUpperCase());
                        BlokUsaha123.getNimKortimLabel().setText(mhsw.getNim().toUpperCase());
                    }

                }

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode NIM Salah");
                return false;
            }
        }

        public void setNimKortim(String s) {
            nimKortim = s;
        }

    }

    private class ValidasiTanggal implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            IntegerConverter intconvert = new IntegerConverter();

            int a = intconvert.convertForward(blokUsaha123.getTanggalPencacahan().getText());
            int b = intconvert.convertForward(blokUsaha123.getTanggalPemeriksaan().getText());
            if (blokUsaha123.getNimPencacah().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if ((a <= 30 && a > 0)) {

                return true;
            }
            if ((b <= 30 && b > 0)) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tanggal harus antara 1 - 31");
                return false;
            }
           

        }

    }

}
