/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "2b3r15_pekerja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B3r15Pekerja.findAll", query = "SELECT b FROM B3r15Pekerja b"),
    @NamedQuery(name = "B3r15Pekerja.findByKKSArtNupNp", query = "SELECT b FROM B3r15Pekerja b WHERE b.kKSArtNupNp = :kKSArtNupNp"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15a", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15a = :b3r15a"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15b", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15b = :b3r15b"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15d", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15d = :b3r15d"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15g", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15g = :b3r15g"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15h", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15h = :b3r15h"),
    @NamedQuery(name = "B3r15Pekerja.findByB3r15k", query = "SELECT b FROM B3r15Pekerja b WHERE b.b3r15k = :b3r15k")})
public class B3r15Pekerja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNupNp")
    private String kKSArtNupNp;
    @Basic(optional = false)
    @Column(name = "B3R15A")
    private int b3r15a;
    @Basic(optional = false)
    @Column(name = "B3R15B")
    private String b3r15b;
    @Basic(optional = false)
    @Column(name = "B3R15D")
    private int b3r15d;
    @Basic(optional = false)
    @Column(name = "B3R15G")
    private int b3r15g;
    @Basic(optional = false)
    @Column(name = "B3R15H")
    private int b3r15h;
    @Basic(optional = false)
    @Column(name = "B3R15K")
    private int b3r15k;
    @JoinColumn(name = "KKSArtNup", referencedColumnName = "KKSArtNup")
    @ManyToOne(optional = false)
    private B3Rinciusaha kKSArtNup;
    @JoinColumn(name = "B3R15E", referencedColumnName = "B3R15E")
    @ManyToOne(optional = false)
    private OpsiB3r15e b3r15e;
    @JoinColumn(name = "B3R15F", referencedColumnName = "B3R15F")
    @ManyToOne(optional = false)
    private OpsiB3r15f b3r15f;
    @JoinColumn(name = "B3R15I", referencedColumnName = "B3R15I")
    @ManyToOne(optional = false)
    private OpsiB3r15i b3r15i;
    @JoinColumn(name = "B3R15J", referencedColumnName = "B3R15J")
    @ManyToOne(optional = false)
    private OpsiB3r15j b3r15j;
    @JoinColumn(name = "B3R15C", referencedColumnName = "kodeJenisKelamin")
    @ManyToOne(optional = false)
    private OpsiJeniskelamin b3r15c;

    public B3r15Pekerja() {
    }

    public B3r15Pekerja(String kKSArtNupNp) {
        this.kKSArtNupNp = kKSArtNupNp;
    }

    public B3r15Pekerja(String kKSArtNupNp, int b3r15a, String b3r15b, int b3r15d, int b3r15g, int b3r15h, int b3r15k) {
        this.kKSArtNupNp = kKSArtNupNp;
        this.b3r15a = b3r15a;
        this.b3r15b = b3r15b;
        this.b3r15d = b3r15d;
        this.b3r15g = b3r15g;
        this.b3r15h = b3r15h;
        this.b3r15k = b3r15k;
    }

    public String getKKSArtNupNp() {
        return kKSArtNupNp;
    }

    public void setKKSArtNupNp(String kKSArtNupNp) {
        this.kKSArtNupNp = kKSArtNupNp;
    }

    public int getB3r15a() {
        return b3r15a;
    }

    public void setB3r15a(int b3r15a) {
        this.b3r15a = b3r15a;
    }

    public String getB3r15b() {
        return b3r15b;
    }

    public void setB3r15b(String b3r15b) {
        this.b3r15b = b3r15b;
    }

    public int getB3r15d() {
        return b3r15d;
    }

    public void setB3r15d(int b3r15d) {
        this.b3r15d = b3r15d;
    }

    public int getB3r15g() {
        return b3r15g;
    }

    public void setB3r15g(int b3r15g) {
        this.b3r15g = b3r15g;
    }

    public int getB3r15h() {
        return b3r15h;
    }

    public void setB3r15h(int b3r15h) {
        this.b3r15h = b3r15h;
    }

    public int getB3r15k() {
        return b3r15k;
    }

    public void setB3r15k(int b3r15k) {
        this.b3r15k = b3r15k;
    }

    public B3Rinciusaha getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(B3Rinciusaha kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public OpsiB3r15e getB3r15e() {
        return b3r15e;
    }

    public void setB3r15e(OpsiB3r15e b3r15e) {
        this.b3r15e = b3r15e;
    }

    public OpsiB3r15f getB3r15f() {
        return b3r15f;
    }

    public void setB3r15f(OpsiB3r15f b3r15f) {
        this.b3r15f = b3r15f;
    }

    public OpsiB3r15i getB3r15i() {
        return b3r15i;
    }

    public void setB3r15i(OpsiB3r15i b3r15i) {
        this.b3r15i = b3r15i;
    }

    public OpsiB3r15j getB3r15j() {
        return b3r15j;
    }

    public void setB3r15j(OpsiB3r15j b3r15j) {
        this.b3r15j = b3r15j;
    }

    public OpsiJeniskelamin getB3r15c() {
        return b3r15c;
    }

    public void setB3r15c(OpsiJeniskelamin b3r15c) {
        this.b3r15c = b3r15c;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kKSArtNupNp != null ? kKSArtNupNp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B3r15Pekerja)) {
            return false;
        }
        B3r15Pekerja other = (B3r15Pekerja) object;
        if ((this.kKSArtNupNp == null && other.kKSArtNupNp != null) || (this.kKSArtNupNp != null && !this.kKSArtNupNp.equals(other.kKSArtNupNp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B3r15Pekerja[ kKSArtNupNp=" + kKSArtNupNp + " ]";
    }
    
}
