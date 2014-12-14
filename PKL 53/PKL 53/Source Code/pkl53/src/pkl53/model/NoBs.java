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
@Table(name = "no_bs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NoBs.findAll", query = "SELECT n FROM NoBs n"),
    @NamedQuery(name = "NoBs.findByNobsId", query = "SELECT n FROM NoBs n WHERE n.nobsId = :nobsId"),
    @NamedQuery(name = "NoBs.findByB1r1", query = "SELECT n FROM NoBs n WHERE n.b1r1 = :b1r1"),
    @NamedQuery(name = "NoBs.findByB1r2", query = "SELECT n FROM NoBs n WHERE n.b1r2 = :b1r2"),
    @NamedQuery(name = "NoBs.findByB1r3", query = "SELECT n FROM NoBs n WHERE n.b1r3 = :b1r3"),
    @NamedQuery(name = "NoBs.findByB1r5a", query = "SELECT n FROM NoBs n WHERE n.b1r5a = :b1r5a")})
public class NoBs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nobs_id")
    private String nobsId;
    @Column(name = "B1R1")
    private String b1r1;
    @Column(name = "B1R2")
    private String b1r2;
    @Column(name = "B1R3")
    private String b1r3;
    @Column(name = "B1R5A")
    private String b1r5a;
    @OneToMany(mappedBy = "b1r5a")
    private List<B1Tempat> b1TempatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r5")
    private List<KetKuesioner> ketKuesionerList;
    @OneToMany(mappedBy = "b1r5a")
    private List<B1Keterangantempat> b1KeterangantempatList;

    public NoBs() {
    }

    public NoBs(String nobsId) {
        this.nobsId = nobsId;
    }

    public String getNobsId() {
        return nobsId;
    }

    public void setNobsId(String nobsId) {
        this.nobsId = nobsId;
    }

    public String getB1r1() {
        return b1r1;
    }

    public void setB1r1(String b1r1) {
        this.b1r1 = b1r1;
    }

    public String getB1r2() {
        return b1r2;
    }

    public void setB1r2(String b1r2) {
        this.b1r2 = b1r2;
    }

    public String getB1r3() {
        return b1r3;
    }

    public void setB1r3(String b1r3) {
        this.b1r3 = b1r3;
    }

    public String getB1r5a() {
        return b1r5a;
    }

    public void setB1r5a(String b1r5a) {
        this.b1r5a = b1r5a;
    }

    @XmlTransient
    public List<B1Tempat> getB1TempatList() {
        return b1TempatList;
    }

    public void setB1TempatList(List<B1Tempat> b1TempatList) {
        this.b1TempatList = b1TempatList;
    }

    @XmlTransient
    public List<KetKuesioner> getKetKuesionerList() {
        return ketKuesionerList;
    }

    public void setKetKuesionerList(List<KetKuesioner> ketKuesionerList) {
        this.ketKuesionerList = ketKuesionerList;
    }

    @XmlTransient
    public List<B1Keterangantempat> getB1KeterangantempatList() {
        return b1KeterangantempatList;
    }

    public void setB1KeterangantempatList(List<B1Keterangantempat> b1KeterangantempatList) {
        this.b1KeterangantempatList = b1KeterangantempatList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nobsId != null ? nobsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NoBs)) {
            return false;
        }
        NoBs other = (NoBs) object;
        if ((this.nobsId == null && other.nobsId != null) || (this.nobsId != null && !this.nobsId.equals(other.nobsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.NoBs[ nobsId=" + nobsId + " ]";
    }
    
}
