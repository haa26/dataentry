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
@Table(name = "opsi_b8r5b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB8r5b.findAll", query = "SELECT o FROM OpsiB8r5b o"),
    @NamedQuery(name = "OpsiB8r5b.findByB8R5B", query = "SELECT o FROM OpsiB8r5b o WHERE o.b8R5B = :b8R5B"),
    @NamedQuery(name = "OpsiB8r5b.findByValue", query = "SELECT o FROM OpsiB8r5b o WHERE o.value = :value")})
public class OpsiB8r5b implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b8R5B")
    private String b8R5B;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b8r5b")
    private List<B8Keteranganperumahandanaset> b8KeteranganperumahandanasetList;

    public OpsiB8r5b() {
    }

    public OpsiB8r5b(String b8R5B) {
        this.b8R5B = b8R5B;
    }

    public OpsiB8r5b(String b8R5B, String value) {
        this.b8R5B = b8R5B;
        this.value = value;
    }

    public String getB8R5B() {
        return b8R5B;
    }

    public void setB8R5B(String b8R5B) {
        this.b8R5B = b8R5B;
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
        hash += (b8R5B != null ? b8R5B.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB8r5b)) {
            return false;
        }
        OpsiB8r5b other = (OpsiB8r5b) object;
        if ((this.b8R5B == null && other.b8R5B != null) || (this.b8R5B != null && !this.b8R5B.equals(other.b8R5B))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB8r5b[ b8R5B=" + b8R5B + " ]";
    }
    
}
