/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.validasi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pkl53.component.Textfield;
import pkl53.controller.SubmitControllerPekerjaan;
import pkl53.controller.SubmitListingController;
import pkl53.converter.IntegerConverter;
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.Kortimpencacah;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.view.Blok123;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4;
import pkl53.view.Blok4Listing;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author HP G42 (RILLA)
 */
public class B123ListingValidasi extends AbstractValidasi{
    private Blok123Listing PanelBlok123Listing;
    private  ArrayList<Loop4Listing> listTextFieldLooop;

    /**
     * @return the PanelBlok123
     */
    public JPanel getPanelBlok123Listing() {
        return PanelBlok123Listing;
    }

    /**
     * @param PanelBlok123 the PanelBlok123 to set
     */
    public void setBlok123Listing(Blok123Listing PanelBlok123) {
        this.PanelBlok123Listing = PanelBlok123;
    }
    
    public void registerValidasi(){
        PanelBlok123Listing.getB1R1().setValidator(new ValidasiB1R1());
        PanelBlok123Listing.getB1R2().setValidator(new ValidasiB1R2());
        PanelBlok123Listing.getB1R3().setValidator(new ValidasiB1R3());
        PanelBlok123Listing.getB1R4().setValidator(new ValidasiB1R4());
        PanelBlok123Listing.getB1R5().setValidator(new ValidasiB1R5());
        PanelBlok123Listing.getB1R6().setValidator(new ValidasiB1R5());
        PanelBlok123Listing.getB3nimPencacah().setValidator(new ValidasiB3NimPencacahan());
        PanelBlok123Listing.getB3tglPencacah().setValidator(new ValidasiB3Tanggal());
        PanelBlok123Listing.getB3tglKortim().setValidator(new ValidasiB3Tanggal());
    
    }
    

private class ValidasiB1R1 implements Validator{
    @Override
    public boolean onCheckValue(Textfield field) {
       
        if(PanelBlok123Listing.getB1R1().getText().equals("05")||PanelBlok123Listing.getB1R1().getText().equals("10")
             ||PanelBlok123Listing.getB1R1().getText().equals("71")){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"kode Kabupaten/Kota salah");
            return false;
        }
      
    }

      
    }

private class ValidasiB1R2 implements Validator {
        SubmitListingController submit = new SubmitListingController();
        List <Kecamatan> kecamatanList = new ArrayList<Kecamatan>();
        
        @Override
        public boolean onCheckValue(Textfield field) {
            
            if (PanelBlok123Listing.getB1R1().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kecamatanList = submit.getKecamatan(PanelBlok123Listing.getB1R1().getText()+PanelBlok123Listing.getB1R2().getText());
            if (kecamatanList.size() > 0) {
                for(Kecamatan mhs : kecamatanList){
                Blok123Listing.setKecamatanLabel(mhs.getNamaKecamatan().toUpperCase());
                }
                
                //BalloonTipsUtility.closeBallon();
                //panelBlok12.getLabelKecamatan().setText(listKecamatan.get(0).getNamaKecamatan());
                return true;
            } else {
//                BalloonTipsUtility.closeBallon();
               JOptionPane.showMessageDialog(null,"Kode Kecamatan salah!");
//                panelBlok12.getLabelKecamatan().setText("");
                return false;
            }

        }

       
    }

private class ValidasiB1R3 implements Validator {
        SubmitListingController submit = new SubmitListingController();
        List <Kelurahan> kelurahanList= new ArrayList<Kelurahan>();
        
        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123Listing.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kelurahanList = submit.getKelurahan(PanelBlok123Listing.getB1R1().getText()+PanelBlok123Listing.getB1R2().getText()
                                                   +PanelBlok123Listing.getB1R3().getText());
            if (kelurahanList.size() > 0) {
                 for(Kelurahan mhs : kelurahanList){
                Blok123Listing.setKelurahanLabel(mhs.getNamaKelurahan().toUpperCase());
                }
                //BalloonTipsUtility.closeBallon();
                //panelBlok12.getLabelKecamatan().setText(listKecamatan.get(0).getNamaKecamatan());
                return true;
            } else {
//                BalloonTipsUtility.closeBallon();
               JOptionPane.showMessageDialog(null,"Kode Kelurahan salah!");
//                panelBlok12.getLabelKecamatan().setText("");
                return false;
            }

        }

        
    }
private class ValidasiB1R4 implements Validator {
        
        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123Listing.getB1R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            if(PanelBlok123Listing.getB1R4().getText().equals("1")||PanelBlok123Listing.getB1R4().getText().equals("2")){
           return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"kode Klasifikasi Desa/Kelurahan salah");
            return false;
        }

        }

        
    }
private class ValidasiB1R5 implements Validator {
        SubmitListingController submit = new SubmitListingController();
        List <NoBs> noBsList= new ArrayList<NoBs>();
        
        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123Listing.getB1R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
//            noBsList = submit.getBS(PanelBlok123Listing.getB1R1().getText()+
//                                    PanelBlok123Listing.getB1R2().getText()+
//                                    PanelBlok123Listing.getB1R3().getText()+
//                                    PanelBlok123Listing.getB1R5().getText());
//            
            if (noBsList.size() > 0) {
                //BalloonTipsUtility.closeBallon();
                //panelBlok12.getLabelKecamatan().setText(listKecamatan.get(0).getNamaKecamatan());
                return true;
            } else {
//                BalloonTipsUtility.closeBallon();
               JOptionPane.showMessageDialog(null,"Kode Blok Sensus salah!");
//                panelBlok12.getLabelKecamatan().setText("");
                return false;
            }

        }

        
    }
private class ValidasiB1R6 implements Validator {
        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123Listing.getB1R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            else{
            return true;
            }
        }

        
    }
private class ValidasiB3NimPencacahan implements Validator {
        
        
        SubmitListingController submit = new SubmitListingController();
        List <Mahasiswa> mahasiswaList= new ArrayList<Mahasiswa>();
        List <Kortimpencacah> kortimpencacahList= new ArrayList<Kortimpencacah>();
        String nimKortim ;
        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123Listing.getB1R6().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            
            kortimpencacahList = submit.getKortimPencacah(PanelBlok123Listing.getB3nimPencacah().getText());
            if (kortimpencacahList.size() > 0) {
                
                
                mahasiswaList = submit.getMahasiswa(PanelBlok123Listing.getB3nimPencacah().getText());
                
                for(Mahasiswa mhs : mahasiswaList){
                Blok123Listing.setNamaPencacahLabel(mhs.getNama().toUpperCase());
                }
                for(Kortimpencacah mhs : kortimpencacahList){
                    List <Mahasiswa> mahasiswaList1= new ArrayList<Mahasiswa>();
                    mahasiswaList1 = submit.getMahasiswa(mhs.getNimKortim().getNim());
                    for(Mahasiswa mhsw : mahasiswaList1){
                    Blok123Listing.setNamaKortimLabel(mhsw.getNama().toUpperCase());
                    Blok123Listing.setNimKortimLabel(mhsw.getNim().toUpperCase());}
                
                }
               
                 return true; 
            }
                //BalloonTipsUtility.closeBallon();
                //panelBlok12.getLabelKecamatan().setText(listKecamatan.get(0).getNamaKecamatan());
              
            
            else{
            JOptionPane.showMessageDialog(null,"Kode nim Salah");
            return false;
            }
        }
        public void setNimKortim(String s){
            nimKortim=s;
        }

        
    }
private class ValidasiB3Tanggal implements Validator {
        @Override
        public boolean onCheckValue(Textfield field) {
            IntegerConverter intconvert = new IntegerConverter();
            int a= intconvert.convertForward(PanelBlok123Listing.getB3tglPencacah().getText());
            int b= intconvert.convertForward(PanelBlok123Listing.getB3tglKortim().getText());
            if (PanelBlok123Listing.getB3nimPencacah().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;}
            if((a<=30&&a>0)){
                
                return true;
            }
            if((b<=30&&b>0)){
              
                return true;
            }
            
            else{
            JOptionPane.showMessageDialog(null,"Tanggal harus antara 1 - 31");
            return false;
            }
        
    }

        
    }
}
