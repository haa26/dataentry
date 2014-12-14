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
import pkl53.view.BlokUsaha5C;

/**
 *
 * @author Prima
 */
public class UsahaBlok5CValidasi extends AbstractValidasi {

    private BlokUsaha5C panelUsahaBlok5C;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB5CUsaha = new ArrayList<Textfield>();

    public BlokUsaha5C getPanelUsahaBlok5C() {
        return panelUsahaBlok5C;
    }

    public void setPanelUsahaBlok5C(BlokUsaha5C panelUsahaBlok5C) {
        this.panelUsahaBlok5C = panelUsahaBlok5C;
    }

    public void registerValidasi() {
        panelUsahaBlok5C.getB5R18A().setValidator(new ValidasiB5R18A());
        panelUsahaBlok5C.getB5R18B_LAKI().setValidator(new ValidasiB5R18B());
        panelUsahaBlok5C.getB5R18B_PR().setValidator(new ValidasiB5R18BPer());
        panelUsahaBlok5C.getB5R19_UTAMA().setValidator(new ValidasiB5R19Utama());
        panelUsahaBlok5C.getB5R19_LAIN().setValidator(new ValidasiB5R19Lainnya());
        panelUsahaBlok5C.getB5R19_LL().setValidator(new ValidasiB5R19LL());
        panelUsahaBlok5C.getB5R20A().setValidator(new ValidasiB5R20A());
        panelUsahaBlok5C.getB5R20B().setValidator(new ValidasiB5R20B());
        panelUsahaBlok5C.getB5R21().setValidator(new ValidasiB5R21());
        panelUsahaBlok5C.getB5R21Lainnya().setValidator(new ValidasiB5R21Lainnya());
        panelUsahaBlok5C.getB5R22A().setValidator(new ValidasiB5R22A());
        panelUsahaBlok5C.getB5R22B().setValidator(new ValidasiB5R22B());
        panelUsahaBlok5C.getB5R22BLainnya().setValidator(new ValidasiB5R22BLainnya());
        panelUsahaBlok5C.getB5R22C().setValidator(new ValidasiB5R22C());
        panelUsahaBlok5C.getB5R22D().setValidator(new ValidasiB5R22D());
        panelUsahaBlok5C.getB5R22D_LAIN().setValidator(new ValidasiB5R22DLainnya());
        panelUsahaBlok5C.getB5R22E().setValidator(new ValidasiB5R22E());
        panelUsahaBlok5C.getB5R22F().setValidator(new ValidasiB5R22F());
        panelUsahaBlok5C.getB5R22FLainnya().setValidator(new ValidasiB5R22FLainnya());
        panelUsahaBlok5C.getB5R22G1().setValidator(new ValidasiB5R22G1());
        panelUsahaBlok5C.getB5R22G2().setValidator(new ValidasiB5R22G2());
        panelUsahaBlok5C.getB5R22G3().setValidator(new ValidasiB5R22G1());
        panelUsahaBlok5C.getB5R22G4().setValidator(new ValidasiB5R22G2());
        panelUsahaBlok5C.getB5R22G5().setValidator(new ValidasiB5R22G1());
        panelUsahaBlok5C.getB5R22G6().setValidator(new ValidasiB5R22G2());
        panelUsahaBlok5C.getB5R22G7().setValidator(new ValidasiB5R22G1());
        panelUsahaBlok5C.getB5R22G8().setValidator(new ValidasiB5R22G2());
        //panelUsahaBlok5C.getB5R22G9().setValidator(new ValidasiB5R22G1());
        panelUsahaBlok5C.getB5R22G9_LAIN().setValidator(new ValidasiB5R22G9());
        panelUsahaBlok5C.getB5R23A().setValidator(new ValidasiB5R23A());
        panelUsahaBlok5C.getB5R23ALainnya().setValidator(new ValidasiB5R23ALainnya());
        panelUsahaBlok5C.getB5R23B1().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B2().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B3().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B4().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B5().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B6().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B7().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B8().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B9().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B10().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B11().setValidator(new ValidasiTipeBantuanYgPernahDiperoleh());
        panelUsahaBlok5C.getB5R23B13_LAIN().setValidator(new ValidasiB5R23BLainnya());

    }

    public void setList5CUsaha() {
        listB5CUsaha.add(panelUsahaBlok5C.getB5R18A()); //index 0
        listB5CUsaha.add(panelUsahaBlok5C.getB5R18B_LAKI()); //index 1
        listB5CUsaha.add(panelUsahaBlok5C.getB5R18B_PR()); //index 2
        listB5CUsaha.add(panelUsahaBlok5C.getB5R19_UTAMA()); //index 3
        listB5CUsaha.add(panelUsahaBlok5C.getB5R19_LAIN()); //index 4
        listB5CUsaha.add(panelUsahaBlok5C.getB5R19_LL()); //index 5
        listB5CUsaha.add(panelUsahaBlok5C.getB5R20A());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R20B());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R21());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R21Lainnya());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22A()); //index 10
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22B());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22BLainnya());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22C());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22D());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22D_LAIN()); //index 15
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22E());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22F());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22FLainnya());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G1());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G2()); //index 20
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G3());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G4());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G5());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G6());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G7()); //index 25
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G8());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R22G9_LAIN());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23A());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23ALainnya()); //index 29
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B1());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B2());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B3());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B4());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B5()); //index 34
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B6());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B7());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B8());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B9());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B10()); //index 39
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B11());
        listB5CUsaha.add(panelUsahaBlok5C.getB5R23B13_LAIN());

        setListTextFields(listB5CUsaha);
    }

    private class ValidasiB5R18A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R18A().getText().matches("[1-2]")) {
                EditableTo(listB5CUsaha, 1, 3);
                if (panelUsahaBlok5C.getB5R18A().getText().matches("[2]")) {
                    skipTo(listB5CUsaha, 1, 3);
                    field.setTextfield(panelUsahaBlok5C.getB5R19_UTAMA());
                    return true;
                }
                field.setTextfield(panelUsahaBlok5C.getB5R18B_LAKI());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R18B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5C.getB5R18B_LAKI().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5C.getB5R18B_LAKI().getText()) < 99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Masukkan Angka dalam rentang 0-98");
                return false;
            }
        }

    }

    private class ValidasiB5R18BPer implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelUsahaBlok5C.getB5R18B_PR().getText()) >= 0 && intconvert.convertForward(panelUsahaBlok5C.getB5R18B_PR().getText()) < 99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Masukkan Angka dalam rentang 0-98");
                return false;
            }
        }

    }

    private class ValidasiB5R19Utama implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R19_UTAMA().getText().matches("[1-7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Sumber Modal Utama Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R19Lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 5, 6);
            if (panelUsahaBlok5C.getB5R19_LAIN().getText().matches("[0-6]")) {
                if (panelUsahaBlok5C.getB5R19_LAIN().getText().equals(panelUsahaBlok5C.getB5R19_UTAMA().getText())) {
                    JOptionPane.showMessageDialog(null, "Tidak Perlu Dituliskan Dua Kali");
                    return false;
                }
                skipTo(listB5CUsaha, 5, 6);
                field.setTextfield(panelUsahaBlok5C.getB5R20A());
                return true;
            } else if (panelUsahaBlok5C.getB5R19_LAIN().getText().matches("[7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Sumber Modal Utama Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R19LL implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if(!field.getText().isEmpty()){
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R20A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R20A().getText().matches("[1-2]")) {
                EditableTo(listB5CUsaha, 7, 10);
                if (panelUsahaBlok5C.getB5R20A().getText().matches("[2]")) {
                    skipTo(listB5CUsaha, 7, 8);
                    field.setTextfield(panelUsahaBlok5C.getB5R21());
                    return true;
                }
                field.setTextfield(panelUsahaBlok5C.getB5R20B());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R20B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R20B().getText().matches("[1-2]")) {
                skipTo(listB5CUsaha, 8, 10);
                field.setTextfield(panelUsahaBlok5C.getB5R22A());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R21 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 9, 10);
            if (panelUsahaBlok5C.getB5R21().getText().matches("[1-6]")) {
                skipTo(listB5CUsaha, 9, 10);
                field.setTextfield(panelUsahaBlok5C.getB5R22A());
                return true;
            } else if (panelUsahaBlok5C.getB5R21().getText().matches("[7]")) {
                field.setTextfield(panelUsahaBlok5C.getB5R21Lainnya());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R21Lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelUsahaBlok5C.getB5R21Lainnya().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R22A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R22A().getText().matches("[1-2]")) {
                EditableTo(listB5CUsaha, 11, 28);
                if (panelUsahaBlok5C.getB5R22A().getText().matches("[2]")) {
                    skipTo(listB5CUsaha, 11, 28);
                    field.setTextfield(panelUsahaBlok5C.getB5R23A());
                    return true;
                }
                field.setTextfield(panelUsahaBlok5C.getB5R22B());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 12, 13);
            if (panelUsahaBlok5C.getB5R22B().getText().matches("[1-5]")) {
                skipTo(listB5CUsaha, 12, 13);
                field.setTextfield(panelUsahaBlok5C.getB5R22C());
                return true;
            } else if (panelUsahaBlok5C.getB5R22B().getText().matches("[6]")) {
                field.setTextfield(panelUsahaBlok5C.getB5R22BLainnya());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22BLainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelUsahaBlok5C.getB5R22BLainnya().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R22C implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R22C().getText().matches("[1-2]")) {
                EditableTo(listB5CUsaha, 14, 28);
                if (panelUsahaBlok5C.getB5R22C().getText().matches("[1]")) {
                    skipTo(listB5CUsaha, 14, 16);
                    field.setTextfield(panelUsahaBlok5C.getB5R22E());
                    return true;
                }
                field.setTextfield(panelUsahaBlok5C.getB5R22D());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }

        }
    }

    private class ValidasiB5R22D implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 15, 28);
            if (panelUsahaBlok5C.getB5R22D().getText().matches("[1-8]")) {
                skipTo(listB5CUsaha, 15, 28);
                field.setTextfield(panelUsahaBlok5C.getB5R23A());
                return true;
            } else if (panelUsahaBlok5C.getB5R22D().getText().matches("[9]")) {
                field.setTextfield(panelUsahaBlok5C.getB5R22D_LAIN());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22DLainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 16, 28);
            if (!panelUsahaBlok5C.getB5R22D_LAIN().getText().isEmpty()) {
                skipTo(listB5CUsaha, 16, 28);
                field.setTextfield(panelUsahaBlok5C.getB5R23A());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R22E implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelUsahaBlok5C.getB5R22E().getText().matches("[1-2]")) {
                EditableTo(listB5CUsaha, 17, 28);
                if (panelUsahaBlok5C.getB5R22E().getText().matches("[1]")) {
                    skipTo(listB5CUsaha, 17, 19);
                    field.setTextfield(panelUsahaBlok5C.getB5R22G1());
                    return true;
                }
                field.setTextfield(panelUsahaBlok5C.getB5R22F());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22F implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 18, 28);
            if (panelUsahaBlok5C.getB5R22F().getText().matches("[1-5]")) {
                skipTo(listB5CUsaha, 18, 28);
                field.setTextfield(panelUsahaBlok5C.getB5R23A());
                return true;
            } else if (panelUsahaBlok5C.getB5R22F().getText().matches("[6]")) {
                field.setTextfield(panelUsahaBlok5C.getB5R22FLainnya());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22FLainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 19, 28);
            if (!panelUsahaBlok5C.getB5R22FLainnya().getText().isEmpty()) {
                skipTo(listB5CUsaha, 19, 28);
                field.setTextfield(panelUsahaBlok5C.getB5R23A());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }

        }

    }

    private class ValidasiB5R22G1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (field.getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22G2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (field.getText().matches("[3-4]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R22G9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
                return true;            
        }

    }

    private class ValidasiB5R23A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5CUsaha, 29, 42);
            if (panelUsahaBlok5C.getB5R23A().getText().matches("[1-6]")) {
                skipTo(listB5CUsaha, 29, 30);
                field.setTextfield(panelUsahaBlok5C.getB5R23B1());
                return true;
            } else if (panelUsahaBlok5C.getB5R23A().getText().matches("[7]")) {
                field.setTextfield(panelUsahaBlok5C.getB5R23ALainnya());
                return true;
            } else if (panelUsahaBlok5C.getB5R23A().getText().matches("8")) {                
                skipTo(listB5CUsaha, 29, 42);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R23ALainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelUsahaBlok5C.getB5R23ALainnya().getText().isEmpty()) {
                field.setTextfield(panelUsahaBlok5C.getB5R23B1());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiTipeBantuanYgPernahDiperoleh implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (field.getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R23BLainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

}
