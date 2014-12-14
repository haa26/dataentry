/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl53.controller;

import pkl53.model.UserModel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import pkl53.view.MainFrame;
import pkl53.view.LoginPanel;
import Dao.UserDao;

/**
 *
 * @author akhul
 */
public class LoginController {

    /**
     * @return the nim
     */
    public static String getNim() {
        return nim;
    }

    /**
     * @param aNim the nim to set
     */
    public static void setNim(String aNim) {
        nim = aNim;
    }

    private UserModel user;
    private LoginPanel loginPanel;

    private CardLayout card;
    private static String nim="";

    public void login() {
        String username = "";
        String password = "";
        UserDao userDao = new UserDao();
        if (user.getUsername() != null && user.getPassword() != null) {
            username = user.getUsername();
            password = user.getPassword();
        }
        //mengambil data didatabase
        UserModel modelUser = userDao.getPasswordByUsername(username);

        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(loginPanel, "Isi password dan username");
        } else {
            if (modelUser.getPassword() == null) {
                JOptionPane.showMessageDialog(loginPanel, "Username tidak terdaftar");
            } else if (modelUser.getPassword().equals(password)) {
                setNim(modelUser.getUsername());
                
                card = (CardLayout) MainFrame.getMainPanel().getLayout();
               modelUser.setUsername(username);
                card.show(MainFrame.getMainPanel(), "homePanel");
            } else {
                JOptionPane.showMessageDialog(loginPanel, "password salah");
            }
        }
        
//        card = (CardLayout) MainFrame.getMainPanel().getLayout();
////                modelUser.setUsername(null);
//                card.show(MainFrame.getMainPanel(), "homePanel");
               
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public void setUserModel(UserModel user) {
        this.user = user;
    }
}
