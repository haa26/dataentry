/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class Blok2 {
    private String NKS;
    private Integer B2R1;
    private Integer B2R2;
    private Integer B2R3; //tipe blm sesuai dgn db

    public Integer getB2R1() {
        return B2R1;
    }

    public void setB2R1(Integer B2R1) {
        this.B2R1 = B2R1;
    }

    public Integer getB2R2() {
        return B2R2;
    }

    public void setB2R2(Integer B2R2) {
        this.B2R2 = B2R2;
    }

    public Integer getB2R3() {
        return B2R3;
    }

    public void setB2R3(Integer B2R3) {
        this.B2R3 = B2R3;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Blok2 other = (Blok2) obj;
        if ((this.NKS == null) ? (other.NKS != null) : !this.NKS.equals(other.NKS)) {
            return false;
        }
        if (this.B2R1 != other.B2R1 && (this.B2R1 == null || !this.B2R1.equals(other.B2R1))) {
            return false;
        }
        if (this.B2R2 != other.B2R2 && (this.B2R2 == null || !this.B2R2.equals(other.B2R2))) {
            return false;
        }
        if (this.B2R3 != other.B2R3 && (this.B2R3 == null || !this.B2R3.equals(other.B2R3))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.NKS != null ? this.NKS.hashCode() : 0);
        hash = 29 * hash + (this.B2R1 != null ? this.B2R1.hashCode() : 0);
        hash = 29 * hash + (this.B2R2 != null ? this.B2R2.hashCode() : 0);
        hash = 29 * hash + (this.B2R3 != null ? this.B2R3.hashCode() : 0);
        return hash;
    }
    
    
}
