/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ideologis
 */
public class Background extends JPanel{
     private Image image;
    
    public Background() {
        image = new ImageIcon(getClass().getResource("/pkl53/image/registrasiawal.png")).getImage();
        //smage = new ImageIcon(getClass().getResource("/pkl53/image/backgroundLogin.png")).getImage();
    }

     @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D gd = (Graphics2D) g.create();
        
        gd.drawImage(image, 0, 0,null);
        
        gd.dispose();
    }
}
