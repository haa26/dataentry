/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import pkl53.model.UserModel;

/**
 *
 * @author akhul
 */
public class UserDao {
    
    private Connection connection;
    
    private final String getPasswordByUsername = "SELECT nim FROM mahasiswa WHERE nim = ?;";
    
//    public void insertUser(UserModel user){
//        
//    }
//
//    public void updateUser(UserModel user){
//        
//    }
//
//    public void deleteUser(String nim){
//        
//    }

  public UserModel getPasswordByUsername(String username){
        UserModel user = null;
        
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pkl53pass");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Query s = em.createQuery("SELECT p.password FROM Password p WHERE p.nimPengentri = :nimPengentri").setParameter("nimPengentri", username);
            
             user = new UserModel();
            
                String psswd = s.getSingleResult().toString();
             
                  user.setPassword(psswd);
            
            em.close();

        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
               return user;
    }
    
}
