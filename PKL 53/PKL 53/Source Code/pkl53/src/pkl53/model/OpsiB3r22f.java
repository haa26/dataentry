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
@Table(name = "opsi_b3r22f")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r22f.findAll", query = "SELECT o FROM OpsiB3r22f o"),
    @NamedQuery(name = "OpsiB3r22f.findByB3r22f", query = "SELECT o FROM OpsiB3r22f o WHERE o.b3r22f = :b3r22f"),
    @NamedQuery(name = "OpsiB3r22f.findByValue", query = "SELECT o FROM OpsiB3r22f o WHERE o.value = :value")})
public class OpsiB3r22f implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R22F")
    private String b3r22f;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r22f")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r22f() {
    }

    public OpsiB3r22f(String b3r22f) {
        this.b3r22f = b3r22f;
    }

    public OpsiB3r22f(String b3r22f, String value) {
        this.b3r22f = b3r22f;
        this.value = value;
    }

    public String getB3r22f() {
        return b3r22f;
    }

    public void setB3r22f(String b3r22f) {
        this.b3r22f = b3r22f;
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
        hash += (b3r22f != null ? b3r22f.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r22f)) {
            return false;
        }
        OpsiB3r22f other = (OpsiB3r22f) object;
        if ((this.b3r22f == null && other.b3r22f != null) || (this.b3r22f != null && !this.b3r22f.equals(other.b3r22f))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r22f[ b3r22f=" + b3r22f + " ]";
    }
    
}
