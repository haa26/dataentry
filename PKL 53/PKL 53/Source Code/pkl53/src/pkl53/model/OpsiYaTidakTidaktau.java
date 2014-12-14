/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "opsi_ya_tidak_tidaktau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiYaTidakTidaktau.findAll", query = "SELECT o FROM OpsiYaTidakTidaktau o"),
    @NamedQuery(name = "OpsiYaTidakTidaktau.findByKode", query = "SELECT o FROM OpsiYaTidakTidaktau o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiYaTidakTidaktau.findByValue", query = "SELECT o FROM OpsiYaTidakTidaktau o WHERE o.value = :value")})
public class OpsiYaTidakTidaktau implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b3r11d")
    private List<B3Rinciusaha> b3RinciusahaList;
    @OneToMany(mappedBy = "b3r11a")
    private List<B3Rinciusaha> b3RinciusahaList1;
    @OneToMany(mappedBy = "b3r11c")
    private List<B3Rinciusaha> b3RinciusahaList2;
    @OneToMany(mappedBy = "b3r11b")
    private List<B3Rinciusaha> b3RinciusahaList3;
    @OneToMany(mappedBy = "b2r9")
    private List<B2Umumusaha> b2UmumusahaList;
    @OneToMany(mappedBy = "b4r17")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;
    @OneToMany(mappedBy = "b4r11")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList1;
    @OneToMany(mappedBy = "b4r12")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList2;
    @OneToMany(mappedBy = "b4r10")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList3;
    @OneToMany(mappedBy = "b4r13")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList4;
    @OneToMany(mappedBy = "b4r9")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList5;

    public OpsiYaTidakTidaktau() {
    }

    public OpsiYaTidakTidaktau(String kode) {
        this.kode = kode;
    }

    public OpsiYaTidakTidaktau(String kode, String value) {
        this.kode = kode;
        this.value = value;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList() {
        return b3RinciusahaList;
    }

    public void setB3RinciusahaList(List<B3Rinciusaha> b3RinciusahaList) {
        this.b3RinciusahaList = b3RinciusahaList;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList1() {
        return b3RinciusahaList1;
    }

    public void setB3RinciusahaList1(List<B3Rinciusaha> b3RinciusahaList1) {
        this.b3RinciusahaList1 = b3RinciusahaList1;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList2() {
        return b3RinciusahaList2;
    }

    public void setB3RinciusahaList2(List<B3Rinciusaha> b3RinciusahaList2) {
        this.b3RinciusahaList2 = b3RinciusahaList2;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList3() {
        return b3RinciusahaList3;
    }

    public void setB3RinciusahaList3(List<B3Rinciusaha> b3RinciusahaList3) {
        this.b3RinciusahaList3 = b3RinciusahaList3;
    }

    @XmlTransient
    public List<B2Umumusaha> getB2UmumusahaList() {
        return b2UmumusahaList;
    }

    public void setB2UmumusahaList(List<B2Umumusaha> b2UmumusahaList) {
        this.b2UmumusahaList = b2UmumusahaList;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList() {
        return b4KeteranganumumtenagakerjaList;
    }

    public void setB4KeteranganumumtenagakerjaList(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList) {
        this.b4KeteranganumumtenagakerjaList = b4KeteranganumumtenagakerjaList;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList1() {
        return b4KeteranganumumtenagakerjaList1;
    }

    public void setB4KeteranganumumtenagakerjaList1(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList1) {
        this.b4KeteranganumumtenagakerjaList1 = b4KeteranganumumtenagakerjaList1;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList2() {
        return b4KeteranganumumtenagakerjaList2;
    }

    public void setB4KeteranganumumtenagakerjaList2(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList2) {
        this.b4KeteranganumumtenagakerjaList2 = b4KeteranganumumtenagakerjaList2;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList3() {
        return b4KeteranganumumtenagakerjaList3;
    }

    public void setB4KeteranganumumtenagakerjaList3(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList3) {
        this.b4KeteranganumumtenagakerjaList3 = b4KeteranganumumtenagakerjaList3;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList4() {
        return b4KeteranganumumtenagakerjaList4;
    }

    public void setB4KeteranganumumtenagakerjaList4(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList4) {
        this.b4KeteranganumumtenagakerjaList4 = b4KeteranganumumtenagakerjaList4;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList5() {
        return b4KeteranganumumtenagakerjaList5;
    }

    public void setB4KeteranganumumtenagakerjaList5(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList5) {
        this.b4KeteranganumumtenagakerjaList5 = b4KeteranganumumtenagakerjaList5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiYaTidakTidaktau)) {
            return false;
        }
        OpsiYaTidakTidaktau other = (OpsiYaTidakTidaktau) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiYaTidakTidaktau[ kode=" + kode + " ]";
    }
    
}
