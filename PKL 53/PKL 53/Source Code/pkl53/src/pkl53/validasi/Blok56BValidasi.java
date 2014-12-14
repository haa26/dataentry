/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.validasi;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkl53.component.Textfield;
import pkl53.converter.IntegerConverter;
import pkl53.model.Blok4PekerjaBinding;
import pkl53.view.Blok4;
import pkl53.view.Blok56;
import pkl53.view.Blok56B;
import pkl53.view.DataEntriPekerjaanPanel;
import pkl53.view.loop.Loop4A;

/**
 *
 * @author Reza Aprianto
 */
public class Blok56BValidasi extends AbstractValidasi {
    
    private DataEntriPekerjaanPanel dataEntriPekerjaanPanel;
    private IntegerConverter ic = new IntegerConverter();
    private Blok56 panelBlok56;
    private Blok56B PanelBlok56B;
    private List<Textfield> listB56BListing = new ArrayList<Textfield>();
    private List<Blok4PekerjaBinding> dataBlok4= Blok4.getB4PekerjaanBindingList();

    /**
     * @return the PanelBlok56B
     */
    public Blok56B getPanelBlok56B() {
        return PanelBlok56B;
    }
//    public boolean skipB6R16(){
//         for(Blok4PekerjaBinding b4 : dataBlok4){
//              
//                
//            if(PanelBlok56.getB5R1Art().getText().equals(b4.getB4r1())&&b4.getB4r1().matches("[4-7]")){
//              
//               
//            return true;
//            } 
//          
//    }
//        return false;
//    }
    public void setList() {
        listB56BListing.add(0,PanelBlok56B.getB6R11());
        listB56BListing.add(1, PanelBlok56B.getB6R12a());
        listB56BListing.add(2, PanelBlok56B.getB6R12b());
        listB56BListing.add(3, PanelBlok56B.getB6R13());
        listB56BListing.add(4, PanelBlok56B.getB6R14());
        listB56BListing.add(5, PanelBlok56B.getB6R15barang());
        listB56BListing.add(6, PanelBlok56B.getB6R15uang());
        listB56BListing.add(7, PanelBlok56B.getB6R16());
        listB56BListing.add(8, PanelBlok56B.getB6R17());
        listB56BListing.add(9, PanelBlok56B.getB6R17lainnya());
        listB56BListing.add(10, PanelBlok56B.getB6R18());
        listB56BListing.add(11, PanelBlok56B.getB6R19());
        listB56BListing.add(12, PanelBlok56B.getB6R20barang());
        listB56BListing.add(13, PanelBlok56B.getB6R20uang());
        listB56BListing.add(14, PanelBlok56B.getB6R21a());
        listB56BListing.add(15, PanelBlok56B.getB6R21b());
        listB56BListing.add(16, PanelBlok56B.getB6R21c());
        listB56BListing.add(17, PanelBlok56B.getB6R22a());
        listB56BListing.add(18, PanelBlok56B.getB6R22b());
        listB56BListing.add(19, PanelBlok56B.getB6R22bLainnya());
        listB56BListing.add(20, PanelBlok56B.getB6R22bLainnya());

    }

    /**
     * @param PanelBlok56B the PanelBlok56B to set
     */
    public void setPanelBlok56B(Blok56B PanelBlok56B) {
        this.PanelBlok56B = PanelBlok56B;
    }

    public List<Blok4PekerjaBinding> getDataBlok4() {
        List<Blok4PekerjaBinding> listBlok4 = new ArrayList<Blok4PekerjaBinding>();
        Component[] comp = Blok4.getLoopPanel().getComponents();
        for (int i = 0; i < comp.length - 1; i++) {
            Loop4A loop = (Loop4A) comp[i];
            listBlok4.add(loop.getBlok4ABinding());

        }
        return listBlok4;

    }

    public void registerValidasi() {

        PanelBlok56B.getB6R11().setValidator(new ValidasiB6R11());
        PanelBlok56B.getB6R12a().setValidator(new ValidasiB6R12a());
        PanelBlok56B.getB6R12b().setValidator(new ValidasiB6R12b());
        PanelBlok56B.getB6R13().setValidator(new ValidasiB6R13());
        PanelBlok56B.getB6R14().setValidator(new ValidasiB6R14());
        PanelBlok56B.getB6R15barang().setValidator(new ValidasiTrue());
        PanelBlok56B.getB6R15uang().setValidator(new ValidasiTrue());
        PanelBlok56B.getB6R16().setValidator(new ValidasiB6R16());
        PanelBlok56B.getB6R17().setValidator(new ValidasiB6R17());
        PanelBlok56B.getB6R17lainnya().setValidator(new ValidasiB6R17lainnya());
        PanelBlok56B.getB6R18().setValidator(new ValidasiB6R18());
        PanelBlok56B.getB6R19().setValidator(new ValidasiB6R19());
        PanelBlok56B.getB6R20barang().setValidator(new ValidasiB6R20barang());
        PanelBlok56B.getB6R20uang().setValidator(new ValidasiTrue());
        PanelBlok56B.getB6R21a().setValidator(new ValidasiB6R21a());
        PanelBlok56B.getB6R21b().setValidator(new ValidasiB6R21b());
        PanelBlok56B.getB6R21c().setValidator(new ValidasiB6R21c());
        PanelBlok56B.getB6R22a().setValidator(new ValidasiB6R22a());
        PanelBlok56B.getB6R22b().setValidator(new ValidasiB6R22b());
        PanelBlok56B.getB6R22bLainnya().setValidator(new ValidasiB6R22bLainnya());

    }

    /**
     * @return the panelBlok56
     */
    public Blok56 getPanelBlok56() {
        return panelBlok56;
    }

    /**
     * @param panelBlok56 the panelBlok56 to set
     */
    public void setPanelBlok56(Blok56 panelBlok56) {
        this.panelBlok56 = panelBlok56;
    }

    /**
     * @param dataEntriPekerjaanPanel the dataEntriPekerjaanPanel to set
     */
    public void setDataEntriPekerjaanPanel(DataEntriPekerjaanPanel dataEntriPekerjaanPanel) {
        this.dataEntriPekerjaanPanel = dataEntriPekerjaanPanel;
    }

    private class ValidasiTrue implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            return true;

        }

    }

    private class ValidasiB6R11 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56B.getB6R11().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56B.getB6R11().getText().matches("[2-2]")) {
                skipTo(listB56BListing, 1, 3);
                field.setTextfield(PanelBlok56B.getB6R13());
                return true;
            } else if (PanelBlok56B.getB6R11().getText().matches("[1-1]")) {
                EditableTo(listB56BListing, 1, 3);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R12a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            System.out.println("CARD " + ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName()));
            int noArt = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB5r1art());
            int b6r10 = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB6r10());
            System.out.println("NOART " + noArt);
            
            for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
                if (ic.convertForward(b4.getB4r1()).equals(noArt)  ) {
                  if(ic.convertForward(b4.getB4r8()) < 4){
                    skipTo(listB56BListing, 7, 20);
                  }else EditableTo(listB56BListing, 7, 20);
                }
               
              
            }
              for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
               
                if (ic.convertForward(b4.getB4r1()).equals(noArt) ) {
                     if( b6r10 == 2){
                    skipTo(listB56BListing, 0, 3);
                     field.setTextfield(PanelBlok56B.getB6R13());
                    }else if( ic.convertForward(b4.getB4r8()) < 4  || ic.convertForward(b4.getB4r8()) > 6){
                    String simpan  = PanelBlok56B.getB6R12a().getText();
                    EditableTo(listB56BListing, 0, 3); 
                    PanelBlok56B.getB6R12a().setText(simpan);
                    skipTo(listB56BListing, 2, 3);
                    field.setTextfield(PanelBlok56B.getB6R13());
                    }else{
                      String simpan  = PanelBlok56B.getB6R12a().getText();
                     EditableTo(listB56BListing, 0, 3); 
                      PanelBlok56B.getB6R12a().setText(simpan);
                     field.setTextfield(PanelBlok56B.getB6R12b());
                    }
                }
              
            }
            return true;
//            if (PanelBlok56B.getB6R11().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
//             
//            if (PanelBlok56B.getB6R12a().getText().matches("[1-3]")) {
//                System.out.println("masuk12a");
//               
//                List<Blok4PekerjaBinding> dataBlok4 = Blok4.getB4PekerjaanBindingList();
//                for (Blok4PekerjaBinding b4 : dataBlok4) {
//                                    System.out.println(b4.getB4r1());
//                                  
//                                   System.out.println(b4.getB4r8());
//                                    String noArt = panelBlok56.getB5R1Art().getText();
//                                     System.out.println(noArt);
//                    if(ic.convertForward(b4.getB4r1())==ic.convertForward(noArt)){
//                        System.out.println(noArt);
//                    if(b4.getB4r8().matches("[1-3]")){
//                        skipTo(listB56BListing, 2, 3);
//                        field.setTextfield(PanelBlok56B.getB6R13());
//                    }else{
//                       EditableTo(listB56BListing, 2, 3); 
//                       field.setTextfield(PanelBlok56B.getB6R12b());
//                    }
//                }else{
//                    
//                }
//                }
//                
//                
//                
//                
//                
//                
//                return true;
//            } else {
//                JOptionPane.showMessageDialog(null, "Kode salah !");
//                return false;
//            }
//
        }

    }

    private class ValidasiB6R12b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R12a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R12b().getText().matches("[1-2]")) {
                //jika blok 4 kolom 8 berkode 4 5 6
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R13 implements Validator {
   List<Blok4PekerjaBinding> dataBlok4= Blok4.getB4PekerjaanBindingList();
        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56B.getB6R12b().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56B.getB6R13().getText().matches("[2-2]")) {
               System.out.println("CARD " + ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName()));
            int noArt = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB5r1art());
            int b6r10 = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB6r10());
            System.out.println("NOART " + noArt);
            
            for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
                if (ic.convertForward(b4.getB4r1()).equals(noArt)  ) {
                  if(ic.convertForward(b4.getB4r8()) < 4){
                    skipTo(listB56BListing, 7, 20);
                  }else EditableTo(listB56BListing, 7, 20);
                }
               
              
            }
              for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
               
                if (ic.convertForward(b4.getB4r1()).equals(noArt) ) {
                     if( b6r10 == 2){
                    skipTo(listB56BListing, 0, 3);
                     field.setTextfield(PanelBlok56B.getB6R13());
                    }else if( ic.convertForward(b4.getB4r8()) < 4  || ic.convertForward(b4.getB4r8()) > 6){
                    String simpan  = PanelBlok56B.getB6R12a().getText();
                    EditableTo(listB56BListing, 0, 3); 
                    PanelBlok56B.getB6R12a().setText(simpan);
                    skipTo(listB56BListing, 2, 3);
                    field.setTextfield(PanelBlok56B.getB6R13());
                    }else{
                      String simpan  = PanelBlok56B.getB6R12a().getText();
                     EditableTo(listB56BListing, 0, 3); 
                      PanelBlok56B.getB6R12a().setText(simpan);
                     field.setTextfield(PanelBlok56B.getB6R12b());
                    }
                }
              
            }
                skipTo(listB56BListing, 4, 5);
                field.setTextfield(PanelBlok56B.getB6R15uang());
                return true;
            } else if (PanelBlok56B.getB6R13().getText().matches("[1-1]")) {
               System.out.println("CARD " + ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName()));
            int noArt = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB5r1art());
            int b6r10 = ic.convertForward(dataEntriPekerjaanPanel.getB5List().get((ic.convertForward(dataEntriPekerjaanPanel.getCurrentCard().getName())) - 1).getB6r10());
            System.out.println("NOART " + noArt);
            
            for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
                if (ic.convertForward(b4.getB4r1()).equals(noArt)  ) {
                  if(ic.convertForward(b4.getB4r8()) < 4){
                    skipTo(listB56BListing, 7, 20);
                  }else EditableTo(listB56BListing, 7, 20);
                }
               
              
            }
              for (Blok4PekerjaBinding b4 : Blok4.getB4PekerjaanBindingList()) {
                System.out.println("b4" + b4.getB4r1());
               
                if (ic.convertForward(b4.getB4r1()).equals(noArt) ) {
                     if( b6r10 == 2){
                    skipTo(listB56BListing, 0, 3);
                     field.setTextfield(PanelBlok56B.getB6R13());
                    }else if( ic.convertForward(b4.getB4r8()) < 4  || ic.convertForward(b4.getB4r8()) > 6){
                    String simpan  = PanelBlok56B.getB6R12a().getText();
                    EditableTo(listB56BListing, 0, 3); 
                    PanelBlok56B.getB6R12a().setText(simpan);
                    skipTo(listB56BListing, 2, 3);
                    field.setTextfield(PanelBlok56B.getB6R13());
                    }else{
                      String simpan  = PanelBlok56B.getB6R12a().getText();
                     EditableTo(listB56BListing, 0, 3); 
                      PanelBlok56B.getB6R12a().setText(simpan);
                     field.setTextfield(PanelBlok56B.getB6R12b());
                    }
                }
              
            }
                EditableTo(listB56BListing, 4, 5);
                field.setTextfield(PanelBlok56B.getB6R14());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }
            

        }

    }

    private class ValidasiB6R14 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R13().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R14().getText().matches("[1-2]")) {
                  
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }
            
        }

    }

    private class ValidasiB6R16 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//            if (PanelBlok56B.getB6R15uang().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                return false;
//            }
            if (PanelBlok56B.getB6R16().getText().matches("[4-4]")) {
                if (PanelBlok56B.getB6R15uang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15uang().getText())==0
                        && PanelBlok56B.getB6R15barang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15barang().getText())==0) {
                    skipTo(listB56BListing, 8, 11);
                    field.setTextfield(PanelBlok56B.getB6R19());
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Bentuk pembayaran upah harus sesuai dengan Bentuk upah yang di terima di R15  !");
                    return false;
                }
            } else if (PanelBlok56B.getB6R16().getText().matches("[3-3]")) {
                 if (!PanelBlok56B.getB6R15uang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15uang().getText())!=0
                        && !PanelBlok56B.getB6R15barang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15barang().getText())!=0) {
                    EditableTo(listB56BListing, 8, 11);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Bentuk pembayaran upah harus sesuai dengan Bentuk upah yang di terima di R15  !");
                    return false;
                }
            } else if (PanelBlok56B.getB6R16().getText().matches("[2-2]")) {
                  if (PanelBlok56B.getB6R15uang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15uang().getText())==0
                        && !PanelBlok56B.getB6R15barang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15barang().getText())!=0) {
                    EditableTo(listB56BListing, 8, 11);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Bentuk pembayaran upah harus sesuai dengan Bentuk upah yang di terima di R15  !");
                    return false;
                }
            } else if (PanelBlok56B.getB6R16().getText().matches("[1-1]")) {
                  if (!PanelBlok56B.getB6R15uang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15uang().getText())!=0
                        && PanelBlok56B.getB6R15barang().getText().isEmpty()||
                        ic.convertForward(PanelBlok56B.getB6R15barang().getText())==0) {
                    EditableTo(listB56BListing, 8, 11);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Bentuk pembayaran upah harus sesuai dengan Bentuk upah yang di terima di R15  !");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R17 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R16().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R17().getText().matches("[6-6]")) {
               EditableTo(listB56BListing, 9, 10);
               field.setTextfield(PanelBlok56B.getB6R17lainnya());
                return true;
            } else if (PanelBlok56B.getB6R17().getText().matches("[1-5]")) {
                
                 skipTo(listB56BListing, 9, 10);
                 field.setTextfield(PanelBlok56B.getB6R18());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R17lainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R16().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R17().getText().matches("[6-6]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R18 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R16().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R18().getText().matches("[1-3]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R19 implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//                if (PanelBlok56B.getB6R18().getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                    return false;
//                }
            if (PanelBlok56B.getB6R19().getText().matches("[2-2]")) {
                skipTo(listB56BListing, 12, 14);
                field.setTextfield(PanelBlok56B.getB6R21a());
                return true;
            } else if (PanelBlok56B.getB6R19().getText().matches("[1-1]")) {
                EditableTo(listB56BListing, 12, 14);
                 field.setTextfield(PanelBlok56B.getB6R20uang());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }
   
   

    private class ValidasiB6R20barang implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//           
            if (PanelBlok56B.getB6R20uang().getText().isEmpty()&&
                  PanelBlok56B.getB6R20barang().getText().isEmpty()  ) {
                 JOptionPane.showMessageDialog(null, "bonus ngak boleh kosong!");
                return false;
               
            }else {
                return true;
            }

        }

    }

    private class ValidasiB6R21a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
//                if (PanelBlok56B.getB6R20barang().getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "Fill the previous field first!");
//                    return false;
//                }
            if (PanelBlok56B.getB6R21a().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R21b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R21a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R21b().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R21c implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R21b().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R21c().getText().matches("[1-2]")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R22a implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R21c().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R22a().getText().matches("[3-3]")) {
                skipTo(listB56BListing,18, 20);
                field.setTextfield(PanelBlok56B.getB6R22bLainnya());
                //skip to blok 7
                return true;
            } else if (PanelBlok56B.getB6R22a().getText().matches("[1-2]")) {
                EditableTo(listB56BListing,18, 20);
                field.setTextfield(PanelBlok56B.getB6R22b());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R22b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R22a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R22b().getText().matches("[1-1]")) {
                skipTo(listB56BListing, 19, 20);
                 field.setTextfield(PanelBlok56B.getB6R22bLainnya());
                //skip to blok 7
                return true;
            } else if (PanelBlok56B.getB6R22b().getText().matches("[2-2]")) {
               
                   field.setTextfield(PanelBlok56B.getB6R22bLainnya());
                //skip to blok 7
                  EditableTo(listB56BListing, 19, 20); 
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

    private class ValidasiB6R22bLainnya implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok56B.getB6R22a().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if (PanelBlok56B.getB6R22b().getText().matches("[2-2]")) {
                return true;
            } else {
             //   JOptionPane.showMessageDialog(null, "Kode salah !");
                return false;
            }

        }

    }

}
