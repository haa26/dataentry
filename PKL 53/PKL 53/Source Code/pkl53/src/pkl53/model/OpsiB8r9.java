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
@Table(name = "opsi_b8r9")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r9.findAll", query = "SELECT o FROM OpsiB8r9 o"),
    @NamedQuery(name = "OpsiB8r9.findByB8R9", query = "SELECT o FROM OpsiB8r9 o WHERE o.b8R9 = :b8R9"),
    @NamedQuery(name = "OpsiB8r9.findByValue", query = "SELECT o FROM OpsiB8r9 o WHERE o.value = :value")})
public class OpsiB8r9 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R9")
    private String b8R9;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b8r9")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r9() {
    }

    public OpsiB8r9(String b8R9) {
        this.b8R9 = b8R9;
    }

    public OpsiB8r9(String b8R9, String value) {
        this.b8R9 = b8R9;
        this.value = value;
    }

    public String getB8R9() {
        return b8R9;
    }

    public void setB8R9(String b8R9) {
        this.b8R9 = b8R9;
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
        hash += (b8R9 != null ? b8R9.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r9)) {
            return false;
        }
        OpsiB8r9 other = (OpsiB8r9) object;
        if ((this.b8R9 == null && other.b8R9 != null) || (this.b8R9 != null && !this.b8R9.equals(other.b8R9))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r9[ b8R9=" + b8R9 + " ]";
    }
    
}
