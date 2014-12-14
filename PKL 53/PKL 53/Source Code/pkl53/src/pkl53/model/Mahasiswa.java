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
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama")})
public class Mahasiswa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b")
    private List<Coba> cobaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mahasiswa")
    private Coba coba;
    @OneToMany(mappedBy = "nimPencacah")
    private List<B1Tempat> b1TempatList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mahasiswa")
    private Kortimpencacah kortimpencacah;
    @OneToMany(mappedBy = "nimKortim")
    private List<Kortimpencacah> kortimpencacahList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nimPencacah")
    private List<KetKuesioner> ketKuesionerList;
    @OneToMany(mappedBy = "nimPencacah")
    private List<B1Keterangantempat> b1KeterangantempatList;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @XmlTransient
    public List<Coba> getCobaList() {
        return cobaList;
    }

    public void setCobaList(List<Coba> cobaList) {
        this.cobaList = cobaList;
    }

    public Coba getCoba() {
        return coba;
    }

    public void setCoba(Coba coba) {
        this.coba = coba;
    }

    @XmlTransient
    public List<B1Tempat> getB1TempatList() {
        return b1TempatList;
    }

    public void setB1TempatList(List<B1Tempat> b1TempatList) {
        this.b1TempatList = b1TempatList;
    }

    public Kortimpencacah getKortimpencacah() {
        return kortimpencacah;
    }

    public void setKortimpencacah(Kortimpencacah kortimpencacah) {
        this.kortimpencacah = kortimpencacah;
    }

    @XmlTransient
    public List<Kortimpencacah> getKortimpencacahList() {
        return kortimpencacahList;
    }

    public void setKortimpencacahList(List<Kortimpencacah> kortimpencacahList) {
        this.kortimpencacahList = kortimpencacahList;
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
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Mahasiswa[ nim=" + nim + " ]";
    }
    
}
