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
import pkl53.converter.IntegerConverter;
import pkl53.view.loop.Loop4A;
import pkl53.view.loop.Loop4B;

/**
 *
 * @author Reza Aprianto
 */
public class Blok4Validasi extends AbstractValidasi {

    IntegerConverter ic = new IntegerConverter();
    private Loop4A panelBlok4A;
    private Loop4B panelBlok4B;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB4A = new ArrayList<Textfield>();
    List<Textfield> listB4B = new ArrayList<Textfield>();

    /**
     * @return the panelBlok4A
     */
    public Loop4A getPanelBlok4A() {
        return panelBlok4A;
    }

    /**
     * @param panelBlok4A the panelBlok4A to set
     */
    public void setPanelBlok4A(Loop4A panelBlok4A) {
        this.panelBlok4A = panelBlok4A;
    }

    public void registerValidasi4A() {
        panelBlok4A.getB4R1().setValidator(new ValidasiB4R1());
        panelBlok4A.getB4R2().setValidator(new ValidasiB4R2());
        panelBlok4A.getB4R3().setValidator(new ValidasiB4R3());
        panelBlok4A.getB4R4().setValidator(new ValidasiB4R4());
        panelBlok4A.getB4R5().setValidator(new ValidasiB4R5());
        panelBlok4A.getB4R6().setValidator(new ValidasiB4R6());
        panelBlok4A.getB4R7().setValidator(new ValidasiB4R7());
        panelBlok4A.getB4R8().setValidator(new ValidasiB4R8());
        panelBlok4A.getB4R9().setValidator(new ValidasiB4R9());
        panelBlok4A.getB4R10().setValidator(new ValidasiB4R10());
        panelBlok4A.getB4R11().setValidator(new ValidasiB4R11());
        panelBlok4A.getB4R12().setValidator(new ValidasiB4R12());
        panelBlok4A.getB4R13().setValidator(new ValidasiB4R13());
        panelBlok4A.getB4R14().setValidator(new ValidasiB4R14());
        panelBlok4A.getB4R15().setValidator(new ValidasiB4R15());
    }

    public void registerValidasi4B() {

        getPanelBlok4B().getB4R1().setValidator(new ValidasiB4R1());
        getPanelBlok4B().getB4R2().setValidator(new ValidasiB4R2());
        getPanelBlok4B().getB4R4().setValidator(new ValidasiB4R4());

        getPanelBlok4B().getB4R16().setValidator(new ValidasiB4R16());
        getPanelBlok4B().getB4R17().setValidator(new ValidasiB4R17());
        getPanelBlok4B().getB4R18().setValidator(new ValidasiB4R18());
        getPanelBlok4B().getB4R19().setValidator(new ValidasiB4R19());
        getPanelBlok4B().getB4R20().setValidator(new ValidasiB4R20());
        getPanelBlok4B().getB4R21().setValidator(new ValidasiB4R21());
        getPanelBlok4B().getB4R22().setValidator(new ValidasiB4R22());
        getPanelBlok4B().getB4R23().setValidator(new ValidasiB4R23());
        getPanelBlok4B().getB4R24().setValidator(new ValidasiB4R24());
//        
    }

    public void setListB4A() {
        listB4A.add(0, panelBlok4A.getB4R1());
        listB4A.add(1, panelBlok4A.getB4R2());
        listB4A.add(2, panelBlok4A.getB4R3());
        listB4A.add(3, panelBlok4A.getB4R4());
        listB4A.add(4, panelBlok4A.getB4R5());
        listB4A.add(5, panelBlok4A.getB4R6());
        listB4A.add(6, panelBlok4A.getB4R7());
        listB4A.add(7, panelBlok4A.getB4R8());
        listB4A.add(8, panelBlok4A.getB4R9());
        listB4A.add(9, panelBlok4A.getB4R10());
        listB4A.add(10, panelBlok4A.getB4R11());
        listB4A.add(11, panelBlok4A.getB4R12());
        listB4A.add(12, panelBlok4A.getB4R13());
        listB4A.add(13, panelBlok4A.getB4R14());
        listB4A.add(14, panelBlok4A.getB4R15());
        listB4A.add(15, panelBlok4A.getB4R15());
    }

    public void setListB4B() {
        listB4B.add(0, getPanelBlok4B().getB4R1());
        listB4B.add(1, getPanelBlok4B().getB4R2());
        listB4B.add(2, getPanelBlok4B().getB4R4());
        listB4B.add(3, getPanelBlok4B().getB4R16());
        listB4B.add(4, getPanelBlok4B().getB4R17());
        listB4B.add(5, getPanelBlok4B().getB4R18());
        listB4B.add(6, getPanelBlok4B().getB4R19());
        listB4B.add(7, getPanelBlok4B().getB4R20());
        listB4B.add(8, getPanelBlok4B().getB4R21());
        listB4B.add(9, getPanelBlok4B().getB4R22());
        listB4B.add(10, getPanelBlok4B().getB4R23());
        listB4B.add(11, getPanelBlok4B().getB4R24());
        listB4B.add(12, getPanelBlok4B().getB4R24());

    }

    /**
     * @return the panelBlok4B
     */
    public Loop4B getPanelBlok4B() {
        return panelBlok4B;
    }

    /**
     * @param panelBlok4B the panelBlok4B to set
     */
    public void setPanelBlok4B(Loop4B panelBlok4B) {
        this.panelBlok4B = panelBlok4B;
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
            if (!panelBlok4A.getB4R5().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                return false;
            }
        }

    }

    private class ValidasiB4R6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R6().getText().matches("[0-9][0-9]")) {
                if (ic.convertForward(panelBlok4A.getB4R6().getText()) < 22) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Penulisan KBLI < 22");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan KBLI 2 Digit ");
                return false;
            }
        }

    }

    private class ValidasiB4R7 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R7().getText().matches("[1-9]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jenis Pekerjaan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R8().getText().matches("[1-3]")) {

                skipTo(listB4A, 8, 15);

                return true;
            } else if (panelBlok4A.getB4R8().getText().matches("[4-7]")) {
                EditableTo(listB4A, 8, 14);
                field.setTextfield(panelBlok4A.getB4R9());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Status Pekerjaan Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R9().getText().matches("[1-2]")) {
                return true;
            } else if (panelBlok4A.getB4R9().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R10().getText().matches("[1-2]")) {
                return true;
            } else if (panelBlok4A.getB4R10().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R11 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R11().getText().matches("[1-2]")) {
                return true;
            } else if (panelBlok4A.getB4R11().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R12 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R12().getText().matches("[1-2]")) {
                return true;
            } else if (panelBlok4A.getB4R12().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R13 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R13().getText().matches("[1-2]")) {
                return true;
            } else if (panelBlok4A.getB4R13().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R14 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4A.getB4R14().getText().matches("[1-1]")) {
                if (panelBlok4A.getB4R9().getText().matches("[2-3]")
                        || panelBlok4A.getB4R10().getText().matches("[2-3]")
                        || panelBlok4A.getB4R11().getText().matches("[2-3]")
                        || panelBlok4A.getB4R12().getText().matches("[2-3]")
                        || !panelBlok4A.getB4R13().getText().matches("[2-2]")) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya  tidak mempunyai pekerjaan informal ");
                    return false;
                }
            } else if (panelBlok4A.getB4R14().getText().matches("[0-0]")) {
                if (panelBlok4A.getB4R9().getText().matches("[2-3]")
                        || panelBlok4A.getB4R10().getText().matches("[2-3]")
                        || panelBlok4A.getB4R11().getText().matches("[2-3]")
                        || panelBlok4A.getB4R12().getText().matches("[2-3]")
                        || !panelBlok4A.getB4R13().getText().matches("[2-2]")) {
                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya mempunyai pekerjaan informal ");
                    return false;

                } else {
                    return true;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;

            }

        }
    }

    private class ValidasiB4R15 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4A().getB4R15().getText().matches("[0-1]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4B.getB4R16().getText().matches("[2-2]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak");
                field.setTextfield(panelBlok4B.getB4R24());
//               skipTo(listB4B, 4, 12);
                return true;
            } else if (panelBlok4B.getB4R16().getText().matches("[1-1]")) {
                EditableTo(listB4B, 4, 12);
                field.setTextfield(panelBlok4B.getB4R17());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }

        }
    }

    private class ValidasiB4R17 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R17().getText().matches("[1-2]")) {
                return true;
            } else if (getPanelBlok4B().getB4R17().getText().matches("[3-3]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R18 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R18().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R19 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R19().getText().matches("[1-3]")) {
                return true;
            } else if (getPanelBlok4B().getB4R19().getText().matches("[4-4]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R20 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R20().getText().matches("[1-3]")) {
                return true;
            } else if (getPanelBlok4B().getB4R20().getText().matches("[4-4]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R21 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R21().getText().matches("[1-3]")) {
                return true;
            } else if (getPanelBlok4B().getB4R21().getText().matches("[4-4]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R22 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getPanelBlok4B().getB4R22().getText().matches("[1-3]")) {
                return true;
            } else if (getPanelBlok4B().getB4R22().getText().matches("[4-4]")) {
                JOptionPane.showMessageDialog(null, "Anda baru mengentri tidak  tau");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB4R23 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok4B.getB4R23().getText().matches("[0-1]")) {
//                if (panelBlok4B.getB4R19().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R20().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R21().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R22().getText().matches("[2-3]")
//                        && !panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    return true;
//                } else if (panelBlok4B.getB4R19().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R20().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R21().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R22().getText().matches("[1-1]")
//                        && !panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    return true;
//                } else if (panelBlok4B.getB4R19().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R20().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R21().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R22().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    return true;
//                } else {
//                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya  tidak mempunyai pekerjaan informal ");
//                    return false;
//                }
//            } else if (panelBlok4B.getB4R23().getText().matches("[0-0]")) {
//
//                if (panelBlok4B.getB4R19().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R20().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R21().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R22().getText().matches("[2-3]")
//                        && !panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya   mempunyai pekerjaan informal ");
//                    return false;
//                } else if (panelBlok4B.getB4R19().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R20().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R21().getText().matches("[1-1]")
//                        || panelBlok4B.getB4R22().getText().matches("[1-1]")
//                        && !panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya   mempunyai pekerjaan informal ");
//                    return false;
//                } else if (panelBlok4B.getB4R19().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R20().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R21().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R22().getText().matches("[2-3]")
//                        && panelBlok4B.getB4R18().getText().matches("[3-3]")) {
//                    JOptionPane.showMessageDialog(null, "Cek kembali, Seharusnya   mempunyai pekerjaan informal ");
//                    return false;
//                } else {
//                    return true;
//                }
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;

            }

        }
    }

    private class ValidasiB4R24 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
           if (getPanelBlok4B().getB4R24().getText().matches("[0-1]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
      
        }

    }
}
