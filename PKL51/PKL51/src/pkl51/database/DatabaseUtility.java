/*
 * PKL 51 - Subseksi Data Entry
 */
package pkl51.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RN Hindarwan
 */
public class DatabaseUtility {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                DbConfigUtility.read();
                StringBuffer url = new StringBuffer(DbConfigUtility.getJdbcUrl() + DbConfigUtility.getServerName() + ":" + DbConfigUtility.getPort() + "/" + DbConfigUtility.getDatabaseName());
                Class.forName(DbConfigUtility.getDriverName()).newInstance();
                connection = DriverManager.getConnection(url.toString(), DbConfigUtility.getUser(), DbConfigUtility.getPassword());
            } catch (InstantiationException ex) {
                Logger.getLogger(DatabaseUtility.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DatabaseUtility.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Database driver tidak ditemukan", "error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(DatabaseUtility.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }


}
