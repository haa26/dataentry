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
import pkl53.model.Kecamatan;
import pkl53.model.Kelurahan;
import pkl53.model.KetKuesioner;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.model.Kortimpencacah;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.view.Blok4Listing;
import pkl53.view.BlokUsaha123;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author HP G42 (RILLA)
 */
public class B123UsahaValidasi extends AbstractValidasi{
    private BlokUsaha123 panelBlok123;
    private  ArrayList<Loop4Listing> listTextFieldLooop;

    /**
     * @return the PanelBlok123
     */
    public JPanel getPanelBlok123() {
        return panelBlok123;
    }

    /**
     * @param PanelBlok123 the PanelBlok123 to set
     */
    public void setPanelBlok123(BlokUsaha123 PanelBlok123) {
        this.panelBlok123 = PanelBlok123;
    }
    
    public void registerValidasi(){
        panelBlok123.getB1R1().setValidator(new ValidasiB1R1());
        panelBlok123.getB1R2().setValidator(new ValidasiB1R2());
        panelBlok123.getB1R3().setValidator(new ValidasiB1R3());
        panelBlok123.getB1R4().setValidator(new ValidasiB1R4());
        panelBlok123.getB1R5a().setValidator(new ValidasiB1R5a());
        panelBlok123.getB1R6().setValidator(new ValidasiB1R6());
    
    }
    

private class ValidasiB1R1 implements Validator{

    @Override
    public boolean onCheckValue(Textfield field) {
        if(panelBlok123.getB1R1().getText().equals("05")||panelBlok123.getB1R1().getText().equals("10")
             ||panelBlok123.getB1R1().getText().equals("71")){
            listTextFieldLooop=Blok4Listing.getListTextFieldLoop();
            
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"kode kabupaten/kota salah");
            return false;
        }
      
    }

       
    }

private class ValidasiB1R2 implements Validator {
        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        List <Kecamatan> kecamatanList = new ArrayList<Kecamatan>();
        
        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok123.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kecamatanList = submit.getKecamatan(panelBlok123.getB1R1().getText()+panelBlok123.getB1R2().getText());
            if (kecamatanList.size() > 0) {
                for(Kecamatan mhs : kecamatanList){
                panelBlok123.getKecamatanLabel().setText(mhs.getNamaKecamatan().toUpperCase());
                }
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
            if (panelBlok123.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kelurahanList = submit.getKelurahan(panelBlok123.getB1R1().getText()+panelBlok123.getB1R2().getText()
                                                   +panelBlok123.getB1R3().getText());
            if (kelurahanList.size() > 0) {
                 for(Kelurahan mhs : kelurahanList){
                panelBlok123.getKelurahanLabel().setText(mhs.getNamaKelurahan().toUpperCase());
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
            if (panelBlok123.getB1R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            if(panelBlok123.getB1R4().getText().equals("1")||panelBlok123.getB1R4().getText().equals("2")){
           return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"kode Klasifikasi Desa/Kelurahan salah");
            return false;
        }

        }

        
    }

private class ValidasiB1R5a implements Validator {
        SubmitListingController submit = new SubmitListingController();
        List <NoBs> noBsList= new ArrayList<NoBs>();
        
        @Override
        public boolean onCheckValue(Textfield field) {
            if (panelBlok123.getB1R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            noBsList = submit.getBS((panelBlok123.getB1R1().getText()+
                                    panelBlok123.getB1R2().getText()+
                                    panelBlok123.getB1R3().getText()+
                                    panelBlok123.getB1R5a().getText()));
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
        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        List <KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        List <KetRt> rtList = new ArrayList<KetRt>();
        
        
        @Override
        public boolean onCheckValue(Textfield field) {
          rtAnggotaList = submit.getketRtAnggota(panelBlok123.getB1R6().getText(),1,new KetKuesioner(panelBlok123.getB1R1().getText()+
                                   panelBlok123.getB1R2().getText()+
                                   panelBlok123.getB1R3().getText()+
                                   panelBlok123.getB1R5a().getText()));
          rtList = submit.getketRt(new KetKuesioner(panelBlok123.getB1R1().getText()+
                                   panelBlok123.getB1R2().getText()+
                                   panelBlok123.getB1R3().getText()+
                                   panelBlok123.getB1R5a().getText()),panelBlok123.getB1R6().getText());
          
          if(rtAnggotaList.size()>0){
              for(KetRtanggota rt : rtAnggotaList){
              panelBlok123.getNamaKrtLabel().setText(rt.getB4r8());
              }
              for(KetRt rt : rtList){
              panelBlok123.getAlamatLabel().setText(rt.getB4r2());
                      }
          return true;
          }
          else{
              JOptionPane.showMessageDialog(null,"Kode No RT salah!");
              return false;
          }
        }

        
    }



}
