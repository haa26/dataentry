/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author akhul
 */
public class UserModel implements Serializable{
    
    private static UserModel instance;
    //private static final long serialVersionUID = 4765454593603168706L;
   private static String username;
    public static final String PROP_USERNAME = "username";
    private String password;
    public static final String PROP_PASSWORD = "password";
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

//    /**
//     * Add PropertyChangeListener.
//     *
//     * @param listener
//     */
//    public void addPropertyChangeListener(PropertyChangeListener listener) {
//        propertyChangeSupport.addPropertyChangeListener(listener);
//    }
//
//    /**
//     * Remove PropertyChangeListener.
//     *
//     * @param listener
//     */
//    public void removePropertyChangeListener(PropertyChangeListener listener) {
//        propertyChangeSupport.removePropertyChangeListener(listener);
//    }
    
    
    /**
     * @return the nim
     */
    public  static  String getUsername() {
        return username;
    }

    /**
     * @param username the nim to set
     */
    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        propertyChangeSupport.firePropertyChange(PROP_USERNAME, oldUsername, this.username);
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        propertyChangeSupport.firePropertyChange(PROP_PASSWORD, oldPassword, this.password);
    }
    
}
