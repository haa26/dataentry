/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.service.impl;

import pkl51.entity.Desa;
import pkl51.error.EntityException;
import pkl51.service.DesaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;

/**
 *
 * @author Hindarwan
 */
public class DesaDaoImpl implements DesaDao {

    private Connection connection;
    private final String insertDesa = "INSERT INTO desa VALUES (?, ?, ?)";
    private final String updateDesa = "UPDATE desa SET nama_desa = ?, kode_kec = ? WHERE kode_desa = ?";
    private final String getByKodeDesa = "SELECT * FROM desa WHERE kode_desa = ?";

    public void insertDesa(Desa desa) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertDesa); //isikan statement yang akan dieksekusi

            statement.setString(1, desa.getKode_desa());
            statement.setString(2, desa.getNama_desa());
            statement.setString(3, desa.getKode_kec());

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

    public void updateDesa(Desa desa) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateDesa);

            statement.setString(1, desa.getNama_desa());
            statement.setString(2, desa.getKode_kec());
            statement.setString(3, desa.getKode_desa());

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

    public Desa getDesaByKodeDesa(String kodeDesa) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByKodeDesa);

            statement.setString(1, kodeDesa);

            ResultSet result = statement.executeQuery();

            Desa desa = null;
            if (result.next()) {
                desa = new Desa();
                desa.setKode_desa(result.getString("kode_desa"));
                desa.setNama_desa(result.getString("nama_kec"));
                desa.setKode_kec(result.getString("kode_kec"));
            } else{
                throw new EntityException("Desa tidak ditemukan");
            }

            connection.commit();

            return desa;


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
