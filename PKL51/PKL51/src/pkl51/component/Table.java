/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.component;

import java.awt.Color;
import javax.swing.JTable;
import usu.widget.util.WidgetUtilities;
/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class Table extends JTable {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public Table() {
        super();
        setForeground(Color.WHITE);
        setSelectionBackground(Color.BLUE.brighter());
        setSelectionForeground(Color.BLACK);
        setFillsViewportHeight(true);
        setOpaque(false);
        WidgetUtilities.setAutomaticPopUpMenu(this);
        setAutoCreateRowSorter(true);
        getTableHeader().setReorderingAllowed(false);
    }
}
