/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;
import pkl51.entity.Blok4;
import pkl51.service.Blok4Dao;
import pkl51.error.EntityException;
/**
 *
 * @author ERI
 */
public class Blok4DaoImpl implements Blok4Dao{
    private Connection connection;
    private final String insertBlok4 =
            "INSERT INTO Blok4 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String updateBlok4 =
            "UPDATE Blok4 SET B4C2 = ? , B4C3 = ?, B4C4 = ?, B4C5 = ?, B4C6 = ?, B4C7 = ?, B4C8 = ?, B4C9 = ?, B4C10 = ?, B4C11 = ?, B4C12 = ? WHERE NKS = ?";
    private final String getBlok4ByNks =
            "SELECT * FROM Blok4 WHERE NKS = ?";
    
    public void insertBlok4(Blok4 blok4) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertBlok4); //isikan statement yang akan dieksekusi
                        
            statement.setString(1, blok4.getNKS());
            statement.setString(2, blok4.getB4C2());
            statement.setString(3, blok4.getB4C3());
            statement.setString(4, blok4.getB4C4());
            statement.setInt(5, blok4.getB4C5());
            statement.setString(6, blok4.getB4C6());
            statement.setString(7, blok4.getB4C7());
            statement.setString(8, blok4.getB4C8());
            statement.setString(9, blok4.getB4C9());
            statement.setString(10, blok4.getB4C10());
            statement.setString(11, blok4.getB4C11());
            statement.setString(12, blok4.getB4C12());
            
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
    
    public void updateBlok4(Blok4 blok4) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateBlok4); //isikan statement yang akan dieksekusi

            statement.setString(1, blok4.getB4C2());
            statement.setString(2, blok4.getB4C3());
            statement.setString(3, blok4.getB4C4());
            statement.setInt(4, blok4.getB4C5());
            statement.setString(5, blok4.getB4C6());
            statement.setString(6, blok4.getB4C7());
            statement.setString(7, blok4.getB4C8());
            statement.setString(8, blok4.getB4C9());
            statement.setString(9, blok4.getB4C10());
            statement.setString(10, blok4.getB4C11());
            statement.setString(11, blok4.getB4C12());
            statement.setString(12, blok4.getNKS());            
            
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
    
    public Blok4 getBlok4ByNks(String NKS) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getBlok4ByNks); //isikan statement yang akan dieksekusi

            statement.setString(1, NKS);
            
             ResultSet resultSet = statement.executeQuery();

            Blok4 blok4 = null;
            if (resultSet.next()) {
                blok4 = new Blok4();
                blok4.setNKS(resultSet.getString("NKS"));
                blok4.setB4C2(resultSet.getString("B4C2"));
                blok4.setB4C3(resultSet.getString("B4C3"));
                blok4.setB4C4(resultSet.getString("B4C4"));
                blok4.setB4C5(resultSet.getInt("B4C5"));
                blok4.setB4C6(resultSet.getString("B4C6"));
                blok4.setB4C7(resultSet.getString("B4C7"));
                blok4.setB4C8(resultSet.getString("B4C8"));
                blok4.setB4C9(resultSet.getString("B4C9"));
                blok4.setB4C10(resultSet.getString("B4C10"));
                blok4.setB4C11(resultSet.getString("B4C11"));
                blok4.setB4C12(resultSet.getString("B4C12"));              
                
            } else {
                throw new SQLException("field tidak ditemukan");
            }

            connection.commit();

            return blok4;
            
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
            System.out.println(ex.getMessage());
            throw new EntityException(ex.getMessage());
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
