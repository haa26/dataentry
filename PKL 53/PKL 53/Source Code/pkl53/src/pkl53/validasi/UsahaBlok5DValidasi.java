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
import pkl53.view.BlokUsaha5D;

/**
 *
 * @author Prima
 */
public class UsahaBlok5DValidasi extends AbstractValidasi {

    private BlokUsaha5D panelBlokUsaha;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB5DUsaha = new ArrayList<Textfield>();

    public BlokUsaha5D getPanelBlokUsaha() {
        return panelBlokUsaha;
    }

    public void setPanelBlokUsaha(BlokUsaha5D panelBlokUsaha) {
        this.panelBlokUsaha = panelBlokUsaha;
    }

    public void registerValidasi() {
        panelBlokUsaha.getB5R24().setValidator(new ValidasiB5R24());
        panelBlokUsaha.getB5R25A().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25B().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25C().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25D().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25E().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25F().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25G().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25H().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25I().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25J().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25K().setValidator(new ValidasiB5R25Pilihan());
        panelBlokUsaha.getB5R25L().setValidator(new ValidasiB5R25Pilihan());

        panelBlokUsaha.getB5R25M_LAIN().setValidator(new ValidasiB5R25Lainnya());
        panelBlokUsaha.getB5R26A().setValidator(new ValidasiB5R26());
        panelBlokUsaha.getB5R26Lainnya().setValidator(new ValidasiB5R26Lainnya());
        panelBlokUsaha.getB5R27_1().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_2().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_3().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_4().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_5().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_6().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_7().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_8().setValidator(new ValidasiB5R27Pilihan());
        panelBlokUsaha.getB5R27_9().setValidator(new ValidasiB5R27Pilihan());

        panelBlokUsaha.getB5R27_10_LAIN().setValidator(new ValidasiB5R27Lainnya());
        panelBlokUsaha.getB5R28().setValidator(new ValidasiB5R28());
        panelBlokUsaha.getB5R29_1().setValidator(new ValidasiB5R29());
        panelBlokUsaha.getB5R29_2().setValidator(new ValidasiB5R29());
        panelBlokUsaha.getB5R29_3().setValidator(new ValidasiB5R29());
        panelBlokUsaha.getB5R30A().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30B().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30C().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30D().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30E().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30F().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R30G().setValidator(new ValidasiB5R30Pilihan());
        panelBlokUsaha.getB5R31().setValidator(new ValidasiB5R31());
        panelBlokUsaha.getB5R32().setValidator(new ValidasiB5R32());
        panelBlokUsaha.getB5R33().setValidator(new ValidasiB5R33());
        panelBlokUsaha.getB5R34().setValidator(new ValidasiB5R34R35());
        panelBlokUsaha.getB5R35().setValidator(new ValidasiB5R34R35());
        panelBlokUsaha.getB5R36().setValidator(new ValidasiB5R36());

    }

    public void setList5DUsaha() {
        listB5DUsaha.add(panelBlokUsaha.getB5R24()); //0
        listB5DUsaha.add(panelBlokUsaha.getB5R25A()); //1
        listB5DUsaha.add(panelBlokUsaha.getB5R25B()); //2
        listB5DUsaha.add(panelBlokUsaha.getB5R25C()); //3
        listB5DUsaha.add(panelBlokUsaha.getB5R25D()); 
        listB5DUsaha.add(panelBlokUsaha.getB5R25E()); //5
        listB5DUsaha.add(panelBlokUsaha.getB5R25F());
        listB5DUsaha.add(panelBlokUsaha.getB5R25G());
        listB5DUsaha.add(panelBlokUsaha.getB5R25H());
        listB5DUsaha.add(panelBlokUsaha.getB5R25I()); //10
        listB5DUsaha.add(panelBlokUsaha.getB5R25J());
        listB5DUsaha.add(panelBlokUsaha.getB5R25K());
        listB5DUsaha.add(panelBlokUsaha.getB5R25L());

        listB5DUsaha.add(panelBlokUsaha.getB5R25M_LAIN());
        listB5DUsaha.add(panelBlokUsaha.getB5R26A()); //15
        listB5DUsaha.add(panelBlokUsaha.getB5R26Lainnya());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_1());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_2());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_3());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_4()); //20
        listB5DUsaha.add(panelBlokUsaha.getB5R27_5());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_6());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_7());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_8());
        listB5DUsaha.add(panelBlokUsaha.getB5R27_9()); //25

        listB5DUsaha.add(panelBlokUsaha.getB5R27_10_LAIN());
        listB5DUsaha.add(panelBlokUsaha.getB5R28());
        listB5DUsaha.add(panelBlokUsaha.getB5R29_1());
        listB5DUsaha.add(panelBlokUsaha.getB5R29_2());
        listB5DUsaha.add(panelBlokUsaha.getB5R29_3()); //30
        listB5DUsaha.add(panelBlokUsaha.getB5R30A());
        listB5DUsaha.add(panelBlokUsaha.getB5R30B());
        listB5DUsaha.add(panelBlokUsaha.getB5R30C());
        listB5DUsaha.add(panelBlokUsaha.getB5R30D());
        listB5DUsaha.add(panelBlokUsaha.getB5R30E());
        listB5DUsaha.add(panelBlokUsaha.getB5R30F());
        listB5DUsaha.add(panelBlokUsaha.getB5R30G());
        listB5DUsaha.add(panelBlokUsaha.getB5R31());
        listB5DUsaha.add(panelBlokUsaha.getB5R32());
        listB5DUsaha.add(panelBlokUsaha.getB5R33());
        listB5DUsaha.add(panelBlokUsaha.getB5R34());
        listB5DUsaha.add(panelBlokUsaha.getB5R35());
        listB5DUsaha.add(panelBlokUsaha.getB5R36());

        setListTextFields(listB5DUsaha);

    }

    private class ValidasiB5R24 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5DUsaha, 1, 26);
            if (panelBlokUsaha.getB5R24().getText().matches("[1]")) {
                field.setTextfield(panelBlokUsaha.getB5R25A());
                return true;
            } else if (panelBlokUsaha.getB5R24().getText().matches("[2]")) {
                skipTo(listB5DUsaha, 1, 26);
                field.setTextfield(panelBlokUsaha.getB5R28());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R25Pilihan implements Validator {

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

    private class ValidasiB5R25Lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5DUsaha, 14, 16);
            if (panelBlokUsaha.getB5R25A().getText().matches("[1]")) {
                field.setTextfield(panelBlokUsaha.getB5R26A());
                return true;
            } else {
                skipTo(listB5DUsaha, 14, 16);
                field.setTextfield(panelBlokUsaha.getB5R27_1());
                return true;
            }
        }

    }

    private class ValidasiB5R26 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5DUsaha, 15, 16);
            if (panelBlokUsaha.getB5R26A().getText().matches("[1-3]")) {
                skipTo(listB5DUsaha, 15, 16);
                field.setTextfield(panelBlokUsaha.getB5R27_1());
                return true;
            } else if (panelBlokUsaha.getB5R26A().getText().matches("[4]")) {
                field.setTextfield(panelBlokUsaha.getB5R26Lainnya());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R26Lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (!panelBlokUsaha.getB5R26Lainnya().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Sebutkan");
                return false;
            }
        }

    }

    private class ValidasiB5R27Pilihan implements Validator {

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

    private class ValidasiB5R27Lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R28 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5DUsaha, 27, 30);
            if (panelBlokUsaha.getB5R28().getText().matches("[1]")) {
                field.setTextfield(panelBlokUsaha.getB5R29_1());
                return true;
            } else if (panelBlokUsaha.getB5R28().getText().matches("[2]")) {
                skipTo(listB5DUsaha, 27, 30);
                field.setTextfield(panelBlokUsaha.getB5R30A());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R29 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R30Pilihan implements Validator {

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

    private class ValidasiB5R31 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5DUsaha, 38, 39);
            if (panelBlokUsaha.getB5R31().getText().matches("[1]")) {
                field.setTextfield(panelBlokUsaha.getB5R32());
                return true;
            } else if (panelBlokUsaha.getB5R31().getText().matches("[2]")) {
                skipTo(listB5DUsaha, 38, 39);
                field.setTextfield(panelBlokUsaha.getB5R33());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R32 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelBlokUsaha.getB5R32().getText()) >= 0 && intconvert.convertForward(panelBlokUsaha.getB5R32().getText()) < 99) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kesalahan");
                return false;
            }
        }

    }

    private class ValidasiB5R33 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(panelBlokUsaha.getB5R33().getText()) >= 0 && intconvert.convertForward(panelBlokUsaha.getB5R33().getText()) <= 21) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode KBLI Tidak Terdaftar");
                return false;
            }
        }

    }

    private class ValidasiB5R34R35 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (field.getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R36 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlokUsaha.getB5R36().getText().matches("[1-3]")) {
                field.setTextfield(panelBlokUsaha.getB5R36());
                return true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah");
                return false;
            }
        }

    }

}
