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
@Table(name = "opsi_b4r18")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB4r18.findAll", query = "SELECT o FROM OpsiB4r18 o"),
    @NamedQuery(name = "OpsiB4r18.findByB4r18", query = "SELECT o FROM OpsiB4r18 o WHERE o.b4r18 = :b4r18"),
    @NamedQuery(name = "OpsiB4r18.findByValue", query = "SELECT o FROM OpsiB4r18 o WHERE o.value = :value")})
public class OpsiB4r18 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B4R18")
    private String b4r18;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b4r18")
    private List<B4Keteranganumumtenagakerja> b4KeteranganumumtenagakerjaList;

    public OpsiB4r18() {
    }

    public OpsiB4r18(String b4r18) {
        this.b4r18 = b4r18;
    }

    public OpsiB4r18(String b4r18, String value) {
        this.b4r18 = b4r18;
        this.value = value;
    }

    public String getB4r18() {
        return b4r18;
    }

    public void setB4r18(String b4r18) {
        this.b4r18 = b4r18;
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
        hash += (b4r18 != null ? b4r18.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB4r18)) {
            return false;
        }
        OpsiB4r18 other = (OpsiB4r18) object;
        if ((this.b4r18 == null && other.b4r18 != null) || (this.b4r18 != null && !this.b4r18.equals(other.b4r18))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB4r18[ b4r18=" + b4r18 + " ]";
    }
    
}
