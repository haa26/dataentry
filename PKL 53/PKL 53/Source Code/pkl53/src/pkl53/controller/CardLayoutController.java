/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author debi
 * Kelas yang dibuat untuk mempermudah perpindahan dari card layout
 * jika ingin ke card selanjutnya pakai method next()
 * prev(): ke card sebelumnya
 * ke card tertentu show("namaCard")
 */
public class CardLayoutController {
    
    private CardLayout cardLayout;
    private JPanel parentCard;

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getParentCard() {
        return parentCard;
    }

    public void setParentCard(JPanel parentCard) {
        this.parentCard = parentCard;
    }
    
    public void next() {
        cardLayout.next(parentCard);
    }
    
    public void previous() {
        cardLayout.previous(parentCard);
    }
    
    public void show(String cardName) {
        cardLayout.show(parentCard, cardName);
    }
    
}
