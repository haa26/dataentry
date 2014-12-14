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
@Table(name = "opsi_ya_tidak")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiYaTidak.findAll", query = "SELECT o FROM OpsiYaTidak o"),
    @NamedQuery(name = "OpsiYaTidak.findByKode", query = "SELECT o FROM OpsiYaTidak o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiYaTidak.findByValue", query = "SELECT o FROM OpsiYaTidak o WHERE o.value = :value")})
public class OpsiYaTidak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b4r16")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;

    public OpsiYaTidak() {
    }

    public OpsiYaTidak(String kode) {
        this.kode = kode;
    }

    public OpsiYaTidak(String kode, String value) {
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
    public List<B4Keteranganumumtenagakerja> getB4KeteranganumumtenagakerjaList() {
        return b4KeteranganumumtenagakerjaList;
    }

    public void setB4KeteranganumumtenagakerjaList(List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList) {
        this.b4KeteranganumumtenagakerjaList = b4KeteranganumumtenagakerjaList;
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
        if (!(object instanceof OpsiYaTidak)) {
            return false;
        }
        OpsiYaTidak other = (OpsiYaTidak) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiYaTidak[ kode=" + kode + " ]";
    }
    
}
