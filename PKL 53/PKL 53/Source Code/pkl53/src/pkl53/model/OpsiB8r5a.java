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
@Table(name = "opsi_b8r5a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r5a.findAll", query = "SELECT o FROM OpsiB8r5a o"),
    @NamedQuery(name = "OpsiB8r5a.findByB8R5A", query = "SELECT o FROM OpsiB8r5a o WHERE o.b8R5A = :b8R5A"),
    @NamedQuery(name = "OpsiB8r5a.findByValue", query = "SELECT o FROM OpsiB8r5a o WHERE o.value = :value")})
public class OpsiB8r5a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R5A")
    private String b8R5A;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b8r5a")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r5a() {
    }

    public OpsiB8r5a(String b8R5A) {
        this.b8R5A = b8R5A;
    }

    public OpsiB8r5a(String b8R5A, String value) {
        this.b8R5A = b8R5A;
        this.value = value;
    }

    public String getB8R5A() {
        return b8R5A;
    }

    public void setB8R5A(String b8R5A) {
        this.b8R5A = b8R5A;
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
        hash += (b8R5A != null ? b8R5A.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r5a)) {
            return false;
        }
        OpsiB8r5a other = (OpsiB8r5a) object;
        if ((this.b8R5A == null && other.b8R5A != null) || (this.b8R5A != null && !this.b8R5A.equals(other.b8R5A))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r5a[ b8R5A=" + b8R5A + " ]";
    }
    
}
