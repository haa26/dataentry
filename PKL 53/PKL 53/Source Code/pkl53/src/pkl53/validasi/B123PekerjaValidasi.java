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
import pkl53.model.KetKuesioner;
import pkl53.model.KetRt;
import pkl53.model.KetRtanggota;
import pkl53.model.Kortimpencacah;
import pkl53.model.Mahasiswa;
import pkl53.model.NoBs;
import pkl53.view.Blok123;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4;
import pkl53.view.Blok4Listing;
import pkl53.view.Blok789;
import pkl53.view.BlokUsaha123;
import pkl53.view.loop.Loop4Listing;

/**
 *
 * @author HP G42 (RILLA)
 */
public class B123PekerjaValidasi extends AbstractValidasi{
    private Blok123 PanelBlok123;
    private  ArrayList<Loop4Listing> listTextFieldLooop;

    /**
     * @return the PanelBlok123
     */
    public JPanel getPanelBlok123() {
        return PanelBlok123;
    }

    /**
     * @param PanelBlok123 the PanelBlok123 to set
     */
    public void setPanelBlok123(Blok123 PanelBlok123) {
        this.PanelBlok123 = PanelBlok123;
    }
    
    public void registerValidasi(){
        PanelBlok123.getB1R1().setValidator(new ValidasiB1R1());
        PanelBlok123.getB1R2().setValidator(new ValidasiB1R2());
        PanelBlok123.getB1R3().setValidator(new ValidasiB1R3());
        PanelBlok123.getB1R4().setValidator(new ValidasiB1R4());
        PanelBlok123.getB1R5a().setValidator(new ValidasiB1R5a());
        PanelBlok123.getB1R5b().setValidator(new ValidasiB1R5b());
        PanelBlok123.getB1R6().setValidator(new ValidasiB1R6());
        PanelBlok123.getB2R1().setValidator(new ValidasiB2R1()) ;
        PanelBlok123.getB2R2().setValidator(new ValidasiB2R2());
        PanelBlok123.getB2R3().setValidator(new ValidasiB2R3());
        PanelBlok123.getB3C1R2().setValidator(new ValidasiB3NimPencacahan());
        PanelBlok123.getB3C1R3a().setValidator(new ValidasiTanggal());
        PanelBlok123.getB3C2R3a().setValidator(new ValidasiTanggal());
    
    }

    public void setPanelBlok789(Blok789 panelBlok789) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private class ValidasiB2R1 implements Validator{

    @Override
    public boolean onCheckValue(Textfield field) {
//       field.setTextfield(PanelBlok123.getB2R2());
        return true;
    }}
     private class ValidasiB2R2 implements Validator{

    @Override
    public boolean onCheckValue(Textfield field) {
//       field.setTextfield(PanelBlok123.getB2R3());
        return true;
    }}
     private class ValidasiB2R3 implements Validator{

    @Override
    public boolean onCheckValue(Textfield field) {
//      field.setTextfield(PanelBlok123.getB3C1R2());
        return true;
    }

       
    } 

private class ValidasiB1R1 implements Validator{

    @Override
    public boolean onCheckValue(Textfield field) {
        if(PanelBlok123.getB1R1().getText().equals("05")||PanelBlok123.getB1R1().getText().equals("10")
             ||PanelBlok123.getB1R1().getText().equals("71")){
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
            if (PanelBlok123.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kecamatanList = submit.getKecamatan(PanelBlok123.getB1R1().getText()+PanelBlok123.getB1R2().getText());
            if (kecamatanList.size() > 0) {
                for(Kecamatan mhs : kecamatanList){
                Blok123.setKecamatanLabel(mhs.getNamaKecamatan().toUpperCase());
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
            if (PanelBlok123.getB1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            kelurahanList = submit.getKelurahan(PanelBlok123.getB1R1().getText()+PanelBlok123.getB1R2().getText()
                                                   +PanelBlok123.getB1R3().getText());
            if (kelurahanList.size() > 0) {
                 for(Kelurahan mhs : kelurahanList){
                Blok123.setKelurahanLabel(mhs.getNamaKelurahan().toUpperCase());
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
            if (PanelBlok123.getB1R3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            if(PanelBlok123.getB1R4().getText().equals("1")||PanelBlok123.getB1R4().getText().equals("2")){
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
            if (PanelBlok123.getB1R4().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill the previous field first!");
                return false;
            }
            noBsList = submit.getBS((PanelBlok123.getB1R1().getText()+
                                    PanelBlok123.getB1R2().getText()+
                                    PanelBlok123.getB1R3().getText()+
                                    PanelBlok123.getB1R5a().getText()));
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

private class ValidasiB1R5b implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123.getB1R5b().getText().matches("[Ss][0-9][0-9][0-9]")) {
                //EditableTo(listB4Listing, 2, 2);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Penulisan Nomor Segmen Salah");
                //EditableTo(listB4Listing, 1, 1);
                //skipTo(listB4Listing, 1, 23);
                return false;
            }
        }

    }

private class ValidasiB1R6 implements Validator {
        SubmitControllerPekerjaan submit = new SubmitControllerPekerjaan();
        private List <KetRtanggota> rtAnggotaList = new ArrayList<KetRtanggota>();
        List <KetRt> rtList = new ArrayList<KetRt>();
        
        
        @Override
        public boolean onCheckValue(Textfield field) {
          rtAnggotaList = submit.getketRtAnggota(PanelBlok123.getB1R6().getText(),1,new KetKuesioner(PanelBlok123.getB1R1().getText()+
                                   PanelBlok123.getB1R2().getText()+
                                   PanelBlok123.getB1R3().getText()+
                                   PanelBlok123.getB1R5a().getText()));
          rtList = submit.getketRt(new KetKuesioner(PanelBlok123.getB1R1().getText()+
                                   PanelBlok123.getB1R2().getText()+
                                   PanelBlok123.getB1R3().getText()+
                                   PanelBlok123.getB1R5a().getText()),PanelBlok123.getB1R6().getText());
          if(getRtAnggotaList().size()>0){
              for(KetRtanggota rt : getRtAnggotaList()){
              Blok123.getNamaKrtLabel().setText(rt.getB4r8());
              }
              for(KetRt rt : rtList){
              Blok123.getAlamatLabel().setText(rt.getB4r2());
                      }
          return true;
          }
          else{
              return false;
          }
        }

        /**
         * @return the rtAnggotaList
         */
        public List <KetRtanggota> getRtAnggotaList() {
            return rtAnggotaList;
        }

        
    }

private class ValidasiB3NimPencacahan implements Validator {

        SubmitListingController submit = new SubmitListingController();
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        List<Kortimpencacah> kortimpencacahList = new ArrayList<Kortimpencacah>();
        String nimKortim;

        @Override
        public boolean onCheckValue(Textfield field) {
            if (PanelBlok123.getB1R6().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isikan Field Sebelumnya");
                return false;
            }

            kortimpencacahList = submit.getKortimPencacah(PanelBlok123.getB3C1R2().getText());
            if (kortimpencacahList.size() > 0) {

                mahasiswaList = submit.getMahasiswa(PanelBlok123.getB3C1R2().getText());

                for (Mahasiswa mhs : mahasiswaList) {
                    Blok123.getNamaPenacacahLabel().setText(mhs.getNama().toUpperCase());
                }
                for (Kortimpencacah mhs : kortimpencacahList) {
                    List<Mahasiswa> mahasiswaList1 = new ArrayList<Mahasiswa>();
                    mahasiswaList1 = submit.getMahasiswa(mhs.getNimKortim().getNim());
                    for (Mahasiswa mhsw : mahasiswaList1) {
                        Blok123.getNamaKortimLabel().setText(mhsw.getNama().toUpperCase());
                        Blok123.getNimKortimLabel().setText(mhsw.getNim().toUpperCase());
                    }

                }

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Kode NIM Salah");
                return false;
            }
        }

        public void setNimKortim(String s) {
            nimKortim = s;
        }

    }

    private class ValidasiTanggal implements Validator {

        @Override
        public boolean onCheckValue(Textfield field) {
            IntegerConverter intconvert = new IntegerConverter();

            int a = intconvert.convertForward(PanelBlok123.getB3C1R3a().getText());
            int b = intconvert.convertForward(PanelBlok123.getB3C2R3a().getText());
            if (PanelBlok123.getB3C1R2().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the previous field first!");
                return false;
            }
            if ((a <= 30 && a > 0)) {

                return true;
            }
            if ((b <= 30 && b > 0)) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tanggal harus antara 1 - 31");
                return false;
            }
           

        }

    }


}
