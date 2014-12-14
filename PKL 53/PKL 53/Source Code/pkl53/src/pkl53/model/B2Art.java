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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "2b2_art")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2Art.findAll", query = "SELECT b FROM B2Art b"),
    @NamedQuery(name = "B2Art.findByKKSArt", query = "SELECT b FROM B2Art b WHERE b.kKSArt = :kKSArt"),
    @NamedQuery(name = "B2Art.findByB2r1", query = "SELECT b FROM B2Art b WHERE b.b2r1 = :b2r1"),
    @NamedQuery(name = "B2Art.findByB2r2", query = "SELECT b FROM B2Art b WHERE b.b2r2 = :b2r2"),
    @NamedQuery(name = "B2Art.findByB2r3", query = "SELECT b FROM B2Art b WHERE b.b2r3 = :b2r3")})
public class B2Art implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArt")
    private String kKSArt;
    @Column(name = "B2R1")
    private Integer b2r1;
    @Column(name = "B2R2")
    private String b2r2;
    @Column(name = "B2R3")
    private String b2r3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kKSArt")
    private List<B3Rinciusaha> b3RinciusahaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kKSArt")
    private List<B2Umumusaha> b2UmumusahaList;
    @JoinColumn(name = "KKS", referencedColumnName = "KKS")
    @ManyToOne(optional = false)
    private B1Tempat kks;

    public B2Art() {
    }

    public B2Art(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public String getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public Integer getB2r1() {
        return b2r1;
    }

    public void setB2r1(Integer b2r1) {
        this.b2r1 = b2r1;
    }

    public String getB2r2() {
        return b2r2;
    }

    public void setB2r2(String b2r2) {
        this.b2r2 = b2r2;
    }

    public String getB2r3() {
        return b2r3;
    }

    public void setB2r3(String b2r3) {
        this.b2r3 = b2r3;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList() {
        return b3RinciusahaList;
    }

    public void setB3RinciusahaList(List<B3Rinciusaha> b3RinciusahaList) {
        this.b3RinciusahaList = b3RinciusahaList;
    }

    @XmlTransient
    public List<B2Umumusaha> getB2UmumusahaList() {
        return b2UmumusahaList;
    }

    public void setB2UmumusahaList(List<B2Umumusaha> b2UmumusahaList) {
        this.b2UmumusahaList = b2UmumusahaList;
    }

    public B1Tempat getKks() {
        return kks;
    }

    public void setKks(B1Tempat kks) {
        this.kks = kks;
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
        if (!(object instanceof B2Art)) {
            return false;
        }
        B2Art other = (B2Art) object;
        if ((this.kKSArt == null && other.kKSArt != null) || (this.kKSArt != null && !this.kKSArt.equals(other.kKSArt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B2Art[ kKSArt=" + kKSArt + " ]";
    }
    
}
