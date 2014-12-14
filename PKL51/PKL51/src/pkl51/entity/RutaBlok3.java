/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl51.entity;

/**
 *
 * @author FITRI ANDRI ASTUTI
 */
public class RutaBlok3 {
    private String NKS;
    private String no_urut_bs;
    private String B1B6;
    private String B1B7;
    private String B1B8;
    private String nim_pencacah;
    private String B3R2a;
    private String B3R2b;
    private String B3R5a;
    private String B3R5b;

    public String getB1B6() {
        return B1B6;
    }

    public void setB1B6(String B1B6) {
        this.B1B6 = B1B6;
    }

    public String getB1B7() {
        return B1B7;
    }

    public void setB1B7(String B1B7) {
        this.B1B7 = B1B7;
    }

    public String getB1B8() {
        return B1B8;
    }

    public void setB1B8(String B1B8) {
        this.B1B8 = B1B8;
    }

    public String getB3R2a() {
        return B3R2a;
    }

    public void setB3R2a(String B3R2a) {
        this.B3R2a = B3R2a;
    }

    public String getB3R2b() {
        return B3R2b;
    }

    public void setB3R2b(String B3R2b) {
        this.B3R2b = B3R2b;
    }

    public String getB3R5a() {
        return B3R5a;
    }

    public void setB3R5a(String B3R5a) {
        this.B3R5a = B3R5a;
    }

    public String getB3R5b() {
        return B3R5b;
    }

    public void setB3R5b(String B3R5b) {
        this.B3R5b = B3R5b;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    public String getNim_pencacah() {
        return nim_pencacah;
    }

    public void setNim_pencacah(String nim_pencacah) {
        this.nim_pencacah = nim_pencacah;
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
        final RutaBlok3 other = (RutaBlok3) obj;
        if ((this.NKS == null) ? (other.NKS != null) : !this.NKS.equals(other.NKS)) {
            return false;
        }
        if ((this.no_urut_bs == null) ? (other.no_urut_bs != null) : !this.no_urut_bs.equals(other.no_urut_bs)) {
            return false;
        }
        if ((this.B1B6 == null) ? (other.B1B6 != null) : !this.B1B6.equals(other.B1B6)) {
            return false;
        }
        if ((this.B1B7 == null) ? (other.B1B7 != null) : !this.B1B7.equals(other.B1B7)) {
            return false;
        }
        if ((this.B1B8 == null) ? (other.B1B8 != null) : !this.B1B8.equals(other.B1B8)) {
            return false;
        }
        if ((this.nim_pencacah == null) ? (other.nim_pencacah != null) : !this.nim_pencacah.equals(other.nim_pencacah)) {
            return false;
        }
        if ((this.B3R2a == null) ? (other.B3R2a != null) : !this.B3R2a.equals(other.B3R2a)) {
            return false;
        }
        if ((this.B3R2b == null) ? (other.B3R2b != null) : !this.B3R2b.equals(other.B3R2b)) {
            return false;
        }
        if ((this.B3R5a == null) ? (other.B3R5a != null) : !this.B3R5a.equals(other.B3R5a)) {
            return false;
        }
        if ((this.B3R5b == null) ? (other.B3R5b != null) : !this.B3R5b.equals(other.B3R5b)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.NKS != null ? this.NKS.hashCode() : 0);
        hash = 47 * hash + (this.no_urut_bs != null ? this.no_urut_bs.hashCode() : 0);
        hash = 47 * hash + (this.B1B6 != null ? this.B1B6.hashCode() : 0);
        hash = 47 * hash + (this.B1B7 != null ? this.B1B7.hashCode() : 0);
        hash = 47 * hash + (this.B1B8 != null ? this.B1B8.hashCode() : 0);
        hash = 47 * hash + (this.nim_pencacah != null ? this.nim_pencacah.hashCode() : 0);
        hash = 47 * hash + (this.B3R2a != null ? this.B3R2a.hashCode() : 0);
        hash = 47 * hash + (this.B3R2b != null ? this.B3R2b.hashCode() : 0);
        hash = 47 * hash + (this.B3R5a != null ? this.B3R5a.hashCode() : 0);
        hash = 47 * hash + (this.B3R5b != null ? this.B3R5b.hashCode() : 0);
        return hash;
    }
    
    
}
