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
@Table(name = "opsi_b8r7b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r7b.findAll", query = "SELECT o FROM OpsiB8r7b o"),
    @NamedQuery(name = "OpsiB8r7b.findByB8R7B", query = "SELECT o FROM OpsiB8r7b o WHERE o.b8R7B = :b8R7B"),
    @NamedQuery(name = "OpsiB8r7b.findByValue", query = "SELECT o FROM OpsiB8r7b o WHERE o.value = :value")})
public class OpsiB8r7b implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R7B")
    private String b8R7B;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b8r7b")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r7b() {
    }

    public OpsiB8r7b(String b8R7B) {
        this.b8R7B = b8R7B;
    }

    public OpsiB8r7b(String b8R7B, String value) {
        this.b8R7B = b8R7B;
        this.value = value;
    }

    public String getB8R7B() {
        return b8R7B;
    }

    public void setB8R7B(String b8R7B) {
        this.b8R7B = b8R7B;
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
        hash += (b8R7B != null ? b8R7B.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r7b)) {
            return false;
        }
        OpsiB8r7b other = (OpsiB8r7b) object;
        if ((this.b8R7B == null && other.b8R7B != null) || (this.b8R7B != null && !this.b8R7B.equals(other.b8R7B))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r7b[ b8R7B=" + b8R7B + " ]";
    }
    
}
