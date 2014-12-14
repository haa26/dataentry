/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl51.service.impl;

import pkl51.entity.Blok6c;
import pkl51.service.Blok6cDao;
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

public class Blok6cDaoImpl implements Blok6cDao {
    private Connection connection;
    private final String insertBlok6c = "INSERT INTO blok6c VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String updateBlok6c = "UPDATE blok6c SET B6CR1 = ?, B6CR2 = ?, B6CR3 = ?, B6CR4 = ?, B6CR5 = ?, B6CR6 = ?, B6CR7 = ?, B6CR8 = ?, B6CR9 = ?, B6CR10 = ?, B6CR11 = ?, B6CR12 = ?, B6CR13 = ?, B6CR14 = ?, B6CR15 = ?, B6CR16 = ?, B6CR17 = ?, B6CR18 = ? WHERE NKS = ?";
    private final String getBlok6cByNKS = "SELECT * FROM blok6c WHERE NKS = ?";



    public void insertBlok6c(Blok6c blok6c) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertBlok6c);

            statement.setString(1, blok6c.getNKS());
            statement.setInt(2, blok6c.getB6CR1());
            statement.setInt(3, blok6c.getB6CR2());
            statement.setInt(4, blok6c.getB6CR3());
            statement.setInt(5, blok6c.getB6CR4());
            statement.setInt(6, blok6c.getB6CR5());
            statement.setInt(7, blok6c.getB6CR6());
            statement.setInt(8, blok6c.getB6CR7());
            statement.setInt(9, blok6c.getB6CR8());
            statement.setInt(10, blok6c.getB6CR9());
            statement.setInt(11, blok6c.getB6CR10());
            statement.setInt(12, blok6c.getB6CR11());
            statement.setInt(13, blok6c.getB6CR12());
            statement.setInt(14, blok6c.getB6CR13());
            statement.setInt(15, blok6c.getB6CR14());
            statement.setInt(16, blok6c.getB6CR15());
            statement.setInt(17, blok6c.getB6CR16());
            statement.setInt(18, blok6c.getB6CR17());
            statement.setInt(19, blok6c.getB6CR18());
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

    public void updateBlok6c(Blok6c blok6c) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateBlok6c);

            statement.setInt(1, blok6c.getB6CR1());
            statement.setInt(2, blok6c.getB6CR2());
            statement.setInt(3, blok6c.getB6CR3());
            statement.setInt(4, blok6c.getB6CR4());
            statement.setInt(5, blok6c.getB6CR5());
            statement.setInt(6, blok6c.getB6CR6());
            statement.setInt(7, blok6c.getB6CR7());
            statement.setInt(8, blok6c.getB6CR8());
            statement.setInt(9, blok6c.getB6CR9());
            statement.setInt(10, blok6c.getB6CR10());
            statement.setInt(11, blok6c.getB6CR11());
            statement.setInt(12, blok6c.getB6CR12());
            statement.setInt(13, blok6c.getB6CR13());
            statement.setInt(14, blok6c.getB6CR14());
            statement.setInt(15, blok6c.getB6CR15());
            statement.setInt(16, blok6c.getB6CR16());
            statement.setInt(17, blok6c.getB6CR17());
            statement.setInt(18, blok6c.getB6CR18());
            statement.setString(19, blok6c.getNKS());
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

    public Blok6c getBlok6cByNKS(String NKS) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getBlok6cByNKS);
            statement.setString(1, NKS);

            ResultSet result = statement.executeQuery();
            Blok6c blok6c = null;
            if (result.next()) {
                blok6c = new Blok6c();
                blok6c.setB6CR1(result.getInt("B6CR1"));
                blok6c.setB6CR2(result.getInt("B6CR2"));
                blok6c.setB6CR3(result.getInt("B6CR3"));
                blok6c.setB6CR4(result.getInt("B6CR4"));
                blok6c.setB6CR5(result.getInt("B6CR5"));
                blok6c.setB6CR6(result.getInt("B6CR6"));
                blok6c.setB6CR7(result.getInt("B6CR7"));
                blok6c.setB6CR8(result.getInt("B6CR8"));
                blok6c.setB6CR9(result.getInt("B6CR9"));
                blok6c.setB6CR10(result.getInt("B6CR10"));
                blok6c.setB6CR11(result.getInt("B6CR11"));
                blok6c.setB6CR12(result.getInt("B6CR12"));
                blok6c.setB6CR13(result.getInt("B6CR13"));
                blok6c.setB6CR14(result.getInt("B6CR14"));
                blok6c.setB6CR15(result.getInt("B6CR15"));
                blok6c.setB6CR16(result.getInt("B6CR16"));
                blok6c.setB6CR17(result.getInt("B6CR17"));
                blok6c.setB6CR18(result.getInt("B6CR18"));
            } else {
                throw new EntityException("Hasil untuk NKS: "+NKS+" tidak ditemukan");
            }
            connection.commit();
            return blok6c;
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
                } catch (SQLException exception) {
                }
            }
        }
    }
}
