/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;
import pkl53.converter.IntegerConverter;

import pkl53.view.BlokUsaha123;
import pkl53.view.BlokUsaha4;
import pkl53.view.loop.Loop4Usaha;

/**
 *
 * @author Prima
 */
public class UsahaBlok4Validasi extends AbstractValidasi {

    private Loop4Usaha panelUsahaBlok4;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB4Usaha = new ArrayList<Textfield>();

    public Loop4Usaha getPanelUsahaBlok4() {
        return panelUsahaBlok4;
    }

    public void setPanelUsahaBlok4(Loop4Usaha panelUsahaBlok4) {
        this.panelUsahaBlok4 = panelUsahaBlok4;
    }

    public void registerValidasi() {
        getPanelUsahaBlok4().getB4R1().setValidator(new ValidasiB4R1());
        getPanelUsahaBlok4().getB4R2().setValidator(new ValidasiB4R2());
        getPanelUsahaBlok4().getB4R3().setValidator(new ValidasiB4R3());
        getPanelUsahaBlok4().getB4R4().setValidator(new ValidasiB4R4());
        getPanelUsahaBlok4().getB4R5().setValidator(new ValidasiB4R5());
        getPanelUsahaBlok4().getB4R6().setValidator(new ValidasiB4R6());
        getPanelUsahaBlok4().getB4R7().setValidator(new ValidasiB4R7());
        getPanelUsahaBlok4().getB4R8().setValidator(new ValidasiB4R8());
        getPanelUsahaBlok4().getB4R9().setValidator(new ValidasiB4R9());
        getPanelUsahaBlok4().getB4R10().setValidator(new ValidasiB4R10());
        getPanelUsahaBlok4().getB4R11().setValidator(new ValidasiB4R11());
        getPanelUsahaBlok4().getB4R12().setValidator(new ValidasiB4R12());
        getPanelUsahaBlok4().getB4R13().setValidator(new ValidasiB4R13());
        getPanelUsahaBlok4().getB4R14().setValidator(new ValidasiB4R14());
        getPanelUsahaBlok4().getB4R15().setValidator(new ValidasiB4R15());
        getPanelUsahaBlok4().getB4R16().setValidator(new ValidasiB4R16());
    }

    public void setListB4Usaha() {
        listB4Usaha.add(panelUsahaBlok4.getB4R1());
        listB4Usaha.add(panelUsahaBlok4.getB4R2());
        listB4Usaha.add(panelUsahaBlok4.getB4R3());
        listB4Usaha.add(panelUsahaBlok4.getB4R4());
        listB4Usaha.add(panelUsahaBlok4.getB4R5());
        listB4Usaha.add(panelUsahaBlok4.getB4R6());
        listB4Usaha.add(panelUsahaBlok4.getB4R7());
        listB4Usaha.add(panelUsahaBlok4.getB4R8());
        listB4Usaha.add(panelUsahaBlok4.getB4R9());
        listB4Usaha.add(panelUsahaBlok4.getB4R10());
        listB4Usaha.add(panelUsahaBlok4.getB4R11());
        listB4Usaha.add(panelUsahaBlok4.getB4R12());
        listB4Usaha.add(panelUsahaBlok4.getB4R13());
        listB4Usaha.add(panelUsahaBlok4.getB4R14());
        listB4Usaha.add(panelUsahaBlok4.getB4R15());
        listB4Usaha.add(panelUsahaBlok4.getB4R16());

        setListTextFields(listB4Usaha);
    }

    private class ValidasiB4R1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            //BELUM ADA IMPLEMENTASI
            return true;
        }

    }

    private class ValidasiB4R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            //BELUM ADA IMPLEMENTASI
            return true;
        }

    }

    private class ValidasiB4R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            //BELUM ADA IMPLEMENTASI
            return true;
        }

    }

    private class ValidasiB4R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            //BELUM ADA IMPLEMENTASI
            return true;
        }

    }

    private class ValidasiB4R5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelUsahaBlok4.getB4R5().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Rincian Usaha Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok4.getB4R6().getText()) > 0 && intconvert.convertForward(panelUsahaBlok4.getB4R6().getText()) <= 21) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode KBLI Tidak Terdaftar");
                return false;
            }
        }

    }

    private class ValidasiB4R7 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R7().getText().matches("[1-7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Status Pekerjaan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB4Usaha, 8, 16);
            if (panelUsahaBlok4.getB4R8().getText().matches("[1]")) {
                return true;
            } else if (panelUsahaBlok4.getB4R8().getText().matches("[2]")) {
                skipTo(listB4Usaha, 8, 16);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Isikan Kode yang Benar");
                return false;
            }
        }

    }

    private class ValidasiB4R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R9().getText().matches("[1-3]")) {
                if (panelUsahaBlok4.getB4R9().getText().equals("3")) {
                    JOptionPane.showMessageDialog(null, "Anda baru saja mengisikan Tidak Tahu");
                    return true;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R10().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R11 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R11().getText().matches("[1-4]")) {
                if (panelUsahaBlok4.getB4R11().getText().matches("[4]")) {
                    JOptionPane.showMessageDialog(null, "Anda baru saja mengisikan Tidak Tahu");
                    return true;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R12 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R12().getText().matches("[1-4]")) {
                if (panelUsahaBlok4.getB4R12().getText().matches("[4]")) {
                    JOptionPane.showMessageDialog(null, "Anda baru saja mengisikan Tidak Tahu");
                    return true;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R13 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R13().getText().matches("[1-4]")) {
                if (panelUsahaBlok4.getB4R13().getText().matches("[4]")) {
                    JOptionPane.showMessageDialog(null, "Anda baru saja mengisikan Tidak Tahu");
                    return true;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R14 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R14().getText().matches("[1-4]")) {
                if (panelUsahaBlok4.getB4R14().getText().matches("[4]")) {
                    JOptionPane.showMessageDialog(null, "Anda baru saja mengisikan Tidak Tahu");
                    return true;
                }
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R15 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R15().getText().matches("[0-1]")) {
                if (panelUsahaBlok4.getB4R9().getText().equals("2") && !panelUsahaBlok4.getB4R10().getText().equals("3")
                        && panelUsahaBlok4.getB4R11().getText().matches("[2-3]") && panelUsahaBlok4.getB4R12().getText().matches("[2-3]")
                        && panelUsahaBlok4.getB4R13().getText().matches("[2-3]") && panelUsahaBlok4.getB4R14().getText().matches("[2-3]")) {
                    if (panelUsahaBlok4.getB4R15().getText().equals("1")) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Seharusnya Usaha Informal");
                        return false;
                    }
                } else {
                    if (panelUsahaBlok4.getB4R15().getText().equals("0")) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Seharusnya Bukan Usaha Informal");
                        return false;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hanya Isikan 0 dan 1");
                return false;
            }

        }

    }

    private class ValidasiB4R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok4.getB4R16().getText().matches("[0-1]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kesalahan");
                return false;
            }

        }

    }

}
