/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class yang digunakan untuk membaca/menulis file konfigurasi database
 * @author erenha
 */
public class DbConfigUtility {

    private static String driverName;
    private static String jdbcUrl;
    private static String user;
    private static String password;
    private static String serverName;
    private static int port;
    private static String databaseName;

    public static String getJdbcUrl() {
        return jdbcUrl;
    }

    public static void setJdbcUrl(String jdbcUrl) {
        DbConfigUtility.jdbcUrl = jdbcUrl;
    }

    public static String getDriverName() {
        return driverName;
    }

    public static void setDriverName(String driverName) {
        DbConfigUtility.driverName = driverName;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        DbConfigUtility.databaseName = databaseName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DbConfigUtility.password = password;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        DbConfigUtility.port = port;
    }

    public static String getServerName() {
        return serverName;
    }

    public static void setServerName(String serverName) {
        DbConfigUtility.serverName = serverName;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        DbConfigUtility.user = user;
    }

    /**
     * Untuk membaca database.properties yang berisi konfigurasi koneksi database
     */
    public static void read() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("database.properties"));
            setDriverName(properties.getProperty("driverName"));
            setJdbcUrl(properties.getProperty("jdbcUrl"));
            setUser(properties.getProperty("user"));
            setPassword(PasswordUtility.decrypt(properties.getProperty("password")));
            setServerName(properties.getProperty("serverName"));
            setPort(Integer.parseInt(properties.getProperty("port")));
            setDatabaseName(properties.getProperty("databaseName"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "database.properties file tidak ditemukan");
            Logger.getLogger(DbConfigUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DbConfigUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Kalo yang ini untuk menulis konfigurasi databasenya
     */
    public static void write() {
        try {
            Properties properties = new Properties();
            properties.setProperty("driverName", driverName);
            properties.setProperty("jdbcUrl", jdbcUrl);
            properties.setProperty("user", user);
            properties.setProperty("password", PasswordUtility.encrypt(password));
            properties.setProperty("serverName", serverName);
            properties.setProperty("port", String.valueOf(port));
            properties.setProperty("databaseName", databaseName);
            properties.store(new FileOutputStream("database.properties"), databaseName);
        } catch (IOException ex) {
            Logger.getLogger(DbConfigUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
