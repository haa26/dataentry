/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.controller;

import pkl53.view.Blok123;
import pkl53.view.Blok123Listing;
import pkl53.view.Blok4;
import pkl53.view.Blok4B;
import pkl53.view.Blok56;
import pkl53.view.Blok56B;
import pkl53.view.Blok789;

/**
 *
 * @author akhul
 */
public class KuesionerControllerListing {
    private Blok123Listing blok123;
    private Blok4 blok4;
    private Blok4B blok4b;
    private Blok56 blok56;
    private Blok56B blok67;
    private Blok789 blok89;

    public void resetBlok123(){
        for (int i = 0; i < blok123.getListTextFieldBlok123().size(); i++) {
            blok123.getListTextFieldBlok123().get(i).setText("");
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
        }
        //blok123.updateUI();
//        blok123.getB1R6().setText("");
//        blok123.getLabelKecamatan().setText("");
//        blok123.getLabelKelurahan().setText("");
//        blok123.getFormScroller1().scrollUp();
//        BalloonTipsUtility.closeBallon();
    }
    public void resetBlok4(){
//        for (int i = 0; i < blok4.getListTextFieldBlok123().size(); i++) {
//            blok4.getListTextFieldBlok123().get(i).setText("");
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
//        }
//        blok123.getB1R6().setText("");
//        blok123.getLabelKecamatan().setText("");
//        blok123.getLabelKelurahan().setText("");
//        blok123.getFormScroller1().scrollUp();
//        BalloonTipsUtility.closeBallon();
    }
    public void resetBlok56(){
        for (int i = 0; i < blok56.getListTextFieldBlok56().size(); i++) {
            blok56.getListTextFieldBlok56().get(i).setText("");
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
        }
//        blok123.getB1R6().setText("");
//        blok123.getLabelKecamatan().setText("");
//        blok123.getLabelKelurahan().setText("");
//        blok123.getFormScroller1().scrollUp();
//        BalloonTipsUtility.closeBallon();
    }
    public void resetBlok67(){
        for (int i = 0; i < blok67.getListTextFieldBlok56B().size(); i++) {
            blok67.getListTextFieldBlok56B().get(i).setText("");
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
        }}
    public void resetBlok89(){
        
//        blok123.getB1R6().setText("");
//        blok123.getLabelKecamatan().setText("");
//        blok123.getLabelKelurahan().setText("");
//        blok123.getFormScroller1().scrollUp();
//        BalloonTipsUtility.closeBallon();
    }
    
    public void resetAll() {
        System.out.println("resetAll");
            resetBlok123();
            resetBlok4();
            resetBlok56();
            resetBlok67();
            resetBlok89();
//            PanelUtility.getPanelEntry().getjProgressBar1().setValue(0);
//            PanelUtility.getPanelEntry().getCardController().show("panelBlok12");
//            PanelUtility.getPanelBlok12().getB1R1().requestFocusInWindow();
    }
    
    /**
     * @param blok123 the blok123 to set
     */
    public void setBlok123Listing(Blok123Listing blok123) {
        this.blok123 = blok123;
    }

    /**
     * @param blok4 the blok4 to set
     */
    public void setBlok4(Blok4 blok4) {
        this.blok4 = blok4;
    }

    /**
     * @param blok56 the blok56 to set
     */
    public void setBlok56(Blok56 blok56) {
        this.blok56 = blok56;
    }
    /**
     * @param blok67 the blok56 to set
     */
    public void setBlok67(Blok56B blok67) {
        this.blok67 = blok67;
    }

    /**
     * @param blok89 the blok78 to set
     */
    public void setBlok89(Blok789 blok89) {
        this.blok89 = blok89;
    }
    
    
    
}
