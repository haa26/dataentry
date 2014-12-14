/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author Hindarwan
 */
public class Desa {
    private String kode_desa;
    private String nama_desa;
    private String kode_kec;

    public Desa() {
    }

    public Desa(String kode_desa, String nama_desa, String kode_kec) {
        this.kode_desa = kode_desa;
        this.nama_desa = nama_desa;
        this.kode_kec = kode_kec;
    }

    public String getKode_desa() {
        return kode_desa;
    }

    public void setKode_desa(String kode_desa) {
        this.kode_desa = kode_desa;
    }

    public String getKode_kec() {
        return kode_kec;
    }

    public void setKode_kec(String kode_kec) {
        this.kode_kec = kode_kec;
    }

    public String getNama_desa() {
        return nama_desa;
    }

    public void setNama_desa(String nama_desa) {
        this.nama_desa = nama_desa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desa other = (Desa) obj;
        if ((this.kode_desa == null) ? (other.kode_desa != null) : !this.kode_desa.equals(other.kode_desa)) {
            return false;
        }
        if ((this.nama_desa == null) ? (other.nama_desa != null) : !this.nama_desa.equals(other.nama_desa)) {
            return false;
        }
        if ((this.kode_kec == null) ? (other.kode_kec != null) : !this.kode_kec.equals(other.kode_kec)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.kode_desa != null ? this.kode_desa.hashCode() : 0);
        hash = 23 * hash + (this.nama_desa != null ? this.nama_desa.hashCode() : 0);
        hash = 23 * hash + (this.kode_kec != null ? this.kode_kec.hashCode() : 0);
        return hash;
    }
    
}
