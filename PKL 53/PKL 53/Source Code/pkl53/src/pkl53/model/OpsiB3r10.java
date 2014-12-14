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
@Table(name = "opsi_b3r10")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r10.findAll", query = "SELECT o FROM OpsiB3r10 o"),
    @NamedQuery(name = "OpsiB3r10.findByB3r10", query = "SELECT o FROM OpsiB3r10 o WHERE o.b3r10 = :b3r10"),
    @NamedQuery(name = "OpsiB3r10.findByValue", query = "SELECT o FROM OpsiB3r10 o WHERE o.value = :value")})
public class OpsiB3r10 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R10")
    private String b3r10;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r10")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r10() {
    }

    public OpsiB3r10(String b3r10) {
        this.b3r10 = b3r10;
    }

    public OpsiB3r10(String b3r10, String value) {
        this.b3r10 = b3r10;
        this.value = value;
    }

    public String getB3r10() {
        return b3r10;
    }

    public void setB3r10(String b3r10) {
        this.b3r10 = b3r10;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList() {
        return b3RinciusahaList;
    }

    public void setB3RinciusahaList(List<B3Rinciusaha> b3RinciusahaList) {
        this.b3RinciusahaList = b3RinciusahaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b3r10 != null ? b3r10.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r10)) {
            return false;
        }
        OpsiB3r10 other = (OpsiB3r10) object;
        if ((this.b3r10 == null && other.b3r10 != null) || (this.b3r10 != null && !this.b3r10.equals(other.b3r10))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r10[ b3r10=" + b3r10 + " ]";
    }
    
}
