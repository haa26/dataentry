/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl51.service.impl;

import pkl51.entity.Blok6a;
import pkl51.service.Blok6aDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;
import pkl51.error.EntityException;


/**
 *
 * @author thiolutfi
 */
public class Blok6aDaoImpl implements Blok6aDao {

    private Connection connection;
    private final String insertBlok6a = "INSERT INTO blok6a VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String updateBlok6a = "UPDATE blok6a SET B6AR1a = ?, B6AR1b = ?, B6AR2a = ?, B6AR2b = ?, B6AR2c = ?, B6AR2d = ?, B6AR2e = ?, B6AR2f = ?, B6AR2g = ?, B6AR2i = ?, B6AR2j = ?, B6AR2k = ?, B6AR2l = ?, B6AR2m = ?, B6AR2n = ?, B6AR2o = ?, B6AR2p = ?, B6AR2q = ?, B6AR2r = ? WHERE NKS = ?";
    private final String getBlok6aByNKS = "SELECT * FROM blok6a WHERE NKS = ?";
    
    

    public void insertBlok6a(Blok6a blok6a) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertBlok6a);

            statement.setString(1, blok6a.getNKS());
            statement.setString(2, blok6a.getB6AR1a());
            statement.setString(3, blok6a.getB6AR1b());
            statement.setInt(4, blok6a.getB6AR2a());
            statement.setInt(5, blok6a.getB6AR2b());
            statement.setInt(6, blok6a.getB6AR2c());
            statement.setInt(7, blok6a.getB6AR2d());
            statement.setInt(8, blok6a.getB6AR2e());
            statement.setInt(9, blok6a.getB6AR2f());
            statement.setInt(10, blok6a.getB6AR2g());
            statement.setInt(11, blok6a.getB6AR2i());
            statement.setInt(12, blok6a.getB6AR2j());
            statement.setInt(13, blok6a.getB6AR2k());
            statement.setInt(14, blok6a.getB6AR2l());
            statement.setInt(15, blok6a.getB6AR2m());
            statement.setInt(16, blok6a.getB6AR2n());
            statement.setInt(17, blok6a.getB6AR2o());
            statement.setInt(18, blok6a.getB6AR2p());
            statement.setInt(19, blok6a.getB6AR2q());
            statement.setInt(20, blok6a.getB6AR2r());
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
            }
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public void updateBlok6a(Blok6a blok6a) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateBlok6a);

            statement.setString(1, blok6a.getB6AR1a());
            statement.setString(2, blok6a.getB6AR1b());
            statement.setInt(3, blok6a.getB6AR2a());
            statement.setInt(4, blok6a.getB6AR2b());
            statement.setInt(5, blok6a.getB6AR2c());
            statement.setInt(6, blok6a.getB6AR2d());
            statement.setInt(7, blok6a.getB6AR2e());
            statement.setInt(8, blok6a.getB6AR2f());
            statement.setInt(9, blok6a.getB6AR2g());
            statement.setInt(10, blok6a.getB6AR2i());
            statement.setInt(11, blok6a.getB6AR2j());
            statement.setInt(12, blok6a.getB6AR2k());
            statement.setInt(13, blok6a.getB6AR2l());
            statement.setInt(14, blok6a.getB6AR2m());
            statement.setInt(15, blok6a.getB6AR2n());
            statement.setInt(16, blok6a.getB6AR2o());
            statement.setInt(17, blok6a.getB6AR2p());
            statement.setInt(18, blok6a.getB6AR2q());
            statement.setInt(19, blok6a.getB6AR2r());
            statement.setString(20, blok6a.getNKS());
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
            }
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public Blok6a getBlok6aByNKS(String NKS) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getBlok6aByNKS);
            statement.setString(1, NKS);

            ResultSet result = statement.executeQuery();
            Blok6a blok6a = null;
            if (result.next()) {
                blok6a = new Blok6a();
                blok6a.setB6AR1a(result.getString("B6AR1a"));
                blok6a.setB6AR1b(result.getString("B6AR1b"));
                blok6a.setB6AR2a(result.getInt("B6AR2a"));
                blok6a.setB6AR2b(result.getInt("B6AR2b"));
                blok6a.setB6AR2c(result.getInt("B6AR2c"));
                blok6a.setB6AR2d(result.getInt("B6AR2d"));
                blok6a.setB6AR2e(result.getInt("B6AR2e"));
                blok6a.setB6AR2f(result.getInt("B6AR2f"));
                blok6a.setB6AR2g(result.getInt("B6AR2g"));
                blok6a.setB6AR2i(result.getInt("B6AR2h"));
                blok6a.setB6AR2j(result.getInt("B6AR2i"));
                blok6a.setB6AR2k(result.getInt("B6AR2j"));
                blok6a.setB6AR2l(result.getInt("B6AR2k"));
                blok6a.setB6AR2m(result.getInt("B6AR2l"));
                blok6a.setB6AR2n(result.getInt("B6AR2m"));
                blok6a.setB6AR2o(result.getInt("B6AR2n"));
                blok6a.setB6AR2p(result.getInt("B6AR2o"));
                blok6a.setB6AR2q(result.getInt("B6AR2p"));
                blok6a.setB6AR2r(result.getInt("B6AR2q"));
            } else {
                throw new EntityException("Hasil untuk NKS: "+NKS+" tidak ditemukan");
            }
            connection.commit();
            return blok6a;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new EntityException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

}
