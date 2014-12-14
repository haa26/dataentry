/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class Kecamatan {
    private String kode_kec;
    private String nama_kec;

    public Kecamatan() {
    }

    public Kecamatan(String kode_kec, String nama_kec) {
        this.kode_kec = kode_kec;
        this.nama_kec = nama_kec;
    }

    public String getKode_kec() {
        return kode_kec;
    }

    public void setKode_kec(String kode_kec) {
        this.kode_kec = kode_kec;
    }

    public String getNama_kec() {
        return nama_kec;
    }

    public void setNama_kec(String nama_kec) {
        this.nama_kec = nama_kec;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kecamatan other = (Kecamatan) obj;
        if ((this.kode_kec == null) ? (other.kode_kec != null) : !this.kode_kec.equals(other.kode_kec)) {
            return false;
        }
        if ((this.nama_kec == null) ? (other.nama_kec != null) : !this.nama_kec.equals(other.nama_kec)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.kode_kec != null ? this.kode_kec.hashCode() : 0);
        hash = 47 * hash + (this.nama_kec != null ? this.nama_kec.hashCode() : 0);
        return hash;
    }
    
    
}
