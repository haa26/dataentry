/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.component;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 */
public class LabelWaktu extends Label implements Runnable {

    private pkl51.util.Time t;

    public LabelWaktu() {
        super("Time");
        setJam();
    }

    public void start() {
        Thread thread = new Thread(this, "TimeThread");
        thread.start();
    }

    public void run() {
        while (true) {

            t.setTime();
            setText(t.getJamHuruf());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LabelWaktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public final void setJam() {
        ActionListener taskPerformer = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "", nol_menit = "", nol_detik = "";

                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

                setText(jam + ":" + menit + ":" + detik + "");
            }
        };
        new Timer(1000, taskPerformer).start();
    }
}
