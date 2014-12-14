/*
 * PKL 51 - Subseksi Data Entry
 */
package pkl51.entity;

/**
 *
 * @author RN Hindarwan
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String password;
    private int level;

    public Mahasiswa(String nim, String nama, String password, int level) {
        this.nim = nim;
        this.nama = nama;
        this.password = password;
        this.level = level;
    }

    public Mahasiswa() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;
        if ((this.nim == null) ? (other.nim != null) : !this.nim.equals(other.nim)) {
            return false;
        }
        if ((this.nama == null) ? (other.nama != null) : !this.nama.equals(other.nama)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.nim != null ? this.nim.hashCode() : 0);
        hash = 11 * hash + (this.nama != null ? this.nama.hashCode() : 0);
        hash = 11 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 11 * hash + this.level;
        return hash;
    }


}
