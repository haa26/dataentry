/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service.impl;

import pkl51.entity.Korwil;
import pkl51.error.EntityException;
import pkl51.service.KorwilDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;

/**
 *
 * @author Hindarwan
 */
public class KorwilDaoImpl implements KorwilDao{

    private Connection connection;
    private final String insertKorwil = "INSERT INTO korwil VALUES (?, ?, ?)";
    private final String updateKorwil = "UPDATE korwil SET nim_korwil = ?, kode_kec = ? WHERE nim_kortim = ?";
    private final String getKorwilByNimKortim = "SELECT * FROM korwil";
            
    public Korwil getKorwilByNimKortim(String nim_kortim) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getKorwilByNimKortim);

            statement.setString(1, nim_kortim);
            
            ResultSet resultSet = statement.executeQuery();
            
            Korwil korwil = null;
            if(resultSet.next()){
                korwil = new Korwil();
                korwil.setNim_kortim(resultSet.getString("nim_kortim"));
                korwil.setNim_korwil(resultSet.getString("nim_korwil"));
                korwil.setKode_kec(resultSet.getString("kode_kec"));
            } else{
                throw new EntityException("nim kortim tidak ditemukan");
            }
            connection.commit();
            
            return korwil;

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
            System.out.println(ex.getMessage());
            throw new EntityException();
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public void insertKorwil(Korwil korwil) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertKorwil);

            statement.setString(1, korwil.getNim_kortim());
            statement.setString(2, korwil.getNim_korwil());
            statement.setString(3, korwil.getKode_kec());
            
            statement.executeUpdate();
            
            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public void updateKorwil(Korwil korwil) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateKorwil);

            statement.setString(1, korwil.getNim_korwil());
            statement.setString(2, korwil.getKode_kec());
            statement.setString(3, korwil.getNim_kortim());
            
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    
}
