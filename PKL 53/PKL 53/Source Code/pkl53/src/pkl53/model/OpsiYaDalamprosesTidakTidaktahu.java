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
@Table(name = "opsi_ya_dalamproses_tidak_tidaktahu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiYaDalamprosesTidakTidaktahu.findAll", query = "SELECT o FROM OpsiYaDalamprosesTidakTidaktahu o"),
    @NamedQuery(name = "OpsiYaDalamprosesTidakTidaktahu.findByKode", query = "SELECT o FROM OpsiYaDalamprosesTidakTidaktahu o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiYaDalamprosesTidakTidaktahu.findByValue", query = "SELECT o FROM OpsiYaDalamprosesTidakTidaktahu o WHERE o.value = :value")})
public class OpsiYaDalamprosesTidakTidaktahu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b2r11")
    private List<B2Umumusaha> b2UmumusahaList;
    @OneToMany(mappedBy = "b2r12")
    private List<B2Umumusaha> b2UmumusahaList1;
    @OneToMany(mappedBy = "b2r13")
    private List<B2Umumusaha> b2UmumusahaList2;
    @OneToMany(mappedBy = "b2r14")
    private List<B2Umumusaha> b2UmumusahaList3;
    @OneToMany(mappedBy = "b4r19")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;
    @OneToMany(mappedBy = "b4r20")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList1;
    @OneToMany(mappedBy = "b4r21")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList2;
    @OneToMany(mappedBy = "b4r22")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList3;

    public OpsiYaDalamprosesTidakTidaktahu() {
    }

    public OpsiYaDalamprosesTidakTidaktahu(String kode) {
        this.kode = kode;
    }

    public OpsiYaDalamprosesTidakTidaktahu(String kode, String value) {
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
    public List<B2Umumusaha> getB2UmumusahaList() {
        return b2UmumusahaList;
    }

    public void setB2UmumusahaList(List<B2Umumusaha> b2UmumusahaList) {
        this.b2UmumusahaList = b2UmumusahaList;
    }

    @XmlTransient
    public List<B2Umumusaha> getB2UmumusahaList1() {
        return b2UmumusahaList1;
    }

    public void setB2UmumusahaList1(List<B2Umumusaha> b2UmumusahaList1) {
        this.b2UmumusahaList1 = b2UmumusahaList1;
    }

    @XmlTransient
    public List<B2Umumusaha> getB2UmumusahaList2() {
        return b2UmumusahaList2;
    }

    public void setB2UmumusahaList2(List<B2Umumusaha> b2UmumusahaList2) {
        this.b2UmumusahaList2 = b2UmumusahaList2;
    }

    @XmlTransient
    public List<B2Umumusaha> getB2UmumusahaList3() {
        return b2UmumusahaList3;
    }

    public void setB2UmumusahaList3(List<B2Umumusaha> b2UmumusahaList3) {
        this.b2UmumusahaList3 = b2UmumusahaList3;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiYaDalamprosesTidakTidaktahu)) {
            return false;
        }
        OpsiYaDalamprosesTidakTidaktahu other = (OpsiYaDalamprosesTidakTidaktahu) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiYaDalamprosesTidakTidaktahu[ kode=" + kode + " ]";
    }
    
}
