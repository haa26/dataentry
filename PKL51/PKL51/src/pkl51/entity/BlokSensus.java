/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author Hindarwan
 */
public class BlokSensus {
    private String no_urut_bs;
    private String no_bs;
    private String kode_kec;
    private String kode_desa;

    public BlokSensus() {
    }

    public BlokSensus(String no_urut_bs, String no_bs, String kode_kec, String kode_desa) {
        this.no_urut_bs = no_urut_bs;
        this.no_bs = no_bs;
        this.kode_kec = kode_kec;
        this.kode_desa = kode_desa;
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

    public String getNo_bs() {
        return no_bs;
    }

    public void setNo_bs(String no_bs) {
        this.no_bs = no_bs;
    }

    public String getNo_urut_bs() {
        return no_urut_bs;
    }

    public void setNo_urut_bs(String no_urut_bs) {
        this.no_urut_bs = no_urut_bs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BlokSensus other = (BlokSensus) obj;
        if ((this.no_urut_bs == null) ? (other.no_urut_bs != null) : !this.no_urut_bs.equals(other.no_urut_bs)) {
            return false;
        }
        if ((this.no_bs == null) ? (other.no_bs != null) : !this.no_bs.equals(other.no_bs)) {
            return false;
        }
        if ((this.kode_kec == null) ? (other.kode_kec != null) : !this.kode_kec.equals(other.kode_kec)) {
            return false;
        }
        if ((this.kode_desa == null) ? (other.kode_desa != null) : !this.kode_desa.equals(other.kode_desa)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.no_urut_bs != null ? this.no_urut_bs.hashCode() : 0);
        hash = 83 * hash + (this.no_bs != null ? this.no_bs.hashCode() : 0);
        hash = 83 * hash + (this.kode_kec != null ? this.kode_kec.hashCode() : 0);
        hash = 83 * hash + (this.kode_desa != null ? this.kode_desa.hashCode() : 0);
        return hash;
    }
    
}
