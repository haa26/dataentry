/*
 *  PKL 51 GUNUNG KIDUL
 *  Subseksie DATA ENTRY + CAPI
 */
package pkl51.service.impl;

import pkl51.entity.Kecamatan;
import pkl51.error.EntityException;
import pkl51.service.KecamatanDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkl51.database.DatabaseUtility;
/**
 *
 * @author Hindarwan
 */
public class KecamatanDaoImpl implements KecamatanDao{

    private Connection connection;
    private final String insertKecamatan = "INSERT INTO kecamatan VALUES (?,?)";
    private final String updateKecamatan = "UPDATE kecamatan SET nama_kec = ? WHERE kode_kec = ?";
    private final String getByKodeKecamatan = "SELECT * FROM kecamatan WHERE kode_kec = ?";
    
    public void insertKecamatan(Kecamatan kecamatan) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertKecamatan);

            statement.setString(1, kecamatan.getKode_kec());
            statement.setString(2, kecamatan.getNama_kec());
            
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

    public void updateKecamatan(Kecamatan kecamatan) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateKecamatan);

            statement.setString(1, kecamatan.getNama_kec());
            statement.setString(2, kecamatan.getKode_kec());

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

    public Kecamatan getKecamatanByKodeKec(String kode_kec) throws EntityException {
        PreparedStatement statement = null;
        try {
            connection = DatabaseUtility.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByKodeKecamatan);

            statement.setString(1, kode_kec);
            
            ResultSet resultSet = statement.executeQuery();
            
            Kecamatan kec = null;
            if(resultSet.next()){
                kec = new Kecamatan();
                kec.setKode_kec(resultSet.getString("kode_kec"));
                kec.setNama_kec(resultSet.getString("nama_kec"));
            }else{
                throw new EntityException("tidak ada kode kecamatan yang sesuai");
            }
            
            connection.commit();

            return kec;
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
