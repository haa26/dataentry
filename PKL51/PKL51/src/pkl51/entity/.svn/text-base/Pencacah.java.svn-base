/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class Pencacah {
    private String nim_pencacah;
    private String nim_kortim;
    
    public String getNim_kortim() {
        return nim_kortim;
    }

    public void setNim_kortim(String nim_kortim) {
        this.nim_kortim = nim_kortim;
    }

    public String getNim_pencacah() {
        return nim_pencacah;
    }

    public void setNim_pencacah(String nim_pencacah) {
        this.nim_pencacah = nim_pencacah;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pencacah other = (Pencacah) obj;
        if ((this.nim_pencacah == null) ? (other.nim_pencacah != null) : !this.nim_pencacah.equals(other.nim_pencacah)) {
            return false;
        }
        if ((this.nim_kortim == null) ? (other.nim_kortim != null) : !this.nim_kortim.equals(other.nim_kortim)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.nim_pencacah != null ? this.nim_pencacah.hashCode() : 0);
        hash = 79 * hash + (this.nim_kortim != null ? this.nim_kortim.hashCode() : 0);
        return hash;
    }
    
    
}
