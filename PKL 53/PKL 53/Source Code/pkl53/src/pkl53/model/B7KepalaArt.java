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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "1b7_kepala_art")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B7KepalaArt.findAll", query = "SELECT b FROM B7KepalaArt b"),
    @NamedQuery(name = "B7KepalaArt.findByKKSArt", query = "SELECT b FROM B7KepalaArt b WHERE b.kKSArt = :kKSArt"),
    @NamedQuery(name = "B7KepalaArt.findByB7r1", query = "SELECT b FROM B7KepalaArt b WHERE b.b7r1 = :b7r1"),
    @NamedQuery(name = "B7KepalaArt.findByB7r2", query = "SELECT b FROM B7KepalaArt b WHERE b.b7r2 = :b7r2"),
    @NamedQuery(name = "B7KepalaArt.findByB7r5", query = "SELECT b FROM B7KepalaArt b WHERE b.b7r5 = :b7r5")})
public class B7KepalaArt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArt")
    private String kKSArt;
    @Column(name = "B7R1")
    private String b7r1;
    @Column(name = "B7R2")
    private Integer b7r2;
    @Column(name = "B7R5")
    private Integer b7r5;
    @JoinColumn(name = "KKSArt", referencedColumnName = "KKSArt", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B4Art b4Art;
    @JoinColumn(name = "B7R3", referencedColumnName = "B7R3")
    @ManyToOne
    private OpsiB7r3 b7r3;
    @JoinColumn(name = "B7R4", referencedColumnName = "B7R4")
    @ManyToOne
    private OpsiB7r4 b7r4;

    public B7KepalaArt() {
    }

    public B7KepalaArt(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public String getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public String getB7r1() {
        return b7r1;
    }

    public void setB7r1(String b7r1) {
        this.b7r1 = b7r1;
    }

    public Integer getB7r2() {
        return b7r2;
    }

    public void setB7r2(Integer b7r2) {
        this.b7r2 = b7r2;
    }

    public Integer getB7r5() {
        return b7r5;
    }

    public void setB7r5(Integer b7r5) {
        this.b7r5 = b7r5;
    }

    public B4Art getB4Art() {
        return b4Art;
    }

    public void setB4Art(B4Art b4Art) {
        this.b4Art = b4Art;
    }

    public OpsiB7r3 getB7r3() {
        return b7r3;
    }

    public void setB7r3(OpsiB7r3 b7r3) {
        this.b7r3 = b7r3;
    }

    public OpsiB7r4 getB7r4() {
        return b7r4;
    }

    public void setB7r4(OpsiB7r4 b7r4) {
        this.b7r4 = b7r4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kKSArt != null ? kKSArt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B7KepalaArt)) {
            return false;
        }
        B7KepalaArt other = (B7KepalaArt) object;
        if ((this.kKSArt == null && other.kKSArt != null) || (this.kKSArt != null && !this.kKSArt.equals(other.kKSArt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B7KepalaArt[ kKSArt=" + kKSArt + " ]";
    }
    
}
