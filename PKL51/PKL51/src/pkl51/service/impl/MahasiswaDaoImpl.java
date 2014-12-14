/*
 * PKL 51 - Subseksi Data Entry
 */
package pkl51.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl51.database.DatabaseUtility;
import pkl51.entity.Mahasiswa;
import pkl51.error.EntityException;
import pkl51.service.MahasiswaDao;

/**
 * Berikut ini adalah DAO implement dari Mahasiswa DAO
 *
 * Perhatikan tentang encode dan decode password SQL statement di bawah ini.
 *
 * @author RN Hindarwan
 * @version 1.0
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private Connection connection;
//    Passwordnya bisa diencode ketika write dan didecode ketika read.
//    Jadi di database, password tidak bisa diketahui secara tdk langsung.
//    Key untuk encode dan decode adalah 'pkl51'.
//    tapi ini baru ditest di MySQL
//    private final String insertMahasiswa =
//            "INSERT INTO mahasiswa(nim, nama, no_hp, password) VALUES(?, ?, ?, ENCODE(? , 'pkl51'))";
//    private final String updateMahasiswa =
//            "UPDATE mahasiswa SET password = ENCODE(? , 'pkl51') WHERE nim = ?";
//    private final String getByNimDanPassword =
//            "SELECT nim, nama, no_hp, DECODE(password, 'pkl51') AS password FROM mahasiswa WHERE nim = ? AND password = ENCODE(? , 'pkl51')";

    //   SQL standard
    private final String insertMahasiswa =
            "INSERT INTO mahasiswa VALUES(?, ?, ?)";
    private final String updateMahasiswa =
            "UPDATE mahasiswa SET password = ? WHERE nim = ?";
    private final String deleteMahasiswa =
            "DELETE FROM mahasiswa WHERE nim = ?";
    private final String getByNimDanPassword =
            "SELECT * FROM mahasiswa WHERE nim = ? AND password = ?";


    public void insertMahasiswa(Mahasiswa mahasiswa) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertMahasiswa);

            statement.setString(1, mahasiswa.getNim());
            statement.setString(2, mahasiswa.getNama());
            statement.setString(3, mahasiswa.getPassword());
//            statement.setInt(4, mahasiswa.getLevel());
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void updatePasswordMahasiswa(Mahasiswa mahasiswa) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateMahasiswa);
            statement.setString(1, mahasiswa.getPassword());
            statement.setString(2, mahasiswa.getNim());
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void deleteMahasiswa(String nim) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteMahasiswa);
            statement.setString(1, nim);

            statement.executeUpdate();

            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Mahasiswa getMahasiswaByNimPassword(String nim, String password) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByNimDanPassword);
            statement.setString(1, nim);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            Mahasiswa mhs = null;
            if (resultSet.next()) {
                mhs = new Mahasiswa();
                mhs.setNim(resultSet.getString("nim"));
                mhs.setNama(resultSet.getString("nama"));
                mhs.setPassword(resultSet.getString("password"));
//                mhs.setLevel(resultSet.getInt("level"));
            } else {
                throw new EntityException("nim dan password tidak ditemukan");
            }

            connection.commit();

            return mhs;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntityException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MahasiswaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}