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
import pkl53.view.Blok789;

/**
 *
 * @author Reza Aprianto
 */
public class Blok789Validasi extends AbstractValidasi {
    IntegerConverter ic = new IntegerConverter();
    private Blok789 PanelBlok789;
    List<Textfield> listB789Listing = new ArrayList<Textfield>();

    /**
     * @return the PanelBlok789
     */
    public Blok789 getPanelBlok789() {
        return PanelBlok789;
    }
    public void setList(){
        listB789Listing.add(0, PanelBlok789.getB7R1());
        listB789Listing.add(1, PanelBlok789.getB7R2());
        listB789Listing.add(2, PanelBlok789.getB7R3());
        listB789Listing.add(3, PanelBlok789.getB7R4());
        listB789Listing.add(4, PanelBlok789.getB7R5());
        listB789Listing.add(5, PanelBlok789.getB8R1());
        listB789Listing.add(6, PanelBlok789.getB8R10a());
        listB789Listing.add(7, PanelBlok789.getB8R10b());
        listB789Listing.add(8, PanelBlok789.getB8R10c());
        listB789Listing.add(9, PanelBlok789.getB8R10d());
        listB789Listing.add(10, PanelBlok789.getB8R10e());
        listB789Listing.add(11, PanelBlok789.getB8R10f());
        listB789Listing.add(12, PanelBlok789.getB8R10g());
        listB789Listing.add(13, PanelBlok789.getB8R10h());
        listB789Listing.add(14, PanelBlok789.getB8R10i());
        listB789Listing.add(15, PanelBlok789.getB8R10j());
        listB789Listing.add(16, PanelBlok789.getB8R2());
        listB789Listing.add(17, PanelBlok789.getB8R3());
        listB789Listing.add(18, PanelBlok789.getB8R4());
        listB789Listing.add(19, PanelBlok789.getB8R5a());
        listB789Listing.add(20, PanelBlok789.getB8R5b());
        listB789Listing.add(21, PanelBlok789.getB8R6());
        listB789Listing.add(22, PanelBlok789.getB8R7a());
        listB789Listing.add(23, PanelBlok789.getB8R7b());
        listB789Listing.add(24, PanelBlok789.getB8R8());
        listB789Listing.add(25, PanelBlok789.getB8R9());
        
    }

    /**
     * @param PanelBlok789 the PanelBlok789 to set
     */
    public void setPanelBlok789(Blok789 PanelBlok789) {
        this.PanelBlok789 = PanelBlok789;
    }

    public void registerValidasi() {
        PanelBlok789.getB7R1().setValidator(new ValidasiB7R1());
        PanelBlok789.getB7R2().setValidator(new ValidasiB7R2());
        PanelBlok789.getB7R3().setValidator(new ValidasiB7R3());
        PanelBlok789.getB7R4().setValidator(new ValidasiB7R4());
        PanelBlok789.getB7R5().setValidator(new ValidasiB7R5());
        PanelBlok789.getB8R1().setValidator(new ValidasiB8R1());
        PanelBlok789.getB8R2().setValidator(new ValidasiB8R2());
        PanelBlok789.getB8R3().setValidator(new ValidasiB8R3());
        PanelBlok789.getB8R4().setValidator(new ValidasiB8R4());

        PanelBlok789.getB8R5a().setValidator(new ValidasiB8R5a());
        PanelBlok789.getB8R5b().setValidator(new ValidasiB8R5b());
        PanelBlok789.getB8R6().setValidator(new ValidasiB8R6());
        PanelBlok789.getB8R7a().setValidator(new ValidasiB8R7a());
        PanelBlok789.getB8R7b().setValidator(new ValidasiB8R7b());
        PanelBlok789.getB8R8().setValidator(new ValidasiB8R8());
        PanelBlok789.getB8R9().setValidator(new ValidasiB8R9());
        PanelBlok789.getB8R10a().setValidator(new ValidasiB8R10a());
        PanelBlok789.getB8R10b().setValidator(new ValidasiB8R10b());
        PanelBlok789.getB8R10c().setValidator(new ValidasiB8R10c());
        PanelBlok789.getB8R10d().setValidator(new ValidasiB8R10d());
        PanelBlok789.getB8R10e().setValidator(new ValidasiB8R10e());
        PanelBlok789.getB8R10f().setValidator(new ValidasiB8R10f());
        PanelBlok789.getB8R10g().setValidator(new ValidasiB8R10g());
        PanelBlok789.getB8R10h().setValidator(new ValidasiB8R10h());
        PanelBlok789.getB8R10i().setValidator(new ValidasiB8R10i());
        PanelBlok789.getB8R10j().setValidator(new ValidasiB8R10j());
       
    }

    private class ValidasiB7R1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
         if (!PanelBlok789.getB7R1().getText().isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "nama harus diisi !");
                return false;
            }

        }

        
    }

    private class ValidasiB7R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB7R1().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB7R2().getText().matches("[0-9][0-9]")) {
                
                if (ic.convertForward(PanelBlok789.getB7R2().getText())>15){
                
                return true;
            } else  {
                JOptionPane.showMessageDialog(null, "umur harus lebih dari 15 tahun !");
                return false;
            }
            } else  {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

       
    }

    private class ValidasiB7R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB7R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB7R3().getText().matches("[1-1]")) {
                skipTo(listB789Listing, 3, 4);
                field.setTextfield(PanelBlok789.getB7R5());
                return true;
            } else if (PanelBlok789.getB7R3().getText().matches("[2-3]")) {
                EditableTo(listB789Listing, 3, 4);
                field.setTextfield(PanelBlok789.getB7R4());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

      
    }

    private class ValidasiB7R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB7R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB7R4().getText().matches("[1-9]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

      

    }

    private class ValidasiB7R5 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok789.getB7R4().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            // harus kurang dari jumlah di blok 4
            return true;

        }

    }

    private class ValidasiB8R1 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB7R5().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R1().getText().matches("[1-7]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB8R2 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R1().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R2().getText().matches("[1-4]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

       

    }

    private class ValidasiB8R3 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R3().getText().matches("[1-6]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

        

    }

    private class ValidasiB8R4 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
           if (ic.convertForward(PanelBlok789.getB8R4().getText())>0
                   &&ic.convertForward(PanelBlok789.getB8R4().getText())<9999) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "tidak bolah kosong !");
                return false;
            }

        }

     

    }

    private class ValidasiB8R5a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R5a().getText().matches("[0-0][1-4]") ||
                   PanelBlok789.getB8R5a().getText().matches("[1-4]") ) {
                 skipTo(listB789Listing, 20, 21);
                field.setTextfield(PanelBlok789.getB8R6());
                return true;
            } else  if (PanelBlok789.getB8R5a().getText().matches("[0-0][5-9]") ||
                   PanelBlok789.getB8R5a().getText().matches("[5-9]")) {
                EditableTo(listB789Listing, 20, 21);
                field.setTextfield(PanelBlok789.getB8R5b());
                return true;
            } else  if (PanelBlok789.getB8R5a().getText().matches("[1-1][0-2]")) {
                  skipTo(listB789Listing, 20, 21);
                field.setTextfield(PanelBlok789.getB8R6());
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Kode harus dua digit !");
                return false;
            }

        }

      

    }

    private class ValidasiB8R5b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R5a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R5b().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

    private class ValidasiB8R6 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok789.getB8R5b().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (ic.convertForward(PanelBlok789.getB8R6().getText())>0&&
                    ic.convertForward(PanelBlok789.getB8R6().getText())<13){
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

    private class ValidasiB8R7a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R6().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R7a().getText().matches("[4-4]")) {
                skipTo(listB789Listing, 23, 24);
                field.setTextfield(PanelBlok789.getB8R8());
                return true;
            } else  if (PanelBlok789.getB8R7a().getText().matches("[1-3]")) {
                EditableTo(listB789Listing, 23, 24);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

    private class ValidasiB8R7b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R7a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R7b().getText().matches("[1-4]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

       

    }

    private class ValidasiB8R8 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok789.getB8R7b().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok789.getB8R8().getText().matches("[1-6]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

    private class ValidasiB8R9 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R8().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R9().getText().matches("[1-8]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

    private class ValidasiB8R10a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R9().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10a().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

      

    }

    private class ValidasiB8R10b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10b().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

       

    }

    private class ValidasiB8R10c implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10b().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10c().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

        

    }

    private class ValidasiB8R10d implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10c().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10d().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

     

    }

    private class ValidasiB8R10e implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10d().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10e().getText().matches("[1-2]")) {
                
                skipTo(listB789Listing, 11, 12);
                field.setTextfield(PanelBlok789.getB8R10g());
                PanelBlok789.getB8R10f().setText("2");
                JOptionPane.showMessageDialog(null, " Pemberitahuan : semua kuisioner pekarjaan pemanas air nya kode 2 !");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

        
    }

    private class ValidasiB8R10f implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10e().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10f().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB8R10g implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok789.getB8R10f().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok789.getB8R10g().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

      
    }

    private class ValidasiB8R10h implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10g().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10h().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

        

    }

    private class ValidasiB8R10i implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10h().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10i().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

     

    }

    private class ValidasiB8R10j implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok789.getB8R10i().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok789.getB8R10j().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }


    }

}
