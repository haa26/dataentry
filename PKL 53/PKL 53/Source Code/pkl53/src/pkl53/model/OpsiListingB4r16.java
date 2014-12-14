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
@Table(name = "opsi_listing_b4r16")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiListingB4r16.findAll", query = "SELECT o FROM OpsiListingB4r16 o"),
    @NamedQuery(name = "OpsiListingB4r16.findByB4r16", query = "SELECT o FROM OpsiListingB4r16 o WHERE o.b4r16 = :b4r16"),
    @NamedQuery(name = "OpsiListingB4r16.findByValue", query = "SELECT o FROM OpsiListingB4r16 o WHERE o.value = :value")})
public class OpsiListingB4r16 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B4R16")
    private String b4r16;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b4r16")
    private List<KetRtanggota> ketRtanggotaList;

    public OpsiListingB4r16() {
    }

    public OpsiListingB4r16(String b4r16) {
        this.b4r16 = b4r16;
    }

    public OpsiListingB4r16(String b4r16, String value) {
        this.b4r16 = b4r16;
        this.value = value;
    }

    public String getB4r16() {
        return b4r16;
    }

    public void setB4r16(String b4r16) {
        this.b4r16 = b4r16;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b4r16 != null ? b4r16.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiListingB4r16)) {
            return false;
        }
        OpsiListingB4r16 other = (OpsiListingB4r16) object;
        if ((this.b4r16 == null && other.b4r16 != null) || (this.b4r16 != null && !this.b4r16.equals(other.b4r16))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiListingB4r16[ b4r16=" + b4r16 + " ]";
    }
    
}
