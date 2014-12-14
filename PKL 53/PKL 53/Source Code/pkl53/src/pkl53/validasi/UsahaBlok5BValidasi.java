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
import pkl53.view.BlokUsaha5B;
import pkl53.view.loop.LoopUsaha;

/**
 *
 * @author Prima
 */
public class UsahaBlok5BValidasi extends AbstractValidasi {

    private BlokUsaha5B panelUsahaBlok5B;
    private LoopUsaha loopUsaha;
    private IntegerConverter intconvert = new IntegerConverter();
    List<Textfield> listB5BUsaha = new ArrayList<Textfield>();

    public BlokUsaha5B getPanelUsahaBlok5B() {
        return panelUsahaBlok5B;
    }

    public void setPanelUsahaBlok5B(BlokUsaha5B panelUsahaBlok5B) {
        this.panelUsahaBlok5B = panelUsahaBlok5B;
    }

    public void registerValidasiR15() {
        getLoopUsaha().getB3R15a1().setValidator(new ValidasiB5R15A());
        getLoopUsaha().getB3R15b1().setValidator(new ValidasiB5R15B());
        getLoopUsaha().getB3R15c1().setValidator(new ValidasiB5R15C());
        getLoopUsaha().getB3R15d1().setValidator(new ValidasiB5R15D());
        getLoopUsaha().getB3R15e1().setValidator(new ValidasiB5R15E());
        getLoopUsaha().getB3R15f1().setValidator(new ValidasiB5R15F());
        getLoopUsaha().getB3R15g1().setValidator(new ValidasiB5R15G());
        getLoopUsaha().getB3R15h1().setValidator(new ValidasiB5R15H());
        getLoopUsaha().getB3R15i1().setValidator(new ValidasiB5R15I());
        getLoopUsaha().getB3R15j1().setValidator(new ValidasiB5R15J());
        getLoopUsaha().getB3R15k1().setValidator(new ValidasiB5R15K());
    }

    public void registerValidasi() {
        panelUsahaBlok5B.getB5R16().setValidator(new ValidasiB5R16());
        panelUsahaBlok5B.getB5R17A_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17B_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CI_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CII_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CIII_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17DI_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17DII_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17E_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17F_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17G_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17H_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17I_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17J_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17K_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17L_PERT().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17TOT_PERT().setValidator(new ValidasiB5TotalPengeluaran());
        panelUsahaBlok5B.getB5R17LABA_PERT().setValidator(new ValidasiB5LabaRugi());
        panelUsahaBlok5B.getB5R17A_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17B_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CI_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CII_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17CIII_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17DI_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17DII_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17E_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17F_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17G_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17H_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17I_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17J_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17K_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17L_NON().setValidator(new ValidasiB5SeputarDuit());
        panelUsahaBlok5B.getB5R17TOT_NON().setValidator(new ValidasiB5TotalPengeluaran());
        panelUsahaBlok5B.getB5R17LABA_NON().setValidator(new ValidasiB5LabaRugi());

    }

    public void setList5BUsaha() {
        listB5BUsaha.add(panelUsahaBlok5B.getB5R16());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17A_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17B_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CI_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CII_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CIII_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17DI_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17DII_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17E_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17F_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17G_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17H_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17I_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17J_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17K_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17L_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17TOT_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17LABA_PERT());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17A_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17B_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CI_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CII_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17CIII_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17DI_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17DII_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17E_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17F_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17G_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17H_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17I_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17J_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17K_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17L_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17TOT_NON());
        listB5BUsaha.add(panelUsahaBlok5B.getB5R17LABA_NON());

        setListTextFields(listB5BUsaha);
    }

    /**
     * @return the loopUsaha
     */
    public LoopUsaha getLoopUsaha() {
        return loopUsaha;
    }

    /**
     * @param loopUsaha the loopUsaha to set
     */
    public void setLoopUsaha(LoopUsaha loopUsaha) {
        this.loopUsaha = loopUsaha;
    }

    private class ValidasiB5R15A implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R15B implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R15C implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15c1().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jenis Kelamin Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15D implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(getLoopUsaha().getB3R15d1().getText()) > 15 && intconvert.convertForward(getLoopUsaha().getB3R15d1().getText()) < 98) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Umur Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15E implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15e1().getText().matches("[3-6]")) {
                return true;
            } else if (getLoopUsaha().getB3R15e1().getText().matches("[7]")) {
                getLoopUsaha().getB3R15i1().setText("4");
                getLoopUsaha().getB3R15j1().setText("7");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Status Pekerjaan Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15F implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15f1().getText().matches("[1-5]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Format Penulisan Kontrak Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15G implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (intconvert.convertForward(getLoopUsaha().getB3R15g1().getText()) < 168 && intconvert.convertForward(getLoopUsaha().getB3R15g1().getText()) >= 1) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Jam Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15H implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15h1().getText().matches("[1-7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jumlah Jam Kerja Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15I implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15i1().getText().matches("[1-4]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Jenis Pembayaran Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15J implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (getLoopUsaha().getB3R15j1().getText().matches("[1-7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Dasar Pembayaran Salah");
                return false;
            }
        }

    }

    private class ValidasiB5R15K implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5SeputarDuit implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if(field.equals(panelUsahaBlok5B.getB5R17E_NON()) || field.equals(panelUsahaBlok5B.getB5R17E_PERT())){
                if(UsahaBlok5AValidasi.kepemilikanTempatUsaha == 2 && field.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Tempatnya Sewa, Harusnya Ada Pengeluaran");
                    return false;
                }
            }
            
            if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 1) {
                panelUsahaBlok5B.getB5R17TOT_PERT().setText(intconvert.convertReverse(hitungPengeluaran()));
                panelUsahaBlok5B.getB5R17LABA_PERT().setText(intconvert.convertReverse(hitungLabaRugi()));
            } else if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 2) {
                panelUsahaBlok5B.getB5R17TOT_NON().setText(intconvert.convertReverse(hitungPengeluaran()));
                panelUsahaBlok5B.getB5R17LABA_NON().setText(intconvert.convertReverse(hitungLabaRugi()));
            }
            return true;

        }
    }

    private class ValidasiB5TotalPengeluaran implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5LabaRugi implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;
        }

    }

    private class ValidasiB5R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            EditableTo(listB5BUsaha, 1, 35);
            if (!panelUsahaBlok5B.getB5R16().getText().isEmpty()) {
                if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 1) {
                    skipTo(listB5BUsaha, 18, 35);
                    field.setTextfield(panelUsahaBlok5B.getB5R17A_PERT());
                } else if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 2) {
                    skipTo(listB5BUsaha, 1, 18);
                    field.setTextfield(panelUsahaBlok5B.getB5R17A_NON());
                } else {
                    JOptionPane.showMessageDialog(null, "Kesalahan\nHubungi Seksi Data Entri Pengolahan");
                }
                panelUsahaBlok5B.getB5R17TOT_NON().setEditable(false);
                panelUsahaBlok5B.getB5R17TOT_PERT().setEditable(false);
                panelUsahaBlok5B.getB5R17LABA_NON().setEditable(false);
                panelUsahaBlok5B.getB5R17LABA_PERT().setEditable(false);
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Harus Ada Isian Untuk Modal Awal");
                return false;
            }

        }

    }

    private int hitungPengeluaran() {
        int pengeluaran = 0;
        if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 1) {
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17A_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17B_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CI_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CII_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CIII_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17DI_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17DII_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17E_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17F_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17G_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17H_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17I_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17J_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17K_PERT().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17L_PERT().getText());
        } else if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 2) {
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17A_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17B_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CI_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CII_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17CIII_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17DI_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17DII_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17E_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17F_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17G_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17H_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17I_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17J_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17K_NON().getText());
            pengeluaran += intconvert.convertForward(panelUsahaBlok5B.getB5R17L_NON().getText());
        }

        return pengeluaran;
    }

    private int hitungLabaRugi() {
        int labaRugi = 0;
        if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 1) {
            labaRugi = UsahaBlok5AValidasi.omsetBulanLalu - intconvert.convertForward(panelUsahaBlok5B.getB5R17TOT_PERT().getText());
        } else if (UsahaBlok5AValidasi.kodePertanianAtauBukan == 2) {
            labaRugi = UsahaBlok5AValidasi.omsetBulanLalu - intconvert.convertForward(panelUsahaBlok5B.getB5R17TOT_NON().getText());
        }
        return labaRugi;
    }

}
