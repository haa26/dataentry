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
@Table(name = "opsi_b8r7a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r7a.findAll", query = "SELECT o FROM OpsiB8r7a o"),
    @NamedQuery(name = "OpsiB8r7a.findByB8R7A", query = "SELECT o FROM OpsiB8r7a o WHERE o.b8R7A = :b8R7A"),
    @NamedQuery(name = "OpsiB8r7a.findByValue", query = "SELECT o FROM OpsiB8r7a o WHERE o.value = :value")})
public class OpsiB8r7a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R7A")
    private String b8R7A;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b8r7a")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r7a() {
    }

    public OpsiB8r7a(String b8R7A) {
        this.b8R7A = b8R7A;
    }

    public OpsiB8r7a(String b8R7A, String value) {
        this.b8R7A = b8R7A;
        this.value = value;
    }

    public String getB8R7A() {
        return b8R7A;
    }

    public void setB8R7A(String b8R7A) {
        this.b8R7A = b8R7A;
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
        hash += (b8R7A != null ? b8R7A.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r7a)) {
            return false;
        }
        OpsiB8r7a other = (OpsiB8r7a) object;
        if ((this.b8R7A == null && other.b8R7A != null) || (this.b8R7A != null && !this.b8R7A.equals(other.b8R7A))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r7a[ b8R7A=" + b8R7A + " ]";
    }
    
}
