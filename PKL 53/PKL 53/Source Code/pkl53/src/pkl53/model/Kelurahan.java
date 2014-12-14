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
@Table(name = "kelurahan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kelurahan.findAll", query = "SELECT k FROM Kelurahan k"),
    @NamedQuery(name = "Kelurahan.findByKelurahanId", query = "SELECT k FROM Kelurahan k WHERE k.kelurahanId = :kelurahanId"),
    @NamedQuery(name = "Kelurahan.findByB1r1", query = "SELECT k FROM Kelurahan k WHERE k.b1r1 = :b1r1"),
    @NamedQuery(name = "Kelurahan.findByB1r2", query = "SELECT k FROM Kelurahan k WHERE k.b1r2 = :b1r2"),
    @NamedQuery(name = "Kelurahan.findByB1r3", query = "SELECT k FROM Kelurahan k WHERE k.b1r3 = :b1r3"),
    @NamedQuery(name = "Kelurahan.findByNamaKelurahan", query = "SELECT k FROM Kelurahan k WHERE k.namaKelurahan = :namaKelurahan")})
public class Kelurahan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kelurahan_id")
    private String kelurahanId;
    @Basic(optional = false)
    @Column(name = "B1R1")
    private String b1r1;
    @Basic(optional = false)
    @Column(name = "B1R2")
    private String b1r2;
    @Basic(optional = false)
    @Column(name = "B1R3")
    private String b1r3;
    @Basic(optional = false)
    @Column(name = "namaKelurahan")
    private String namaKelurahan;
    @OneToMany(mappedBy = "b1r3")
    private List<B1Tempat> b1TempatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r3")
    private List<KetKuesioner> ketKuesionerList;
    @OneToMany(mappedBy = "b1r3")
    private List<B1Keterangantempat> b1KeterangantempatList;

    public Kelurahan() {
    }

    public Kelurahan(String kelurahanId) {
        this.kelurahanId = kelurahanId;
    }

    public Kelurahan(String kelurahanId, String b1r1, String b1r2, String b1r3, String namaKelurahan) {
        this.kelurahanId = kelurahanId;
        this.b1r1 = b1r1;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.namaKelurahan = namaKelurahan;
    }

    public String getKelurahanId() {
        return kelurahanId;
    }

    public void setKelurahanId(String kelurahanId) {
        this.kelurahanId = kelurahanId;
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

    public String getNamaKelurahan() {
        return namaKelurahan;
    }

    public void setNamaKelurahan(String namaKelurahan) {
        this.namaKelurahan = namaKelurahan;
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
        hash += (kelurahanId != null ? kelurahanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kelurahan)) {
            return false;
        }
        Kelurahan other = (Kelurahan) object;
        if ((this.kelurahanId == null && other.kelurahanId != null) || (this.kelurahanId != null && !this.kelurahanId.equals(other.kelurahanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Kelurahan[ kelurahanId=" + kelurahanId + " ]";
    }
    
}
