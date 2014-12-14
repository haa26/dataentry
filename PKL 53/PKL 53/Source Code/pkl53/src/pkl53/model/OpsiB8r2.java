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
@Table(name = "opsi_b8r2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r2.findAll", query = "SELECT o FROM OpsiB8r2 o"),
    @NamedQuery(name = "OpsiB8r2.findByB8r2", query = "SELECT o FROM OpsiB8r2 o WHERE o.b8r2 = :b8r2"),
    @NamedQuery(name = "OpsiB8r2.findByValue", query = "SELECT o FROM OpsiB8r2 o WHERE o.value = :value")})
public class OpsiB8r2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B8R2")
    private String b8r2;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b8r2")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r2() {
    }

    public OpsiB8r2(String b8r2) {
        this.b8r2 = b8r2;
    }

    public OpsiB8r2(String b8r2, String value) {
        this.b8r2 = b8r2;
        this.value = value;
    }

    public String getB8r2() {
        return b8r2;
    }

    public void setB8r2(String b8r2) {
        this.b8r2 = b8r2;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B8Keteranganperumahandanaset> getB8KeteranganperumahandanasetList() {
        return b8KeteranganperumahandanasetList;
    }

    public void setB8KeteranganperumahandanasetList(List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList) {
        this.b8KeteranganperumahandanasetList = b8KeteranganperumahandanasetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b8r2 != null ? b8r2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r2)) {
            return false;
        }
        OpsiB8r2 other = (OpsiB8r2) object;
        if ((this.b8r2 == null && other.b8r2 != null) || (this.b8r2 != null && !this.b8r2.equals(other.b8r2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r2[ b8r2=" + b8r2 + " ]";
    }
    
}
