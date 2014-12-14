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
import pkl51.entity.Blok5;
import pkl51.service.Blok5Dao;
import pkl51.error.EntityException;
/**
 *
 * @author ERI
 */
public class Blok5DaoImpl implements Blok5Dao{
    private Connection connection;
    private final String insertBlok5 =
            "INSERT INTO Blok5 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String updateBlok5 =
            "UPDATE Blok5 SET B5R1a = ? , B5R1b = ?, B5R1c = ?, B5R2ia = ?, B5R2ib = ?, B5R2ic = ?, B5R2id = ?, B5R2ie = ?, B5R2iia = ?, B5R2iib = ?, B5R2iic = ?, B5R2iid = ?, B5R2iie = ?, B5R2iif = ?, B5R2iig = ?, B5R2iih = ?, B5R2iiia = ?, B5R2iiib = ?, B5R2iiic = ?, B5R2iiid = ? WHERE NKS = ?";
    private final String getBlok5ByNks =
            "SELECT * FROM Blok5 WHERE NKS = ?";
    
    public void insertBlok5(Blok5 blok5) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertBlok5); //isikan statement yang akan dieksekusi

            statement.setString(1, blok5.getNKS());
            statement.setString(2, blok5.getB5R1a());
            statement.setString(3, blok5.getB5R1b());
            statement.setString(4, blok5.getB5R1c());
            statement.setInt(5, blok5.getB5R2ia());
            statement.setInt(6, blok5.getB5R2ib());
            statement.setInt(7, blok5.getB5R2ic());
            statement.setInt(8, blok5.getB5R2id());
            statement.setInt(9, blok5.getB5R2ie());
            statement.setInt(10, blok5.getB5R2iia());
            statement.setInt(11, blok5.getB5R2iib());
            statement.setInt(12, blok5.getB5R2iic());
            statement.setInt(13, blok5.getB5R2iid());
            statement.setInt(14, blok5.getB5R2iie());
            statement.setInt(15, blok5.getB5R2iif());
            statement.setInt(16, blok5.getB5R2iig());
            statement.setInt(17, blok5.getB5R2iih());
            statement.setInt(18, blok5.getB5R2iiia());
            statement.setInt(19, blok5.getB5R2iiib());
            statement.setInt(20, blok5.getB5R2iiic());
            statement.setInt(21, blok5.getB5R2iiid());
                    
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
    
    public void updateBlok5(Blok5 blok5) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateBlok5); //isikan statement yang akan dieksekusi
            
            statement.setString(1, blok5.getB5R1a());
            statement.setString(2, blok5.getB5R1b());
            statement.setString(3, blok5.getB5R1c());
            statement.setInt(4, blok5.getB5R2ia());
            statement.setInt(5, blok5.getB5R2ib());
            statement.setInt(6, blok5.getB5R2ic());
            statement.setInt(7, blok5.getB5R2id());
            statement.setInt(8, blok5.getB5R2ie());
            statement.setInt(9, blok5.getB5R2iia());
            statement.setInt(10, blok5.getB5R2iib());
            statement.setInt(11, blok5.getB5R2iic());
            statement.setInt(12, blok5.getB5R2iid());
            statement.setInt(13, blok5.getB5R2iie());
            statement.setInt(14, blok5.getB5R2iif());
            statement.setInt(15, blok5.getB5R2iig());
            statement.setInt(16, blok5.getB5R2iih());
            statement.setInt(17, blok5.getB5R2iiia());
            statement.setInt(18, blok5.getB5R2iiib());
            statement.setInt(19, blok5.getB5R2iiic());
            statement.setInt(20, blok5.getB5R2iiid());
            statement.setString(21, blok5.getNKS());
            
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
    
    public Blok5 getBlok5ByNks(String NKS) throws EntityException{
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getBlok5ByNks); //isikan statement yang akan dieksekusi

            statement.setString(1, NKS);
            
            ResultSet resultSet = statement.executeQuery();

            Blok5 blok5 = null;
            if (resultSet.next()) {
                blok5 = new Blok5();
                blok5.setNKS(resultSet.getString("NKS"));
                blok5.setB5R1a(resultSet.getString("B5R1a"));
                blok5.setB5R1b(resultSet.getString("B5R1b"));
                blok5.setB5R1c(resultSet.getString("B5R1c"));
                blok5.setB5R2ia(resultSet.getInt("B5R2ia"));
                blok5.setB5R2ib(resultSet.getInt("B5R2ib"));
                blok5.setB5R2ic(resultSet.getInt("B5R2ic"));
                blok5.setB5R2id(resultSet.getInt("B5R2id"));
                blok5.setB5R2ie(resultSet.getInt("B5R2ie"));
                blok5.setB5R2iia(resultSet.getInt("B5R2iia"));
                blok5.setB5R2iib(resultSet.getInt("B5R2iib"));
                blok5.setB5R2iic(resultSet.getInt("B5R2iic"));
                blok5.setB5R2iid(resultSet.getInt("B5R2iid"));    
                blok5.setB5R2iie(resultSet.getInt("B5R2iie"));
                blok5.setB5R2iif(resultSet.getInt("B5R2iif"));
                blok5.setB5R2iig(resultSet.getInt("B5R2iig"));
                blok5.setB5R2iih(resultSet.getInt("B5R2iih"));  
                blok5.setB5R2iiia(resultSet.getInt("B5R2iiia"));
                blok5.setB5R2iiib(resultSet.getInt("B5R2iiib"));
                blok5.setB5R2iiic(resultSet.getInt("B5R2iiic"));
                blok5.setB5R2iiid(resultSet.getInt("B5R2iiid"));  
                
            } else {
                throw new SQLException("field tidak ditemukan");
            }

            connection.commit();

            return blok5;
            
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
