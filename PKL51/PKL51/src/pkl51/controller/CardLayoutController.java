/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.controller;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * Control untuk pindah-pindah card
 * jika ingin ke card selanjutnya tinggal panggil next()
 * ke card sebelumnya prev()
 * ke card tertentu show("namaCard")
 * @author Hindarwan
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
