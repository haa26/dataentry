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
import pkl53.model.Blok4PekerjaBinding;
import pkl53.view.Blok4;
import pkl53.view.Blok4B;
import pkl53.view.Blok56;

/**
 *
 * @author Reza Aprianto
 */
public class Blok56Validasi extends AbstractValidasi {

    private Blok56 PanelBlok56;
    List<Textfield> listB56Listing = new ArrayList<Textfield>();
    IntegerConverter ic = new IntegerConverter();

    /**
     * @return the PanelBlok56
     */
    public Blok56 getPanelBlok56() {
        return PanelBlok56;
    }

    public void setList() {
        listB56Listing.add(0, PanelBlok56.getB5R1Nama());
        listB56Listing.add(1, PanelBlok56.getB5R1Art());
        listB56Listing.add(2, PanelBlok56.getB5R2());
        listB56Listing.add(3, PanelBlok56.getB5R3());
        listB56Listing.add(4, PanelBlok56.getB5R4());
        listB56Listing.add(5, PanelBlok56.getB5R5());
        listB56Listing.add(6, PanelBlok56.getB5R6Prop());
        listB56Listing.add(7, PanelBlok56.getB5R6Kab());
        listB56Listing.add(8, PanelBlok56.getB5R7Prop());
        listB56Listing.add(9, PanelBlok56.getB5R7Kab());
        listB56Listing.add(10, PanelBlok56.getB5R8());
        listB56Listing.add(11, PanelBlok56.getB5R9());
        listB56Listing.add(12, PanelBlok56.getB5R10());
        listB56Listing.add(13, PanelBlok56.getB5R11());
        listB56Listing.add(14, PanelBlok56.getB5R12());
        listB56Listing.add(15, PanelBlok56.getB5R13());
        listB56Listing.add(16, PanelBlok56.getB5R14a());
        listB56Listing.add(17, PanelBlok56.getB5R14b());
        listB56Listing.add(18, PanelBlok56.getB5R15());
        listB56Listing.add(19, PanelBlok56.getB5R16());

        listB56Listing.add(20, PanelBlok56.getB5R17a());
        listB56Listing.add(21, PanelBlok56.getB5R17b());

        listB56Listing.add(22, PanelBlok56.getB6R1());
        listB56Listing.add(23, PanelBlok56.getB6R2());
        listB56Listing.add(24, PanelBlok56.getB6R3());
        listB56Listing.add(25, PanelBlok56.getB6R4a());
        listB56Listing.add(26, PanelBlok56.getB6R4b());
        listB56Listing.add(27, PanelBlok56.getB6R5a());
        listB56Listing.add(28, PanelBlok56.getB6R5b());

        listB56Listing.add(29, PanelBlok56.getB6R6utama());
        listB56Listing.add(30, PanelBlok56.getB6R6lainnya());
        listB56Listing.add(31, PanelBlok56.getB6R6lainnya2());
        listB56Listing.add(32, PanelBlok56.getB6R7a());
        listB56Listing.add(33, PanelBlok56.getB6R7b());
        listB56Listing.add(34, PanelBlok56.getB6R8a());
        listB56Listing.add(35, PanelBlok56.getB6R8b1());
        listB56Listing.add(36, PanelBlok56.getB6R8b2());
        listB56Listing.add(37, PanelBlok56.getB6R8b3());
        listB56Listing.add(38, PanelBlok56.getB6R8b4());
        listB56Listing.add(39, PanelBlok56.getB6R8b5());
        listB56Listing.add(40, PanelBlok56.getB6R8b6());

        listB56Listing.add(41, PanelBlok56.getB6R9a());
        listB56Listing.add(42, PanelBlok56.getB6R9b());
        listB56Listing.add(43, PanelBlok56.getB6R9b());
        listB56Listing.add(44, PanelBlok56.getB6R10());
        listB56Listing.add(45, PanelBlok56.getB6R3tetap());
        listB56Listing.add(46, PanelBlok56.getB6R3tdktetap());
        listB56Listing.add(47, PanelBlok56.getB6R8b8());
        listB56Listing.add(48, PanelBlok56.getB6R8bJuml());

    }

    /**
     * @param PanelBlok56 the PanelBlok56 to set
     */
    public void setPanelBlok56(Blok56 PanelBlok56) {
        this.PanelBlok56 = PanelBlok56;
    }

    public void registerValidasi() {
        PanelBlok56.getB5R1Nama().setValidator(new ValidasiB5R1Nama());
        PanelBlok56.getB5R1Art().setValidator(new ValidasiB5R1Art());
        PanelBlok56.getB5R2().setValidator(new ValidasiB5R2());
        PanelBlok56.getB5R3().setValidator(new ValidasiB5R3());
        PanelBlok56.getB5R4().setValidator(new ValidasiB5R4());
        PanelBlok56.getB5R5().setValidator(new ValidasiB5R5());
        PanelBlok56.getB5R6Prop().setValidator(new ValidasiB5R6Prop());
        PanelBlok56.getB5R6Kab().setValidator(new ValidasiB5R6Kab());
        PanelBlok56.getB5R7Prop().setValidator(new ValidasiB5R7Prop());
        PanelBlok56.getB5R7Kab().setValidator(new ValidasiB5R7Kab());
        PanelBlok56.getB5R8().setValidator(new ValidasiB5R8());
        PanelBlok56.getB5R9().setValidator(new ValidasiB5R9());
        PanelBlok56.getB5R10().setValidator(new ValidasiB5R10());
        PanelBlok56.getB5R11().setValidator(new ValidasiB5R11());
        PanelBlok56.getB5R12().setValidator(new ValidasiB5R12());
        PanelBlok56.getB5R13().setValidator(new ValidasiB5R13());
        PanelBlok56.getB5R14a().setValidator(new ValidasiTrue());
        PanelBlok56.getB5R14b().setValidator(new ValidasiTrue());
        PanelBlok56.getB5R15().setValidator(new ValidasiB5R15());
        PanelBlok56.getB5R16().setValidator(new ValidasiB5R16());

        PanelBlok56.getB5R17a().setValidator(new ValidasiB5R17a());
        PanelBlok56.getB5R17b().setValidator(new ValidasiB5R17b());
        PanelBlok56.getB6R1().setValidator(new ValidasiB6R1());
        PanelBlok56.getB6R2().setValidator(new ValidasiB6R2());
        PanelBlok56.getB6R3().setValidator(new ValidasiB6R3());
        PanelBlok56.getB6R3tetap().setValidator(new ValidasiB6R3tetap());
        PanelBlok56.getB6R3tdktetap().setValidator(new ValidasiTrue());
        PanelBlok56.getB6R4a().setValidator(new ValidasiB6R4a());
        PanelBlok56.getB6R4b().setValidator(new ValidasiB6R4b());
        PanelBlok56.getB6R5a().setValidator(new ValidasiB6R5a());
        PanelBlok56.getB6R5b().setValidator(new ValidasiB6R5b());
        PanelBlok56.getB6R6utama().setValidator(new ValidasiB6R6utama());
        PanelBlok56.getB6R6lainnya().setValidator(new ValidasiB6R6lainnya());
        PanelBlok56.getB6R6lainnya2().setValidator(new ValidasiTrue());
        PanelBlok56.getB6R7a().setValidator(new ValidasiB6R7a());
        PanelBlok56.getB6R7b().setValidator(new ValidasiB6R7b());
        PanelBlok56.getB6R8a().setValidator(new ValidasiB6R8a());
        PanelBlok56.getB6R8b1().setValidator(new ValidasiB6R8b1());
        PanelBlok56.getB6R8b2().setValidator(new ValidasiB6R8b2());
        PanelBlok56.getB6R8b3().setValidator(new ValidasiB6R8b3());
        PanelBlok56.getB6R8b4().setValidator(new ValidasiB6R8b4());
        PanelBlok56.getB6R8b5().setValidator(new ValidasiB6R8b5());
        PanelBlok56.getB6R8b6().setValidator(new ValidasiB6R8b6());
        PanelBlok56.getB6R8b8().setValidator(new ValidasiB6R8b8());
        PanelBlok56.getB6R8bJuml().setValidator(new ValidasiB6R8bJuml());
        PanelBlok56.getB6R9a().setValidator(new ValidasiB6R9a());
        PanelBlok56.getB6R9b().setValidator(new ValidasiB6R9b());
        PanelBlok56.getB6R10().setValidator(new ValidasiB6R10());

    }

    private class ValidasiTrue implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;

        }

    }

    private class ValidasiB5R1Nama implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            //ambil dari blok 4
            return true;

        }

    }

    private class ValidasiB5R1Art implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            List<Blok4PekerjaBinding> dataBlok4 = Blok4.getB4PekerjaanBindingList();
            List<Blok4PekerjaBinding> dataBlok4B = Blok4B.getB4PekerjaBinding();

            for (Blok4PekerjaBinding b4 : dataBlok4) {

                if (ic.convertForward(PanelBlok56.getB5R1Art().getText()) == (ic.convertForward(b4.getB4r1()))) {

//                    if (b4.getB4r15().equalsIgnoreCase("1")) {
                    PanelBlok56.getB5R2().setText(b4.getB4r4());

                    if (PanelBlok56.getB5R1Nama().getText().equals(b4.getB4r2())) {

                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Penulisan no art salah \n no art " + PanelBlok56.getB5R1Art().getText() + " itu milik "
                                + b4.getB4r2() + "silahkan perbaiki isian nama  !");
                        return false;
                    }

//                    } else {
//                        JOptionPane.showMessageDialog(null, "Art tidak mempunyai pekerjaan informal!");
//                        return false;
//                    }
                }
            }
            for (Blok4PekerjaBinding b4B : dataBlok4B) {

                if (ic.convertForward(PanelBlok56.getB5R1Art().getText()) == (ic.convertForward(b4B.getB4r1()))) {

//                    if ( b4B.getB4r24().equalsIgnoreCase("1")) {
                    PanelBlok56.getB5R2().setText(b4B.getB4r4());

                    if (PanelBlok56.getB5R1Nama().getText().equals(b4B.getB4r2())) {

                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Nama Tidak konsisten dengan blok 4  !");
                        return false;
                    }

//                    } else {
//                        JOptionPane.showMessageDialog(null, "Art tidak mempunyai pekerjaan informal!");
//                        return false;
//                    }
                }

            }
            return true;

        }
    }

    private class ValidasiB5R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;

        }

    }

    private class ValidasiB5R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R3().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Hanya Memperbolehkan Laki-laki dan Perempuan !");
                return false;
            }

        }

    }

    private class ValidasiB5R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R4().getText().matches("[0-9][0-9]")) {
                // antara isri > anak , selisih 15
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R5().getText().matches("[1-4]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Harus punya Status Perkawinan  !");
                return false;
            }

        }

    }

    private class ValidasiB5R6Prop implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R5().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (!PanelBlok56.getB5R6Prop().getText().matches("[1-1][8-8]")) {
                skipTo(listB56Listing, 7, 8);
                field.setTextfield(PanelBlok56.getB5R7Prop());
                return true;
            } else if (ic.convertForward(PanelBlok56.getB5R6Prop().getText())>0&&
                    ic.convertForward(PanelBlok56.getB5R6Prop().getText())<99){
                EditableTo(listB56Listing, 7, 8);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R6Kab implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R6Prop().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB5R6Kab().getText())>0&&
                    ic.convertForward(PanelBlok56.getB5R6Kab().getText())<99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R7Prop implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R6Prop().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (!PanelBlok56.getB5R7Prop().getText().matches("[1-1][8-8]")) {
                skipTo(listB56Listing, 9, 10);
                field.setTextfield(PanelBlok56.getB5R8());
                return true;
            } else if (ic.convertForward(PanelBlok56.getB5R7Prop().getText())>0&&
                    ic.convertForward(PanelBlok56.getB5R7Prop().getText())<99) {
                EditableTo(listB56Listing, 9, 10);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R7Kab implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R7Prop().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB5R7Kab().getText())>0&&
                    ic.convertForward(PanelBlok56.getB5R7Kab().getText())<99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R7Prop().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R8().getText().matches("[0-9]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (PanelBlok56.getB5R8().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R9().getText().matches("[1-1]")) {
                skipTo(listB56Listing, 12, 15);
                field.setTextfield(PanelBlok56.getB5R13());
                return true;
            } else if (PanelBlok56.getB5R9().getText().matches("[3-3]")) {
                EditableTo(listB56Listing, 12, 15);
                skipTo(listB56Listing, 12, 13);
                field.setTextfield(PanelBlok56.getB5R11());
                return true;
            }
            if (PanelBlok56.getB5R9().getText().matches("[2-2]")) {
                EditableTo(listB56Listing, 12, 15);
                field.setTextfield(PanelBlok56.getB5R10());
                return true;
            }
            {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R9().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R10().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R11 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB5R10().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB5R11().getText().matches("[1-5]")) {
                skipTo(listB56Listing, 14, 15);
                field.setTextfield(PanelBlok56.getB5R13());
                return true;
            } else if (PanelBlok56.getB5R11().getText().matches("[6-9]")) {
                EditableTo(listB56Listing, 14, 15);
                field.setTextfield(PanelBlok56.getB5R12());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode  salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R12 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB5R11().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB5R12().getText())>0&&
                    ic.convertForward(PanelBlok56.getB5R12().getText())<99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode dua digit !");
                return false;
            }

        }

    }

    private class ValidasiB5R13 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB5R12().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB5R13().getText().matches("[1-1]")) {
                skipTo(listB56Listing, 16, 18);
                field.setTextfield(PanelBlok56.getB5R15());
                return true;
            } else if (PanelBlok56.getB5R13().getText().matches("[2-3]")) {
                EditableTo(listB56Listing, 16, 18);
                field.setTextfield(PanelBlok56.getB5R14a());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R15 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB5R14b().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB5R15().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R15().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R16().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R17a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB5R16().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB5R17a().getText().matches("[2-2]")) {
                skipTo(listB56Listing, 21, 22);
                field.setTextfield(PanelBlok56.getB6R1());
                return true;
            } else if (PanelBlok56.getB5R17a().getText().matches("[1-1]")) {
                EditableTo(listB56Listing, 21, 22);
                field.setTextfield(PanelBlok56.getB5R17b());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB5R17b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB5R17a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB5R17b().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R1 implements Validator {

        List<Blok4PekerjaBinding> dataBlok4 = Blok4.getB4PekerjaanBindingList();

        @Override
        public boolean onCheckValue(Textfield field) {

            if (ic.convertForward(PanelBlok56.getB6R1().getText())>0&&
                    ic.convertForward(PanelBlok56.getB6R1().getText())<99) {

                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Kode harus dua digit !");
                return false;
            }

        }

    }

    private class ValidasiB6R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (ic.convertForward(PanelBlok56.getB6R2().getText())>0&&
                    ic.convertForward(PanelBlok56.getB6R2().getText())<99){
                if (ic.convertForward(PanelBlok56.getB6R2().getText()) < 22) {
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

    private class ValidasiB6R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R2().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R3().getText())>0&&
                    ic.convertForward(PanelBlok56.getB6R3().getText())<3) {
                skipTo(listB56Listing, 25, 29);
                skipTo(listB56Listing, 45, 47);
                PanelBlok56.getB6R4a().setText("0");
                PanelBlok56.getB6R4b().setText("0");
                PanelBlok56.getB6R5a().setText("0");
                PanelBlok56.getB6R5b().setText("0");
                field.setTextfield(PanelBlok56.getB6R6utama());
                return true;
            } else if (PanelBlok56.getB6R3().getText().matches("[1-1][0-0]")) {
                EditableTo(listB56Listing, 25, 29);
                EditableTo(listB56Listing, 45, 47);
                skipTo(listB56Listing, 46, 47);
                field.setTextfield(PanelBlok56.getB6R3tetap());
                return true;
            } else if (PanelBlok56.getB6R3().getText().matches("[1-1][3-3]")) {
                EditableTo(listB56Listing, 25, 29);
                EditableTo(listB56Listing, 45, 47);
                skipTo(listB56Listing, 45, 46);
                field.setTextfield(PanelBlok56.getB6R3tdktetap());
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R3().getText())>3&&
                    ic.convertForward(PanelBlok56.getB6R3().getText())<14) {

                skipTo(listB56Listing, 45, 47);
                EditableTo(listB56Listing, 25, 29);

                field.setTextfield(PanelBlok56.getB6R4a());

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R3tetap implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            field.setTextfield(PanelBlok56.getB6R4a());
            return true;

        }

    }

    private class ValidasiB6R4a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R4a().getText())>=0&&
                    ic.convertForward(PanelBlok56.getB6R4a().getText())<99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Jarak harus dalam Dua digit !");
                return false;
            }

        }

    }

    private class ValidasiB6R4b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R4a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R4b().getText())>=0&&
                    ic.convertForward(PanelBlok56.getB6R4b().getText())<999) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Jarak harus dalam Tiga digit !");
                return false;
            }

        }

    }

    private class ValidasiB6R5a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R4b().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R5a().getText())>=0&&
                    ic.convertForward(PanelBlok56.getB6R5a().getText())<99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Lama Perjalanan Harus dalam Dua digit !");
                return false;
            }

        }

    }

    private class ValidasiB6R5b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R5a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R5b().getText())>=0&&
                    ic.convertForward(PanelBlok56.getB6R5b().getText()) < 60) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Isikan ke kolom jam jika lebih dari 59 menit !");
                return false;
            }

        }

    }

    private class ValidasiB6R6utama implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R5b().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==1) {
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==2) {
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==4) {
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==8) {
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==16) {
                return true;
            } else if (ic.convertForward(PanelBlok56.getB6R6utama().getText())==32) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Tidak sesuai !");
                return false;
            }

        }

    }

    private class ValidasiB6R6lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R5b().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB6R6lainnya().getText().equalsIgnoreCase("32")
                    || PanelBlok56.getB6R6utama().getText().equalsIgnoreCase("32")) {
                EditableTo(listB56Listing, 31, 32);
                field.setTextfield(PanelBlok56.getB6R6lainnya2());
                return true;
            }
            if (ic.convertForward(PanelBlok56.getB6R6lainnya().getText())>0&&
                    ic.convertForward(PanelBlok56.getB6R6lainnya().getText())<99||
                   PanelBlok56.getB6R6lainnya().getText().isEmpty() ) {
                skipTo(listB56Listing, 31, 32);

                field.setTextfield(PanelBlok56.getB6R7a());
                return true;

            }
        return true;}
    }

    private class ValidasiB6R7a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (ic.convertForward(PanelBlok56.getB5R4().getText()) - ic.convertForward(PanelBlok56.getB6R7a().getText())
                    > 11) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Memulai usaha harus berumur lebih dari 12 tahun!");
                return false;
            }

        }

    }

    private class ValidasiB6R7b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {

            if (ic.convertForward(PanelBlok56.getB6R7b().getText()) < 12) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "12 bulan isikan di kolum tahun !");
                return false;
            }

        }

    }

    private class ValidasiB6R8a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB6R8a().getText().matches("[0-7]")) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Jumlah hari kerja tidak satu minggu yang lalu !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b1().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b2().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b3().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b4().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b5().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b6().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8b8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok56.getB6R8b8().getText()) < 24) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Mengizinkan kerja rodi !");
                return false;
            }

        }

    }

    private class ValidasiB6R8bJuml implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            int index = 0;
            if (ic.convertForward(PanelBlok56.getB6R8b1().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b2().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b3().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b4().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b5().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b6().getText()) != 0) {
                index++;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b8().getText()) != 0) {
                index++;
            }
            System.out.println(index);
            if (ic.convertForward(PanelBlok56.getB6R8b1().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b2().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b3().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b4().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b5().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b6().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }
            if (ic.convertForward(PanelBlok56.getB6R8b8().getText()) > 24) {
                JOptionPane.showMessageDialog(null, "Tidak mendukung kerja rodi !");
                return false;
            }

            if (ic.convertForward(PanelBlok56.getB6R8bJuml().getText())
                    != ic.convertForward(PanelBlok56.getB6R8b1().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b2().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b3().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b4().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b5().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b6().getText())
                    + ic.convertForward(PanelBlok56.getB6R8b8().getText())) {

                JOptionPane.showMessageDialog(null, "Jumlah jam tidak sesuai !");
                return false;
            } else if (ic.convertForward(PanelBlok56.getB6R8a().getText()) != index) {

                JOptionPane.showMessageDialog(null, "Jumlah hari kerja tidak sesuai !");
                return false;
            } else {

                return true;
            }

        }

    }

    private class ValidasiB6R9a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R8a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB6R9a().getText().matches("[2-2]")) {
                skipTo(listB56Listing, 42, 43);
                field.setTextfield(PanelBlok56.getB6R10());
                return true;
            } else if (PanelBlok56.getB6R9a().getText().matches("[1-1]")) {
                EditableTo(listB56Listing, 42, 43);
                field.setTextfield(PanelBlok56.getB6R9b());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R9b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56.getB6R9a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56.getB6R9b().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R10 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56.getB6R9a().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56.getB6R10().getText().matches("[2-2]")) {
                skipTo(listB56Listing, 11, 13);
                return true;
            } else if (PanelBlok56.getB6R10().getText().matches("[1-1]")) {
                EditableTo(listB56Listing, 11, 13);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }
}
