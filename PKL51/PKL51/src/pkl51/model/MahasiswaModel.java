/*
 * PKL 51 - Subseksi Data Entry
 */

package pkl51.model;

import java.sql.SQLException;
import pkl51.entity.Mahasiswa;
import pkl51.error.EntityException;
import pkl51.model.event.MahasiswaListener;
import pkl51.service.MahasiswaDao;
import pkl51.service.impl.MahasiswaDaoImpl;

/**
 *
 * @author RN Hindarwan
 */
public class MahasiswaModel {
    private String nim;
    private String nama;
    private String password;
    private int level;
    private MahasiswaListener listener;

    public MahasiswaListener getListener() {
        return listener;
    }

    public void setListener(MahasiswaListener listener) {
        this.listener = listener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        fireOnChange(this);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        fireOnChange(this);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        fireOnChange(this);
    }

    protected void fireOnChange(MahasiswaModel model){
        if(listener!=null){
            listener.onChange(this);
        }
    }

//    protected void fireOnUpdate(String username){
//        if(listener!=null){
//            listener.onUpdate(username);
//        }
//    }

    public void updatePasswordMahasiswa() throws SQLException, EntityException{
        MahasiswaDao dao = new MahasiswaDaoImpl();
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim(nim);
        mahasiswa.setPassword(password);

        dao.updatePasswordMahasiswa(mahasiswa);

//        fireOnUpdate(username);
        fireOnChange(this);
    }

    public void getMahasiswaByNimPassword() throws EntityException{
        MahasiswaDao dao = new MahasiswaDaoImpl();
        Mahasiswa mahasiswa = dao.getMahasiswaByNimPassword(nim, password);
        setNim(mahasiswa.getNim());
        setNama(mahasiswa.getNama());
        setPassword(mahasiswa.getPassword());
        setLevel(mahasiswa.getLevel());
    }
}
