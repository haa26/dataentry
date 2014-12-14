/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import java.awt.Color;
import java.awt.Component;
import pkl53.view.BlokUsaha123;
import pkl53.view.BlokUsaha4;
import pkl53.view.BlokUsaha5;
import pkl53.view.BlokUsaha5B;
import pkl53.view.BlokUsaha5C;
import pkl53.view.BlokUsaha5D;
import pkl53.view.DataEntriUsahaPanel;

/**
 *
 * @author akhul
 */
public class KuesionerControllerUsaha {

    private DataEntriUsahaPanel dataEntriUsahaPanel;
    private BlokUsaha123 blok123Usaha;
    private BlokUsaha4 blokUsaha4;
    private BlokUsaha5B blokUsaha5B;
    private BlokUsaha5C blokUsaha5C;
    private BlokUsaha5 blokUsaha5;
    private BlokUsaha5D blokUsaha5D;
    private int jumlahPekerja;

    public void resetAll() {
        System.out.println("resetAll");
        int i = DataEntriUsahaPanel.getContainerPanel().getComponentCount();
        for(int j=i-1; j>=6;j-- ){
            DataEntriUsahaPanel.getContainerPanel().remove(j);
        }
        dataEntriUsahaPanel.getB3RinciusahaTambahanListA().clear();
        dataEntriUsahaPanel.getB3RinciusahaTambahanListB().clear();
        dataEntriUsahaPanel.getB3RinciusahaTambahanListC().clear();
        dataEntriUsahaPanel.getB3RinciusahaTambahanListD().clear();
        dataEntriUsahaPanel.setLoop(1);
        resetBlokUsaha123();
        resetBlokUsaha4();
        resetBlok5();   
    }

    public void resetBlok5() {
        resetBlokUsaha5();
        resetBlokUsaha5b();
        resetB5R15();
        resetBlokUsaha5c();
        resetBlokUsaha5d();
    }

    private void resetBlokUsaha123() {
        for (int i = 0; i < getBlok123Usaha().getListTextFieldBlok123Usaha().size(); i++) {
            getBlok123Usaha().getListTextFieldBlok123Usaha().get(i).setText("");
        }
        for (int i = 0; i < blok123Usaha.getListLabelBlok123().size(); i++) {
            blok123Usaha.getListLabelBlok123().get(i).setText("");
            blok123Usaha.getListLabelBlok123().get(i).setBackground(Color.white);
            //blok123.getListTextFieldBlok123().get(i).setContain(false);
        }
    }

    private void resetBlokUsaha4() {
        getBlokUsaha4().clearBlok4();
    }

    private void resetBlokUsaha5() {
        for (int i = 0; i < getBlokUsaha5().getListTextFieldBlokUsaha5().size(); i++) {
            getBlokUsaha5().getListTextFieldBlokUsaha5().get(i).setText("");
        }
    }

    private void resetBlokUsaha5b() {
        for (int i = 0; i < getBlokUsaha5B().getListTextFieldBlokUsaha5b().size(); i++) {
            getBlokUsaha5B().getListTextFieldBlokUsaha5b().get(i).setText("");
        }
    }

    private void resetB5R15() {
        getBlokUsaha5B().getLoopPanel().removeAll();
        getBlokUsaha5B().getListModelB3R15().clear();
    }

    private void resetBlokUsaha5c() {
        for (int i = 0; i < getBlokUsaha5C().getListTextFieldBlokUsaha5c().size(); i++) {
            getBlokUsaha5C().getListTextFieldBlokUsaha5c().get(i).setText("");
        }
    }

    private void resetBlokUsaha5d() {
        for (int i = 0; i < getBlokUsaha5D().getListTextFieldBlokUsaha5d().size(); i++) {
            getBlokUsaha5D().getListTextFieldBlokUsaha5d().get(i).setText("");
        }
    }

    /**
     * @return the blok123Usaha
     */
    public BlokUsaha123 getBlok123Usaha() {
        return blok123Usaha;
    }

    /**
     * @param blok123Usaha the blok123Usaha to set
     */
    public void setBlok123Usaha(BlokUsaha123 blok123Usaha) {
        this.blok123Usaha = blok123Usaha;
    }

    /**
     * @return the blokUsaha4
     */
    public BlokUsaha4 getBlokUsaha4() {
        return blokUsaha4;
    }

    /**
     * @param blokUsaha4 the blokUsaha4 to set
     */
    public void setBlokUsaha4(BlokUsaha4 blokUsaha4) {
        this.blokUsaha4 = blokUsaha4;
    }

    /**
     * @return the blokUsaha5B
     */
    public BlokUsaha5B getBlokUsaha5B() {
        return blokUsaha5B;
    }

    /**
     * @param blokUsaha5B the blokUsaha5B to set
     */
    public void setBlokUsaha5B(BlokUsaha5B blokUsaha5B) {
        this.blokUsaha5B = blokUsaha5B;
    }

    /**
     * @return the blokUsaha5C
     */
    public BlokUsaha5C getBlokUsaha5C() {
        return blokUsaha5C;
    }

    /**
     * @param blokUsaha5C the blokUsaha5C to set
     */
    public void setBlokUsaha5C(BlokUsaha5C blokUsaha5C) {
        this.blokUsaha5C = blokUsaha5C;
    }

    /**
     * @return the blokUsaha5
     */
    public BlokUsaha5 getBlokUsaha5() {
        return blokUsaha5;
    }

    /**
     * @param blokUsaha5 the blokUsaha5 to set
     */
    public void setBlokUsaha5(BlokUsaha5 blokUsaha5) {
        this.blokUsaha5 = blokUsaha5;
    }

    /**
     * @return the blokUsaha5D
     */
    public BlokUsaha5D getBlokUsaha5D() {
        return blokUsaha5D;
    }

    /**
     * @param blokUsaha5D the blokUsaha5D to set
     */
    public void setBlokUsaha5D(BlokUsaha5D blokUsaha5D) {
        this.blokUsaha5D = blokUsaha5D;
    }

    /**
     * @return the dataEntriUsahaPanel
     */
    public DataEntriUsahaPanel getDataEntriUsahaPanel() {
        return dataEntriUsahaPanel;
    }

    /**
     * @param dataEntriUsahaPanel the dataEntriUsahaPanel to set
     */
    public void setDataEntriUsahaPanel(DataEntriUsahaPanel dataEntriUsahaPanel) {
        this.dataEntriUsahaPanel = dataEntriUsahaPanel;
    }

}
