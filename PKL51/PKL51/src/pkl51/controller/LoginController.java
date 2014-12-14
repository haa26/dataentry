/*
 * PKL 51 - Subseksi Data Entry
 */
package pkl51.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pkl51.error.EntityException;
import pkl51.model.MahasiswaModel;
import pkl51.view.FormUtama;
import pkl51.view.PanelLogin;

/**
 *
 * @author RN Hindarwan
 */
public class LoginController {

    private MahasiswaModel model;

    public void setModel(MahasiswaModel model) {
        this.model = model;
    }

    public void changePassword(PanelLogin panelLogin) {
        String username = panelLogin.getTextFieldUsername().getText();
        char[] passwordChar = panelLogin.getTextFieldPassword().getPassword();
        String password = new String(passwordChar);
        char[] newPasswordChar = panelLogin.getTextFieldNewPassword().getPassword();
        String newPassword = new String(newPasswordChar);
        char[] confirmPasswordChar = panelLogin.getTextFieldConfirmPassword().getPassword();
        String confirmPassword = new String(confirmPasswordChar);

        //proses validasi login
        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "Username masih kosong");
            panelLogin.getTextFieldUsername().requestFocusInWindow();
        } else if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "Password masih kosong");
            panelLogin.getTextFieldPassword().requestFocusInWindow();
        } else if (newPassword.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "New password masih kosong");
            panelLogin.getTextFieldNewPassword().requestFocusInWindow();
        } else if (confirmPassword.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "Confirm password masih kosong");
            panelLogin.getTextFieldConfirmPassword().requestFocusInWindow();
        } else if (!newPassword.trim().equals(confirmPassword.trim())) {
            JOptionPane.showMessageDialog(panelLogin, "New password dan Confirm password harus sama");
            panelLogin.getTextFieldConfirmPassword().requestFocusInWindow();
        } else {
            model.setNim(username);
            model.setPassword(newPassword);
            try {
                model.updatePasswordMahasiswa();
                JOptionPane.showMessageDialog(panelLogin, "Password berhasil diubah, silahkan login dengan menggunakan password yang baru");
                panelLogin.getTextFieldNewPassword().setVisible(false);
                panelLogin.getTextFieldConfirmPassword().setVisible(false);
                panelLogin.getLabelNewPassword().setVisible(false);
                panelLogin.getLabelConfirmPassword().setVisible(false);
                panelLogin.getButtonChange().setVisible(false);
                panelLogin.getButtonCancel().setVisible(false);
                panelLogin.getButtonExit().setVisible(true);
                panelLogin.getButtonLogin().setVisible(true);
                panelLogin.getTextFieldPassword().setText("");
                panelLogin.getTextFieldPassword().requestFocusInWindow();
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EntityException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void login(PanelLogin panelLogin) {
        String username = panelLogin.getTextFieldUsername().getText();
        char[] passwordChar = panelLogin.getTextFieldPassword().getPassword();
        String password = new String(passwordChar);
        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "Username masih kosong");
            panelLogin.getTextFieldUsername().requestFocusInWindow();
        } else if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(panelLogin, "Password masih kosong");
            panelLogin.getTextFieldPassword().requestFocusInWindow();
        } else {
            model.setNim(username);
            model.setPassword(password);
            try {
                model.getMahasiswaByNimPassword();
                //password default: 12345
                if ("12345".equals(model.getPassword())) {
                    JOptionPane.showMessageDialog(panelLogin, "Password masih default, ubah sekarang");
                    panelLogin.getTextFieldNewPassword().setVisible(true);
                    panelLogin.getTextFieldConfirmPassword().setVisible(true);
                    panelLogin.getLabelNewPassword().setVisible(true);
                    panelLogin.getLabelConfirmPassword().setVisible(true);
                    panelLogin.getButtonChange().setVisible(true);
                    panelLogin.getButtonCancel().setVisible(true);
                    panelLogin.getButtonExit().setVisible(false);
                    panelLogin.getButtonLogin().setVisible(false);
                    panelLogin.getTextFieldNewPassword().requestFocusInWindow();
                } else {
                    FormUtama.getInstance().getCardControllerUtama().next();
                    panelLogin.getTextFieldUsername().setText("");
                    panelLogin.getTextFieldPassword().setText("");
                    panelLogin.getTextFieldNewPassword().setText("");
                    panelLogin.getTextFieldConfirmPassword().setText("");
                }
            } catch (EntityException ex) {
                JOptionPane.showMessageDialog(panelLogin, "Username dan password tidak ditemukan");
                panelLogin.getTextFieldUsername().requestFocusInWindow();
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void cancelChangePassword(PanelLogin panelLogin) {

        panelLogin.getTextFieldNewPassword().setVisible(false);
        panelLogin.getTextFieldConfirmPassword().setVisible(false);
        panelLogin.getLabelNewPassword().setVisible(false);
        panelLogin.getLabelConfirmPassword().setVisible(false);
        panelLogin.getButtonChange().setVisible(false);
        panelLogin.getButtonCancel().setVisible(false);
        panelLogin.getButtonExit().setVisible(true);
        panelLogin.getButtonLogin().setVisible(true);
        FormUtama.getInstance().getCardControllerUtama().next();
        panelLogin.getTextFieldUsername().setText("");
        panelLogin.getTextFieldPassword().setText("");
        panelLogin.getTextFieldNewPassword().setText("");
        panelLogin.getTextFieldConfirmPassword().setText("");
    }
}
