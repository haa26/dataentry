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
@Table(name = "opsi_b8r3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r3.findAll", query = "SELECT o FROM OpsiB8r3 o"),
    @NamedQuery(name = "OpsiB8r3.findByB8R3", query = "SELECT o FROM OpsiB8r3 o WHERE o.b8R3 = :b8R3"),
    @NamedQuery(name = "OpsiB8r3.findByValue", query = "SELECT o FROM OpsiB8r3 o WHERE o.value = :value")})
public class OpsiB8r3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R3")
    private String b8R3;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b8r3")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r3() {
    }

    public OpsiB8r3(String b8R3) {
        this.b8R3 = b8R3;
    }

    public OpsiB8r3(String b8R3, String value) {
        this.b8R3 = b8R3;
        this.value = value;
    }

    public String getB8R3() {
        return b8R3;
    }

    public void setB8R3(String b8R3) {
        this.b8R3 = b8R3;
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
        hash += (b8R3 != null ? b8R3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r3)) {
            return false;
        }
        OpsiB8r3 other = (OpsiB8r3) object;
        if ((this.b8R3 == null && other.b8R3 != null) || (this.b8R3 != null && !this.b8R3.equals(other.b8R3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r3[ b8R3=" + b8R3 + " ]";
    }
    
}
