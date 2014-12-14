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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "kabupatenkota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kabupatenkota.findAll", query = "SELECT k FROM Kabupatenkota k"),
    @NamedQuery(name = "Kabupatenkota.findByKodeKabupaten", query = "SELECT k FROM Kabupatenkota k WHERE k.kodeKabupaten = :kodeKabupaten"),
    @NamedQuery(name = "Kabupatenkota.findByNamaKabupaten", query = "SELECT k FROM Kabupatenkota k WHERE k.namaKabupaten = :namaKabupaten")})
public class Kabupatenkota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodeKabupaten")
    private String kodeKabupaten;
    @Basic(optional = false)
    @Column(name = "namaKabupaten")
    private String namaKabupaten;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r1")
    private List<B1Tempat> b1TempatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r1")
    private List<KetKuesioner> ketKuesionerList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b1r1")
    private B1Keterangantempat b1Keterangantempat;

    public Kabupatenkota() {
    }

    public Kabupatenkota(String kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    public Kabupatenkota(String kodeKabupaten, String namaKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
        this.namaKabupaten = namaKabupaten;
    }

    public String getKodeKabupaten() {
        return kodeKabupaten;
    }

    public void setKodeKabupaten(String kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    public String getNamaKabupaten() {
        return namaKabupaten;
    }

    public void setNamaKabupaten(String namaKabupaten) {
        this.namaKabupaten = namaKabupaten;
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

    public B1Keterangantempat getB1Keterangantempat() {
        return b1Keterangantempat;
    }

    public void setB1Keterangantempat(B1Keterangantempat b1Keterangantempat) {
        this.b1Keterangantempat = b1Keterangantempat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeKabupaten != null ? kodeKabupaten.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kabupatenkota)) {
            return false;
        }
        Kabupatenkota other = (Kabupatenkota) object;
        if ((this.kodeKabupaten == null && other.kodeKabupaten != null) || (this.kodeKabupaten != null && !this.kodeKabupaten.equals(other.kodeKabupaten))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Kabupatenkota[ kodeKabupaten=" + kodeKabupaten + " ]";
    }
    
}
