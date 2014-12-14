/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl51.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl51.database.DatabaseUtility;

/**
 *
 * @author Hindarwan
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DatabaseUtility.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
