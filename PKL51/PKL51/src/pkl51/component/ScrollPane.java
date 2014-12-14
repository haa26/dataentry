/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.component;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import usu.widget.glass.ViewPortGlass;
/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class ScrollPane extends JScrollPane {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public ScrollPane() {
        super();
        setViewport(new ViewPortGlass());
        setOpaque(false);
        setBorder(new LineBorder(Color.black));
    }
}