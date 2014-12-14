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
@Table(name = "kecamatan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kecamatan.findAll", query = "SELECT k FROM Kecamatan k"),
    @NamedQuery(name = "Kecamatan.findByKecamatanId", query = "SELECT k FROM Kecamatan k WHERE k.kecamatanId = :kecamatanId"),
    @NamedQuery(name = "Kecamatan.findByB1r1", query = "SELECT k FROM Kecamatan k WHERE k.b1r1 = :b1r1"),
    @NamedQuery(name = "Kecamatan.findByB1r2", query = "SELECT k FROM Kecamatan k WHERE k.b1r2 = :b1r2"),
    @NamedQuery(name = "Kecamatan.findByNamaKecamatan", query = "SELECT k FROM Kecamatan k WHERE k.namaKecamatan = :namaKecamatan")})
public class Kecamatan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kecamatan_id")
    private String kecamatanId;
    @Basic(optional = false)
    @Column(name = "B1R1")
    private String b1r1;
    @Basic(optional = false)
    @Column(name = "B1R2")
    private String b1r2;
    @Column(name = "namaKecamatan")
    private String namaKecamatan;
    @OneToMany(mappedBy = "b1r2")
    private List<B1Tempat> b1TempatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r2")
    private List<KetKuesioner> ketKuesionerList;
    @OneToMany(mappedBy = "b1r2")
    private List<B1Keterangantempat> b1KeterangantempatList;

    public Kecamatan() {
    }

    public Kecamatan(String kecamatanId) {
        this.kecamatanId = kecamatanId;
    }

    public Kecamatan(String kecamatanId, String b1r1, String b1r2) {
        this.kecamatanId = kecamatanId;
        this.b1r1 = b1r1;
        this.b1r2 = b1r2;
    }

    public String getKecamatanId() {
        return kecamatanId;
    }

    public void setKecamatanId(String kecamatanId) {
        this.kecamatanId = kecamatanId;
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

    public String getNamaKecamatan() {
        return namaKecamatan;
    }

    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
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
        hash += (kecamatanId != null ? kecamatanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kecamatan)) {
            return false;
        }
        Kecamatan other = (Kecamatan) object;
        if ((this.kecamatanId == null && other.kecamatanId != null) || (this.kecamatanId != null && !this.kecamatanId.equals(other.kecamatanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Kecamatan[ kecamatanId=" + kecamatanId + " ]";
    }
    
}
