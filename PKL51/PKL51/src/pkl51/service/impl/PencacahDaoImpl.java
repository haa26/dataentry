/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service.impl;

import pkl51.entity.Pencacah;
import pkl51.error.EntityException;
import pkl51.service.PencacahDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;
/**
 *
 * @author Hindarwan
 */
public class PencacahDaoImpl implements PencacahDao{

    private Connection connection;
    private final String insertPencacah = "INSERT INTO pencacah VALUES (?, ?)";
    private final String updatePencacah = "UPDATE pencacah SET nim_kortim = ? WHERE nim_pencacah = ?";
    private final String getByNimPencacah = "SELECT * FROM pencacah WHERE nim_pencacah = ?";
    
    public void insertPencacah(Pencacah pencacah) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPencacah);

            statement.setString(1, pencacah.getNim_pencacah());
            statement.setString(2, pencacah.getNim_kortim());
            
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

    public void updatePencacah(Pencacah pencacah) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updatePencacah);

            statement.setString(1, pencacah.getNim_kortim());
            statement.setString(2, pencacah.getNim_pencacah());
            
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

    public Pencacah getPencacahByNimPencacah(String nim_pencacah) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByNimPencacah);

            statement.setString(1, nim_pencacah);

            ResultSet resultSet = statement.executeQuery();
            
            Pencacah pencacah = null;
            if(resultSet.next()){
                pencacah = new Pencacah();
                pencacah.setNim_pencacah(resultSet.getString("nim_pencacah"));
                pencacah.setNim_kortim(resultSet.getString("nim_kortim"));
            } else{
                throw new EntityException("nim pencacah tidak ditemukan");
            }
            
            connection.commit();
            
            return pencacah;

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
    
}
