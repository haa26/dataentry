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
@Table(name = "opsi_b4r8")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB4r8.findAll", query = "SELECT o FROM OpsiB4r8 o"),
    @NamedQuery(name = "OpsiB4r8.findByB4r8", query = "SELECT o FROM OpsiB4r8 o WHERE o.b4r8 = :b4r8"),
    @NamedQuery(name = "OpsiB4r8.findByValue", query = "SELECT o FROM OpsiB4r8 o WHERE o.value = :value")})
public class OpsiB4r8 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B4R8")
    private String b4r8;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b4r19")
    private List<KetRtanggota> ketRtanggotaList;
    @OneToMany(mappedBy = "b4r8")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;

    public OpsiB4r8() {
    }

    public OpsiB4r8(String b4r8) {
        this.b4r8 = b4r8;
    }

    public OpsiB4r8(String b4r8, String value) {
        this.b4r8 = b4r8;
        this.value = value;
    }

    public String getB4r8() {
        return b4r8;
    }

    public void setB4r8(String b4r8) {
        this.b4r8 = b4r8;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<KetRtanggota> getKetRtanggotaList() {
        return ketRtanggotaList;
    }

    public void setKetRtanggotaList(List<KetRtanggota> ketRtanggotaList) {
        this.ketRtanggotaList = ketRtanggotaList;
    }

    @XmlTransient
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList() {
        return b4KeteranganumumtenagakerjaList;
    }

    public void setB4KeteranganumumtenagakerjaList(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList) {
        this.b4KeteranganumumtenagakerjaList = b4KeteranganumumtenagakerjaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b4r8 != null ? b4r8.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB4r8)) {
            return false;
        }
        OpsiB4r8 other = (OpsiB4r8) object;
        if ((this.b4r8 == null && other.b4r8 != null) || (this.b4r8 != null && !this.b4r8.equals(other.b4r8))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB4r8[ b4r8=" + b4r8 + " ]";
    }
    
}
