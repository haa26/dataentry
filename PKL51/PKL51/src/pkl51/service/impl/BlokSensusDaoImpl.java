/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.service.impl;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl51.entity.BlokSensus;
import pkl51.service.BlokSensusDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pkl51.database.DatabaseUtility;
import pkl51.error.EntityException;

/**
 *
 * @author Hindarwan
 */
public class BlokSensusDaoImpl implements BlokSensusDao {

    private Connection connection;
    private final String insertBlokSensus = "INSERT INTO blok_sensus VALUES (?, ?, ?, ?)";
    private final String updateBlokSensus = "UPDATE blok_sensus SET no_bs = ?, kode_kec = ?, kode_desa = ? WHERE no_urut_bs = ?";
    private final String getBlokSensusByNoUrutBS = "SELECT * FROM blok_sensus WHERE no_urut_bs = ?";

    public BlokSensus getBlokSensusByNoUrutBS(String no_urut_bs) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(getBlokSensusByNoUrutBS);

            statement.setString(1, no_urut_bs);

            ResultSet result = statement.executeQuery();

            BlokSensus blokSensus = null;

            if (result.next()) {
                blokSensus = new BlokSensus();
                blokSensus.setNo_urut_bs(result.getString("no_urut_bs"));
                blokSensus.setNo_bs(result.getString("no_bs"));
                blokSensus.setKode_kec(result.getString("kode_kec"));
                blokSensus.setKode_desa(result.getString("kode_desa"));
            } else {
                throw new EntityException("blok sensus tidak ditemukan");
            }

            connection.commit();

            return blokSensus;

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement!= null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void insertBlokSensus(BlokSensus blokSensus) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(insertBlokSensus);

            statement.setString(1, blokSensus.getNo_urut_bs());
            statement.setString(2, blokSensus.getNo_bs());
            statement.setString(3, blokSensus.getKode_kec());
            statement.setString(4, blokSensus.getKode_desa());

            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BlokSensusDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void updateBlokSensus(BlokSensus blokSensus) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateBlokSensus);

            statement.setString(1, blokSensus.getNo_bs());
            statement.setString(2, blokSensus.getKode_kec());
            statement.setString(3, blokSensus.getKode_desa());
            statement.setString(4, blokSensus.getNo_urut_bs());

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
