/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.imageClass;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BlokPekerja123 extends JPanel{
     private Image image;
    
    public BlokPekerja123() {
        image = new ImageIcon(getClass().getResource("/pkl53/image/P1.png")).getImage();
    }

        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D gd = (Graphics2D) g.create();
        
        gd.drawImage(image, 0, 0,null);
        
        gd.dispose();
    }
    
}
