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
@Table(name = "opsi_b4r7")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB4r7.findAll", query = "SELECT o FROM OpsiB4r7 o"),
    @NamedQuery(name = "OpsiB4r7.findByB4r7", query = "SELECT o FROM OpsiB4r7 o WHERE o.b4r7 = :b4r7"),
    @NamedQuery(name = "OpsiB4r7.findByValue", query = "SELECT o FROM OpsiB4r7 o WHERE o.value = :value")})
public class OpsiB4r7 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B4R7")
    private String b4r7;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b4r18")
    private List<KetRtanggota> ketRtanggotaList;
    @OneToMany(mappedBy = "b4r7")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;

    public OpsiB4r7() {
    }

    public OpsiB4r7(String b4r7) {
        this.b4r7 = b4r7;
    }

    public OpsiB4r7(String b4r7, String value) {
        this.b4r7 = b4r7;
        this.value = value;
    }

    public String getB4r7() {
        return b4r7;
    }

    public void setB4r7(String b4r7) {
        this.b4r7 = b4r7;
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
        hash += (b4r7 != null ? b4r7.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB4r7)) {
            return false;
        }
        OpsiB4r7 other = (OpsiB4r7) object;
        if ((this.b4r7 == null && other.b4r7 != null) || (this.b4r7 != null && !this.b4r7.equals(other.b4r7))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB4r7[ b4r7=" + b4r7 + " ]";
    }
    
}
