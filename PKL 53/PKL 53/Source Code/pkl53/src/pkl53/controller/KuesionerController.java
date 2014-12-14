/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.controller;

import java.awt.Color;
import pkl53.view.Blok123;
import pkl53.view.Blok4;
import pkl53.view.Blok4B;
import pkl53.view.Blok56;
import pkl53.view.Blok56B;
import pkl53.view.Blok789;
import pkl53.view.DataEntriPekerjaanPanel;

/**
 *
 * @author akhul
 */
public class KuesionerController {
    private Blok123 blok123;
    private Blok4 blok4;
    private Blok4B blok4b;
    private Blok56 blok56;
    private Blok56B blok56B;
    private Blok789 blok789;
        private DataEntriPekerjaanPanel dataEntriPekerjaanPanel;

    public void resetBlok123(){
        for (int i = 0; i < blok123.getListTextFieldBlok123().size(); i++) {
            blok123.getListTextFieldBlok123().get(i).setText("");
            blok123.getListTextFieldBlok123().get(i).setBackground(Color.white);
            
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
        }
        for (int i = 0; i < blok123.getListLabelBlok123().size(); i++) {
            blok123.getListLabelBlok123().get(i).setText("");
            blok123.getListLabelBlok123().get(i).setBackground(Color.white);
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
        getBlok4().clearBlok4();
    }
    public void resetBlok4B(){
        getBlok4b().clearBlok4B();
    }
    public void resetBlok56(){
        for (int i = 0; i < getBlok56().getListTextFieldBlok56().size(); i++) {
            getBlok56().getListTextFieldBlok56().get(i).setText("");
        }
    }
    public void resetBlok56B(){
        for (int i = 0; i < getBlok56B().getListTextFieldBlok56B().size(); i++) {
            getBlok56B().getListTextFieldBlok56B().get(i).setText("");
        }
    }
    public void resetBlok789(){
        for (int i = 0; i < getBlok789().getListTextFieldBlok789().size(); i++) {
            getBlok789().getListTextFieldBlok789().get(i).setText("");
        }
    }
    
    public void resetAll() {
        System.out.println("resetAll");
        int i = DataEntriPekerjaanPanel.getContainerPanel().getComponentCount();
        System.out.println(i);
        for(int j=i-1; j>=5;j-- ){
            DataEntriPekerjaanPanel.getContainerPanel().remove(j);
        }
        dataEntriPekerjaanPanel.getB5List().clear();
        dataEntriPekerjaanPanel.getB6List().clear();
        dataEntriPekerjaanPanel.setLoop(1);
            resetBlok123();
            resetBlok4();
            resetBlok4B();
            resetBlok56();
            resetBlok56B();
            
            
    }
    
    /**
     * @param blok123 the blok123 to set
     */
    public void setBlok123(Blok123 blok123) {
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
     * @return the blok123
     */
    public Blok123 getBlok123() {
        return blok123;
    }

    /**
     * @return the blok4
     */
    public Blok4 getBlok4() {
        return blok4;
    }

    /**
     * @return the blok4b
     */
    public Blok4B getBlok4b() {
        return blok4b;
    }

    /**
     * @param blok4b the blok4b to set
     */
    public void setBlok4b(Blok4B blok4b) {
        this.blok4b = blok4b;
    }

    /**
     * @return the blok56
     */
    public Blok56 getBlok56() {
        return blok56;
    }

    /**
     * @return the blok56B
     */
    public Blok56B getBlok56B() {
        return blok56B;
    }

    /**
     * @param blok56B the blok56B to set
     */
    public void setBlok56B(Blok56B blok56B) {
        this.blok56B = blok56B;
    }

    /**
     * @return the blok789
     */
    public Blok789 getBlok789() {
        return blok789;
    }

    /**
     * @param blok789 the blok789 to set
     */
    public void setBlok789(Blok789 blok789) {
        this.blok789 = blok789;
    }

    public void setDataEntriUsahaPanel( DataEntriPekerjaanPanel d) {
        this.dataEntriPekerjaanPanel = d;
    }
    
    
    
}
