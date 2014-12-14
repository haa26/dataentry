/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class Korwil {
    private String nim_kortim;
    private String nim_korwil;
    private String kode_kec;

    public Korwil() {
    }

    public Korwil(String nim_kortim, String nim_korwil, String kode_kec) {
        this.nim_kortim = nim_kortim;
        this.nim_korwil = nim_korwil;
        this.kode_kec = kode_kec;
    }

    public String getKode_kec() {
        return kode_kec;
    }

    public void setKode_kec(String kode_kec) {
        this.kode_kec = kode_kec;
    }

    public String getNim_kortim() {
        return nim_kortim;
    }

    public void setNim_kortim(String nim_kortim) {
        this.nim_kortim = nim_kortim;
    }

    public String getNim_korwil() {
        return nim_korwil;
    }

    public void setNim_korwil(String nim_korwil) {
        this.nim_korwil = nim_korwil;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Korwil other = (Korwil) obj;
        if ((this.nim_kortim == null) ? (other.nim_kortim != null) : !this.nim_kortim.equals(other.nim_kortim)) {
            return false;
        }
        if ((this.nim_korwil == null) ? (other.nim_korwil != null) : !this.nim_korwil.equals(other.nim_korwil)) {
            return false;
        }
        if ((this.kode_kec == null) ? (other.kode_kec != null) : !this.kode_kec.equals(other.kode_kec)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.nim_kortim != null ? this.nim_kortim.hashCode() : 0);
        hash = 47 * hash + (this.nim_korwil != null ? this.nim_korwil.hashCode() : 0);
        hash = 47 * hash + (this.kode_kec != null ? this.kode_kec.hashCode() : 0);
        return hash;
    }
    
    
}
