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
@Table(name = "opsi_b4r3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB4r3.findAll", query = "SELECT o FROM OpsiB4r3 o"),
    @NamedQuery(name = "OpsiB4r3.findByB4r3", query = "SELECT o FROM OpsiB4r3 o WHERE o.b4r3 = :b4r3"),
    @NamedQuery(name = "OpsiB4r3.findByValue", query = "SELECT o FROM OpsiB4r3 o WHERE o.value = :value")})
public class OpsiB4r3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B4R3")
    private String b4r3;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4r9")
    private List<KetRtanggota> ketRtanggotaList;
    @OneToMany(mappedBy = "b4r3")
    private List<B4Art> b4ArtList;

    public OpsiB4r3() {
    }

    public OpsiB4r3(String b4r3) {
        this.b4r3 = b4r3;
    }

    public OpsiB4r3(String b4r3, String value) {
        this.b4r3 = b4r3;
        this.value = value;
    }

    public String getB4r3() {
        return b4r3;
    }

    public void setB4r3(String b4r3) {
        this.b4r3 = b4r3;
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
    public List<B4Art> getB4ArtList() {
        return b4ArtList;
    }

    public void setB4ArtList(List<B4Art> b4ArtList) {
        this.b4ArtList = b4ArtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b4r3 != null ? b4r3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB4r3)) {
            return false;
        }
        OpsiB4r3 other = (OpsiB4r3) object;
        if ((this.b4r3 == null && other.b4r3 != null) || (this.b4r3 != null && !this.b4r3.equals(other.b4r3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB4r3[ b4r3=" + b4r3 + " ]";
    }
    
}
