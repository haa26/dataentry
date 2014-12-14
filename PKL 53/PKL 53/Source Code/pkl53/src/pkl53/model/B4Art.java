/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "1b4_art")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B4Art.findAll", query = "SELECT b FROM B4Art b"),
    @NamedQuery(name = "B4Art.findByKKSArt", query = "SELECT b FROM B4Art b WHERE b.kKSArt = :kKSArt"),
    @NamedQuery(name = "B4Art.findByB4r1", query = "SELECT b FROM B4Art b WHERE b.b4r1 = :b4r1"),
    @NamedQuery(name = "B4Art.findByB4r2", query = "SELECT b FROM B4Art b WHERE b.b4r2 = :b4r2")})
public class B4Art implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArt")
    private String kKSArt;
    @Column(name = "B4R1")
    private String b4r1;
    @Column(name = "B4R2")
    private String b4r2;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b4Art")
    private B7KepalaArt b7KepalaArt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kKSArt")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;
    @JoinColumn(name = "KKS", referencedColumnName = "KKS")
    @ManyToOne(optional = false)
    private B1Keterangantempat kks;
    @JoinColumn(name = "B4R3", referencedColumnName = "B4R3")
    @ManyToOne
    private OpsiB4r3 b4r3;

    public B4Art() {
    }

    public B4Art(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public String getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public String getB4r1() {
        return b4r1;
    }

    public void setB4r1(String b4r1) {
        this.b4r1 = b4r1;
    }

    public String getB4r2() {
        return b4r2;
    }

    public void setB4r2(String b4r2) {
        this.b4r2 = b4r2;
    }

    public B7KepalaArt getB7KepalaArt() {
        return b7KepalaArt;
    }

    public void setB7KepalaArt(B7KepalaArt b7KepalaArt) {
        this.b7KepalaArt = b7KepalaArt;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList() {
        return b4KeteranganumumtenagakerjaList;
    }

    public void setB4KeteranganumumtenagakerjaList(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList) {
        this.b4KeteranganumumtenagakerjaList = b4KeteranganumumtenagakerjaList;
    }

    public B1Keterangantempat getKks() {
        return kks;
    }

    public void setKks(B1Keterangantempat kks) {
        this.kks = kks;
    }

    public OpsiB4r3 getB4r3() {
        return b4r3;
    }

    public void setB4r3(OpsiB4r3 b4r3) {
        this.b4r3 = b4r3;
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
        if (!(object instanceof B4Art)) {
            return false;
        }
        B4Art other = (B4Art) object;
        if ((this.kKSArt == null && other.kKSArt != null) || (this.kKSArt != null && !this.kKSArt.equals(other.kKSArt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B4Art[ kKSArt=" + kKSArt + " ]";
    }
    
}
